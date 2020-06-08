<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../base/meta.jsp"%>
<html>
	<head>
	
	</head>
	<body>
		<table id="factoryTable">
			<thead>
				<tr>
					<th data-options="field:'factory_name',width:50,align:'center'">工厂名</th>
					<th data-options="field:'factory_icon',width:50,align:'center'">图标</th>
				</tr>
			</thead>
		</table>
		<div id="factoryTB" style="padding: 5px">
			<a id="addFactory" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加工厂</a>
			<a id="delFactory" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">删除工厂</a>
		</div>
		<div id="addFactoryDia" class="easyui-dialog" data-options="title:'新增工厂',modal:true,closed:true,buttons:[{
				text:'确定',
				handler:addFactory
			},{
				text:'取消',
				handler:function(){$('#addFactoryDia').dialog('close')}
			}]" style="padding: 10px;width: 400px">
			<form id="addForm" method="post" enctype="multipart/form-data"> 
				<input name="factoryName" id="factoryName" class="easyui-textbox" type="text" data-options="label: '工厂名:',required:true" style="width:300px">
				<input name="factoryIcon" id="factoryIcon" class="easyui-filebox" style="width:300px" data-options="buttonText: '选择文件',accept:'image/*',required:true">
			</form>
		</div>
		<script type="text/javascript">
			$('#factoryTable').datagrid({
				url:'<%=basePath%>system/getFactoryData',
					toolbar:'#factoryTB',
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
			})
			$('#addFactory').click(function(){
				$('#addFactoryDia').dialog('open');
				
			
			})
			$('#delFactory').click(function(){
				var rows=$('#factoryTable').datagrid('getSelections');
				if(rows.length==0){
					$.messager.alert('错误','请选择一行记录进行删除','info');
					return false ;
				}
				$.messager.confirm('Confirm', '确定删除这条记录吗？', function(r){
					if (r){
						$.ajax({
							type:'post',
							url:'<%=basePath%>system/delFactory',
							data:{
								factoryName:rows[0].factory_name,
								factoryIconStr:rows[0].factory_icon
							},
							success:function(data){
								$.messager.show({
											title:'提示信息',
											msg:data.message,
											timeout:5000,
											showType:'slide'
										});
										$('#factoryTable').datagrid('reload');
							}
						})
					}
				});
			})
			function addFactory(){
				$.messager.progress();
				var rows=$('#factoryTable').datagrid('getData').rows;
				for(var i=0;i<rows.length;i++){
					if($('#factoryName').textbox('getValue')==rows[i].factory_name){
						$.messager.alert('错误','工厂名已存在','error');
						$.messager.progress('close');
						return false;
					}
				}
				$('#addForm').form('submit', {
					url:'<%=basePath%>system/addFactory',
					onSubmit: function(param){
						var isValid = $(this).form('validate');
						if (!isValid){
							$.messager.progress('close');
						}
						return isValid;
					},
					success: function(data){
						var obj=JSON.parse(data);
						$.messager.progress('close');
						if(obj.error==1){
							$.messager.alert('错误',obj.message,'error');
						}else{
							$.messager.show({
								title:'提示',
								msg:'添加成功',
								timeout:3000,
								showType:'slide'
							});
							$('#factoryTable').datagrid('reload');
						}
						$('#addFactoryDia').dialog('close');
					}
				});
			}
		</script>
	</body>
</html>