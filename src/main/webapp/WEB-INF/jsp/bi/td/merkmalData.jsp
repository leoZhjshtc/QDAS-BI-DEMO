<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<head>

</head>
<body>
	<table id="merkmalTable">
		<thead>
			<tr>
				<th data-options="field:'METEIL',width:50,align:'center'">METEIL</th>
				<th data-options="field:'MEMERKMAL',width:50,align:'center'">MEMERKMAL</th>
				<th data-options="field:'MEMERKNR',width:50,align:'center'">MEMERKNR</th>
				<th data-options="field:'MEMERKBEZ',width:100,align:'center'">MEMERKBEZ</th>
				<th data-options="field:'MENENNMAS',width:50,align:'center'">MENENNMAS</th>
				<th data-options="field:'MEUGW',width:50,align:'center'">MEUGW</th>
				<th data-options="field:'MEOGW',width:50,align:'center'">MEOGW</th>
			</tr>
		</thead>
	</table>
	<div id="merkmalTb" style="padding: 10px">
		测量工序：<input class="easyui-textbox" id="merkmalName" name="merkmalName" style="width: 200px"> 
		<a id="merkmalSearch" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查找</a>
		<a id="cancelMerkmalSearch" class="easyui-linkbutton" data-options="iconCls:'icon-back'" style="float: right">取消查询</a>
	</div>
	<script type="text/javascript">
		$(function(){
			$('#merkmalTable').datagrid({
					url:'<%=basePath%>teil/getMerkmalData?teilId='+${teilId},
					toolbar:'#merkmalTb',
					border : false,
					pagination : false,
					fit : true,
					rownumbers : true,
					fitColumns : true,
					singleSelect : true,
					checkOnSelect : true,
					selectOnCheck : true,
					pageSize : 20,
					pageList : [ 20, 40, 60, 80 ],
					dndRow : false,
					enableHeaderClickMenu : false,
					enableHeaderContextMenu : true,
					enableRowContextMenu : false,
					rowTooltip : false,
					onSelect:function(rowIndex, rowData){
						var row1=$('#teilTable').datagrid('getSelected');
						var row2=$('#merkmalTable').datagrid('getSelected');
						$('#wertevarAcc').panel({
							href:'<%=basePath%>teil/initWertevarPage?teilId='+row1.TETEIL+'&merkmalId='+row2.MEMERKMAL
						});
						$('#teilAcc').accordion('select',2);
						var accSelected = $('#teilAcc').accordion('getPanel',1);
						accSelected.panel('setTitle', '测量参数(参数名:'+row2.MEMERKBEZ+')');
						/* $('#wertevarTable').datagrid('reload',{
							teilId:row1.TETEIL,
							merkmalId:row2.MEMERKMAL
						}); */
					}
				});
				$('#merkmalSearch').click(function(){
					var row=$('#teilTable').datagrid('getSelected');
					$('#merkmalTable').datagrid('reload',{
						merkmalName:$('#merkmalName').textbox('getValue')
					})
				});
				$('#cancelMerkmalSearch').click(function(){
					var row=$('#teilTable').datagrid('getSelected');
					$('#merkmalName').textbox('setValue','');
					$('#merkmalTable').datagrid('reload',{
						merkmalName:$('#merkmalName').textbox('getValue'),
						teilId:row.TETEIL
					})
					$('#teilAcc').accordion('select',0);
					$('#wertevarTable').datagrid('loadData', { total: 0, rows: [] });
				})
			})
	</script>
</body>
</html>

