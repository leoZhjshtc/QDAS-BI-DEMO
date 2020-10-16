<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
</head>
<body>
<div class="row">
    <div class="col-md-3 col-xs-12">
        <div id="2" class="box">
            <div class="box-body">
                <table class="table table-condensed">
                    <tr>
                        <td class="tableLab">零件号:</td>
                        <td id="td1"></td>
                    </tr>
                    <tr>
                        <td class="tableLab">零件名:</td>
                        <td id="td2"></td>
                    </tr>
                    <tr>
                        <td class="tableLab">产品组:</td>
                        <td id="td3"></td>
                    </tr>
                    <tr>
                        <td class="tableLab">工序:</td>
                        <td id="td4"></td>
                    </tr>
                    <tr>
                        <td class="tableLab">参数名:</td>
                        <td id="td5"></td>
                    </tr>
                    <tr>
                        <td class="tableLab">名义值:</td>
                        <td id="td6"></td>
                    </tr>
                    <tr>
                        <td class="tableLab">上公差上限:</td>
                        <td id="td7"></td>
                    </tr>
                    <tr>
                        <td class="tableLab">下公差上限:</td>
                        <td id="td8"></td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <div class="col-md-9 col-xs-12">
        <div id="1" class="box">
            <div class="box-body">
                <div id="qbShowChartDiv"></div>
            </div>
        </div>
    </div>
</div>
<style type="text/css">
    .tableLab {
        font-weight: 800;
    }
</style>
<script type="text/javascript">
    var qbShowInterval;
    var pageIndex = 0;
    var qbShowLinechart;
    $(function () {
        $('#qbShowBox').on('expanded.boxwidget', function () {
            $('#qbShowChartDiv').height(($(window).height()-100)*0.88);
            var intervalTime=$('#intervalTime').val()
            lbQbShow();
            clearInterval(qbShowInterval);
            qbShowInterval = setInterval(lbQbShow, parseInt(intervalTime) * 1000);
            ifQbShowOpen=true;
        })
        $('#qbShowBox').on('collapsed.boxwidget', function () {
            clearInterval(qbShowInterval);
            ifQbShowOpen=false;
        })
        $(window).resize(function () {
            if (qbShowLinechart != undefined) {
                qbShowLinechart.resize();
            }
        });
    })
    function lbTimeChange() {
        if(ifQbShowOpen){
            clearInterval(qbShowInterval);
            qbShowInterval = setInterval(lbQbShow, parseInt($('#intervalTime').val()) * 1000);
        }

    }
    function lbQbShow() {
        pageIndex += 1;
        var teilNum;
        var teilK1003;
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getQbShowFormInfo',
            data: {
                startTime: startTime,
                endTime: endTime,
                teilNum: teilNum,
                teilK1003: teilK1003,
                page: pageIndex,
                qbSerchWertCount: $('#qbSerchWertCount').val(),
                ifQbSerchWertCount: ifQbSerchWertCount
            },
            success: function (data) {
                $('#td1').html(data.rows.TETEILNR);
                $('#td2').html(data.rows.TEBEZEICH);
                $('#td3').html(data.rows.TEKURZBEZEICH);
                $('#td4').html(data.rows.TEAUFTRAGSTR);
                $('#td5').html(data.rows.MEMERKBEZ);
                $('#td6').html(data.rows.MENENNMAS);
                $('#td7').html(data.rows.MEOGW);
                $('#td8').html(data.rows.MEUGW);
                initQbShowChart(data.chartList);
                if (pageIndex == data.total) {
                    pageIndex = 0;
                }
            }
        })
    }

    function initQbShowChart(data) {
        if (data.length > 0) {
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
                    var tolObj=toleranceChange(data[0].MEUGW,data[0].MEOGW,$('#toleranceMultiple').val());
                    upLimit = tolObj.meogw;
                    downLimit = tolObj.meugw;
                    var warnObj=toleranceChange(data[0].MEUGW,data[0].MEOGW,$('#warningLimitMultiple').val());
                    newupLimit = warnObj.meogw;
                    newdownLimit = warnObj.meugw;
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
                qbShowLinechart = initQbLineChartWithNewLimit('qbShowChartDiv', xValue, yValue, upLimit, downLimit,newupLimit,newdownLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle,overallDicideStandardType);
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
                        if (data[i].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].WVWERT.toString().substring(data[i].WVWERT.toString().indexOf(".") - 1)) > 0) {
                            nokCount += 1;
                        } else {
                            okCount += 1;
                        }
                    }
                }
                yData = [okCount, nokCount];
                pieArr = [{name: '合格', value: okCount}, {name: '不合格', value: nokCount}];
                qbShowLinechart = initBarAndPie('qbShowChartDiv', xData, yData, pieArr, title);

            }
        }
    }
</script>
</body>
</html>
