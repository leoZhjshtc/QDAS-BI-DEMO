<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'north',split:false" style="height:50px; padding: 5px;overflow: hidden">
        <form>
            <a id="lastWsPage"  class="easyui-linkbutton" data-options="iconCls:'icon-lastPage',disabled:true" style="margin: 0px">向前</a>
            <input id="workShopSwitch" class="easyui-switchbutton" data-options="checked:true,onText:'手动',offText:'自动',onChange:qbSwitchBtnChange" style="width: 100px" />
            <a id="nextWsPage"  class="easyui-linkbutton" style="margin: 0px" data-options="iconCls:'icon-nextPage',iconAlign:'right',disabled:true" >向后</a>
            <select id="qbIntervalSelect" class="easyui-combobox" name="dept" style="width:200px;" label="轮播间隔:" labelAlign="right"
                    data-options="onChange:function(newValue,oldValue){qbIntervalTime(newValue)},editable:false">
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
                <input class="easyui-textbox" name="TETEILNR" style="width:100%;padding-left: 5px"
                       data-options="label:'<font>零件号:</font>',editable:false,labelWidth:120">
            </div>
            <div style="margin-top:15px">
                <input class="easyui-textbox" name="TEBEZEICH" style="width:100%;padding-left: 5px"
                       data-options="label:'<font>零件名:</font>',editable:false,labelWidth:120">
            </div>
            <div style="margin-top:15px">
                <input class="easyui-textbox" name="TEKURZBEZEICH" style="width:100%;padding-left: 5px"
                       data-options="label:'<font>产品组:</font>',editable:false,labelWidth:120">
            </div>
            <div style="margin-top:15px">
                <input class="easyui-textbox textfont" name="MEMERKBEZ" style="width:100%;padding-left: 5px"
                       data-options="label:'<font>参数名:</font>',editable:false,labelWidth:120">
            </div>
            <div style="margin-top:15px">
                <input class="easyui-textbox" id="MENENNMAS" name="MENENNMAS" style="width:100%;padding-left: 5px"
                       data-options="label:'<font>名义值:</font>',editable:false,labelWidth:120">
            </div>
            <div style="margin-top:15px">
                <input class="easyui-textbox" id="MEOGW" name="MEOGW" style="width:100%;padding-left: 5px"
                       data-options="label:'<font>上公差上限:</font>',editable:false,labelWidth:120">
            </div>
            <div style="margin-top:15px">
                <input class="easyui-textbox" id="MEUGW" name="MEUGW" style="width:100%;padding-left: 5px"
                       data-options="label:'<font>下公差上限:</font>',editable:false,labelWidth:120">
            </div>
            <input type="hidden" id="MEMERKART" name="MEMERKART">
        </form>
    </div>
    <div id="qbShowCharts" data-options="region:'center',onResize:function(){qbShowChartResize()}" style=""></div>
</div>
<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
<script type="text/javascript">
    var pageIndex = 0;
    var lbLinechart;
    $(function () {
        plInterval = setInterval(plQbShow,1000*10);
        $('#lastWsPage').click(function () {
            pageIndex=pageIndex-2;
            plQbShow();
        });
        $('#nextWsPage').click(function () {
            plQbShow();
        });
    })
    function qbSwitchBtnChange(flag) {
        if(flag){
            plInterval=setInterval(plQbShow, parseInt($('#qbIntervalSelect').combobox('getValue'))*1000);
            $('#lastWsPage').linkbutton('disable');
            $('#nextWsPage').linkbutton('disable');
            $('#qbIntervalSelect').combobox('enable');
        }else{
            clearInterval(plInterval);
            $('#lastWsPage').linkbutton('enable');
            $('#nextWsPage').linkbutton('enable');
            $('#qbIntervalSelect').combobox('disable');
        }
    }
    function qbIntervalTime(time) {
        clearInterval(plInterval);
        plInterval=setInterval(plQbShow, time*1000);
    }
    function plQbShow() {
        pageIndex += 1;
        var selectAcc = $('#qbAcc').accordion('getSelected');
        var selectAccIndex = $('#qbAcc').accordion('getPanelIndex', selectAcc);
        var teilNum;
        var teilName;
        var teilK1003;
        var teilId;
        if(selectAccIndex==1){
            teilNum=$('#procedureTeilNum').val();
            teilName=$('#procedureTeilName').val();
            teilK1003=$('#procedureTeilK1003').val();
        }else if(selectAccIndex==2){
            teilId=$('#merkmalPageTeilId').val();
        }
        $.ajax({
            type: 'post',
            url: '<%=basePath%>qbGetrag/getQbShowFormInfo',
            data: {
                startTime: startTime,
                endTime: endTime,
                teilId:teilId,
                teilNum:teilNum,
                teilName:teilName,
                teilK1003:teilK1003,
                page: pageIndex
            },
            success: function (data) {
                $('#qbShowDiv').panel('setTitle','看板   '+pageIndex+" / "+data.total);
                $('#dataForm').form('load', data.rows);
                initQbShowChart(data.chartList);
                if(pageIndex==data.total){
                    pageIndex=0;
                }
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
    function qbShowChartResize() {
        if(lbLinechart!=undefined){
            lbLinechart.resize();
        }
    }
</script>
</body>
</html>
