<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<input type="hidden" id="pTeilNum" value="${pTeilInfo.teilNum}">
<input type="hidden" id="pTeilK1003" value="${pTeilInfo.teilK1003}">
<input type="hidden" id="pProcessNum" value="${pTeilInfo.processNum}">
<div class="easyui-layout" fit="true">
    <div data-options="region:'center'">
        <div id="mmChartDiv" class="easyui-panel" data-options="border:true" style="overflow:hidden;height: 25%"></div>
        <div id="recentEvery24ChartDiv" class="easyui-panel" data-options="border:true" style="overflow:hidden;height: 25%"></div>
        <div id="recent24ChartDiv" class="easyui-panel" data-options="border:true" style="overflow:hidden;height: 25%"></div>
        <div class="easyui-panel" data-options="border:true" style="overflow:hidden;height: 25%">
            <div class="easyui-layout" fit="true">
                <div data-options="region:'north',split:false" style="height:35px;">
                    年：<input id="yearComboboxProcess" class="easyui-combobox" style="width: 100px"
                             data-options="valueField:'year',textField:'year',url:'<%=basePath%>gqb/getYearComboboxData',panelMaxHeight:'100px',onSelect:function(record){qaProcessYearChange(record.year)}">

                    月：<select id="monthComboboxProcess" class="easyui-combobox" name="dept" style="width: 100px"
                              data-options="panelMaxHeight:'100px',onChange:function(newValue,oldValue){qaProcessMonthChange(newValue)}">
                    <option value="0">&nbsp;</option>
                    <option value="01">1月</option>
                    <option value="02">2月</option>
                    <option value="03">3月</option>
                    <option value="04">4月</option>
                    <option value="05">5月</option>
                    <option value="06">6月</option>
                    <option value="07">7月</option>
                    <option value="08">8月</option>
                    <option value="09">9月</option>
                    <option value="10">10月</option>
                    <option value="11">11月</option>
                    <option value="12">12月</option>
                </select>
                </div>
                <div id="yearMonthChartDiv" data-options="region:'center'" style=""></div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mmChart.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/qa.js"></script>
<script type="text/javascript">
    $(function () {
        initMmChartData();
        initProcessRecentChart();

        var now = new Date(); //当前日期
        var nowMonth = now.getMonth(); //当前月
        var nowYear = now.getFullYear(); //当前年
        //本月的开始时间
        var monthStartDate = new Date(nowYear, nowMonth, 1);
        //本月的结束时间
        var monthEndDate = new Date(nowYear, nowMonth + 1, 0);
        var monthStartTime = monthStartDate.format("yyyy-MM-dd") + " 00:00:00";
        var monthEndTime = monthEndDate.format("yyyy-MM-dd") + " 00:00:00";
        initProcessMonthReportChart(monthStartTime, monthEndTime);
    })
    function qaProcessYearChange(year) {
        var reportStartTime,reportEndTime;
        if($('#monthComboboxProcess').combobox('getValue')==0){
            reportStartTime=year+"-"+'01-01 00:00:00';
            reportEndTime = (parseInt(year)+1)+"-"+'01-01 00:00:00';
            initProcessYearReportChart(reportStartTime,reportEndTime);
        }else{
            reportStartTime=year+"-"+$('#monthComboboxProcess').combobox('getValue')+'-01 00:00:00';
            reportEndTime = new Date(year, parseInt($('#monthComboboxProcess').combobox('getValue')), 1).format("yyyy-MM-dd 00:00:00");
            initProcessMonthReportChart(reportStartTime, reportEndTime);
        }
    }
    function qaProcessMonthChange(month) {
        var reportStartTime,reportEndTime;
        if(month==0){
            reportStartTime=$('#yearComboboxProcess').combobox('getValue')+"-"+'01-01 00:00:00';
            reportEndTime = (parseInt($('#yearComboboxProcess').combobox('getValue'))+1)+"-"+'01-01 00:00:00';
            initProcessYearReportChart(reportStartTime,reportEndTime);
        }else if($('#yearComboboxProcess').combobox('getValue')==''){
            reportStartTime=nowYear+"-"+month+'-01 00:00:00';
            reportEndTime = new Date(nowYear, parseInt(month), 1).format("yyyy-MM-dd 00:00:00");
        }else{
            reportStartTime=$('#yearComboboxProcess').combobox('getValue')+"-"+month+'-01 00:00:00';
            reportEndTime = new Date($('#yearComboboxProcess').combobox('getValue'), parseInt(month), 1).format("yyyy-MM-dd 00:00:00");
        }
        initProcessMonthReportChart(reportStartTime, reportEndTime);
    }
    function initMmChartData() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>gqb/getMissionManageChartData',
            data: {
                teilNum:$('#pTeilNum').val(),
                processNum:$('#pProcessNum').val(),
                teilK1003:$('#pTeilK1003').val(),
                startTime: startTime,
                endTime: endTime
            },
            beforeSend: function () {
                initLoading('mmChartDiv', 'loading1')
            },
            success: function (data) {
                if (data.length > 0) {
                    var yValueArr = new Array();
                    var chartDataArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        yValueArr.push(data[i].TETEILNR + "\n" + data[i].TEKURZBEZEICH + "\n" + data[i].TEAUFTRAGSTR);
                        for (var j = 0; j < data[i].wvnrList.length; j++) {
                            var valueObj = new Object();
                            valueObj.name = data[i].TETEILNR;
                            valueObj.teilId = data[i].wvnrList[j].TETEIL;
                            valueObj.wvwertnr = data[i].wvnrList[j].WVWERTNR;
                            valueObj.value = new Array();
                            valueObj.value.push(data[i].TETEILNR + "\n" + data[i].TEKURZBEZEICH + "\n" + data[i].TEAUFTRAGSTR);
                            valueObj.value.push(data[i].wvnrList[j].wvList[0].WVDATZEIT);
                            valueObj.value.push(data[i].wvnrList[j].wvList[data[i].wvnrList[j].wvList.length - 1].WVDATZEIT);
                            var redAlarm = 0;
                            for (var k = 0; k < data[i].wvnrList[j].wvList.length; k++) {
                                if (data[i].wvnrList[j].wvList[k].MEMERKART == '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                        redAlarm += 1;
                                    }
                                } else {
                                    if ((data[i].wvnrList[j].wvList[k].MEUGW != undefined & data[i].wvnrList[j].wvList[k].MEUGW != '' & data[i].wvnrList[j].wvList[k].MEUGW != 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEUGW) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (data[i].wvnrList[j].wvList[k].MEOGW != undefined & data[i].wvnrList[j].wvList[k].MEOGW != '' & data[i].wvnrList[j].wvList[k].MEOGW != 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEOGW) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
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
                    mmchart = initChart(yValueArr, chartDataArr, "mmChartDiv");
                    mmchart.off('click');
                    mmchart.on('click', function (params) {
                        $('#qbChartPanel').panel('close');
                        $('#mmDetailsPanel').panel('open');
                        $('#mmDetailsPanel').panel('resize');
                        $('#mmDetailsPanel').panel('refresh', '<%=basePath%>initMissionManageDetailsPage?teilId=' + params.data.teilId + '&wvwertnr=' + params.data.wvwertnr);
                    });
                }
                removeLoading('loading1');
            }
        })
    }
    function initProcessRecentChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>gqb/getProcessRecent24HoursData',
            data: {
                teilNum:$('#pTeilNum').val(),
                processNum:$('#pProcessNum').val(),
                teilK1003:$('#pTeilK1003').val()
            },
            beforeSend: function () {
                initLoading('recentEvery24ChartDiv', 'loading2');
                initLoading('recent24ChartDiv', 'loading3');
            },
            success: function (data) {
                var lititle;
                /*var titleArr = new Array();
                titleArr.push('Process')
                var dataArr = new Array();*/
                var legendArr = new Array();
                var xValues = new Array();
                var seriesArr = new Array();

                var barXValue = new Array();
                var barSuccessValue = new Array();
                var barFailValue = new Array();
                if (data.length > 0) {
                    for (var i = 0; i < data.length; i++) {
                        var title = data[i].TEAUFTRAGSTR;
                        // titleArr.push(title);
                        var sObj = new Object();
                        var sdata = new Array();
                        legendArr.push(title);
                        lititle = title;
                        var barTitle = data[i].TEAUFTRAGSTR;
                        barXValue.push(barTitle);
                        var barTotalCount = 0;
                        var barFailCount = 0;
                        for (var j = 0; j < data[i].timeList.length; j++) {
                            xValues.push(data[i].timeList[j].hourDate);
                            var nokCount = 0;
                            barTotalCount += data[i].timeList[j].wvList.length;
                            for (var k = 0; k < data[i].timeList[j].wvList.length; k++) {
                                if (data[i].timeList[j].wvList[k].MEMERKART == '1') {
                                    if (data[i].timeList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].timeList[j].wvList[k].WVWERT.toString().substring(data[i].timeList[j].wvList[k].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                        nokCount += 1;
                                        barFailCount += 1;
                                    }
                                } else {
                                    if ((data[i].timeList[j].wvList[k].MEUGW != undefined & data[i].timeList[j].wvList[k].MEUGW != '' & data[i].timeList[j].wvList[k].MEUGW != 'null' & parseFloat(data[i].timeList[j].wvList[k].MEUGW) > parseFloat(data[i].timeList[j].wvList[k].WVWERT))
                                        | (data[i].timeList[j].wvList[k].MEOGW != undefined & data[i].timeList[j].wvList[k].MEOGW != '' & data[i].timeList[j].wvList[k].MEOGW != 'null' & parseFloat(data[i].timeList[j].wvList[k].MEOGW) < parseFloat(data[i].timeList[j].wvList[k].WVWERT))) {
                                        nokCount += 1;
                                        barFailCount += 1;
                                    }
                                }
                            }
                            var pr = ((data[i].timeList[j].wvList.length - nokCount) * 100 / data[i].timeList[j].wvList.length).toFixed(2);
                            // var dataStr = "{\"Process\":\"" + data[i].timeList[j].hourDate + "时\",\"" + title + "\":\"" + pr + "\"}";
                            // dataArr.push(JSON.parse(dataStr));
                            var sdataArr = new Array();
                            sdataArr[0] = data[i].timeList[j].hourDate;
                            sdataArr[1] = parseFloat(pr);
                            sdata.push(sdataArr);
                        }
                        sObj.name = title;
                        sObj.type = 'line';
                        sObj.data = sdata;
                        seriesArr.push(sObj);

                        var barSuccessObj = new Object();
                        var barFailObj = new Object();
                        barSuccessObj.value = ((barTotalCount - barFailCount) * 100 / barTotalCount).toFixed(2);
                        barSuccessObj.text = barTitle;
                        barSuccessObj.teilId = data[i].TETEIL;
                        barFailObj.value = (barFailCount / barTotalCount * 100).toFixed(2);
                        barFailObj.text = barTitle;
                        barFailObj.teilId = data[i].TETEIL;
                        barSuccessValue.push(barSuccessObj);
                        barFailValue.push(barFailObj);
                    }
                    var newXvalue = noRepeatArr(xValues).sort();
                    proceduteLinesChart = initRecent24HoursLineChart('recentEvery24ChartDiv', legendArr, newXvalue, seriesArr);
                    ProcessBarsChart = initQaPassRateChart('recent24ChartDiv', barXValue, barSuccessValue, barFailValue);
                    ProcessBarsChart.off('click');
                    ProcessBarsChart.on('click', function (params) {
                        var teilId=params.data.teilId;
                        $('#qbChartPanel').panel('close');
                        $('#qaMerkmalPanel').panel('open');
                        $('#qaMerkmalPanel').panel('resize');
                        $('#qaMerkmalPanel').panel('refresh', '<%=basePath%>gqb/initMerkmalQualityAnalyse?teilId=' + teilId);
                    })
                }
                removeLoading('loading3');
                removeLoading('loading2');
            }
        })
    }
    function initProcessMonthReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>gqb/getProcessMonthReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime,
                teilNum:$('#pTeilNum').val(),
                processNum:$('#pProcessNum').val(),
                teilK1003:$('#pTeilK1003').val()
            },
            beforeSend: function () {
                initLoading('yearMonthDivP', 'loading4');
            },
            success: function (data) {
                if (data.length > 0) {
                    var legendArr = new Array();
                    var xvalue = new Array();
                    var seriesArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        var title = data[i].TEAUFTRAGSTR;
                        legendArr.push(title);
                        var sObj = new Object();
                        var sdata = new Array();
                        for (var j = 0; j < data[i].timeList.length; j++) {
                            xvalue.push(data[i].timeList[j].DATADATE);
                            var sdataArr = new Array();
                            var wvpr = 0;
                            for (var k = 0; k < data[i].timeList[j].wvList.length; k++) {
                                wvpr += parseFloat(data[i].timeList[j].wvList[k].PASSRATE);
                            }
                            sdataArr[0] = data[i].timeList[j].DATADATE;
                            sdataArr[1] = parseFloat(wvpr / (data[i].timeList[j].wvList.length)).toFixed(2);
                            sdata.push(sdataArr);
                        }
                        sObj.name = title;
                        sObj.type = 'line';
                        sObj.data = sdata;
                        seriesArr.push(sObj);
                    }
                    var newXvalue = noRepeatArr(xvalue).sort();
                    ProcessYYChart = initRecent24HoursLineChart('yearMonthChartDiv', legendArr, newXvalue, seriesArr);
                }else{
                    ProcessYYChart.clear();
                }
                removeLoading('loading4');
            }
        })
    }
    function initProcessYearReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>gqb/getProcessYearReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime,
                teilNum:$('#pTeilNum').val(),
                processNum:$('#pProcessNum').val(),
                teilK1003:$('#pTeilK1003').val()
            },
            beforeSend: function () {
                initLoading('yearMonthDivP', 'loading5');
            },
            success: function (data) {
                if (data.length > 0) {
                    var legendArr = new Array();
                    var xvalue = new Array();
                    var seriesArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        var title = data[i].TEAUFTRAGSTR;
                        legendArr.push(title);
                        var sObj = new Object();
                        var sdata = new Array();
                        for (var j = 0; j < data[i].timeList.length; j++) {
                            xvalue.push(data[i].timeList[j].DATADATE);
                            var sdataArr = new Array();
                            var wvpr = 0;
                            for (var k = 0; k < data[i].timeList[j].wvList.length; k++) {
                                wvpr += parseFloat(data[i].timeList[j].wvList[k].PASSRATE);
                            }
                            sdataArr[0] = data[i].timeList[j].DATADATE;
                            sdataArr[1] = parseFloat(wvpr / (data[i].timeList[j].wvList.length)).toFixed(2);
                            sdata.push(sdataArr);
                        }
                        sObj.name = title;
                        sObj.type = 'line';
                        sObj.data = sdata;
                        seriesArr.push(sObj);
                    }
                    var newXvalue = noRepeatArr(xvalue).sort();
                    ProcessYYChart = initRecent24HoursLineChart('yearMonthChartDiv', legendArr, newXvalue, seriesArr);
                }else{
                    ProcessYYChart.clear();
                }
                removeLoading('loading5');
            }
        })
    }
</script>
</body>
</html>