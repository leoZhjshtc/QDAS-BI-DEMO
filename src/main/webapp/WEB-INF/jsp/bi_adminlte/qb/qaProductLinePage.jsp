<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="box">
            <div class="box-body">
                <div style="height: 300px;" id="productLineRecent24HoursPieChart">
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-9 col-xs-12">
        <div class="box">
            <div class="box-body">
                <div style="height: 300px;" id="productLineRecent24HoursLineChart">
                </div>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-md-3 col-xs-12">
        <div class="box">
            <div class="box-body">
                <div class="form-group">
                    <label>年</label>
                    <select class="form-control" id="plYearCombobox">
                        <c:forEach items="${yearList}" var="list">
                            <option value="${list.year}">${list.year}年</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>月</label>
                    <select class="form-control" id="plMonthCombobox">
                        <option value="0">查看年报</option>
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
                <button type="button" class="btn btn-info pull-right" onclick="searchChartData();" style="width: 100px">
                    查看
                </button>
            </div>
        </div>
    </div>
    <div class="col-md-9 col-xs-12">
        <div class="box">
            <div class="box-body">
                <div style="height: 300px;" id="productLineYearMonthLineChart">
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var qastartTime = moment().startOf('second').add(-24, 'hour').format('YYYY-MM-DD HH:mm:ss');
    var qaendTime = moment().startOf('second').format('YYYY-MM-DD HH:mm:ss');
    var monthStrat = moment().startOf('month').format('YYYY-MM-DD HH:mm:ss');
    var qapllinesChart, qaplpieChart, qaplreportChart;
    $(function () {
        initPlRecentChart();
        initPlMonthReportChart(monthStrat, qaendTime);
        $('#plMonthCombobox').val(moment().startOf('month').format('MM'));
        $(window).resize(function () {
            if (qapllinesChart != undefined) {
                qapllinesChart.resize();
            }
            if (qaplpieChart != undefined) {
                qaplpieChart.resize();
            }
            if (qaplreportChart != undefined) {
                qaplreportChart.resize();
            }
        });
    })

    function searchChartData() {
        if ($('#plMonthCombobox').val() === '0') {
            initPlYearReportChart($('#plYearCombobox').val() + '-01-01 00:00:00', $('#plYearCombobox').val() + '-12-31 23:59:59')
        } else {
            var reportStartTime = $('#plYearCombobox').val() + "-" + $('#plMonthCombobox').val() + '-01 00:00:00';
            var reportEndTime = new Date($('#plYearCombobox').val(), parseInt($('#plMonthCombobox').val()), 1).format("yyyy-MM-dd 00:00:00");
            initPlMonthReportChart(reportStartTime, reportEndTime);
        }
    }

    function initPlRecentChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getProductLineRecent24HoursData',
            data: {
                startTime: qastartTime,
                endTime: qaendTime
            },
            success: function (data) {
                var legendArr = new Array();
                var xValues = new Array();
                var seriesArr = new Array();
                //饼图
                var pieDataArr = new Array();
                var pieNokCount = 0;
                var pieTotal = 0;
                if (data.length > 0) {
                    for (var i = 0; i < data.length; i++) {
                        var title = data[i].TETEILNR + "/" + data[i].TEBEZEICH + "/" + data[i].TEKURZBEZEICH;
                        legendArr.push(title);
                        var sObj = new Object();
                        var sdata = new Array();
                        for (var j = 0; j < data[i].timeList.length; j++) {
                            xValues.push(data[i].timeList[j].hourDate);
                            var nokCount = 0;
                            pieTotal += data[i].timeList[j].wvList.length;
                            for (var k = 0; k < data[i].timeList[j].wvList.length; k++) {
                                if (data[i].timeList[j].wvList[k].MEMERKART === '1') {
                                    if (data[i].timeList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].timeList[j].wvList[k].WVWERT.toString().substring(data[i].timeList[j].wvList[k].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                        nokCount += 1;
                                        pieNokCount += 1;
                                    }
                                } else {
                                    var downLimit,upLimit;
                                    if(overallDicideStandardType==='1'){
                                        var obj=toleranceChange(data[i].timeList[j].wvList[k].MEUGW,data[i].timeList[j].wvList[k].MEOGW,$('#toleranceMultiple').val());
                                        downLimit=obj.meugw;
                                        upLimit=obj.meogw;
                                    }else{
                                        var obj=toleranceChange(data[i].timeList[j].wvList[k].MEUGW,data[i].timeList[j].wvList[k].MEOGW,$('#warningLimitMultiple').val());
                                        downLimit=obj.meugw;
                                        upLimit=obj.meogw;
                                    }
                                    if ((!isBlank(downLimit)& parseFloat(downLimit) > parseFloat(data[i].timeList[j].wvList[k].WVWERT))
                                        | (!isBlank(upLimit) & parseFloat(upLimit) < parseFloat(data[i].timeList[j].wvList[k].WVWERT))) {
                                        nokCount += 1;
                                        pieNokCount += 1;
                                    }
                                }
                            }
                            var pr = ((data[i].timeList[j].wvList.length - nokCount) * 100 / data[i].timeList[j].wvList.length).toFixed(2);
                            var sdataArr = new Array();
                            sdataArr[0] = data[i].timeList[j].hourDate;
                            sdataArr[1] = parseFloat(pr);
                            sdata.push(sdataArr);
                        }
                        sObj.name = title;
                        sObj.type = 'line';
                        sObj.data = sdata;
                        seriesArr.push(sObj);
                    }
                    var newXvalue = noRepeatArr(xValues).sort();
                    qapllinesChart = initRecent24HoursLineChart('productLineRecent24HoursLineChart', legendArr, newXvalue, seriesArr);

                    var pieOkObj = new Object();
                    pieOkObj.name = "合格",
                    pieOkObj.value = ((pieTotal - pieNokCount) / pieTotal * 100).toFixed(2);
                    var pieNOkObj = new Object();
                    pieNOkObj.name = "不合格",
                    pieNOkObj.value = (pieNokCount / pieTotal * 100).toFixed(2);
                    pieDataArr.push(pieOkObj);
                    pieDataArr.push(pieNOkObj);
                    qaplpieChart = initAdminLtePieChart('productLineRecent24HoursPieChart', pieDataArr);
                }
            }
        })
    }

    function initPlMonthReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getProductLineMonthReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime
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
                    qaplreportChart = initRecent24HoursLineChart('productLineYearMonthLineChart', legendArr, newXvalue, seriesArr);
                } else {
                    if(qaplreportChart!==undefined){
                        qaplreportChart.clear();
                    }
                }
            }
        })
    }

    function initPlYearReportChart(searchStartTime, searchEndTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getProductLineYearReportData',
            data: {
                startTime: searchStartTime,
                endTime: searchEndTime
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
                    qaplreportChart = initRecent24HoursLineChart('productLineYearMonthLineChart', legendArr, newXvalue, seriesArr);
                } else {
                    if(qaplreportChart!==undefined){
                        qaplreportChart.clear();
                    }
                }
            }
        })
    }
</script>
</body>
</html>
