<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'north',split:false" style="height:80px;padding: 5px">
        <div>
            零件号(K1001)：<input id="mmTeilNum" style="width:150px">
            零件名(K1002)：<input id="mmTeilName" style="width:150px">
            (K1003)：<input id="mmTeilK1003" style="width:150px">
            <a id="mmSearchBtn" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查找</a>
        </div>
        <div style="margin-top: 5px">
            <div style="float: left">
                开始时间：<input id="mmStartTime" class="easyui-datetimebox" data-options="onChange:function(newValue, oldValue){mmDateSearch(newValue,1)}" style="width:150px">
                结束时间：<input id="mmEndTime" class="easyui-datetimebox" data-options="onChange:function(newValue, oldValue){mmDateSearch(newValue,2)}" style="width:150px">
            </div>
            <form id="radioForm" style="float: left;margin: 5px">
                <input class="easyui-radiobutton"
                       data-options="checked:true,onChange:function(checked){if(checked){timeRadioClick(1)}}"
                       name="mmTimeRadio" value="1" label="今日:" labelAlign="right">
                <input class="easyui-radiobutton"
                       data-options="onChange:function(checked){if(checked){timeRadioClick(2)}}"
                       name="mmTimeRadio" value="2" label="昨日:" labelAlign="right">
                <input class="easyui-radiobutton"
                       data-options="onChange:function(checked){if(checked){timeRadioClick(3)}}"
                       name="mmTimeRadio" value="7" label="这周:" labelAlign="right">
            </form>
        </div>
    </div>
    <div data-options="region:'west',title:'数据',split:true,collapsed:true" style="width:40%;">
        <table id="planTable" class="easyui-datagrid" data-options="fitColumns:true,singleSelect:true,fit:true,onClickRow:tableClick">
            <thead>
            <tr>
                <th data-options="field:'TETEILNR',width:100,align:'center'">零件号(K1001)</th>
                <th data-options="field:'TEBEZEICH',width:100,align:'center'">零件名(K1002)</th>
                <th data-options="field:'TEKURZBEZEICH',width:100,align:'center'">项目名(K1003)</th>
                <th data-options="field:'TEAUFTRAGSTR',width:100,align:'center'">工序(K1053)</th>
                <th data-options="field:'TEABT',width:100,align:'center'">产品组(K1101)</th>
                <th data-options="field:'TEMASCHINENR',width:100,align:'center'">产线(K1081)</th>
                <th data-options="field:'TEPREINRBEZ',width:100,align:'center'">测量设备(K1206)</th>
                <th data-options="field:'TEWERK',width:120,align:'center'">工厂(K1303)</th>
                <th data-options="field:'WVDATZEIT',width:120,align:'center'">测量时间</th>
            </tr>
            </thead>
        </table>
    </div>
    <div id="mmChartDiv" data-options="region:'center',title:'图表',onResize:function(){chartResize()}" style="">

    </div>
</div>
<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mmChart.js"></script>
<script type="text/javascript">
    var mmchart;
    $('#mmTeilNum').textbox();
    $('#mmTeilName').textbox();
    $('#mmTeilK1003').textbox();
    getChartData();
    $('#mmSearchBtn').click(function () {
        getChartData();
    });
    function timeRadioClick(checked) {
        var now = new Date();
        if (checked == 1) {
            mmStartTime = now.format('yyyy-MM-dd 00:00:00');
            mmEndTime='';
        } else if (checked == 2) {
            var searchTime = now.getTime() - (86400000);
            var yesday = new Date(searchTime)
            mmStartTime = yesday.format('yyyy-MM-dd 00:00:00');
            mmEndTime = now.format('yyyy-MM-dd 00:00:00');
        } else if (checked == 3) {
            var weekStartDate = new Date(now.getFullYear(), now.getMonth(), now.getDate() - now.getDay());
            mmStartTime = weekStartDate.format('yyyy-MM-dd 00:00:00');
            mmEndTime='';
        }
        $('#mmStartTime').datetimebox('setValue','');
        $('#mmEndTime').datetimebox('setValue','');
        getChartData();
    }
    function mmDateSearch(newValue,index) {
        if(index==1){
            if($('#mmEndTime').datetimebox('getValue')!=''&newValue>$('#mmEndTime').datetimebox('getValue')){
                $.messager.alert('信息','开始时间不得大于结束时间!','info');
            }else{
                mmStartTime=newValue;
                mmEndTime=$('#mmEndTime').datetimebox('getValue');
                getChartData();
            }
        }else{
            if($('#mmStartTime').datetimebox('getValue')!=''&newValue<$('#mmStartTime').datetimebox('getValue')){
                $.messager.alert('信息','开始时间不得大于结束时间!','info');
            }else{
                mmStartTime=$('#mmStartTime').datetimebox('getValue');
                mmEndTime=newValue;
                getChartData();
            }

        }
        $('#radioForm').find('.easyui-radiobutton').each(function (index,ele) {
            $(ele).radiobutton('uncheck');
        })
    }
    function getChartData() {

        $.ajax({
            type: 'post',
            url: '<%=basePath%>getragMissionManageChartData',
            data: {
                teilNum:$('#mmTeilNum').textbox('getValue'),
                teilName:$('#mmTeilName').textbox('getValue'),
                teilK1003:$('#mmTeilK1003').textbox('getValue'),
                startTime: mmStartTime,
                endTime: mmEndTime
            },
            beforeSend: function () {
                initLoading('mmChartDiv', 'loading1')
            },
            success: function (data) {
                if (data.length > 0) {
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
                        $('#mmTwoLi').html("> 主页面");
                        $('#mmPanel').panel('close');
                        $('#mmDetailsPage').panel('open');
                        $('#mmDetailsPage').panel('resize');
                        $('#mmDetailsPageCenterBox').panel('refresh', '<%=basePath%>initMissionManageDetailsPage?teilId=' + params.data.teilId + '&wvwertnr=' + params.data.wvwertnr);
                    });
                }
                removeLoading('loading1');
                loadTableData(data);
            }
        })
    }
    function loadTableData(data) {
        var tableData=new Array();
        for(var i=0;i<data.length;i++){
            for(var j=0;j<data[i].wvnrList.length;j++){
                var obj=new Object();
                obj.TETEILNR=data[i].TETEILNR;
                obj.TEBEZEICH=data[i].TEBEZEICH;
                obj.TEKURZBEZEICH=data[i].TEKURZBEZEICH;
                obj.TEPREINRBEZ=data[i].wvnrList[j].TEPREINRBEZ;
                obj.TEAUFTRAGSTR=data[i].wvnrList[j].TEAUFTRAGSTR;
                obj.TEMASCHINENR=data[i].wvnrList[j].TEMASCHINENR;
                obj.TEABT=data[i].wvnrList[j].TEABT;
                obj.TEWERK=data[i].wvnrList[j].TEWERK;
                obj.TETEIL=data[i].wvnrList[j].TETEIL;
                obj.WVWERTNR=data[i].wvnrList[j].WVWERTNR;
                obj.WVDATZEIT=data[i].wvnrList[j].wvList[0].WVDATZEIT;
                tableData.push(obj);
            }
        }
        $('#planTable').datagrid('loadData',tableData);
    }
    function tableClick(index,row) {
        $('#mmTwoLi').html("> 主页面");
        $('#mmPanel').panel('close');
        $('#mmDetailsPage').panel('open');
        $('#mmDetailsPage').panel('resize');
        $('#mmDetailsPageCenterBox').panel('refresh', '<%=basePath%>initMissionManageDetailsPage?teilId=' + row.TETEIL + '&wvwertnr=' + row.WVWERTNR);
    }
    function chartResize() {
        if (mmchart != null & mmchart != '') {
            mmchart.resize();
        }
    }
</script>
</body>
</html>
