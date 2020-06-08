<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/mm.css" />
	<script type="text/javascript">
		$(function(){
			$('#mmPanel').panel('refresh','<%=basePath%>mc/initMissionManageOne?factoryName='+encodeURI('${mmFactoryName }'));
			//$('div:contains("零件详情")').append("<span style='float:right;'>节点</span>"); 
		
		})
		function goBack(){
			$('#mmDetailsPage').panel('close');
			$('#mmTwoLi').html('');
			$('#mmPanel').panel('open');
			$('#mmPanel').panel('resize');
		
		}
		function goToFactory(){
			var currentUrl = window.location.href;
  			window.location.href='<%=basePath%>main/factoryList?currentUrl='+currentUrl;
  		
  		}
	</script>
  </head>
  
  <body>
  		<!-- <div id="mmAcc" class="easyui-accordion" data-options="fit:true">
  			<div id="mmPanel" title="任务管理" data-options="" style="overflow:hidden;">
  				
  			</div>
  			<div id="mmDetailsPage" title="零件详情" data-options="" style="overflow:hidden;">
  				
  			</div>
  		</div> -->
  		 <div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
  			 	<div data-options="region:'north',split:false,border:false" style="height:30px;overflow: hidden;display: table-cell;vertical-align: middle;text-align: center;background-color:#f3f3f3;font-size:15px;">
	    			<span id="currentWsName"></span>
						<ul class="placeul">
							<li><a id="mmFactoryLi" onclick="goToFactory()" style="cursor:hand">${mmFactoryName }</a></li>
							<li><a id="mmTwoLi" onclick="goBack()" style="cursor:hand"></a></li>
						</ul>
	  			</div>
		  		<div data-options="region:'center',border:false" style="overflow: hidden;">
		  			<div id="mmPanel" class="easyui-panel" data-options="fit:true,border:false" style="overflow:hidden;">
  				
			  		</div>
			  		<div id="mmDetailsPage" class="easyui-panel" data-options="fit:true,closed:true,border:false" style="overflow:hidden;">
			  			<div class="easyui-layout" fit="true">
			  				<!-- <div data-options="region:'north',split:false" style="height:42px;padding:5px;overflow: hidden;">
			  					<a class="easyui-linkbutton" data-options="iconCls:'icon-back'" onclick="goBack()" style="float: right">返回</a>
			  				</div> -->
			  				<div id="mmDetailsPageCenterBox" data-options="region:'center'" ></div>
			  			</div>
			  		</div>
		  		</div>
		</div>
  		
  </body>
</html>
