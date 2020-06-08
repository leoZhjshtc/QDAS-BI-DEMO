<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div id="qaTeilChartDiv"
         data-options="region:'north',split:false,border:false,collapsible:false,onResize:linesChartResize"
         style="height:33%;"></div>
    <div id="qaTeilChartDivCen" data-options="region:'center',onResize:barsChartResize"></div>
    <div data-options="region:'south',split:false,border:false,collapsible:false" style="height:33%;">
        <div id="yearMonthDiv" class="easyui-layout" fit="true">
            <div data-options="region:'north',split:false" style="height:35px;">
                年：<input id="yearCombobox" class="easyui-combobox" style="width: 100px"
                         data-options="valueField:'year',textField:'year',url:'<%=basePath%>getragQa/getYearComboboxData',panelMaxHeight:'100px',onSelect:function(record){qaTeilYearChange(record.year)},onLoadSuccess:yearComboboxLoad">

                月：<select id="monthCombobox" class="easyui-combobox" name="dept" style="width: 100px"
                          data-options="panelMaxHeight:'100px',onLoadSuccess:monthComboboxLoad,onChange:function(newValue,oldValue){qaTeilMonthChange(newValue)}">
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
            <div id="yearMonthChart" data-options="region:'center'" style=""></div>
        </div>
    </div>
</div>
<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qa.css"/>
<script type="text/javascript">
    var linesChart, barsChart, reportChart;

    var now = new Date(); //当前日期
    var nowMonth = now.getMonth(); //当前月

    var nowYear = now.getFullYear(); //当前年
    //本月的开始时间
    var monthStartDate = new Date(nowYear, nowMonth, 1);
    //本月的结束时间
    var monthEndDate = new Date(nowYear, nowMonth + 1, 0);
    var startTime = monthStartDate.format("yyyy-MM-dd") + " 00:00:00";
    var endTime = monthEndDate.format("yyyy-MM-dd") + " 00:00:00";
    initRecentChart();
    initTeilMonthReportChart(startTime, endTime);
    function monthComboboxLoad() {
       /* var selectValue;
        if(nowMonth+1<10){
            selectValue='0'+(nowMonth+1);
        }else{
            selectValue=nowMonth+1;
        }
        $('#monthCombobox').combobox('setValue',selectValue);*/
    }
    function yearComboboxLoad() {
        /*$('#yearCombobox').combobox('setValue',nowYear);*/
    }
    function qaTeilYearChange(year) {
        var reportStartTime,reportEndTime;
        if($('#monthCombobox').combobox('getValue')==0){
            reportStartTime=year+"-"+'01-01 00:00:00';
            reportEndTime = (parseInt(year)+1)+"-"+'01-01 00:00:00';
            initTeilYearReportChart(reportStartTime,reportEndTime);
        }else{
            reportStartTime=year+"-"+$('#monthCombobox').combobox('getValue')+'-01 00:00:00';
            reportEndTime = new Date(year, parseInt($('#monthCombobox').combobox('getValue')), 1).format("yyyy-MM-dd 00:00:00");
            initTeilMonthReportChart(reportStartTime, reportEndTime);
        }
    }
    function qaTeilMonthChange(month) {
        var reportStartTime,reportEndTime;
        if(month==0){
            reportStartTime=$('#yearCombobox').combobox('getValue')+"-"+'01-01 00:00:00';
            reportEndTime = (parseInt($('#yearCombobox').combobox('getValue'))+1)+"-"+'01-01 00:00:00';
            initTeilYearReportChart(reportStartTime,reportEndTime);
        }else if($('#yearCombobox').combobox('getValue')==''){
            reportStartTime=nowYear+"-"+month+'-01 00:00:00';
            reportEndTime = new Date(nowYear, parseInt(month), 1).format("yyyy-MM-dd 00:00:00");
        }else{
            reportStartTime=$('#yearCombobox').combobox('getValue')+"-"+month+'-01 00:00:00';
            reportEndTime = new Date($('#yearCombobox').combobox('getValue'), parseInt(month), 1).format("yyyy-MM-dd 00:00:00");
        }
        initTeilMonthReportChart(reportStartTime, reportEndTime);
    }
    function initRecentChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>getragQa/getTeilRecent24HoursData',
            beforeSend: function () {
                initLoading('qaTeilChartDiv', 'loading1');
                initLoading('qaTeilChartDivCen', 'loading2');
            },
            success: function (data) {
                var teilLiStr;
                /* var titleArr=new Array();
                 titleArr.push('teil')
                 var dataArr=new Array();*/
                var legendArr = new Array();
                var xValues = new Array();
                var seriesArr = new Array();
                //柱状图
                var barXValue = new Array();
                var barSuccessValue = new Array();
                var barFailValue = new Array();
                if (data.length > 0) {
                    for (var i = 0; i < data.length; i++) {
                        var title = data[i].TETEILNR + "/" + data[i].TEBEZEICH + "/" + data[i].TEKURZBEZEICH;
                        /*titleArr.push(title);*/
                        legendArr.push(title);
                        var sObj = new Object();
                        var sdata = new Array();

                        teilLiStr = title;
                        var barTitle = data[i].TETEILNR + "\n" + data[i].TEBEZEICH + "\n" + data[i].TEKURZBEZEICH;
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
                            /*var dataStr="{\"teil\":\""+data[i].timeList[j].hourDate+"时\",\""+title+"\":\""+pr+"\"}";
                            dataArr.push(JSON.parse(dataStr));*/
                            var sdataArr = new Array();
                            sdataArr[0] = data[i].timeList[j].hourDate;
                            sdataArr[1] = parseFloat(pr);
                            sdata.push(sdataArr);
                        }
                        sObj.name = title;
                        sObj.type = 'line';
                        sObj.data = sdata;
                        seriesArr.push(sObj);
                        //柱状图
                        var barSuccessObj = new Object();
                        var barFailObj = new Object();
                        barSuccessObj.value = ((barTotalCount - barFailCount) * 100 / barTotalCount).toFixed(2);
                        barSuccessObj.text = barTitle;
                        barSuccessObj.k1001 = data[i].TETEILNR;
                        barSuccessObj.k1002 = data[i].TEBEZEICH;
                        barSuccessObj.k1003 = data[i].TEKURZBEZEICH;
                        barFailObj.value = (barFailCount / barTotalCount * 100).toFixed(2);
                        barFailObj.text = barTitle;
                        barFailObj.k1001 = data[i].TETEILNR;
                        barFailObj.k1002 = data[i].TEBEZEICH;
                        barFailObj.k1003 = data[i].TEKURZBEZEICH;
                        barSuccessValue.push(barSuccessObj);
                        barFailValue.push(barFailObj);
                    }
                    var newXvalue = noRepeatArr(xValues).sort();
                    linesChart = initRecent24HoursLineChart('qaTeilChartDiv', legendArr, newXvalue, seriesArr);
                    barsChart = initQaPassRateChart('qaTeilChartDivCen', barXValue, barSuccessValue, barFailValue);
                    barsChart.off('click');
                    barsChart.on('click', function (params) {
                        $('#qaTeilLi').html("> " + params.data.k1001 + "/" + params.data.k1002 + "/" + params.data.k1003);
                        $('#qaTeilAbility').panel('close');
                        $('#qaProcedureAbility').panel('open');
                        $('#qaProcedureAbility').panel('refresh', '<%=basePath%>getragQa/initProcedureQualityAnalyse?teilNum=' + params.data.k1001 + "&teilName=" + params.data.k1002 + "&teilDescription=" + params.data.k1003);
                        $('#qaProcedureAbility').panel('resize');
                    })
                }
                removeLoading('loading1');
                removeLoading('loading2');
            }
        })
    }

    function initTeilMonthReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>getragQa/getTeilMonthReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime
            },
            beforeSend: function () {
                initLoading('yearMonthDiv', 'loading3');
            },
            success: function (data) {
                if (data.length > 0) {
                    var legendArr = new Array();
                    var xvalue = new Array();
                    var seriesArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        var title = data[i].TETEILNR + "/" + data[i].TEBEZEICH + "/" + data[i].TEKURZBEZEICH;
                        legendArr.push(title);
                        var sObj = new Object();
                        var sdata = new Array();
                        for (var j = 0; j < data[i].timeList.length; j++) {
                            xvalue.push(data[i].timeList[j].DATADATE);
                            var sdataArr = new Array();
                            var wvpr=0;
                            for(var k=0;k<data[i].timeList[j].wvList.length;k++){
                                wvpr+=parseFloat(data[i].timeList[j].wvList[k].PASSRATE);
                            }
                            sdataArr[0] = data[i].timeList[j].DATADATE;
                            sdataArr[1] = parseFloat(wvpr/(data[i].timeList[j].wvList.length)).toFixed(2);
                            sdata.push(sdataArr);
                        }
                        sObj.name = title;
                        sObj.type = 'line';
                        sObj.data = sdata;
                        seriesArr.push(sObj);
                    }
                    var newXvalue = noRepeatArr(xvalue).sort();
                    reportChart = initRecent24HoursLineChart('yearMonthChart', legendArr, newXvalue, seriesArr);
                }else{
                    reportChart.clear();
                }
                removeLoading('loading3');
            }
        })
    }
    function initTeilYearReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>getragQa/getTeilYearReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime
            },
            beforeSend: function () {
                initLoading('yearMonthDiv', 'loading3');
            },
            success: function (data) {
                console.log(data);
                if (data.length > 0) {
                    var legendArr = new Array();
                    var xvalue = new Array();
                    var seriesArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        var title = data[i].TETEILNR + "/" + data[i].TEBEZEICH + "/" + data[i].TEKURZBEZEICH;
                        legendArr.push(title);
                        var sObj = new Object();
                        var sdata = new Array();
                        for (var j = 0; j < data[i].timeList.length; j++) {
                            xvalue.push(data[i].timeList[j].DATADATE);
                            var sdataArr = new Array();
                            var wvpr=0;
                            for(var k=0;k<data[i].timeList[j].wvList.length;k++){
                                wvpr+=parseFloat(data[i].timeList[j].wvList[k].PASSRATE);
                            }
                            sdataArr[0] = data[i].timeList[j].DATADATE;
                            sdataArr[1] = parseFloat(wvpr/(data[i].timeList[j].wvList.length)).toFixed(2);
                            sdata.push(sdataArr);
                        }
                        sObj.name = title;
                        sObj.type = 'line';
                        sObj.data = sdata;
                        seriesArr.push(sObj);
                    }
                    var newXvalue = noRepeatArr(xvalue).sort();
                    reportChart = initRecent24HoursLineChart('yearMonthChart', legendArr, newXvalue, seriesArr);
                }else{
                    reportChart.clear();
                }
                removeLoading('loading3');
            }
        })
    }
    function linesChartResize() {
        if (linesChart != null & linesChart != undefined) {
            linesChart.resize();
        }
        if (reportChart != null & reportChart != undefined) {
            reportChart.resize();
        }
    }

    function barsChartResize() {
        if (barsChart != null & barsChart != undefined) {
            barsChart.resize();
        }
    }
</script>
</body>
</html>
