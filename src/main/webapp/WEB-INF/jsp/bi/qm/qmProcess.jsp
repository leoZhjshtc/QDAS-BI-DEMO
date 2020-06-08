<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

</head>

<body>
	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
		<input id="qmProcessPlName" type="hidden" value="${qmProcessPlName }">
		<div id="processCenterbox" data-options="region:'center',border:false" style="padding: 5px;">
			<c:forEach items="${qmProcessList}" var="list">
				<c:choose>
					<c:when test="${list.qualityLevel==\"0\"}">
						<%-- <a id="${list.buttonId}" class="easyui-linkbutton c1"
							data-options="size:'large',iconCls:'icon-gongxuIcon'"
							style="width:90%;height: 50px;margin: 3px;text-align: left"
							onclick="getMachine('${list.buttonId}','${list.TEAUFTRAGGBBEZ  }','${list.TEAUFTRAGSTR }');"><font
							size="3em" style="margin-left: 10px">${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</font></a> --%>
							<div style="margin-top: 5px">
								<ul class="process" onclick="getMachine('${list.buttonId}','${list.TEAUFTRAGGBBEZ  }','${list.TEAUFTRAGSTR }');">
									<li class="green" id="${list.buttonId}"><div class="greenCircle"></div>${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</li>
								</ul>
							</div>
					</c:when>
					<c:when test="${list.qualityLevel==\"1\"}">
						<%-- <a id="${list.buttonId}" class="easyui-linkbutton c7"
							data-options="size:'large',iconCls:'icon-gongxuIcon'"
							style="width:90%;height: 50px;margin: 3px;text-align: left"
							onclick="getMachine('${list.buttonId}','${list.TEAUFTRAGGBBEZ  }','${list.TEAUFTRAGSTR }');"><font
							size="3em" style="margin-left: 10px">${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</font></a> --%>
							<div style="margin-top: 5px">
								<ul class="process" onclick="getMachine('${list.buttonId}','${list.TEAUFTRAGGBBEZ  }','${list.TEAUFTRAGSTR }');">
									<li class="yellow" id="${list.buttonId}" ><div class="yellowCircle"></div>${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</li>
								</ul>
							</div>
					</c:when>
					<c:when test="${list.qualityLevel==\"2\"}">
						<%-- <a id="${list.buttonId}" class="easyui-linkbutton c5"
							data-options="size:'large',iconCls:'icon-gongxuIcon'"
							style="width:90%;height: 50px;margin: 3px;text-align: left"
							onclick="getMachine('${list.buttonId}','${list.TEAUFTRAGGBBEZ  }','${list.TEAUFTRAGSTR }');"><font
							size="3em" style="margin-left: 10px">${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</font></a> --%>
							<div style="margin-top: 5px">
								<ul class="process" onclick="getMachine('${list.buttonId}','${list.TEAUFTRAGGBBEZ  }','${list.TEAUFTRAGSTR }');">
									<li class="red" id="${list.buttonId}" ><div class="redCircle"></div>${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</li>
								</ul>
							</div>
					</c:when>
				</c:choose>
			</c:forEach>
		</div>
	</div>
	<script type="text/javascript">
		function getMachine(plId,processName,processId){
  			/* $('#processCenterbox > ul').linkbutton({
			    iconCls:'icon-gongxuIcon'
			}); */
			$('#processCenterbox').find('li').each(function(index,element){
	 				$(element).removeClass('processSelect');
	 			})
	 		$('#qmMachineLi').html('');
  			$('#'+plId).addClass('processSelect');
			$('#qmProcessLi').html("&gt;&nbsp;&nbsp;"+processName+"/"+processId);
			$('#qmMerkmalProcessLi').html("&gt;&nbsp;&nbsp;"+processName+"/"+processId);
			$('#qmMachineCenterbox').panel('refresh','<%=basePath%>qm/initMachine?processId='+encodeURI(processId)+'&productLineName='+encodeURI($('#qmProcessPlName').val()));
  			$('#qmTeilCenterbox').panel('clear');
  		}
		function mousemoveMacFn(e){
  			$('#macAlarmDig').dialog('open');
  			$('#macAlarmDig').panel('move',{
  				left:e.clientX+10,
  				top:e.clientY+10
  			});
  			$('#macAlarmDig').panel('resize');
  		}
  		function mοuseοutMacFn(){
  			$('#macAlarmDig').dialog('close');
  		}
	
	</script>
</body>
</html>
