<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp"%>
<html>
	<head>
		<script type="text/javascript">
			$(function(){
				$('#merkmal').click(function(){
					$('#img').attr('src','<%=basePath%>resources/images/drawing/hongyuan.png');
				
				})
			})
			function test(){
				//console.log($('#dopdiv').draggable('options'));
				console.log($('#dopdiv').position())
			}
			function getLeft(width){
				return width/1000*100+'%';
			
			}
		</script>
	</head>
	<body style="background-image: url(<%=basePath%>resources/images/drawing/tuzhi.png);background-repeat: no-repeat;background-attachment: fixed;background-size:100% 100%;">
		<a id="merkmal" class="easyui-linkbutton c1" data-options="size:'large'" style="width:100px;height: 100px;position: absolute;top: 140px;left: 330px;" >产线1</a>
		<img id="img" src="<%=basePath%>resources/images/drawing/lvyuan.png" style="position: absolute;top: 230px;left: 300;"/>
		<a class="easyui-linkbutton c5" data-options="size:'large'" style="width:100px;height: 100px;position: absolute;top: 140px;left: 1080px;" >产线2</a>
		<img src="<%=basePath%>resources/images/drawing/hongyuan.png" style="position: absolute;top: 230px;left: 1050;"/>
		<a class="easyui-linkbutton c7" data-options="size:'large'" style="width:100px;height: 100px;position: absolute;top: 510px;left: getLeft(500);" >产线3</a>
		<img src="<%=basePath%>resources/images/drawing/huangyuan.png" style="position: absolute;top: 490px;left: 250;"/>
		<a class="easyui-linkbutton c6" data-options="size:'large'" style="width:100px;height: 100px;position: absolute;top: 510px;left: 1510;" >产线4</a>
		<img src="<%=basePath%>resources/images/drawing/lanyuan.png" style="position: absolute;top: 490px;left: 1480;"/>
		
		<div id="dopdiv" class="easyui-draggable" >
        	<a class="easyui-linkbutton c1" id="dop"data-options="size:'large'" style="width:100px;height: 100px;" onclick="test()" >产线5</a>
        </div>
	</body>
</html>