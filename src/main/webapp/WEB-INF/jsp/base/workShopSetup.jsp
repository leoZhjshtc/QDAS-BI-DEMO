<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../base/meta.jsp"%>
<html>
	<head>
	
	</head>
	<body>
		<table id="workShopTable">
			<thead>
				<tr>
					<th data-options="field:'workShop_name',width:50,align:'center'">车间名</th>
					<th data-options="field:'workShop_drawing',width:50,align:'center'">车间图纸</th>
					<th data-options="field:'factory_name',width:50,align:'center'">工厂</th>
				</tr>
			</thead>
		</table>
		<div id="workShopTB" style="padding: 5px">
			<a id="addWorkShop" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加车间</a>
			<a id="delWorkShop" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">删除车间</a>
			<a id="openPl" class="easyui-linkbutton" data-options="iconCls:'icon-shezhi'">设置产线</a>
		</div>
		<div id="addWorkShopDia" class="easyui-dialog" data-options="title:'新增车间',modal:true,closed:true,buttons:[{
				text:'确定',
				handler:addWorkShop
			},{
				text:'取消',
				handler:function(){$('#addWorkShopDia').dialog('close')}
			}]" style="padding: 10px;width: 400px">
			<form id="addwpForm" method="post" enctype="multipart/form-data"> 
				<input name="workShopName" id="workShopName" class="easyui-textbox" type="text" data-options="label: '车间名:',required:true" style="width:300px">
				<input class="easyui-combobox" id="factoryNameCom" name="factoryName" style="width:300px"
				data-options="valueField:'factory_name',textField:'factory_name',url:'<%=basePath%>system/getFactoryData',label:'工厂名',editable:false,required:true, panelHeight:150">
				<input name="workShopDrawing" id="workShopDrawing" class="easyui-filebox" style="width:300px" data-options="buttonText: '选择文件',accept:'image/*',required:true">
			</form>
		</div>
		<div id="plWin" class="easyui-dialog" data-options="title:'产线设置',resizable:false,modal:true,closed:true">
			<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
				<div data-options="region:'north',split:false,collapsible:false" style="height:42px;background:#eee;padding: 5px;overflow: hidden">
					<a id="addpl" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加产线</a>
					<!-- <a id="editpl" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">编辑产线</a> -->
					<a id="delpl" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">删除产线</a>
					
				</div>
				<div id="plCenterbox" data-options="region:'center'">
				
				
				
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function(){
			$('#plWin').height(window.innerHeight*0.9);
			$('#plWin').width(window.innerWidth*0.9);
				<%-- $('#factoryNameCom').combobox({
				    url:'<%=basePath%>system/getFactoryData',
				    label:'工厂名:',
					editable:false,
				    required:true,
				    valueField:'factory_name',
				    textField:'factory_name',
				    panelHeight:150
				}); --%>
				$('#addpl').click(function(){
					$('#addplWin').dialog('open');
					$('#newPlDopdiv').show();
					$('#newPointDopdiv').show();
				})
				$('#delpl').click(function(){
					<%-- $.post('<%=basePath%>system/delProductLine',{productLineName:$('#selectPl').val(),factoryName:'1'});
					$('#centerDiv').panel('refresh','<%=basePath%>system/initProductLineSetup?factoryName=1'); --%>
					if($('#selectPl').val()==''){
						$.messager.alert('错误','请先选择一个产线!','info');
						return false;
					}
					$.messager.confirm('提示信息', '确定删除这个产线吗?', function(r){
						if (r){
							var row = $('#workShopTable').datagrid('getSelected');
							$.ajax({
								type:'post',
								url:'<%=basePath%>system/delProductLine',
								data:{
									productLineName:$('#selectPl').val(),
									factoryName:row.factory_name,
									workShopName:$('#workShopNamePL').val()
								},
								success:function(data){
									$('#plCenterbox').panel('refresh','<%=basePath%>system/initProductLineSetup?factoryName='+encodeURI(row.factory_name)+'&workShopDrawingStr='+$('#workShopDrawingPL').val()+'&workShopName='+encodeURI($('#workShopNamePL').val()));
								}
							})
						}
					});
				})
				$('#delWorkShop').click(function(){
					var row = $('#workShopTable').datagrid('getSelected');
					if(row==null){
						$.messager.alert('错误','选择一行车间','error');
						return false;
					}
					$.messager.confirm('提示信息','确定删除吗？',function(r){
					    if (r){
					        $.ajax({
					        	type:'post',
								url:'<%=basePath%>system/delWorkShop',
					        	data:{
									workShopName:row.workShop_name,
									workShopDrawingStr:row.workShop_drawing,
									factoryName:row.factory_name
					        	},
					        	success:function(data){
					        		if(data.error==0){
					        			$.messager.show({
											title:'提示信息',
											msg:'操作成功',
											timeout:5000,
											showType:'slide'
										});
										$('#workShopTable').datagrid('reload');
					        		}else{
					        			$.messager.show({
											title:'提示信息',
											msg:'操作失败',
											timeout:5000,
											showType:'slide'
										});
										$('#workShopTable').datagrid('reload');
					        		}
					        	}
					        })
					    }
					});
				
				})
			})
			$('#workShopTable').datagrid({
				url:'<%=basePath%>system/getWorkShop',
					toolbar:'#workShopTB',
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
			$('#addWorkShop').click(function(){
				$('#factoryNameCom').combobox('reload');
				$('#addWorkShopDia').dialog('open');
			})
			$('#openPl').click(function(){
				var row = $('#workShopTable').datagrid('getSelected');
				if(row==null){
					$.messager.alert('错误','选择一行车间','error');
					return false;
				}
				$('#plWin').dialog('open');
				$('#plCenterbox').panel('refresh','<%=basePath%>system/initProductLineSetup?factoryName='+encodeURI(row.factory_name)+'&workShopName='+encodeURI(row.workShop_name)+'&workShopDrawingStr='+row.workShop_drawing);
			})
			function addWorkShop(){
				$.messager.progress();
				var rows=$('#workShopTable').datagrid('getData').rows;
				for(var i=0;i<rows.length;i++){
					if($('#workShopName').textbox('getValue')==rows[i].workShop_name&$('#factoryNameCom').combobox('getValue')==rows[i].factory_name){
						$.messager.alert('错误','重复的车间信息','error');
						$.messager.progress('close');
						return false;
					}
				}
				$('#addwpForm').form('submit', {
					url:'<%=basePath%>system/addWorkShop',
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
						}
						$('#workShopTable').datagrid('reload')
						$('#addWorkShopDia').dialog('close');
					}
				});
			}
		</script>
	</body>
</html>