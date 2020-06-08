<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div id="cc" class="easyui-layout" fit="true">
    <div data-options="region:'north',split:false,collapsible:false,border:false"
         style="height:120px;padding: 5px;overflow: hidden;">
        <div class="column"><span class="current">零件信息</span></div>
        <table style="width: 100%;background-color: #eeeeee">
            <tr>
                <td class="teilTD">零件号</td>
                <td class="teilTD">项目名称</td>
                <td class="teilTD">K1003</td>
                <td class="teilTD">产品组</td>
                <td class="teilTD">工序号</td>
                <td class="teilTD">工厂</td>
                <td class="teilTD">产线</td>
                <td class="teilTD">测量设备</td>
            </tr>
            <tr>
                <td class="teilTD">${infoMap.TETEILNR }</td>
                <td class="teilTD">${infoMap.TEBEZEICH }</td>
                <td class="teilTD">${infoMap.TEKURZBEZEICH }</td>
                <td class="teilTD">${infoMap.TEABT }</td>
                <td class="teilTD">${infoMap.TEAUFTRAGSTR }</td>
                <td class="teilTD">${infoMap.TEWERK }</td>
                <td class="teilTD">${infoMap.TEMASCHINENR }</td>
                <td class="teilTD">${infoMap.TEPREINRBEZ }</td>
            </tr>
        </table>
    </div>
    <div data-options="region:'center',border:false">
        <table id="detailsMerkmalTable" class="easyui-datagrid"
               data-options="url:'<%=basePath%>gqb/missionManageDetailsMerkmalTable',fitColumns:true,singleSelect:true,fit:true,rownumbers:true,
					  					queryParams: {
					  						teilId:'${infoMap.TETEIL }',
					  						wvwertnr:'${infoMap.wvwertnr }'

					  						}<%--,
					  						onClickCell:function(index,field,value)	{
					  							if(field=='MEMERKBEZ'){
					  								var rows=$(this).datagrid('getRows');
					  								openQaMerkmalDig(rows[index]);
					  							}
					  						}--%>

					  						">
            <thead>
            <tr>
                <th data-options="field:'MEMERKBEZ',width:100,align:'left'">参数名</th>
                <th data-options="field:'WVWERT',width:50,align:'center',formatter:valueFormatter">测量值</th>
                <th data-options="field:'MENENNMAS',width:50,align:'center'">名义值</th>
                <th data-options="field:'MEUGW',width:50,align:'center'">下公差</th>
                <th data-options="field:'MEOGW',width:50,align:'center'">上公差</th>
                <th data-options="field:'aa',width:50,align:'center',formatter:smileFormatter">结果</th>
                <th data-options="field:'PRVORNAME',width:50,align:'center'">测量人员</th>
                <th data-options="field:'WVDATZEIT',width:120,align:'center'">测量日期</th>
            </tr>
            </thead>
        </table>
    </div>
</div>
<!-- <div id="mmMerkmalAnilityDIV" style="display: none;"></div> -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/missionManage.css"/>
<style type="text/css">
    .teilTD {
        width: 10%;
        height: 26px;
        font-size: 14px;
        text-align: center;
        font-weight: bold;

    }
</style>
<script type="text/javascript">
    function valueFormatter(value, row, index) {
        if (row.MEMERKART == '1') {
            if (value.toString().indexOf('.') !== 0 & parseFloat(value.toString().substring(value.toString().indexOf(".") - 1) > 0)) {
                return '不合格';
            } else {
                return '合格';
            }
        } else {
            return value;
        }
    }

    function smileFormatter(value, row, index) {
        if (row.MEMERKART == '1') {
            if (row.WVWERT.toString().indexOf('.') !== 0 & parseFloat(row.WVWERT.toString().substring(row.WVWERT.toString().indexOf(".") - 1) > 0)) {
                return "<img src='<%=basePath %>resources/images/smile_NOK.png' style='height:30px'>";
            } else {
                return "<img src='<%=basePath %>resources/images/smile_OK.png' style='height:30px'>";
            }
        } else {
            if ((row.MEUGW !== '' & row.WVWERT < row.MEUGW) | (row.MEOGW !== '' & row.WVWERT > row.MEOGW)) {
                return "<img src='<%=basePath %>resources/images/smile_NOK.png' style='height:30px'>";
            } else if ((row.MENORMISTUN !== '' & row.WVWERT < row.MENORMISTUN) | (row.MENORMISTOB !== '' & row.WVWERT > row.MENORMISTOB)) {
                return "<img src='<%=basePath %>resources/images/smile_ALARM.png' style='height:30px'>";
            } else {
                return "<img src='<%=basePath %>resources/images/smile_OK.png' style='height:30px'>";
            }
        }

    }
</script>
</body>
</html>
