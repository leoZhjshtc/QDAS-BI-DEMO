<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'west',title:'参数信息',split:true,border:false" style="width:70%;">
        <table id="qaMerkmalDetailsTable">
            <thead>
            <tr>
                <th field="ck" checkbox="true"></th>
                <th data-options="field:'MEMERKBEZ',width:100,align:'left'">参数名</th>
                <th data-options="field:'MENENNMAS',width:50,align:'center'">名义值</th>
                <th data-options="field:'MEUGW',width:50,align:'center'">下公差限</th>
                <th data-options="field:'MEOGW',width:50,align:'center'">上公差限</th>
                <th data-options="field:'MEEINHEITTEXT',width:50,align:'center'">单位</th>
                <th data-options="field:'aa',width:50,align:'center',formatter:merkmalPpassRateFormatter">合格率</th>
                <th data-options="field:'CPK',width:50,align:'center'">CPK</th>
                <th data-options="field:'CPKbtn',width:100,align:'center',formatter:cpkBtnFormatter">CPK</th>
            </tr>
            </thead>
        </table>
    </div>

    <div id="chartsDiv" data-options="region:'center',border:false,title:'图表',onResize:function(){merkmalChartResize()}"
         style="overflow: auto;"></div>
   <%-- <div id="tableBar">
        <a id="cpk125" style="float: right" class="easyui-linkbutton" data-options="iconCls:'icon-search'">获取近125条数据CPK</a>
        <a id="cpkByTime" style="float: right" class="easyui-linkbutton" data-options="iconCls:'icon-search'">获取近24小时数据CPK</a>
    </div>--%>
</div>
<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
<script type="text/javascript">
    var qaChartArr = new Array();
    $('#qaMerkmalDetailsTable').datagrid({
        url: '<%=basePath%>gqb/getMerkmalRecent24HoursData',
        queryParams: {
            teilId: '${qaMerkmalTeilId}'
        },
        // toolbar:'#tableBar',
        fit: true,
        fitColumns: true,
        striped: true,
        rownumbers: true,
        singleSelect: true,
        selectOnCheck: false,
        checkOnSelect: false,
        onLoadSuccess: function (data) {
            var rows = data.rows;
            $(".datagrid-header-check").html("");
        },
        onCheck: function (index, row) {
            initChart(row);
        },
        onUncheck: function (index, row) {
            $('#teil'+row.METEIL+'merkmal'+row.MEMERKMAL).remove();
            for(var i=0;i<qaChartArr.length;i++){
                if(qaChartArr[i].teilId==row.METEIL&qaChartArr[i].merkmalId==row.MEMERKMAL){
                    qaChartArr.splice(i, 1);
                }
            }
        },
        onDblClickRow: function (index, row) {
            /*$('#dztDIV').dialog('open');
            $.ajax({
                type:'post',
                url:'

            <%=basePath%>qa/getDztChartData',
                data:{
                    teilId:row.METEIL,
                    merkmalId:row.MEMERKMAL,
                    startTime:startTimeQA,
                    endTime:endTimeQA
                },
                success:function(data){
                    $('#dztDataTable').datagrid('loadData',data);
                }
            })*/
        }
    })

    function initChart(row) {
        $('#chartsDiv').append('<div id="teil' + row.METEIL + 'merkmal' + row.MEMERKMAL + '" style="width: 99%;height: 300px;"></div>');
        if (row.MEMERKART != 1) {
            var upLimitData = row.MEOGW;
            var downLimitData = row.MEUGW;
            var chartTitle = row.MEMERKBEZ;
            var mData = row.MENENNMAS;
            dataList = row.wvList;
            var xValues = new Array();
            var yValues = new Array();
            for (var i = 0; i < dataList.length; i++) {
                xValues.push(dataList[i].WVDATZEIT);
                yValues.push(dataList[i].WVWERT);
            }
            var lineCharts = new Object();
            lineCharts.linechart = initQaLineChart('teil' + row.METEIL + 'merkmal' + row.MEMERKMAL, xValues, yValues, upLimitData, downLimitData, mData, chartTitle);
            lineCharts.teilId = row.METEIL;
            lineCharts.MEMERKART = row.MEMERKART;
            lineCharts.merkmalId = row.MEMERKMAL;
            qaChartArr.push(lineCharts);
        } else {
            var chartTitle = row.MEMERKBEZ;
            var xData = ['合格', '不合格'];
            var yData = [];
            var pieArr = [];
            var okCount = 0;
            var nokCount = 0;
            var title;
            for (var i = 0; i < row.wvList.length; i++) {
                if (row.MEMERKART == '1') {
                    if (row.wvList[i].WVWERT.toString().indexOf('.') !== 0 & parseFloat(row.wvList[i].WVWERT.toString().substring(row.wvList[i].WVWERT.toString().indexOf(".") - 1) > 0)) {
                        nokCount += 1;
                    }
                } else {
                    if ((row.MEUGW !== undefined & row.MEUGW !== '' & row.MEUGW !== 'null' & parseFloat(row.MEUGW) > parseFloat(row.wvList[i].WVWERT))
                        | (row.MEOGW !== undefined & row.MEOGW !== '' & row.MEOGW !== 'null' & parseFloat(row.MEOGW) < parseFloat(row.wvList[i].WVWERT))) {
                        nokCount += 1;
                    }
                }
            }
            okCount = ((row.wvList.length - nokCount) / row.wvList.length * 100).toFixed(2);
            nokCount=100-okCount;
            yData = [okCount, nokCount];
            pieArr = [{name: '合格', value: okCount}, {name: '不合格', value: nokCount}];
            var lineCharts = new Object();
            lineCharts.linechart = initBarAndPie('teil' + row.METEIL + 'merkmal' + row.MEMERKMAL, xData, yData, pieArr, chartTitle);
            lineCharts.teilId = row.METEIL;
            lineCharts.merkmalId = row.MEMERKMAL;
            lineCharts.MEMERKART = row.MEMERKART;
            qaChartArr.push(lineCharts);
        }

    }

    function merkmalPpassRateFormatter(value, rowData, rowIndex) {
        var nokCount = 0
        for (var i = 0; i < rowData.wvList.length; i++) {
            if (rowData.MEMERKART == '1') {
                if (rowData.wvList[i].WVWERT.toString().indexOf('.') !== 0 & parseFloat(rowData.wvList[i].WVWERT.toString().substring(rowData.wvList[i].WVWERT.toString().indexOf(".") - 1) > 0)) {
                    nokCount += 1;
                }
            } else {
                if ((rowData.MEUGW !== undefined & rowData.MEUGW !== '' & rowData.MEUGW !== 'null' & parseFloat(rowData.MEUGW) > parseFloat(rowData.wvList[i].WVWERT))
                    | (rowData.MEOGW !== undefined & rowData.MEOGW !== '' & rowData.MEOGW !== 'null' & parseFloat(rowData.MEOGW) < parseFloat(rowData.wvList[i].WVWERT))) {
                    nokCount += 1;
                }
            }
        }
        var passRate = ((rowData.wvList.length - nokCount) / rowData.wvList.length * 100).toFixed(2) + '%';
        return passRate;
    }

    function merkmalChartResize() {
        if(qaChartArr.length!=0){
            for(var i=0;i<qaChartArr.length;i++){
                qaChartArr[i].linechart.resize()
            }
        }
    }
    function cpkBtnFormatter(value,row,index){
        return '<input type="button" style="width:50%" value="近125" onclick="getCPKbyDate(1,'+index+','+row.METEIL+','+row.MEMERKMAL+')">'+
            '<input type="button" style="width:50%" value="近24H" onclick="getCPKbyDate(2,'+index+','+row.METEIL+','+row.MEMERKMAL+')">';
    }
    function getCPKbyDate(type,index,teilId,merkmalId) {
        $.ajax({
            type:'post',
            data:{
                teilId:teilId,
                merkmalId:merkmalId,
                type:type,
                startTime:startTime,
                endTime:endTime
            },
            url:'<%=basePath%>gqb/getCpkData',
            beforeSend:function(){
                $('#qaMerkmalDetailsTable').datagrid('updateRow',{
                    index: index,
                    row: {
                        CPK:'<img style="width:32px;height:30px;" src=\"<%=basePath%>resources/images/qdasLoading.gif\"/>'
                    }
                });
            },
            success:function (data) {
                $('#qaMerkmalDetailsTable').datagrid('updateRow',{
                    index: index,
                    row: {
                        CPK:data.cpk
                    }
                });
            }
        })
    }
</script>
</body>
</html>
