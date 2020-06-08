<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<head>

</head>
<body>
	<table id="teilTable">
		<thead>
			<tr>
				<th data-options="field:'TETEIL',width:50,align:'center',sortable:true">TETEIL</th>
				<th data-options="field:'TETEILNR',width:100,align:'center'">TETEILNR</th>
				<th data-options="field:'TEBEZEICH',width:100,align:'center'">TEBEZEICH</th>
				<th data-options="field:'TEWERKSTOFFNR',width:100,align:'center'">TEWERKSTOFFNR</th>
			</tr>
		</thead>
	</table>
	<div id="teilTb" style="padding: 10px">
		零件号：<input class="easyui-textbox" id="teilNum" name="teilNum"style="width: 200px"> 
		零件名：<input class="easyui-textbox"id="teilName" name="teilName" style="width: 200px"> 
		<a id="teilSearch" class="easyui-linkbutton"data-options="iconCls:'icon-search'">零件查找</a> 
		<a id="cancelTeilSearch" class="easyui-linkbutton" data-options="iconCls:'icon-back'" style="float: right">取消查询</a>
	</div>
	<script type="text/javascript">
		$(function(){
			$('#teilTable').datagrid({
				url:'<%=basePath%>teil/getTeilData',
				toolbar:'#teilTb',
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
					var row=$('#teilTable').datagrid('getSelected');
					$('#merkmalAcc').panel({
						href:'<%=basePath%>teil/initMerkmalPage?teilId='+row.TETEIL
					});
					$('#teilAcc').accordion('select',1);
					var accSelected = $('#teilAcc').accordion('getPanel',0);
					accSelected.panel('setTitle', '零件(零件号:'+row.TETEILNR+')');
					/* $('#merkmalTable').datagrid('reload',{
						teilId:row.TETEIL
					}) */
				}
			});
			$('#teilSearch').click(function(){
				$('#teilTable').datagrid('reload',{
					teilNum:$('#teilNum').textbox('getValue'),
					teilName:$('#teilName').textbox('getValue')
				});
			});
			$('#cancelTeilSearch').click(function(){
				$('#teilNum').textbox('setValue','');
				$('#teilName').textbox('setValue','');
				$('#teilTable').datagrid('reload',{
					teilNum:$('#teilNum').textbox('getValue'),
					teilName:$('#teilName').textbox('getValue')
				});
				$('#merkmalTable').datagrid('loadData', { total: 0, rows: [] });
				$('#wertevarTable').datagrid('loadData', { total: 0, rows: [] });
			})
		
		
		})
	</script>
</body>
</html>

