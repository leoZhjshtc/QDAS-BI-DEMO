<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head>

<body>
	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
		<input type="hidden" id="qmPlFactoryName" value="${qmPlFactoryName }"> 
		<input type="hidden" id="qmTotalWP" value="${qmTotalWP }"> 
		<input type="hidden" id="qmPlWorkShopName" value="${qmPlWorkShopName }"> 
		<div id="plCenterbox" data-options="region:'center'"
			style="background-image: url(<%=basePath%>resources/images/drawing/${qmPlWorkShopDrawing });background-repeat: no-repeat;background-size:100% 100%;">
			<c:forEach items="${qmPlList}" var="prodectLine">
				<c:choose>
					<c:when test="${prodectLine.qualityLevel==\"0\"}">
						<div id="${prodectLine.buttonId}Div" class="qmPlDivGreen" style="position: absolute;top: ${prodectLine.productLine_topPosition};left: ${prodectLine.productLine_leftPosition};display:none;"
							onclick="getProcess('${prodectLine.buttonId}','${prodectLine.productLine_name }');">
							<div class="titleDiv">
								<div class="iconDiv"></div>
								<div class="iconDivText">${prodectLine.productLine_name  }</div>
							</div>
							<div class="textDiv">
								<span id="${prodectLine.buttonId}Span1"></span><br>
								<span id="${prodectLine.buttonId}Span2"></span><br>
								<span id="${prodectLine.buttonId}Span3"></span><br>
								<span id="${prodectLine.buttonId}Span4"></span>
							</div>
						</div>
						<img id="img${prodectLine.buttonId}"
							src="<%=basePath%>resources/images/lvyuan.png"
							style="position: absolute;top: ${prodectLine.point_topPosition};left: ${prodectLine.point_leftPosition};width:20px;height:20px"
							onclick="getProcess('${prodectLine.buttonId}','${prodectLine.productLine_name }');"
							onmouseenter="mousemovePlFn(event,'${prodectLine.buttonId}','${prodectLine.productLine_name }')"
							onmouseout="mοuseοutPlFn('${prodectLine.buttonId}')"/>
					</c:when>
					<c:when test="${prodectLine.qualityLevel==\"1\"}">
						
					</c:when>
					<c:when test="${prodectLine.qualityLevel==\"2\"}">
						<div class="qmPlDivRed" style="position: absolute;top: ${prodectLine.productLine_topPosition};left: ${prodectLine.productLine_leftPosition}"
							onclick="getProcess('${prodectLine.buttonId}','${prodectLine.productLine_name }');">
							<div class="titleDiv">
								<div class="iconDiv"></div>
								<div class="iconDivText">${prodectLine.productLine_name  }</div>
							</div>
							<div class="textDiv">
								<span>零件号：${prodectLine.alarmTeil}</span><br>
								<span>参数：${prodectLine.alarmMerkmal}</span><br>
								<span>测量时间：${prodectLine.alarmTime}</span><br>
								<span>结果：${prodectLine.alarmResult}</span>
							</div>
						</div>
						<img id="img${prodectLine.buttonId}"
							src="<%=basePath%>resources/images/hongyuan.png"
							onclick="getProcess('${prodectLine.buttonId}','${prodectLine.productLine_name }');"
							style="position: absolute;top: ${prodectLine.point_topPosition};left: ${prodectLine.point_leftPosition};width:20px;height:20px" />
					</c:when>
				</c:choose>
			</c:forEach>
		</div>
	</div>
	<script type="text/javascript">
		//$('#qmProductLinePanel').panel('setTitle', '产线         (工厂：'+$('#qmPlFactoryName').val()+' / 车间：'+$('#qmPlWorkShopName').val()+')')
		/* $('#currentWsName').html($('#qmPlFactoryName').val()+"&nbsp;&nbsp;&gt;&nbsp;&nbsp;"+$('#qmPlWorkShopName').val()); */
		$('#qmWorkShop').html("&gt;&nbsp;&nbsp;"+$('#qmPlWorkShopName').val());
  		function getProcess(plId,plName){
  			/* $('#plCenterbox').find('a').linkbutton({
			    iconCls:''
			});
  			$('#'+plId).linkbutton({
			    iconCls: 'icon-large-gou'
			}); */
			$('#qmProductLinePanel').panel('close');
			$('#qmMachinePanel').panel('open');
			$('#qmPlLi').html("&gt;&nbsp;&nbsp;"+$('#qmPlWorkShopName').val()+"&nbsp;&nbsp;&gt;&nbsp;&nbsp;"+plName);
			$('#qmMerkmalPlLi').html("&gt;&nbsp;&nbsp;"+$('#qmPlWorkShopName').val()+"&nbsp;&nbsp;&gt;&nbsp;&nbsp;"+plName);
			$('#qmProcessCenterbox').panel('refresh','<%=basePath%>qm/initProcessPage?productLineName='+encodeURI(plName));
			//$('#plAlarmDig').dialog('close');
			$('#qmTeilCenterbox').panel('clear');
			if(autoQmWorkShop!=null&&autoQmWorkShop!='undefined'){
				clearInterval(autoQmWorkShop)
			
			}
  		}
  		function mousemovePlFn(e,plButId,productLineName){
  			/* $('#plAlarmDig').dialog('open');
  			$('#plAlarmDig').panel('move',{
  				left:e.clientX+10,
  				top:e.clientY+10
  			});
  			$('#plAlarmDig').panel('resize'); */
  			$('#'+plButId+'Div').show();
  			//$('#'+plButId+'DataList').datalist('reload');
  			$.ajax({
  				url: '<%=basePath%>qm/getLastAlarmDataByPl',
  				type:'post',
  				data:{
  					productLineName:productLineName
  				},
  				success:function(data){
  					$('#'+plButId+'Span1').html(data[0].text);
  					$('#'+plButId+'Span2').html(data[1].text);
  					$('#'+plButId+'Span3').html(data[2].text);
  					$('#'+plButId+'Span4').html(data[3].text);
  				}
  			
  			})
  		}
  		function mοuseοutPlFn(plButId){
  			//$('#plAlarmDig').dialog('close');
  			$('#'+plButId+'Div').hide();
  		}
  		
  	</script>
</body>
</html>
