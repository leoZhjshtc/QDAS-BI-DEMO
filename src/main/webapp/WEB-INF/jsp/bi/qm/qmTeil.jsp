<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
  </head>
  
  <body>
    <div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
    	<input type="hidden" id="qmTeilMachineName" value="${qmTeilMachineName }">
    	<input type="hidden" id="qmTeilPlName" value="${qmTeilPlName }">
    	<input type="hidden" id="qmTeilProcessName" value="${qmTeilProcessName }">
		<div id="qmTeilCenterDIV" data-options="region:'center',border:false" style="padding: 10px">
			<c:forEach items="${qmTeilList}" var="list">
				<c:choose>
					<c:when test="${list.qualityLevel==\"0\"}">
						<div style="width: 23%;height: 190;float: left;margin: 3px;">
							<a id="${list.buttonId}" class="easyui-linkbutton c1"
								data-options="size:'large',iconCls:'icon-teilIcon'"
								<%-- onclick="openMerkmalDig('${list.TETEILNR }')" --%>
								style="width:100%;height: 50px;text-align: left"><font
								size="3em" style="margin-left: 5px"><nobr>${list.TETEILNR  }/${list.TEBEZEICH }</nobr></font></a>
							<table class="easyui-datagrid" style="width:100%;height:130px"
							        data-options="url:'<%=basePath%>qm/getTeilTop3Value',fitColumns:true,singleSelect:true,queryParams:{
							        	teilId:'${list.TETEIL  }'},scrollbarSize:0,
							        	onClickRow: function(index,row){
							        		tableRowSelect(row,'${list.TETEILNR  }','${list.TEBEZEICH }')
							        	} ">
							    <thead>
							        <tr>
							        	<th data-options="field:'qualityLevel',width:60,align:'center'">结果</th>
							        	<th data-options="field:'WVDATZEIT',width:100,align:'center'">时间</th>
							            <th data-options="field:'PRVORNAME',width:50,align:'center'">检验员</th>
							        </tr>
							    </thead>
							</table>
						</div>
					</c:when>
					<c:when test="${list.qualityLevel==\"1\"}">
						<div style="width: 23%;height: 190;float: left;margin: 3px;">
							<a id="${list.buttonId}" class="easyui-linkbutton c7"
								data-options="size:'large',iconCls:'icon-teilIcon'"
								<%-- onclick="openMerkmalDig('${list.TETEILNR }')" --%>
								style="width:100%;height: 50px;text-align: left"><font
								size="3em" style="margin-left: 5px"><nobr>${list.TETEILNR  }/${list.TEBEZEICH }</nobr></font></a>
							<table class="easyui-datagrid" style="width:100%;height:130px"
							        data-options="url:'<%=basePath%>qm/getTeilTop3Value',fitColumns:true,singleSelect:true,queryParams:{
							        teilId:'${list.TETEIL  }'},scrollbarSize:0,onClickRow:
							        	function(index,row){
							        		tableRowSelect(row,'${list.TETEILNR  }','${list.TEBEZEICH }')
							        	} ">
							    <thead>
							        <tr>
							        	<th data-options="field:'qualityLevel',width:60,align:'center'">结果</th>
							        	<th data-options="field:'WVDATZEIT',width:100,align:'center'">时间</th>
							            <th data-options="field:'PRVORNAME',width:50,align:'center'">检验员</th>
							        </tr>
							    </thead>
							</table>
						</div>
					</c:when>
					<c:when test="${list.qualityLevel==\"2\"}">
						<div style="width: 23%;height: 190;float: left;margin: 3px;">
							<a id="${list.buttonId}" class="easyui-linkbutton c5"
								data-options="size:'large',iconCls:'icon-teilIcon'"
								<%-- onclick="openMerkmalDig('${list.TETEILNR }')" --%>
								style="width:100%;height: 50px;text-align: left"><font
								size="3em" style="margin-left: 5px"><nobr>${list.TETEILNR  }/${list.TEBEZEICH }</nobr></font></a>
							<table class="easyui-datagrid" style="width:100%;height:130px"
							        data-options="url:'<%=basePath%>qm/getTeilTop3Value',fitColumns:true,singleSelect:true,queryParams:{
							        teilId:'${list.TETEIL  }'},scrollbarSize:0,onClickRow:
							        function(index,row){
							        		tableRowSelect(row,'${list.TETEILNR  }','${list.TEBEZEICH }')
							        	} ">
							    <thead>
							        <tr>
							        	<th data-options="field:'qualityLevel',width:60,align:'center'">结果</th>
							        	<th data-options="field:'WVDATZEIT',width:100,align:'center'">时间</th>
							            <th data-options="field:'PRVORNAME',width:50,align:'center'">检验员</th>
							        </tr>
							    </thead>
							</table>
						</div>
					</c:when>
				</c:choose>
			</c:forEach>
		</div>
	</div>
	<!-- <div id="qmMerkmalAnilityDIV"></div> -->
	<style type="text/css">
	
	
	</style>
	<script type="text/javascript">
		$('#qmMerkmalAnilityDIV').dialog({
			    title: '图表',
			    width: $(window).width(),
			    height: $(window).height(),
			    closed: true,
			    cache: false,
			    modal: true
			});
		function getMerkmal(bid,teilId){
			$('#qmTeilCenterDIV > a').linkbutton({
			    iconCls:''
			});
			$('#teil'+teilId).linkbutton({
			    iconCls: 'icon-large-gou'
			});
			$('#qmMachinePanel').panel('close');
			$('#qmMerkmalPanel').panel('open');
			$('#qmMerkmalCenterbox').panel('refresh','<%=basePath%>qm/initMerkmal?teilId='+teilId);
			//$('#teilAlarmDig').dialog('close');
		}
		function mousemoveTeilFn(e){
  			$('#teilAlarmDig').dialog('open');
  			$('#teilAlarmDig').panel('move',{
  				left:e.clientX+10,
  				top:e.clientY+10
  			});
  			$('#teilAlarmDig').panel('resize');
  		}
  		function mοuseοuTeilFn(){
  			$('#teilAlarmDig').dialog('close');
  		}
  		function tableRowSelect(row,teilNum,teilName){
  		  	$('#qmMachinePanel').panel('close');
			$('#qmMerkmalPanel').panel('open');
			$('#qmMerkmalTeilLi').html("&gt;&nbsp;&nbsp;"+teilNum+" / "+teilName);
			<%-- $('#qmMerkmalCenterbox').panel('refresh','<%=basePath%>qm/initMerkmal?teilNum='+teilNum+'&wertevarId='+row.WVWERTNR+'&teilName='+teilName+'&productLineName='+$('#qmTeilPlName').val()+'&machineName='+$('#qmTeilMachineName').val()+'&processId='+$('#qmTeilProcessName').val()); --%>
			$('#qmMerkmalCenterbox').panel('refresh','<%=basePath%>qm/initMerkmal?teilId='+row.WVTEIL+'&wertevarId='+row.WVWERTNR+'&operator='+encodeURI(row.PRVORNAME));
  		}
  		function openMerkmalDig(teilNum){
  			$('#qmMerkmalAnilityDIV').dialog('open');
  			$('#qmMerkmalAnilityDIV').panel('refresh','<%=basePath%>qa/initQaMerkmalAbility?productLineName='+$('#qmTeilPlName').val()+"&machineName="+$('#qmTeilMachineName').val()+"&processNum="+$('#qmTeilProcessName').val()+'&teilNum='+teilNum);
  		}
	</script>
  </body>
</html>
