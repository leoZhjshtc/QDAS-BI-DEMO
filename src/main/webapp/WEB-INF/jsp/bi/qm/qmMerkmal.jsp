<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>

  </head>
  
  <body>
	<div id="qmMerkmalTable" class="easyui-layout" fit="true">
		<div data-options="region:'north',split:false,collapsible:false,border:false" style="height:120px;padding: 5px;overflow: hidden;">
			<div class="column"><span class="current">零件信息</span></div>
			<table style="width: 100%;background-color: #eeeeee">
				<tr>
					<td class="teilTD">零件号</td>
					<td class="teilTD">项目名称</td>
					<td class="teilTD">产品组</td>
					<td class="teilTD">项目状态</td>
					<td class="teilTD">工序名称</td>
					<td class="teilTD">工序号</td>
					<td class="teilTD">产线</td>
					<td class="teilTD">测量设备</td>
					<td class="teilTD">检验原因</td>
					<td class="teilTD">检验规范号</td>
				</tr>
				<tr>
					<td class="teilTD">${tableMap.TETEILNR }</td>
					<td class="teilTD">${tableMap.TEBEZEICH }</td>
					<td class="teilTD">${tableMap.TEKURZBEZEICH }</td>
					<td class="teilTD">${tableMap.TEAENDSTAND }</td>
					<td class="teilTD">${tableMap.TEAUFTRAGGBBEZ }</td>
					<td class="teilTD">${tableMap.TEAUFTRAGSTR }</td>
					<td class="teilTD">${tableMap.TEKOSTST }</td>
					<td class="teilTD">${tableMap.TEPREINRNR }</td>
					<td class="teilTD">${tableMap.WV0063 }</td>
					<td class="teilTD">${tableMap.TE_1341 }</td>
				</tr>
			</table>
		</div>
	    <div data-options="region:'center'" style="">
	    	<table id="wertevarDetailsTable" style="width: 100%;height: 100%">
				<thead>
					<tr>
						<th data-options="field:'MEMERKBEZ',width:100,align:'left'">参数名</th>
						<th data-options="field:'WVWERT',width:50,align:'center',formatter:valueFormatter">测量值</th>
						<th data-options="field:'MENENNMAS',width:50,align:'center'">名义值</th>
						<th data-options="field:'MEUGW',width:50,align:'center'">下公差</th>
						<th data-options="field:'MEOGW',width:50,align:'center'">上公差</th>
						<th data-options="field:'MENORMISTUN',width:50,align:'center'">下警戒</th>
						<th data-options="field:'MENORMISTOB',width:50,align:'center'">上警戒</th>
						<th data-options="field:'aa',width:50,align:'center',formatter:smileFormatter">结果</th>
						<th data-options="field:'ETTEXT',width:100,align:'center'">事件</th>
						<th data-options="field:'PRVORNAME',width:50,align:'center'">测量人员</th>
						<th data-options="field:'WV0014',width:120,align:'center'">追溯码</th>
						<th data-options="field:'WVDATZEIT',width:120,align:'center'">测量日期</th>
					</tr>
				</thead>
			</table>
	    </div>
	</div>    
	<div id="qmMerkmalAnilityDIV"></div>
	<input type="hidden" id="merkmalTeilId" value="${qmMerkmalTeilId }">
	<input type="hidden" id="qmMerkmalWertevarId" value="${qmMerkmalWertevarId }">
	<input type="hidden" id="qmPRVORNAME" value="${qmPRVORNAME }">
	<%-- <input type="hidden" id="qmMerkmalTeilNum" value="${qmMerkmalTeilNum }">
	<input type="hidden" id="qmMerkmalTeilName" value="${qmMerkmalTeilName }">
	<input type="hidden" id="qmMerkmalPlName" value="${qmMerkmalPlName }">
	<input type="hidden" id="qmMerkmalMachineName" value="${qmMerkmalMachineName }">
	<input type="hidden" id="qmMerkmalProcess" value="${qmMerkmalProcess }"> --%>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/missionManage.css" />
	<style type="text/css">
		.teilTD{
			width: 10%;height:26px;font-size:14px;text-align: center;font-weight: bold;
		
		}
	</style>
	<script type="text/javascript">
		$('#wertevarDetailsTable').datagrid({
				url:'<%=basePath%>qm/getMerkmalData',
				queryParams:{
					/* teilNum:$('#qmMerkmalTeilNum').val(),
					teilName:$('#qmMerkmalTeilName').val(),
					wertevarId:$('#qmMerkmalWertevarId').val(),
					productLineName:$('#qmMerkmalPlName').val(),
					machineName:$('#qmMerkmalMachineName').val(),
					processId:$('#qmMerkmalProcess').val() */
					operator:$('#qmPRVORNAME').val(),
					teilId:$('#merkmalTeilId').val(),
					wertevarId:$('#qmMerkmalWertevarId').val()
				},
				border : false,
				pagination : false,
				fit : true,
				rownumbers : true,
				fitColumns : true,
				singleSelect : true,
				checkOnSelect : true,
				selectOnCheck : true,
				pageSize : 20,
				pageList : [ 20, 40, 60, 80 ],
				dndRow : false,
				enableHeaderClickMenu : false,
				enableHeaderContextMenu : true,
				enableRowContextMenu : false,
				rowTooltip : false,
				<%-- onSelect:function(index,row){
					//openMerkmalDig(row);
					$('#qmMerkmalAnilityDIV').window('setTitle','${tableMap.TEKOSTST } / ${tableMap.TEAUFTRAGSTR } / ${tableMap.TEPREINRNR } / ${tableMap.TETEILNR } / ${tableMap.TEBEZEICH }');
					$('#qmMerkmalAnilityDIV').window('open');
					$('#qmMerkmalAnilityDIV').window('refresh','<%=basePath%>qa/initQaMerkmalAbility?teilNum=${tableMap.TETEILNR }&merkmalId='+row.MEMERKMAL+'&teilId='+row.METEIL);
				} --%>
				onClickCell:function(index,field,value)	{
					if(field=='MEMERKBEZ'){
						var rows=$(this).datagrid('getRows');
						var row=rows[index];
					  	$('#qmMerkmalAnilityDIV').window('setTitle','${tableMap.TEKOSTST } / ${tableMap.TEAUFTRAGSTR } / ${tableMap.TEPREINRNR } / ${tableMap.TETEILNR } / ${tableMap.TEBEZEICH }');
						$('#qmMerkmalAnilityDIV').window('open');
						$('#qmMerkmalAnilityDIV').window('refresh','<%=basePath%>qa/initQaMerkmalAbility?teilNum=${tableMap.TETEILNR }&merkmalId='+row.MEMERKMAL+'&teilId='+row.METEIL);
					}
				}
			})
			$('#qmMerkmalAnilityDIV').dialog({
			    title: '图表',
			    width: $(window).width(),
			    height: $(window).height(),
			    closed: true,
			    cache: false,
			    modal: true
			});
			function openMerkmalDig(row){
				$('#qmMerkmalAnilityDIV').window('close');
				$('#qmMerkmalAnilityDIV').window('open');
	  			$('#qmMerkmalAnilityDIV').window('refresh','<%=basePath%>qa/initQaMerkmalAbility?productLineName=${tableMap.TEKOSTST }&machineName=${tableMap.TEPREINRNR }&processNum=${tableMap.TEAUFTRAGSTR }&teilNum=${tableMap.TETEILNR }&merkmalId='+row.MEMERKMAL+'&teilId='+row.METEIL);
	  			
	  		}
			function valueFormatter(value,row,index){
				if(row.MEMERKART=='1'){
					if(value.toString().indexOf('.')!==0&parseFloat(value.toString().substring(value.toString().indexOf(".")-1)>0)){
						return '不合格';
					}else{
						return '合格';
					}
				}else{
					return value;
				} 
			}
			function smileFormatter(value,row,index){
				if(row.MEMERKART=='1'){
					if(row.WVWERT.toString().indexOf('.')!==0&parseFloat(row.WVWERT.toString().substring(row.WVWERT.toString().indexOf(".")-1)>0)){
						return "<img src='<%=basePath %>resources/images/smile_NOK.png' style='height:30px'>";
					}else{
						return "<img src='<%=basePath %>resources/images/smile_OK.png' style='height:30px'>";
					}
				}else{
					if((row.MEUGW!==''&row.WVWERT<row.MEUGW)|(row.MEOGW!==''&row.WVWERT>row.MEOGW)){
						return "<img src='<%=basePath %>resources/images/smile_NOK.png' style='height:30px'>";
					}else if((row.MENORMISTUN!==''&row.WVWERT<row.MENORMISTUN)|(row.MENORMISTOB!==''&row.WVWERT>row.MENORMISTOB)){
						return "<img src='<%=basePath %>resources/images/smile_ALARM.png' style='height:30px'>";
					}else{
						return "<img src='<%=basePath %>resources/images/smile_OK.png' style='height:30px'>";
					}
				}
			
			}
	</script>
  </body>
</html>
