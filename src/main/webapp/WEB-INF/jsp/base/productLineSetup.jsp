<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base/meta.jsp"%>
<html>
	<head>
		
	</head>
	<body>
		<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
				<input type="hidden" id="selectPl" name="selectPl">
				<input type="hidden" id="factoryNamePL" name="factoryNamePL" value="${factoryName}">
				<input type="hidden" id="workShopNamePL" name="workShopNamePL" value="${workShopName}">
				<input type="hidden" id="workShopDrawingPL" name="workShopDrawingPL" value="${workShopDrawing}">
			<div data-options="region:'center'" style="background-image: url(<%=basePath%>resources/images/drawing/${workShopDrawing });background-repeat: no-repeat;background-size:100% 100%;">
					<c:forEach items="${plList}" var="map">
						<a id="${map.productLine_name }" onclick="editPl(this)" class="easyui-linkbutton c1" data-options="size:'large'" 
							style="width:150px;height: 150px;position: absolute;top: ${map.productLine_topPosition};left: ${map.productLine_leftPosition}" >${map.productLine_name }</a>
							
						<img id="img${map.productLine_name }" src="<%=basePath%>resources/images/lvyuan.png" style="position: absolute;top: ${map.point_topPosition};left: ${map.point_leftPosition};width: 20px;height:20px"/>
					</c:forEach>
					<%-- <a class="easyui-linkbutton c1" data-options="size:'large'" style="width:100px;height: 100px;position: absolute;top: 30.39%;left: 20.43%" >123</a>
					<img id="img" src="<%=basePath%>resources/images/lvyuan.png" style="position: absolute;top: 50.46%;left: 18.45%;"/> --%>
					
					<div id="newPlDopdiv" class="easyui-draggable" data-options="onDrag:onDrag"><a class="easyui-linkbutton c6" data-options="size:'large'" style="width:150px;height: 150px;" >新产线</a></div>
					<div id="newPointDopdiv" class="easyui-draggable"><img src="<%=basePath%>resources/images/lanyuan.png" style="width: 20px;height:20px"/></div>
			</div>
		</div>
		<div style="width: 300px;height: 150px;padding: 10px" id="addplWin" class="easyui-dialog" data-options="title:'添加产线',closed:true,buttons:[{
				text:'确定',
				handler:addplDiv
			},{
				text:'取消',
				handler:function(){$('#addplWin').dialog('close');$('#newPlDopdiv').hide();$('#newPointDopdiv').hide();}
			}],onBeforeClose:function(){$('#newPlDopdiv').hide();$('#newPointDopdiv').hide();}">
				<!-- <input class="easyui-textbox" id="addPlname" name="addPlname" style="width:250px;" data-options="label:'产线名:',editable:true"> -->
				<input id="addPlname" name="addPlname" style="width:250px;" />
			</div>
		<div id="editplWin" class="easyui-dialog" data-options="title:'编辑产线',modal:true,closed:true"></div>
		<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qm.css" />
		<script type="text/javascript">
			$(function(){
				$('#newPlDopdiv').hide();
				$('#newPointDopdiv').hide();
				$('#merkmal').click(function(){
					$('#img').attr('src','<%=basePath%>resources/images/hongyuan.png');
				
				})
				$('#addPlname').combobox({
				    url:'<%=basePath%>system/getProductLineCombobox',
				    valueField:'TEKOSTST',
				    textField:'TEKOSTST',
				    label:'产线名:',
				    editable:false
				});
				
			})
			function editPl(pl){
				$('#plCenterbox > a').linkbutton({
				    iconCls:''
				});
				$(pl).linkbutton({
				    iconCls: 'icon-large-gou'
				});
				$('#selectPl').val($(pl).context.id);
			}
			function addplDiv(){
				$.messager.progress({
					title:'信息',
					text:'保存信息中...',
					interval:1000
				}); 
				var plTopPos=($('#newPlDopdiv').position().top*100/$('#plCenterbox').height()).toFixed(4);
				var plLeftPos=($('#newPlDopdiv').position().left*100/$('#plCenterbox').width()).toFixed(4);
				var pointTopPos=($('#newPointDopdiv').position().top*100/$('#plCenterbox').height()).toFixed(4);
				var pointLeftPos=($('#newPointDopdiv').position().left*100/$('#plCenterbox').width()).toFixed(4);
				var plName=$('#addPlname').combobox('getValue');
				$.ajax({
					type:'post',
					url:'<%=basePath%>system/addNewProductLine',
					data:{
						workShopName:$('#workShopNamePL').val(),
						factoryName:$('#factoryNamePL').val(),
						productLineName:plName,
						plTopPosition:plTopPos+'%',
						plLeftPosition:plLeftPos+'%',
						pointTopPosition:pointTopPos+'%',
						pointLeftPosition:pointLeftPos+'%'
					},
					success:function(data){
						if(data.message==1){
							$.messager.progress('close');
							$.messager.show({
									title:'提示信息',
									msg:'操作失败',
									timeout:3000,
									showType:'slide'
								});
						}else{
							$.messager.progress('close');
							$('#addplWin').dialog('close')
							$('#plCenterbox').panel('refresh','<%=basePath%>system/initProductLineSetup?factoryName='+$('#factoryNamePL').val()+'&workShopDrawingStr='+$('#workShopDrawingPL').val()+'&workShopName='+$('#workShopNamePL').val());
						}
					}
				})
			}
			function onDrag(e){
				var d = e.data;
				if (d.left < 0){d.left = 0}
				if (d.top < 0){d.top = 0}
				if (d.left + $(d.target).outerWidth() > $(d.parent).width()){
					d.left = $(d.parent).width() - $(d.target).outerWidth();
				}
				if (d.top + $(d.target).outerHeight() > $(d.parent).height()){
					d.top = $(d.parent).height() - $(d.target).outerHeight();
				}
			}
		</script>
	</body>
</html>