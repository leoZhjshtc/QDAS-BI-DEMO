<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../../base/meta.jsp"%>
<html>
<head>
</head>

<body>
	<input type="hidden" id="mmTwoCheckMan" value="${mmTwoCheckMan }">
	<div id="cc" class="easyui-layout" fit="true">
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
					<td class="teilTD">${mmTeilMap.TETEILNR }</td>
					<td class="teilTD">${mmTeilMap.TEBEZEICH }</td>
					<td class="teilTD">${mmTeilMap.TEKURZBEZEICH }</td>
					<td class="teilTD">${mmTeilMap.TEAENDSTAND }</td>
					<td class="teilTD">${mmTeilMap.TEAUFTRAGGBBEZ }</td>
					<td class="teilTD">${mmTeilMap.TEAUFTRAGSTR }</td>
					<td class="teilTD">${mmTeilMap.TEKOSTST }</td>
					<td class="teilTD">${mmTeilMap.TEPREINRNR }</td>
					<td class="teilTD">${mmTwoWV0063 }</td>
					<td class="teilTD">${mmTeilMap.TE_1341 }</td>
				</tr>
			</table>
	    </div>
	    <div data-options="region:'center',border:false" >
	    	<!-- <div class="column"><span class="current">测量参数信息</span></div> -->
	    	<table id="detailsMerkmalTable" class="easyui-datagrid"
				data-options="url:'<%=basePath%>mc/getDetailsMerkmalTable',fitColumns:true,singleSelect:true,fit:true,rownumbers:true,
					  					queryParams: {
					  						<%-- wv0063:'${mmTwoWV0063Id }', --%>
					  						teilId:'${mmTeilId }',
					  						checkMan:'${mmTwoCheckMan }',
					  						tekurzbezeich:'${mmTekurzbezeich }',
					  						wvwertnr:'${mmWvwertnr }'
					  						
					  						},
					  						onClickCell:function(index,field,value)	{
					  							if(field=='MEMERKBEZ'){
					  								var rows=$(this).datagrid('getRows');
					  								openQaMerkmalDig(rows[index]);
					  							}
					  						}
					  						
					  						">
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
	<!-- <div id="mmMerkmalAnilityDIV" style="display: none;"></div> -->
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/missionManage.css" />
	<style type="text/css">
		.teilTD{
			width: 10%;height:26px;font-size:14px;text-align: center;font-weight: bold;
		
		}
	</style>
	<script type="text/javascript">
		<%-- $('#detailsTeilForm').form('load','<%=basePath%>mc/getDetailsTeilTable?teilNum='+${mmTeilNum }+'&wvwertnr='+${mmWvwertnr }); --%>
		
	
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
	function openQaMerkmalDig(row){
		$('body').append('<div id="mmMerkmalAnilityDIV" style="display: none;"></div>');
			$('#mmMerkmalAnilityDIV').dialog({
			    title: '${mmTeilMap.TEKOSTST } / ${mmTeilMap.TEAUFTRAGSTR } / ${mmTeilMap.TEPREINRNR } / ${mmTeilMap.TETEILNR } / ${mmTeilMap.TEBEZEICH }',
			    width: $(window).width(),
			    height: $(window).height(),
			    closed: true,
			    cache: false,
			    modal: true,
			    href:'<%=basePath%>qa/initQaMerkmalAbility?teilNum=${mmTeilMap.TETEILNR }&merkmalId='+row.MEMERKMAL+'&teilId='+row.TETEIL,
			    onClose:function(){
			    	$('#mmMerkmalAnilityDIV').dialog('destroy');
			    	$('#mmMerkmalAnilityDIV').remove();
			    }
			});
				$('#mmMerkmalAnilityDIV').dialog('open');
	  			<%-- $('#mmMerkmalAnilityDIV').window('refresh','<%=basePath%>qa/initQaMerkmalAbility?productLineName=${mmTeilMap.TEKOSTST }&machineName=${mmTeilMap.TEPREINRNR }&processNum=${mmTeilMap.TEAUFTRAGSTR }&teilNum=${mmTeilMap.TETEILNR }&merkmalId='+row.MEMERKMAL+'&teilId='+row.TETEIL); --%>
	  		}
	</script>
</body>
</html>
