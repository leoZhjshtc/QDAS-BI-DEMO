<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

</head>

<body>
	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
		<input id="qmMachinePl" type="hidden" value="${qmMachinePl }">
		<input id="qmMachineProcess" type="hidden" value="${qmMachineProcess }">
		<div id="machineCenterbox" data-options="region:'center',border:false" style="padding: 10px">
			<c:forEach items="${qmMachineList}" var="list">
				<c:choose>
					<c:when test="${list.qualityLevel==\"0\"}">
						<a id="${list.buttonId}" class="easyui-linkbutton c1"
							data-options="size:'large',iconCls:'icon-kachiIcon'"
							style="width:23%;height: 50px;margin: 3px;text-align: left"
							onclick="getTeil('${list.buttonId}','${list.TEPREINRNR }');"><font
							size="3em" style="margin-left: 10px"><nobr>${list.TEPREINRNR  }</nobr></font></a>
					</c:when>
					<c:when test="${list.qualityLevel==\"1\"}">
						<a id="${list.buttonId}" class="easyui-linkbutton c7"
							data-options="size:'large',iconCls:'icon-kachiIcon'"
							style="width:23%;height: 50px;margin: 3px;text-align: left"
							onclick="getTeil('${list.buttonId}','${list.TEPREINRNR }');"><font
							size="3em" style="margin-left: 10px"><nobr>${list.TEPREINRNR  }</nobr></font></a>
					</c:when>
					<c:when test="${list.qualityLevel==\"2\"}">
						<a id="${list.buttonId}" class="easyui-linkbutton c5"
							data-options="size:'large',iconCls:'icon-kachiIcon'"
							style="width:23%;height: 50px;margin: 3px;text-align: left"
							onclick="getTeil('${list.buttonId}','${list.TEPREINRNR }');"><font
							size="3em" style="margin-left: 10px"><nobr>${list.TEPREINRNR  }</nobr></font></a>
					</c:when>
				</c:choose>
			</c:forEach>
		</div>
	</div>
	<!-- <div id="macAlarmDig" class="easyui-dialog" style="width:400px;height:200px;"
        data-options="modal:false,closed:true,style:{position:'absolute'},closable:true,title:''">
	    <table class="easyui-datagrid" data-options="url:'',fitColumns:true,singleSelect:true,fit:true">
		    <thead>
		        <tr>
		            <th data-options="field:'code',width:100">零件</th>
		            <th data-options="field:'name',width:100">参数</th>
		            <th data-options="field:'price',width:100,align:'right'">测量值</th>
		        </tr>
		    </thead>
		</table>
	</div> -->
	<script type="text/javascript">
		function getTeil(plId,machineName){
  			$('#machineCenterbox > a').linkbutton({
			    iconCls:'icon-kachiIcon'
			});
  			$('#'+plId).linkbutton({
			    iconCls: 'icon-large-gou'
			});
			//$('#qmMachinePanel').panel('close');
			//$('#qmTeilPanel').panel('open');
			$('#qmMachineLi').html("&gt;&nbsp;&nbsp;"+machineName);
			$('#qmMerkmalMachineLi').html("&gt;&nbsp;&nbsp;"+machineName);
			$('#qmTeilCenterbox').panel('refresh','<%=basePath%>qm/initTeil?machineName='+encodeURI(machineName)+'&productLineName='+encodeURI($('#qmMachinePl').val())+'&processId='+encodeURI($('#qmMachineProcess').val()));
			//$('#macAlarmDig').dialog('close');
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
