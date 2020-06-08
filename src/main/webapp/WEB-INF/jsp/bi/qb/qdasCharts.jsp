<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp"%>

<html>
  <head>

  </head>
  
  <body>
  <input type="hidden" id="teilIdqc" value="${teilIdqc }">
  <input type="hidden" id="merkmalqc" value="${merkmalqc }">
    <table style="width: 100%;height: 100%">
			<tr style="height: 50%">
				<td rowspan="2" style="width: 30%" id="qdaskzt"></td>
				<td id="qdasdzt" style="width: 40%"></td>
				<td rowspan="2" style="width: 30%" id="qdasbg3"></td>
			</tr>		
			<tr style="height: 50%">
				<td id="qdaszft"></td>
			</tr>
		</table>
		<script type="text/javascript">
			$(function(){
				getQdasCharts();
			})
			function getQdasCharts(){
				$.messager.progress({
					title:'信息',
					text:'读取数据中...',
					interval:1000
				}); 
				var startTime;
					var endTime;
					if($('#qbSearchTimeType1').radiobutton('options').checked==true){
						startTime=$('#qbStartTime').datetimebox('getValue');
						endTime=$('#qbEndTime').datetimebox('getValue');
					}else{
						var searchChartRealTime=searchTimeInterval($('#timecc').combobox('getValue'));
						startTime=searchChartRealTime.startTime;
						endTime=searchChartRealTime.endTime;
					}
				$.ajax({
					type:'post',
					url:'<%=basePath%>qb/getQdasChartsData',
					data:{
						teilId:$('#teilIdqc').val(),
						merkmalId:$('#merkmalqc').val(),
						startTime:startTime,
						endTime:endTime
					},
					success:function(data){
						if(data.error!=1){
							$('#qdasbg3').append('<img style=\"width: 100%;height:100%;\" src=\"data:image/bmp;base64,'+data.bg3+'\"/>');
							$('#qdaskzt').append('<img style=\"width: 100%;height:100%;\" src=\"data:image/bmp;base64,'+data.kzt+'\"/>');
							$('#qdasdzt').append('<img style=\"width: 100%;height:100%;\" src=\"data:image/bmp;base64,'+data.dzt+'\"/>');
							$('#qdaszft').append('<img style=\"width: 100%;height:100%;\" src=\"data:image/bmp;base64,'+data.zft+'\"/>');
							$.messager.progress('close'); 
						}else{
							$('#qdaskzt').append('<p>出错了！！！</p>');
							$.messager.progress('close'); 
						}
						
					}
				})
			}
		
		</script>
  </body>
</html>
