<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
</head>
<body>
<div id="plChartCarousel" class="carousel slide carousel-vertical" data-wrap="false"
     data-interval="false">
    <div class="carousel-inner">
        <div class="item active">
            <div id="plChartDiv">
            </div>
        </div>
        <div class="item">
            <div id="processChartDiv"></div>
        </div>
        <div class="item">
            <div id="merkmalChartDiv"></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var mmPlchart, mmProcesschart, qbLinechart;
    $(function () {
        $('#plChartCarousel').carousel('pause');
        initPlmmChart();
        $(window).resize(function () {
            if (mmPlchart != undefined) {
                mmPlchart.resize();
            }
            if (mmProcesschart != undefined) {
                mmProcesschart.resize();
            }
            if (qbLinechart != undefined) {
                qbLinechart.resize();
            }
        });
    })
    function initPlmmChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getPlMissionManageChartData',
            data:{
              startTime:startTime,
              endTime:endTime
            },
            success: function (data) {
                if (data.length > 0) {
                    if (data.length == 1) {
                        $('#plChartDiv').height(data.length * 150 + 'px');
                    } else if (data.length == 2) {
                        $('#plChartDiv').height(data.length * 100 + 'px');
                    } else {
                        $('#plChartDiv').height(data.length * 60 + 'px');
                    }
                    var yValueArr = new Array();
                    var chartDataArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        yValueArr.push(data[i].TETEILNR + "\n" + data[i].TEBEZEICH + "\n" + data[i].TEKURZBEZEICH);
                        for (var j = 0; j < data[i].wvnrList.length; j++) {
                            var valueObj = new Object();
                            valueObj.name = data[i].TETEILNR;
                            valueObj.teilId = data[i].wvnrList[j].TETEIL;
                            valueObj.wvwertnr = data[i].wvnrList[j].WVWERTNR;
                            valueObj.value = new Array();
                            valueObj.value.push(data[i].TETEILNR + "\n" + data[i].TEBEZEICH + "\n" + data[i].TEKURZBEZEICH);
                            valueObj.value.push(data[i].wvnrList[j].wvList[0].WVDATZEIT);
                            valueObj.value.push(data[i].wvnrList[j].wvList[data[i].wvnrList[j].wvList.length - 1].WVDATZEIT);
                            var redAlarm = 0;
                            for (var k = 0; k < data[i].wvnrList[j].wvList.length; k++) {
                                if (data[i].wvnrList[j].wvList[k].MEMERKART == '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                        redAlarm += 1;
                                    }
                                } else {
                                    if ((data[i].wvnrList[j].wvList[k].MEUGW !== undefined & data[i].wvnrList[j].wvList[k].MEUGW !== '' & data[i].wvnrList[j].wvList[k].MEUGW !== 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEUGW) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (data[i].wvnrList[j].wvList[k].MEOGW !== undefined & data[i].wvnrList[j].wvList[k].MEOGW !== '' & data[i].wvnrList[j].wvList[k].MEOGW !== 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEOGW) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
                                        redAlarm += 1;
                                    }
                                }
                            }
                            valueObj.value.push("有" + redAlarm + "个超差数据");
                            valueObj.itemStyle = new Object()
                            valueObj.itemStyle.normal = new Object();
                            if (redAlarm > 0) {
                                valueObj.itemStyle.normal.color = '#EE0000';
                            } else {
                                valueObj.itemStyle.normal.color = '#48B18A';
                            }
                            chartDataArr.push(valueObj);
                        }
                    }
                    mmPlchart = initChartAdminlte(yValueArr, chartDataArr, "plChartDiv");
                    mmPlchart.off('click');
                    mmPlchart.on('click', function (params) {
                        $('#mmDetailsTitle').html(params.value[0].toString().replace(/\n/g,'/'));
                        $('#mmDetailsTableDiv').load('<%=basePath%>baqb/getMissionManageDetails', {
                            teilId: params.data.teilId,
                            wvwertnr: params.data.wvwertnr
                        },function () {
                            window.location.href = '#maodian3';
                        });
                    });
                }
            }
        })
    }

    function initProcessMmChart(teilNum, teilName, teilK1003) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getProcessMissionManageChartData',
            data: {
                teilNum: teilNum,
                teilName: teilName,
                teilK1003: teilK1003,
                startTime:startTime,
                endTime:endTime
            },
            success: function (data) {
                if (data.length > 0) {
                    if (data.length == 1) {
                        $('#processChartDiv').height(data.length * 150 + 'px');
                    } else if (data.length == 2) {
                        $('#processChartDiv').height(data.length * 100 + 'px');
                    } else {
                        $('#processChartDiv').height(data.length * 60 + 'px');
                    }
                    var yValueArr = new Array();
                    var chartDataArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        yValueArr.push(data[i].TEAUFTRAGSTR);
                        for (var j = 0; j < data[i].wvnrList.length; j++) {
                            var valueObj = new Object();
                            valueObj.name = data[i].wvnrList[j].TETEILNR;
                            valueObj.teilId = data[i].wvnrList[j].TETEIL;
                            valueObj.wvwertnr = data[i].wvnrList[j].WVWERTNR;
                            valueObj.value = new Array();
                            valueObj.value.push(data[i].TEAUFTRAGSTR);
                            valueObj.value.push(data[i].wvnrList[j].wvList[0].WVDATZEIT);
                            valueObj.value.push(data[i].wvnrList[j].wvList[data[i].wvnrList[j].wvList.length - 1].WVDATZEIT);
                            var redAlarm = 0;
                            for (var k = 0; k < data[i].wvnrList[j].wvList.length; k++) {
                                if (data[i].wvnrList[j].wvList[k].MEMERKART == '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                        redAlarm += 1;
                                    }
                                } else {
                                    if ((data[i].wvnrList[j].wvList[k].MEUGW !== undefined & data[i].wvnrList[j].wvList[k].MEUGW !== '' & data[i].wvnrList[j].wvList[k].MEUGW !== 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEUGW) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (data[i].wvnrList[j].wvList[k].MEOGW !== undefined & data[i].wvnrList[j].wvList[k].MEOGW !== '' & data[i].wvnrList[j].wvList[k].MEOGW !== 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEOGW) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
                                        redAlarm += 1;
                                    }
                                }
                            }
                            valueObj.value.push("有" + redAlarm + "个超差数据");
                            valueObj.itemStyle = new Object()
                            valueObj.itemStyle.normal = new Object();
                            if (redAlarm > 0) {
                                valueObj.itemStyle.normal.color = '#EE0000';
                            } else {
                                valueObj.itemStyle.normal.color = '#48B18A';
                            }
                            chartDataArr.push(valueObj);
                        }
                    }
                    mmProcesschart = initChartAdminlte(yValueArr, chartDataArr, "processChartDiv");
                    mmProcesschart.off('click');
                    mmProcesschart.on('click', function (params) {
                        $('#mmDetailsTitle').html(teilNum+'/'+teilName+'/'+teilK1003+' -> '+params.value[0]);
                        $('#mmDetailsTableDiv').load('<%=basePath%>baqb/getMissionManageDetails', {
                            teilId: params.data.teilId,
                            wvwertnr: params.data.wvwertnr
                        });
                        window.location.href = '#maodian3';
                    });
                }
            }
        })
    }

    function initMerkmalChart(teilId, merkmalId) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getMerkmalChartData',
            data: {
                teilId: teilId,
                merkmalId: merkmalId,
                startTime:startTime,
                endTime:endTime
            },
            success: function (data) {
                if (data.length > 0) {
                    $('#merkmalChartDiv').height('500px');
                    if (data[0].MEMERKART != 1) {
                        var upLimit;
                        var downLimit;
                        var newupLimit;
                        var newdownLimit;
                        var chartTitle;
                        var mdata;
                        var xValue = [];
                        var yValue = [];
                        var tooltipTime = [];
                        var tooltipPRVORNAME = [];
                        var tooltipPMBEZ = [];
                        if (data.length > 0) {
                            upLimit = data[0].MEOGW;
                            downLimit = data[0].MEUGW;
                            newupLimit = data[0].NEWMEOGW;
                            newdownLimit = data[0].NEWMEUGW;
                            chartTitle = data[0].MEMERKBEZ;
                            mdata = data[0].MENENNMAS;
                            for (var i = 0; i < data.length; i++) {
                                tooltipTime.push(data[i].WVDATZEIT);
                                tooltipPRVORNAME.push(data[i].PRVORNAME == undefined ? '' : data[i].PRVORNAME);
                                tooltipPMBEZ.push('');
                                xValue.push(data[i].WVDATZEIT);
                                yValue.push(data[i].WVWERT)
                            }
                        }
                        qbLinechart = initQbLineChartWithNewLimit('merkmalChartDiv', xValue, yValue, upLimit, downLimit,newupLimit,newdownLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
                    } else {
                        var xData = ['合格', '不合格'];
                        var yData = [];
                        var pieArr = [];
                        var okCount = 0;
                        var nokCount = 0;
                        var title;
                        if (data.length > 0) {
                            title = data[0].MEMERKBEZ
                            for (var i = 0; i < data.length; i++) {
                                if (data[i].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].WVWERT.toString().substring(data[i].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                    nokCount += 1;
                                } else {
                                    okCount += 1;
                                }
                            }
                        }
                        yData = [okCount, nokCount];
                        pieArr = [{name: '合格', value: okCount}, {name: '不合格', value: nokCount}];
                        qbLinechart = initBarAndPie('merkmalChartDiv', xData, yData, pieArr, title);

                    }
                }
            }
        })
    }
</script>
</body>
</html>
