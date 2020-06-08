<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
    <script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
    <title>质量看板</title>
    <style type="text/css">
        .textbox .textbox-text {
            font-size: 18px;
        }
        font {
            font-size: 18px;
            font-weight: bold
        }
    </style>
    <script type="text/javascript">
        var today = new Date();
        var startTime = today.getFullYear() + "-" + (today.getMonth() + 1) + "-" + today.getDate() + " 00:00:00";
        var endTime;
        var pageIndex = 0;
        var plInterval=null;
        $(function () {
            $('#plAcc').panel('refresh', '<%=basePath%>qb/initProductLine?startTime=' + startTime);
            $('#qbShowDiv').window({
                width: $(window).width() - 100,
                height: $(window).height() - 100,
                collapsible: false,
                minimizable: false,
                modal: true,
                closed: true,
                onClose:function () {
                    clearInterval(plInterval);
                }
            });
            $('#plQbShow').click(function () {
                pageIndex=0;
                $('#qbShowDiv').window('open');
                plInterval = setInterval(plQbShow,1000*10);

            })
        })
        function qbIntervalTime(time) {
            clearInterval(plInterval);
            plInterval=setInterval(plQbShow, time*1000);
        }
        function timeRadioClick(checked) {
            var now = new Date();
            if (checked == 1) {
                startTime = now.getFullYear() + "-" + (now.getMonth() + 1) + "-" + now.getDate() + " 00:00:00";
            } else if (checked == 2) {
                var searchTime = now.getTime() - (86400000);
                var yesday = new Date(searchTime)
                startTime = yesday.getFullYear() + "-" + (yesday.getMonth() + 1) + "-" + yesday.getDate() + " 00:00:00";
                endTime = now.getFullYear() + "-" + (now.getMonth() + 1) + "-" + now.getDate() + " 00:00:00";
            } else if (checked == 3) {
                var weekStartDate = new Date(now.getFullYear(), now.getMonth(), now.getDate() - now.getDay());
                startTime = weekStartDate.getFullYear() + "-" + (weekStartDate.getMonth() + 1) + "-" + weekStartDate.getDate() + " 00:00:00";
            }
        }

        function plQbShow() {
            pageIndex += 1;
            $.ajax({
                type: 'post',
                url: '<%=basePath%>qb/getQbShowFormInfo',
                data: {
                    startTime: startTime,
                    endTime: endTime,
                    teilId:$('#merkmalPageTeilId').val(),
                    page: pageIndex
                },
                success: function (data) {
                    if(pageIndex==data.total){
                        pageIndex=1;
                    }
                    $('#qbShowDiv').panel('setTitle','看板   '+pageIndex+" / "+data.total)
                    $('#dataForm').form('load', data.rows[0]);
                    initQbShowChart(data.chartList);
                }
            })
        }

        function initQbShowChart(data) {
            if (data[0].MEMERKART != 1) {
                var upLimit;
                var downLimit;
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
                qbLinechart = initQbLineChart('qbShowCharts', xValue, yValue, upLimit, downLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
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
                qbLinechart = initBarAndPie('qbShowCharts', xData, yData, pieArr, title);

            }
        }
    </script>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'center',border:false" style="overflow: hidden;">
        <div id="qbAcc" class="easyui-accordion" style="height: 100%;width: 100%">
            <div title="产线" data-options="selected:true" style="overflow:auto;">
                <div class="easyui-layout" fit="true">
                    <div data-options="region:'north',border:true" style="height: 40px;padding: 5px;overflow: hidden">
                        <form style="float: left">
                            <input class="easyui-radiobutton"
                                   data-options="checked:true,onChange:function(checked){if(checked){timeRadioClick(1)}}"
                                   name="plDateChose" value="1" label="今日:" labelAlign="right">
                            <input class="easyui-radiobutton"
                                   data-options="onChange:function(checked){if(checked){timeRadioClick(2)}}"
                                   name="plDateChose" value="2" label="昨日:" labelAlign="right">
                            <input class="easyui-radiobutton"
                                   data-options="onChange:function(checked){if(checked){timeRadioClick(3)}}"
                                   name="plDateChose" value="7" label="这周:" labelAlign="right">
                        </form>
                        <a id="plQbShow" class="easyui-linkbutton" data-options="iconCls:'icon-kanbanicon'"
                           style="float: right">打开轮播看板</a>
                    </div>
                    <div id="plAcc" data-options="region:'center',border:false"></div>
                </div>
            </div>
            <div id="teilAcc" title="零件" data-options="">

            </div>
            <div id="merkmalAcc" title="参数">
            </div>
        </div>
    </div>
</div>
<div id="qbShowDiv">
    <div class="easyui-layout" fit="true">
        <div data-options="region:'north',split:false" style="height:50px; padding: 5px;overflow: hidden">
            <form>
                <input class="easyui-checkbox" name="fruit" value="Apple" label="定性参数:" labelAlign="right"
                       checked="true">
                <input class="easyui-checkbox" name="fruit" value="Apple" label="定量参数:" labelAlign="right"
                       checked="true">
                <select id="qbIntervalSelect" class="easyui-combobox" name="dept" style="width:200px;" label="轮播间隔:" labelAlign="right"
                        data-options="onChange:function(newValue,oldValue){qbIntervalTime(newValue)}">
                    <option value="10">10秒</option>
                    <option value="3">3秒</option>
                    <option value="20">20秒</option>
                    <option value="40">40秒</option>
                    <option value="60">1分钟</option>
                </select>
            </form>
        </div>
        <div data-options="region:'west',split:false" style="width:25%;padding: 5px">
            <form id="dataForm" method="post">
                <div style="margin-top:15px">
                    <input class="easyui-textbox" name="TETEILNR" style="width:100%;padding-left: 20px"
                           data-options="label:'<font>零件号:</font>',editable:false,labelWidth:120">
                </div>
                <div style="margin-top:15px">
                    <input class="easyui-textbox" name="TEBEZEICH" style="width:100%;padding-left: 20px"
                           data-options="label:'<font>零件名:</font>',editable:false,labelWidth:120">
                </div>
                <div style="margin-top:15px">
                    <input class="easyui-textbox" name="TEKOSTST" style="width:100%;padding-left: 20px"
                           data-options="label:'<font>产线名:</font>',editable:false,labelWidth:120">
                </div>
                <div style="margin-top:15px">
                    <input class="easyui-textbox textfont" name="MEMERKBEZ" style="width:100%;padding-left: 20px"
                           data-options="label:'<font>参数名:</font>',editable:false,labelWidth:120">
                </div>
                <div style="margin-top:15px">
                    <input class="easyui-textbox" id="MENENNMAS" name="MENENNMAS" style="width:100%;padding-left: 20px"
                           data-options="label:'<font>名义值:</font>',editable:false,labelWidth:120">
                </div>
                <div style="margin-top:15px">
                    <input class="easyui-textbox" id="MEOGW" name="MEOGW" style="width:100%;padding-left: 20px"
                           data-options="label:'<font>上公差上限:</font>',editable:false,labelWidth:120">
                </div>
                <div style="margin-top:15px">
                    <input class="easyui-textbox" id="MEUGW" name="MEUGW" style="width:100%;padding-left: 20px"
                           data-options="label:'<font>下公差上限:</font>',editable:false,labelWidth:120">
                </div>
                <input type="hidden" id="MEMERKART" name="MEMERKART">
            </form>
        </div>
        <div id="qbShowCharts" data-options="region:'center'" style=""></div>
    </div>
</div>
</body>
</html>