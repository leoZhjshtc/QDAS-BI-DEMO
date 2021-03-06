<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <link rel="stylesheet" type="text/css"
          href="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap-daterangepicker/daterangepicker.css">
</head>
<body>
<div id="plChartCarousel" class="carousel slide carousel-vertical" data-wrap="false"
     data-interval="false">
    <div class="carousel-inner">
        <div class="item active">
            <div class="btn-group">
                <button type="button" class="btn btn-default btn-md active" onclick="onePlMmCharts(this)"><i class="fa fa-align-left"></i></button>
                <button type="button" class="btn btn-default btn-md" onclick="manyPlMmCharts(this)"><i class="fa fa-th"></i></button>
            </div>
            <div id="plChartDiv" style="margin-top: 10px"></div>
        </div>
        <div class="item">
            <div class="btn-group">
                <button type="button" class="btn btn-default btn-md active" onclick="oneProcessMmCharts(this)"><i class="fa fa-align-left"></i></button>
                <button type="button" class="btn btn-default btn-md" onclick="manyProcessMmCharts(this)"><i class="fa fa-th"></i></button>
            </div>
            <div id="processChartDiv" style="margin-top: 10px"></div>
        </div>
<%--        <div class="item">--%>
<%--            <div class="input-group col-md-3 col-xs-12">--%>
<%--                <input type="text" class="form-control pull-right" id="dztSearchTime">--%>
<%--            </div>--%>
<%--            <div id="merkmalChartDiv"></div>--%>
<%--        </div>--%>
    </div>
</div>
<script type="text/javascript"
        src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
<script type="text/javascript">
    var mmPlchart, mmProcesschart, qbLinechart;
    var dztSearchTeil,dztSearchMerkmal;
    var manyMmchartArr=new Array();
    $(function () {
        $('#plChartCarousel').carousel('pause');
        initPlmmChart();
        $(window).resize(function () {
            if (mmPlchart !== undefined) {
                mmPlchart.resize();
            }
            if (mmProcesschart !== undefined) {
                mmProcesschart.resize();
            }
            if (qbLinechart !== undefined) {
                qbLinechart.resize();
            }
            if(manyMmchartArr.length!==0){
                for(var i=0;i<manyMmchartArr.length;i++){
                    manyMmchartArr[i].mmchart.resize();
                }
            }
        });
    })
    function onePlMmCharts(ele) {
        $(ele).addClass("active");
        $(ele).next('button').removeClass("active");
        $('#plChartDiv').empty();
        initPlmmChart();
        manyMmchartArr=[];
    }
    function manyPlMmCharts(ele) {
        $(ele).addClass("active");
        $(ele).prev('button').removeClass("active");
        $('#plChartDiv').empty();
        initManyPlmmChart();
    }
    function oneProcessMmCharts(ele) {
        $(ele).addClass("active");
        $(ele).next('button').removeClass("active");
        manyMmchartArr=[];
        $('#processChartDiv').empty();
        initProcessMmChart(mmProcessParamsObj.teilNum,mmProcessParamsObj.teilName,mmProcessParamsObj.teilK1003);
    }
    function manyProcessMmCharts(ele) {
        $(ele).addClass("active");
        $(ele).prev('button').removeClass("active");
        $('#processChartDiv').empty();
        initManyProcessMmChart(mmProcessParamsObj.teilNum, mmProcessParamsObj.teilName, mmProcessParamsObj.teilK1003);
    }
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
                    var chardiv = "<div id='oneMmchart'></div>"
                    $('#plChartDiv').append(chardiv);
                    if (data.length == 1) {
                        $('#oneMmchart').height(data.length * 160 + 'px');
                    } else if (data.length == 2) {
                        $('#oneMmchart').height(data.length * 130 + 'px');
                    } else {
                        $('#oneMmchart').height(data.length * 90 + 'px');
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
                                if (data[i].wvnrList[j].wvList[k].MEMERKART === '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                        redAlarm += 1;
                                    }
                                } else {
                                    var obj;
                                    if(overallDicideStandardType==='1'){
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#toleranceMultiple').val());
                                    }else{
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#warningLimitMultiple').val());
                                    }

                                    if ((!isBlank(obj.meugw)& parseFloat(obj.meugw) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (!isBlank(obj.meogw)& parseFloat(obj.meogw) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
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
                    mmPlchart = initChartAdminlte(yValueArr, chartDataArr, "oneMmchart");
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
                    var chardiv = "<div id='oneMmProcessChart'></div>"
                    $('#processChartDiv').append(chardiv);
                    if (data.length == 1) {
                        $('#oneMmProcessChart').height(data.length * 160 + 'px');
                    } else if (data.length == 2) {
                        $('#oneMmProcessChart').height(data.length * 130 + 'px');
                    } else {
                        $('#oneMmProcessChart').height(data.length * 90 + 'px');
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
                                if (data[i].wvnrList[j].wvList[k].MEMERKART === '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                        redAlarm += 1;
                                    }
                                } else {
                                    var obj;
                                    if(overallDicideStandardType==='1'){
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#toleranceMultiple').val());
                                    }else{
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#warningLimitMultiple').val());
                                    }

                                    if ((!isBlank(obj.meugw)& parseFloat(obj.meugw) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (!isBlank(obj.meogw)& parseFloat(obj.meogw) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
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
                    mmProcesschart = initChartAdminlte(yValueArr, chartDataArr, "oneMmProcessChart");
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


    function initManyPlmmChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getPlMissionManageChartData',
            data:{
                startTime:startTime,
                endTime:endTime
            },
            success: function (data) {
                if (data.length > 0) {
                    for (var i = 0; i < data.length; i++) {
                        var yValueArr = new Array();
                        var chartDataArr = new Array();
                        yValueArr.push(data[i].TETEILNR + "\n" + data[i].TEBEZEICH + "\n" + data[i].TEKURZBEZEICH);
                        var alarmIndex=0;
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
                                if (data[i].wvnrList[j].wvList[k].MEMERKART === '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                        redAlarm += 1;
                                        alarmIndex=1;
                                    }
                                } else {
                                    var obj;
                                    if(overallDicideStandardType==='1'){
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#toleranceMultiple').val());
                                    }else{
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#warningLimitMultiple').val());
                                    }
                                    if ((!isBlank(obj.meugw)& parseFloat(obj.meugw) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (!isBlank(obj.meogw)& parseFloat(obj.meogw) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
                                        redAlarm += 1;
                                        alarmIndex=1;
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
                        var chardiv="<div class=\"col-md-4 col-sm-12 col-xs-12\">" +
                            "   <div class=\"info-box\" style=\"height:130px\">" ;
                        if(alarmIndex===0){
                            chardiv +="       <span class=\"info-box-icon bg-green\" style=\"width:10px;height:130px\"></span>";
                        }else{
                            chardiv +="       <span class=\"info-box-icon bg-red\" style=\"width:10px;height:130px\"></span>";
                        }
                        chardiv += "       <div class=\"info-box-content\" style=\"margin-left:10px\">" +
                            "           <span class=\"info-box-text\">"+data[i].TETEILNR + " / " + data[i].TEBEZEICH + " / " + data[i].TEKURZBEZEICH+"</span>" +
                            "           <div style='height: 100px' id='plmmchart"+i+"'></div>" +
                            "       </div>" +
                            "   </div>" +
                            "</div>"
                        $('#plChartDiv').append(chardiv);
                        var manyMmChartsObj = new Object();
                        manyMmChartsObj.mmchart = initChartSmall(yValueArr, chartDataArr, "plmmchart"+i);
                        /*mmPlchart = initChartAdminlte(yValueArr, chartDataArr, "plChartDiv");*/
                        manyMmChartsObj.mmchart.off('click');
                        manyMmChartsObj.mmchart.on('click', function (params) {
                            $('#mmDetailsTitle').html(params.value[0].toString().replace(/\n/g,'/'));
                            $('#mmDetailsTableDiv').load('<%=basePath%>baqb/getMissionManageDetails', {
                                teilId: params.data.teilId,
                                wvwertnr: params.data.wvwertnr
                            },function () {
                                window.location.href = '#maodian3';
                            });
                        });
                        manyMmchartArr.push(manyMmChartsObj);
                    }

                }
            }
        })
    }
    function initManyProcessMmChart(teilNum, teilName, teilK1003) {
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
                    var yValueArr = new Array();
                    var chartDataArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        yValueArr.push(data[i].TEAUFTRAGSTR);
                        var alarmIndex=0;
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
                                if (data[i].wvnrList[j].wvList[k].MEMERKART === '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                        redAlarm += 1;
                                        alarmIndex=1;
                                    }
                                } else {
                                    var obj;
                                    if(overallDicideStandardType==='1'){
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#toleranceMultiple').val());
                                    }else{
                                        obj=toleranceChange(data[i].wvnrList[j].wvList[k].MEUGW,data[i].wvnrList[j].wvList[k].MEOGW,$('#warningLimitMultiple').val());
                                    }
                                    if ((!isBlank(obj.meugw)& parseFloat(obj.meugw) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (!isBlank(obj.meogw)& parseFloat(obj.meogw) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
                                        redAlarm += 1;
                                        alarmIndex=1;
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
                        var chardiv="<div class=\"col-md-4 col-sm-12 col-xs-12\">" +
                            "   <div class=\"info-box\" style=\"height:130px\">" ;
                        if(alarmIndex===0){
                            chardiv +="       <span class=\"info-box-icon bg-green\" style=\"width:10px;height:130px\"></span>";
                        }else{
                            chardiv +="       <span class=\"info-box-icon bg-red\" style=\"width:10px;height:130px\"></span>";
                        }
                        chardiv += "       <div class=\"info-box-content\" style=\"margin-left:10px\">" +
                            "           <span class=\"info-box-text\">"+data[i].TEAUFTRAGSTR+"</span>" +
                            "           <div style='height: 100px' id='plmmprocesschart"+i+"'></div>" +
                            "       </div>" +
                            "   </div>" +
                            "</div>"
                        $('#processChartDiv').append(chardiv);
                        var manyMmChartsObj = new Object();
                        manyMmChartsObj.mmchart = initChartSmall(yValueArr, chartDataArr, "plmmprocesschart"+i);
                        manyMmChartsObj.mmchart.off('click');
                        manyMmChartsObj.mmchart.on('click', function (params) {
                            $('#mmDetailsTitle').html(teilNum+'/'+teilName+'/'+teilK1003+' -> '+params.value[0]);
                            $('#mmDetailsTableDiv').load('<%=basePath%>baqb/getMissionManageDetails', {
                                teilId: params.data.teilId,
                                wvwertnr: params.data.wvwertnr
                            });
                            window.location.href = '#maodian3';
                        });
                        manyMmchartArr.push(manyMmChartsObj);
                    }
                }
            }
        })
    }
</script>
</body>
</html>
