<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div id="qaProcedureChartDiv"
         data-options="region:'north',split:false,border:false,collapsible:false,onResize:proceduteLinesChartResize"
         style="height:33%;"></div>
    <div id="qaProcedureChartDivCen" data-options="region:'center',onResize:procedureBarsChartResize"></div>
    <div data-options="region:'south',split:false,border:false,collapsible:false" style="height:33%;">
        <div id="yearMonthDivP" class="easyui-layout" fit="true">
            <div data-options="region:'north',split:false" style="height:35px;">
                年：<input id="yearComboboxProcedure" class="easyui-combobox" style="width: 100px"
                         data-options="valueField:'year',textField:'year',url:'<%=basePath%>getragQa/getYearComboboxData',panelMaxHeight:'100px',onSelect:function(record){qaProcedureYearChange(record.year)}">

                月：<select id="monthComboboxProcedure" class="easyui-combobox" name="dept" style="width: 100px"
                          data-options="panelMaxHeight:'100px',onChange:function(newValue,oldValue){qaProcedureMonthChange(newValue)}">
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
            <div id="yearMonthChartP" data-options="region:'center'" style=""></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var proceduteLinesChart, procedureBarsChart, procedureYYChart;

    var now = new Date(); //当前日期
    var nowMonth = now.getMonth(); //当前月
    var nowYear = now.getFullYear(); //当前年
    //本月的开始时间
    var monthStartDate = new Date(nowYear, nowMonth, 1);
    //本月的结束时间
    var monthEndDate = new Date(nowYear, nowMonth + 1, 0);
    var startTime = monthStartDate.format("yyyy-MM-dd") + " 00:00:00";
    var endTime = monthEndDate.format("yyyy-MM-dd") + " 00:00:00";
    initProcedureMonthReportChart(startTime, endTime);
    initProcedureRecentChart();
    function qaProcedureYearChange(year) {
        var reportStartTime,reportEndTime;
        if($('#monthComboboxProcedure').combobox('getValue')==0){
            reportStartTime=year+"-"+'01-01 00:00:00';
            reportEndTime = (parseInt(year)+1)+"-"+'01-01 00:00:00';
            initProcedureYearReportChart(reportStartTime,reportEndTime);
        }else{
            reportStartTime=year+"-"+$('#monthComboboxProcedure').combobox('getValue')+'-01 00:00:00';
            reportEndTime = new Date(year, parseInt($('#monthComboboxProcedure').combobox('getValue')), 1).format("yyyy-MM-dd 00:00:00");
            initProcedureMonthReportChart(reportStartTime, reportEndTime);
        }
    }
    function qaProcedureMonthChange(month) {
        var reportStartTime,reportEndTime;
        if(month==0){
            reportStartTime=$('#yearComboboxProcedure').combobox('getValue')+"-"+'01-01 00:00:00';
            reportEndTime = (parseInt($('#yearComboboxProcedure').combobox('getValue'))+1)+"-"+'01-01 00:00:00';
            initProcedureYearReportChart(reportStartTime,reportEndTime);
        }else if($('#yearComboboxProcedure').combobox('getValue')==''){
            reportStartTime=nowYear+"-"+month+'-01 00:00:00';
            reportEndTime = new Date(nowYear, parseInt(month), 1).format("yyyy-MM-dd 00:00:00");
        }else{
            reportStartTime=$('#yearComboboxProcedure').combobox('getValue')+"-"+month+'-01 00:00:00';
            reportEndTime = new Date($('#yearComboboxProcedure').combobox('getValue'), parseInt(month), 1).format("yyyy-MM-dd 00:00:00");
        }
        initProcedureMonthReportChart(reportStartTime, reportEndTime);
    }
    function initProcedureRecentChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>getragQa/getProcedureRecent24HoursData',
            data: {
                teilNum: '${qaProcedureMap.qaProcedureTeilNum}',
                teilName: '${qaProcedureMap.qaProcedureTeilName}',
                teilDescription: '${qaProcedureMap.qaProcedureTeilD}'
            },
            beforeSend: function () {
                initLoading('qaProcedureChartDiv', 'loading1');
                initLoading('qaProcedureChartDivCen', 'loading2');
            },
            success: function (data) {
                var lititle;
                /*var titleArr = new Array();
                titleArr.push('procedure')
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
                            // var dataStr = "{\"procedure\":\"" + data[i].timeList[j].hourDate + "时\",\"" + title + "\":\"" + pr + "\"}";
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
                    proceduteLinesChart = initRecent24HoursLineChart('qaProcedureChartDiv', legendArr, newXvalue, seriesArr);
                    procedureBarsChart = initQaPassRateChart('qaProcedureChartDivCen', barXValue, barSuccessValue, barFailValue);
                    procedureBarsChart.off('click');
                    procedureBarsChart.on('click', function (params) {
                        $('#qaProcedureLi').html(">" + lititle);
                        $('#qaProcedureAbility').panel('close');
                        $('#qaMerkmalAbility').panel('open');
                        $('#qaMerkmalAbility').panel('refresh', '<%=basePath%>getragQa/initMerkmalQualityAnalyse?teilId=' + params.data.teilId);
                        $('#qaMerkmalAbility').panel('resize');
                    })
                }
                removeLoading('loading1');
                removeLoading('loading2');
            }
        })
    }

    function initProcedureMonthReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>getragQa/getProcedureMonthReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime,
                teilNum: '${qaProcedureMap.qaProcedureTeilNum}',
                teilName: '${qaProcedureMap.qaProcedureTeilName}',
                teilDescription: '${qaProcedureMap.qaProcedureTeilD}'
            },
            beforeSend: function () {
                initLoading('yearMonthDivP', 'loading3');
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
                    procedureYYChart = initRecent24HoursLineChart('yearMonthChartP', legendArr, newXvalue, seriesArr);
                }else{
                    procedureYYChart.clear();
                }
                removeLoading('loading3');
            }
        })
    }
    function initProcedureYearReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>getragQa/getProcedureYearReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime,
                teilNum: '${qaProcedureMap.qaProcedureTeilNum}',
                teilName: '${qaProcedureMap.qaProcedureTeilName}',
                teilDescription: '${qaProcedureMap.qaProcedureTeilD}'
            },
            beforeSend: function () {
                initLoading('yearMonthDivP', 'loading3');
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
                    procedureYYChart = initRecent24HoursLineChart('yearMonthChartP', legendArr, newXvalue, seriesArr);
                }else{
                    procedureYYChart.clear();
                }
                removeLoading('loading3');
            }
        })
    }
    function proceduteLinesChartResize() {
        if (proceduteLinesChart != null & proceduteLinesChart != undefined) {
            proceduteLinesChart.resize();
        }
    }
    function procedureBarsChartResize() {
        if (procedureBarsChart != null & procedureBarsChart != undefined) {
            procedureBarsChart.resize();
        }
        if (procedureYYChart != null & procedureYYChart != undefined) {
            procedureYYChart.resize();
        }
    }
</script>
</body>
</html>
