<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base/meta.jsp"%>
<head>
<title>bi Page</title>
<link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" type="image/x-icon">
<link href="<%=basePath %>resources/blueThemes/css/style.css" rel="stylesheet" type="text/css" />
<script language="javascript">
	$(function(){
	   /*  $('.loginbox0').css({'position':'absolute','left':($(window).width()-810)/2});
		$(window).resize(function(){  
	    $('.loginbox0').css({'position':'absolute','left':($(window).width()-810)/2});
	    })   */
	    var url1="<%=basePath%>qm/initQm?factoryName="+encodeURI('上海工厂');
	    var url2="<%=basePath%>qa/initQualityAnalysePage?factoryName="+encodeURI('上海工厂');
	    var url3="<%=basePath%>mc/initMissionManage?factoryName="+encodeURI('上海工厂');
	});  
	function logout(){
		$.messager.confirm('提示信息', '确定登出用户？', function(r){
			if (r){
				window.location.href='<%=basePath%>main/logout';
			}
		});
	}
	function test1(){
		window.location.href="<%=basePath%>qm/initQm?factoryName="+encodeURI('上海工厂');
	}
	function test2(){
		window.location.href="<%=basePath%>qa/initQualityAnalysePage?factoryName="+encodeURI('上海工厂');
	}
	function test3(){
		window.location.href="<%=basePath%>mc/initMissionManage?factoryName="+encodeURI('上海工厂');
	}
</script> 

</head>

<body background="<%=basePath%>resources/blueThemes/images/mainbg.png" style=" background-repeat:no-repeat ; background-size:100% 100%;  background-attachment: fixed;" >
<%-- <input type="hidden" id="mainPageFactoryName" value="${mainPageFactoryName }">
<input type="hidden" id="mainPageWorkShopName" value="${mainPageWorkShopName }">
<input type="hidden" id="mainPageWorkShopDrawing" value="${mainPageWorkShopDrawing }"> --%>
    <div class="loginbody1">
	    <span class="systemlogo"></span> 
	    <div class="loginbox0">
		    <ul class="loginlist">
		    	<li><a onclick="test1()" ><img src="<%=basePath%>resources/images/zhiliangkanban.png" style="width: 68px;height: 68px" /><p>B<br></br>质量监控</p></a></li>
			  	<li><a onclick="test2()" ><img src="<%=basePath%>resources/images/zhiliangfenxi.png" style="width: 68px;height: 68px" /><p>B<br></br>质量分析</p></a></li>
				<li><a onclick="test3()" ><img src="<%=basePath%>resources/images/renwuguanli.png" style="width: 68px;height: 68px"/><p>B<br></br>任务管理</p></a></li>
				<li><a href="<%=basePath%>system/initPage"><img src="<%=basePath%>resources/images/shezhi.png" style="width: 68px;height: 68px" /><p>B<br></br>系统设置</p></a></li>
		    </ul>
			<ul class="loginlist">
				<%--<li><a href="<%=basePath%>qb/initQb"><img src="<%=basePath%>resources/images/zhiliangkanban.png" style="width: 68px;height: 68px" /><p>格特拉克<br></br>质量看板</p></a></li>--%>
					<li><a href="<%=basePath%>gqb/initQualityBoardPage"><img src="<%=basePath%>resources/images/zhiliangfenxi.png" style="width: 68px;height: 68px" /><p>NEW</p></a></li>
					<li><a href="<%=basePath%>qbGetrag/initQb"><img src="<%=basePath%>resources/images/zhiliangkanban.png" style="width: 68px;height: 68px" /><p>G<br></br>质量看板</p></a></li>
					<li><a href="<%=basePath%>getragInitManageMainPage"><img src="<%=basePath%>resources/images/renwuguanli.png" style="width: 68px;height: 68px"/><p>G<br></br>任务管理</p></a></li>
					<li><a href="<%=basePath%>getragQa/initGetgraQaPage"><img src="<%=basePath%>resources/images/zhiliangfenxi.png" style="width: 68px;height: 68px" /><p>G<br></br>质量分析</p></a></li>
			</ul>
			<ul class="loginlist">
				<li><a href="<%=basePath%>baqb/initFrameworkPage" ><img src="<%=basePath%>resources/images/zhiliangkanban.png" style="width: 68px;height: 68px" /><p>NEW_UI</p></a></li>

			</ul>
	    </div>
    </div>
    <div class="loginbm">版权所有  2019&nbsp;&nbsp;&nbsp; <strong>www.q-das.cn</strong> &nbsp;&nbsp;&nbsp;</div>
</body>

</html>
