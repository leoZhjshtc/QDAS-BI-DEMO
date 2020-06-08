<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
	  <script type="text/javascript" src="<%=basePath%>resources/js/jquery-1.12.4.min.js"></script>
	  <script type="text/javascript" src="<%=basePath%>resources/easyui/jquery.easyui.min.js"></script>
	  <script type="text/javascript" src="<%=basePath%>resources/easyui/locale/easyui-lang-zh_CN.js"></script>
	  <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/easyui/themes/gray/easyui.css" />
	  <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/easyui/themes/color.css" />
	  <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/easyui/themes/icon.css" />
	  <link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" type="image/x-icon">
	<script type="text/javascript">
		$(function(){
			var data = [{
				text: '产线设置',
				iconCls: 'icon-shezhi',
				state: 'open',
				children: [{
					text: '工厂设置',
					url:'<%=basePath%>system/initFactorySetup'
				},{
					text: '车间设置',
					url:'<%=basePath%>system/initWorkShopPage'
				}]
			},{
				text: '应用设置',
				iconCls: 'icon-shezhi',
				children: [{
					text: '质量监控设置',
					url:'<%=basePath%>system/initQmSetUp'
				},{
					text: '任务管理设置',
					url:'<%=basePath%>system/initMmSetup'
				},{
					text: '手动更新',
					url:'<%=basePath%>system/initQaSetUp'
				}]
			}];
		   /* var menudata;
		    $.ajax({
		    	type:'post',
		    	url:'<%=basePath%>system/getMenuData',
		    	async: false,
		    	success:function(data){
		    		menudata=data;
		    	}
		    })*/
			$('#sm').sidemenu({
				data:data,
				onSelect:function(item){
					$('#centerDiv').panel({
						href:item.url
					})
					$('#addplWin').dialog('close');
				}
			});
			$('#_easyui_tree_1').addClass('tree-node-selected');
			$('#centerDiv').panel({
				href:'<%=basePath%>system/initFactorySetup'
			})
		
		})
	</script>
  </head>
  
  <body>
    <div class="easyui-layout" fit="true"> 
    	<div data-options="region:'north',split:false,collapsible:false,border:false" style="background-color: #2dc3e8;height: 60px;overflow: hidden;" >
			<div style="float: left;margin-left: 20px;height: 100%"><small><a href="<%=basePath%>main/factoryList" > <img src="<%=basePath%>resources/images/qdas-logo.png" alt="" /></a></small></div>
		</div>
	    <div data-options="region:'west',title:'菜单',split:false" style="background:#eee;width:150px;">
	    	<div id="sm" style="width: 100%"></div>
	    </div>
	    <div id="centerDiv" data-options="region:'center'"></div>
    </div>
  </body>
</html>
