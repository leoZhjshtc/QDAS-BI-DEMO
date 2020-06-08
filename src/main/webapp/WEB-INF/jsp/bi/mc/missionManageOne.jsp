<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../../base/meta.jsp"%>
<html>
<head>

</head>

<body>
	<div class="easyui-layout" fit="true">
		<div data-options="region:'north',split:false" style="height:120px;padding:0px;overflow: hidden;">
			<input type="hidden" id="mmFactoryName" value="${mmFactoryName }">
			<input type="hidden" id="mmWorkShopName" value="${mmWorkShopName }">
			<div id="searchBox" class="easyui-layout" fit="true">
			    <div data-options="region:'center',border:false" style="padding: 5px;overflow: hidden;">
			    	<form action="" style="width: 100%;">
			    		<table style="width: 100%;height: 100%">
			    			<tr style="height: 33%">
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">零件号:</td>
			    				<td style="width: 14%"><input id="mmSearchTeilNum" class="easyui-combobox" style="width:100%"
									data-options="editable:true,valueField:'value',textField:'text',url:'<%=basePath%>mc/getAllTeilNumComboBox',
									onClick:function(data){comboboxChange(data.value,7)}"/></td>
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">检验计划编号:</td>
			    				<td style="width: 14%"><input id="mmSearchCheckPlanNum" class="easyui-combobox"
									style="width:100%"
									data-options="panelMinWidth:150,editable:true,valueField:'value',textField:'text',url:'<%=basePath%>mc/getAllCheckPlanNumComboBox',
									onClick:function(data){comboboxChange(data.value,4)}"></td>
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">产线:</td>
			    				<td style="width: 14%"><input id="mmSearchProductLine" class="easyui-combobox"
									style="width:100%"
									data-options="editable:true,valueField:'productLine_name',textField:'text',url:'<%=basePath%>mc/getAllProductLineComboBox',
					  							queryParams: {factoryName: '${mmFactoryName }',workShopName: '${mmWorkShopName }'},onClick:function(data){comboboxChange(data.productLine_name,2)}"></td>
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">工序:</td>
			    				<td style="width: 14%"><input id="mmProcedure" class="easyui-combobox"
									style="width:100%"
									data-options="panelMinWidth:150,editable:true,valueField:'value',textField:'text',url:'<%=basePath%>mc/getProcedureComboBox',
									onClick:function(data){comboboxChange(data.value,8)}"></td>
								<td style="width: 8%;text-align: right;"><a id="mmSearch" style="width: 90%" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a></td>
			    			</tr>
			    			<tr style="height: 33%">
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">产品组:</td>
			    				<td style="width: 14%"><input id="mmSearchProductClass" class="easyui-combobox"
									style="width:100%"
									data-options="editable:true,valueField:'value',textField:'text',url:'<%=basePath%>mc/getAllProductClassComboBox',
									onClick:function(data){comboboxChange(data.value,1)}"></td>
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">零件名称:</td>
			    				<td style="width: 14%"><input id="mmSearchTeilName" class="easyui-combobox"
									style="width:100%"
									data-options="editable:true,valueField:'value',textField:'text',url:'<%=basePath%>mc/getAllTeilNameComboBox',
									onClick:function(data){comboboxChange(data.value,5)}"></td>
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">检验原因:</td>
			    				<td style="width: 14%"><input id="mmSearchCheckType" class="easyui-combobox"
									style="width:100%"
									data-options="editable:false,valueField:'value',textField:'text',showItemIcon: true,url:'<%=basePath%>mc/getAllCheckTypeComboBox',
									onClick:function(data){comboboxChange(data.value,3)},formatter: function(row){
										<%--var opts = $(this).combobox('options');
										return row[opts.textField];--%>
										 return '<div style=\'background:'+row.color+';width:20px;height:20px;float: left;margin-right: 5px\'></div>'+row.text;
									}"></td>
			    				<td style="width: 9%;text-align: right;white-space:nowrap;">检验人员:</td>
			    				<td style="width: 14%"><input id="mmSearchCheckMan" class="easyui-combobox"
									style="width:100%"
									data-options="editable:true,valueField:'value',textField:'text',url:'<%=basePath%>mc/getAllCheckManComboBox',
									onClick:function(data){comboboxChange(data.value,6)}"></td>
								<td style="width: 8%;text-align: right;"> <a id="exportExcel" class="easyui-linkbutton" data-options="iconCls:'icon-excelIcon'" style="width: 90%;white-space:nowrap;">导出Excel</a></td>
			    			</tr>
			    			<tr style="height: 33%">
			    				<td>
			    					<input id="sb" class="easyui-switchbutton"  data-options="onChange:function(checked){timeChange(checked)},onText:'详细时间',offText:'时间区间'"
							    		style="width:90%;height:80%;">
			    				</td>
			    				<td colspan="4">
			    					<div id="dataTimeFormOne" >
			    						<form>
											<input class="easyui-radiobutton" name="searchDate" value=""
												label="全部" labelWidth="50" labelAlign="right"
												data-options="onChange:function(checked){if(checked){searchTimeChange(1)}}">
											<input class="easyui-radiobutton" name="searchDate" value=""
												label="今日" labelWidth="50" labelAlign="right" checked="true"
												data-options="onChange:function(checked){if(checked){searchTimeChange(2)}}">
											<input class="easyui-radiobutton" name="searchDate" value=""
												label="昨日" labelWidth="50" labelAlign="right"
												data-options="onChange:function(checked){if(checked){searchTimeChange(3)}}">
											<input class="easyui-radiobutton" name="searchDate" value=""
												label="最近一周" labelWidth="80" labelAlign="right"
												data-options="onChange:function(checked){if(checked){searchTimeChange(4)}}">
											<!-- <input class="easyui-radiobutton" name="searchDate" value=""
												label="最近一月" labelWidth="80" labelAlign="right"
												data-options="onChange:function(checked){if(checked){searchTimeChange(5)}}">
											<input class="easyui-radiobutton" name="searchDate" value=""
												label="最近一季度" labelWidth="80" labelAlign="right"
												data-options="onChange:function(checked){if(checked){searchTimeChange(6)}}">
											<input class="easyui-radiobutton" name="searchDate" value=""
												label="一年数据" labelWidth="80" labelAlign="right"
												data-options="onChange:function(checked){if(checked){searchTimeChange(7)}}"> -->
										</form>
			    					</div>
			    					<div id="dataTimeFormTwo">
			    						<input class="easyui-datetimebox" id="mmStartDateTimeBox" data-options="editable:false,label:'开始时间:',labelAlign:'right',onChange:function(newDate,oldDate){mmDateTimeBoxSearch(newDate,1)},onShowPanel:function(){
					        																							$(this).datetimebox('spinner').timespinner('setValue','07:00:00');}" style="width:250px">
										<input class="easyui-datetimebox" id="mmEndDateTimeBox" data-options="editable:false,label:'结束时间:',labelAlign:'right',onChange:function(newDate,oldDate){mmDateTimeBoxSearch(newDate,2)},onShowPanel:function(){
					        																							$(this).datetimebox('spinner').timespinner('setValue','07:00:00');}" style="width:250px">
			    					</div>
									<!-- <form  style="float: left;margin-left: 10px">
										<input class="easyui-datetimebox" id="mmStartDateTimeBox" data-options="editable:false,label:'开始时间:',labelAlign:'right',onChange:function(newDate,oldDate){mmDateTimeBoxSearch(newDate,1)},onShowPanel:function(){
					        																							$(this).datetimebox('spinner').timespinner('setValue','07:00:00');}" style="width:250px">
										<input class="easyui-datetimebox" id="mmEndDateTimeBox" data-options="editable:false,label:'结束时间:',labelAlign:'right',onChange:function(newDate,oldDate){mmDateTimeBoxSearch(newDate,2)},onShowPanel:function(){
					        																							$(this).datetimebox('spinner').timespinner('setValue','07:00:00');}" style="width:250px">
									</form> -->
			    				</td>
			    				<td colspan="4">
			    					<form style="float: right;margin: 10px">
							    		<input class="easyui-radiobutton" name="type" value="" label="产品组：" labelAlign='right'
							    			data-options="onChange:function(checked){if(checked){changeChartType(1)}}">
							    		<input class="easyui-radiobutton" name="type" value="" label="产线：" labelAlign='right'
							    			data-options="onChange:function(checked){if(checked){changeChartType(2)}},checked:true">
							    		<input class="easyui-radiobutton" name="type" value="" label="产线&gt;工序：" labelAlign='right'
							    			data-options="labelWidth:'100',onChange:function(checked){if(checked){changeChartType(4)}}">
							    		<input class="easyui-radiobutton" name="type" value="" label="产线&gt;设备：" labelAlign='right'
							    			data-options="labelWidth:'100',onChange:function(checked){if(checked){changeChartType(0)}}">
							    		<!-- <input class="easyui-radiobutton" name="type" value="" label="设备：" labelAlign='right'
							    			data-options="onChange:function(checked){if(checked){changeChartType(3)}}"> -->
							    	</form>
			    				</td>
			    			</tr>
			    		</table>
					</form>
			    </div>
			</div>
		</div>
		<div data-options="region:'west',title:'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;检测任务统计',split:true,border:false,collapsed:true"
			style="width:50%;">
			<table id="planTable">
				<thead>
					<tr>
						<!-- <th data-options="field:'TETEIL',width:50,align:'center'">零件序号</th> -->
						<th data-options="field:'TETEILNR',width:100,align:'center',sortable:true">零件号</th>
						<th data-options="field:'TE_1341',width:100,align:'center',sortable:true">检验计划编号</th>
						<th data-options="field:'TEKOSTST',width:100,align:'center',sortable:true">生产线</th>
						<th data-options="field:'TEAUFTRAGGBBEZ',width:100,align:'center',sortable:true">工序</th>
						<th data-options="field:'TEKURZBEZEICH',width:100,align:'center',sortable:true">产品组</th>
						<th data-options="field:'TEBEZEICH',width:100,align:'center',sortable:true">零件名</th>
						<th data-options="field:'WV0063',width:100,align:'center',sortable:true">检验原因</th>
						<th data-options="field:'WVDATZEIT',width:120,align:'center',sortable:true">检测时间</th>
						<th data-options="field:'PRVORNAME',width:100,align:'center',sortable:true">检测人员</th>
					</tr>
				</thead>
			</table>
			<div id="mmTableTB" style="padding: 5px">

				<!-- <input class="easyui-datetimebox" id="mmSearchStartTime" name="mmSearchStartTime" data-options="editable:false,label:'检测时间:',labelAlign:'right'" style="width:200px">
			  				<input class="easyui-datetimebox" id="mmSearchEndTime" name="mmSearchEndTime" data-options="editable:false,label:'至:',labelAlign:'center',labelWidth:30" style="width:200px"> -->

			</div>
		</div>
		<div data-options="region:'center',title:'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;任务管理主界面',onResize:function(){chartResize()}"
			style="padding:5px;">
			<div id="charts" style="width: 100%;">

			</div>
		</div>
		<!-- <div data-options="region:'center',border:false,title:'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;图表'">
			<div class="easyui-layout" fit="true">
			    <div data-options="region:'north',split:false" style="height:40px;padding: 5px;overflow: hidden;">
			    	<form>
			    		<input class="easyui-radiobutton" name="type" value="" label="产品组：" labelAlign='right'
			    			data-options="onChange:function(checked){if(checked){changeChartType(1)}},checked:true">
			    		<input class="easyui-radiobutton" name="type" value="" label="产线：" labelAlign='right'
			    			data-options="onChange:function(checked){if(checked){changeChartType(2)}}">
			    		<input class="easyui-radiobutton" name="type" value="" label="产线&gt;设备：" labelAlign='right'
			    			data-options="labelWidth:'100',onChange:function(checked){if(checked){changeChartType(0)}}">
			    		<input class="easyui-radiobutton" name="type" value="" label="设备：" labelAlign='right'
			    			data-options="onChange:function(checked){if(checked){changeChartType(3)}}">
			    		<input class="easyui-radiobutton" name="type" value="" label="产线&gt;工序：" labelAlign='right'
			    			data-options="labelWidth:'100',onChange:function(checked){if(checked){changeChartType(4)}}">
			    	</form>
			    </div>
			    <div id="charts" data-options="region:'center',onResize:function(){chartResize()}" style="padding:5px;"></div>
			</div>
		</div> -->
	</div>
	<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
	<script type="text/javascript">
		$('#dataTimeFormTwo').hide();
		var mmchart;
		var initToday=new Date();
		var tomorrow=new Date();
		tomorrow.setTime(initToday.getTime()+24*60*60*1000)
		var startTime=initToday.getFullYear()+"-"+(initToday.getMonth()+1)+"-"+initToday.getDate()+" "+"07:30:00";
		var endTime=tomorrow.getFullYear()+"-"+(tomorrow.getMonth()+1)+"-"+(tomorrow.getDate())+" "+"07:30:00";
		var chartType=2;
		getChartData('','','','','','','','',chartType);
		$('#planTable').datagrid({
			url:'<%=basePath%>mc/getCheckMissionData',
			fitColumns:true,
			singleSelect:true,
			fit:true,
			toolbar:'#mmTableTB',
			pagination : true,
			pageSize : 20,
			pageList : [ 20, 40, 60, 80 ],
			queryParams: {factoryName: '${mmFactoryName }',workShopName: '${mmWorkShopName }',startTime:startTime,endTime:endTime},
			onSelect:function(index,row){getDetailsPage(row);}
		})
		function searchTimeChange(index){
			var now=new Date();
			switch(index) {
			     case 1:
			     	startTime='';
			     	endTime='';
			        break;
			     case 2:
			   		var tomorrowDay=new Date();
					tomorrowDay.setTime(now.getTime()+24*60*60*1000)
			        startTime=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+"07:30:00";
			        endTime=tomorrowDay.getFullYear()+"-"+(tomorrowDay.getMonth()+1)+"-"+(tomorrowDay.getDate())+" "+"07:30:00";
			        break;
			     case 3:
			        var yestoday=new Date();
			        yestoday.setTime(now.getTime()-24*60*60*1000);
			        startTime=yestoday.getFullYear()+"-"+(yestoday.getMonth()+1)+"-"+yestoday.getDate()+" "+"07:30:00";
			        endTime=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+"07:30:00";
			        break;
			     case 4:
			        var searchTime=now.getTime()-(7*86400000);
					var ago=new Date(searchTime);
					startTime=ago.getFullYear()+"-"+(ago.getMonth()+1)+"-"+ago.getDate()+" "+"07:30:00";
					endTime=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+"07:30:00";
			        break;
			     case 5:
			        var searchTime=now.getTime()-(30*86400000);
					var ago=new Date(searchTime);
					startTime=ago.getFullYear()+"-"+(ago.getMonth()+1)+"-"+ago.getDate()+" "+"07:30:00";
					endTime=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+"07:30:00";
			        break;
			     case 6:
			        var searchTime=now.getTime()-(90*86400000);
					var ago=new Date(searchTime);
					startTime=ago.getFullYear()+"-"+(ago.getMonth()+1)+"-"+ago.getDate()+" "+"07:30:00";
					endTime=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+"07:30:00";
			        break;
			     case 7:
			        var searchTime=now.getTime()-(365*86400000);
					var ago=new Date(searchTime);
					startTime=ago.getFullYear()+"-"+(ago.getMonth()+1)+"-"+ago.getDate()+" "+"07:30:00";
					endTime=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+"07:30:00";
			}
			$('#planTable').datagrid('reload',{
				startTime:startTime,
				endTime:endTime,
				productClass:$('#mmSearchProductClass').combobox('getValue'),
				productLine:$('#mmSearchProductLine').combobox('getValue'),
				checkType:$('#mmSearchCheckType').combobox('getValue'),
				checkPlanNum:$('#mmSearchCheckPlanNum').combobox('getValue'),
				teilName:$('#mmSearchTeilName').combobox('getValue'),
				checkMan:$('#mmSearchCheckMan').combobox('getValue'),
				factoryName: $('#mmFactoryName').val(),
				workShopName: $('#mmWorkShopName').val(),
				teilNum:$('#mmSearchTeilNum').val(),
				procedure:$('#mmProcedure').combobox('getValue')
			});
			if(mmchart!=null&mmchart!=''){
							mmchart.clear();
						}
			getChartData($('#mmSearchProductClass').combobox('getValue'),$('#mmSearchProductLine').combobox('getValue'),$('#mmSearchCheckType').combobox('getValue'),$('#mmSearchCheckPlanNum').combobox('getValue'),$('#mmSearchTeilName').combobox('getValue'),$('#mmSearchCheckMan').combobox('getValue'),$('#mmSearchTeilNum').val(),$('#mmProcedure').combobox('getValue'),chartType);
		}
		function comboboxChange(newValue,index){
			var productClass=$('#mmSearchProductClass').combobox('getValue');
			var productLine=$('#mmSearchProductLine').combobox('getValue');
			var checkType=$('#mmSearchCheckType').combobox('getValue');
			var checkPlanNum=$('#mmSearchCheckPlanNum').combobox('getValue');
			var teilNum=$('#mmSearchTeilNum').combobox('getValue');
			var teilName=$('#mmSearchTeilName').combobox('getValue');
			var checkMan=$('#mmSearchCheckMan').combobox('getValue');
			var procedure=$('#mmProcedure').combobox('getValue');

			switch(index) {
			     case 1:
			     	productClass=newValue;
			        break;
			     case 2:
			     	productLine=newValue;
			        break;
			     case 3:
			     	checkType=newValue;
			        break;
			     case 4:
			     	checkPlanNum=newValue;
			        break;
			     case 5:
			     	teilName=newValue;
			        break;
			     case 6:
			     	checkMan=newValue;
			     	break;
			     case 7:
			     	teilNum=newValue;
			     	break;
			     case 8:
			     	procedure=newValue;
			}
			$('#planTable').datagrid('reload',{
				startTime:startTime,
				endTime:endTime,
				productClass:productClass,
				productLine:productLine,
				checkType:checkType,
				checkPlanNum:checkPlanNum,
				teilName:teilName,
				checkMan:checkMan,
				teilNum:teilNum,
				procedure:procedure,
				factoryName: $('#mmFactoryName').val(),
				workShopName: $('#mmWorkShopName').val()
			});
			if(mmchart!=null&mmchart!=''){
							mmchart.clear();
						}
			getChartData(productClass,productLine,checkType,checkPlanNum,teilName,checkMan,teilNum,procedure,chartType);
		}
		$('#mmSearch').click(function(){
			var productClass=$('#mmSearchProductClass').combobox('getValue');
			var productLine=$('#mmSearchProductLine').combobox('getValue');
			var checkType=$('#mmSearchCheckType').combobox('getValue');
			var checkPlanNum=$('#mmSearchCheckPlanNum').combobox('getValue');
			var teilNum=$('#mmSearchTeilNum').combobox('getValue');
			var teilName=$('#mmSearchTeilName').combobox('getValue');
			var checkMan=$('#mmSearchCheckMan').combobox('getValue');
			var procedure=$('#mmProcedure').combobox('getValue');
			$('#planTable').datagrid('reload',{
				startTime:startTime,
				endTime:endTime,
				productClass:productClass,
				productLine:productLine,
				checkType:checkType,
				checkPlanNum:checkPlanNum,
				teilName:teilName,
				checkMan:checkMan,
				teilNum:teilNum,
				procedure:procedure,
				factoryName: $('#mmFactoryName').val(),
				workShopName: $('#mmWorkShopName').val()
			});
			if(mmchart!=null&mmchart!=''){
							mmchart.clear();
						}
			getChartData(productClass,productLine,checkType,checkPlanNum,teilName,checkMan,teilNum,procedure,chartType);

		})
		function getChartData(productClass,productLine,checkType,checkPlanNum,teilName,checkMan,teilNum,procedure,chartType){
			$.ajax({
				type:'post',
				url:'<%=basePath%>mc/getProductionPlanChartData',
				data:{
					startTime:startTime,
					endTime:endTime,
					productClass:productClass,
					productLine:productLine,
					checkType:checkType,
					checkPlanNum:checkPlanNum,
					teilName:teilName,
					checkMan:checkMan,
					procedure:procedure,
					teilNum:teilNum,
					factoryName: $('#mmFactoryName').val(),
					workShopName: $('#mmWorkShopName').val()
				},
				success:function(data){
					if(data.length>0){
						if(chartType=='0'){
							var plMacArr=new Array();
							var chartDataArr=new Array();
							for(var i=0;i<data.length;i++){
								var obj=new Object();
								obj.name=data[i].tepreinrnr;
								obj.TETEILNR=data[i].teteilnr;
								obj.TETEIL=data[i].teteil;
								//obj.TEPRGRUNDBEZ=data[i].teprgrundbez;
								obj.WV0063=data[i].wv0063;
								obj.WV0063ID=data[i].wv0063Id;
								obj.WVWERTNR=data[i].wvwertnr;
								obj.TEKURZBEZEICH=data[i].tekurzbezeich;
								var valueArr=new Array();
								var itemStyleObj=new Object();
								var normalObj=new Object();
								if(data[i].alarmRed>0){
									valueArr=[data[i].tekostst+"\n "+data[i].tepreinrnr,data[i].startTime,data[i].endTime,'有'+data[i].alarmRed+'个超差数据',data[i].prvorname];
									normalObj.color='#EE0000';
								}else if((data[i].alarmYellow>0)){
									valueArr=[data[i].tekostst+"\n "+data[i].tepreinrnr,data[i].startTime,data[i].endTime,'有'+data[i].alarmYellow+'个警报数据',data[i].prvorname];
									normalObj.color='#FFFF00';
								}else if(data[i].alarmRed<=0&data[i].alarmYellow<=0){
									//normalObj.color='#00FA00';
									valueArr=[data[i].tekostst+"\n "+data[i].tepreinrnr,data[i].startTime,data[i].endTime,'无超差数据',data[i].prvorname];
									/*if(data[i].wv0063Id=='1'){
										normalObj.color='#CAE1FF';
									}else if(data[i].wv0063Id=='2'){
										normalObj.color='#104E8B';
									}else if(data[i].wv0063Id=='3'){
										normalObj.color='#7A7A7A';
									}else if(data[i].wv0063Id=='4'){
										normalObj.color='#7B68EE';
									}else if(data[i].wv0063Id=='5'){
										normalObj.color='#E0BC78';
									}else if(data[i].wv0063Id=='6'){
										normalObj.color='#72B362';
									} else{
										normalObj.color='#080808';
									}*/
									normalObj.color=data[i].chartColor;
								}
								obj.value=valueArr;
								itemStyleObj.normal=normalObj;
								obj.itemStyle=itemStyleObj;
								chartDataArr.push(obj);
								plMacArr.push(data[i].tekostst+"\n "+data[i].tepreinrnr);
							}
							plMacArr.sort();
							var yValueArr=new Array();
							var firstobj=plMacArr[0];
							yValueArr.push(firstobj);
							for(var i=0;i<plMacArr.length;i++){
								if(firstobj!=plMacArr[i]){
									firstobj=plMacArr[i];
									yValueArr.push(firstobj);
								}
							}
							if(3>=yValueArr.length){
								$('#charts').height('170px');
							}else{
								$('#charts').height(yValueArr.length*50+'px');
							}

							mmchart=initChart(yValueArr,chartDataArr,'charts');
						}else if(chartType=='1'){
							var pcArr=new Array();
							var chartDataArr=new Array();
							for(var i=0;i<data.length;i++){
								var obj=new Object();
								obj.name=data[i].tekurzbezeich;
								obj.TETEILNR=data[i].teteilnr;
								//obj.TEPRGRUNDBEZ=data[i].teprgrundbez;
								obj.WV0063=data[i].wv0063;
								obj.WV0063ID=data[i].wv0063Id;
								obj.WVWERTNR=data[i].wvwertnr;
								obj.TETEIL=data[i].teteil;
								obj.TEKURZBEZEICH=data[i].tekurzbezeich;
								var valueArr=new Array();
								var itemStyleObj=new Object();
								var normalObj=new Object();
								if(data[i].alarmRed>0){
									valueArr=[data[i].tekurzbezeich,data[i].startTime,data[i].endTime,'有'+data[i].alarmRed+'个超差数据',data[i].prvorname];
									normalObj.color='#EE0000';
								}else if((data[i].alarmYellow>0)){
									valueArr=[data[i].tekurzbezeich,data[i].startTime,data[i].endTime,'有'+data[i].alarmYellow+'个警报数据',data[i].prvorname];
									normalObj.color='#FFFF00';
								}else if(data[i].alarmRed<=0&data[i].alarmYellow<=0){
									//normalObj.color='#00FA00';
									valueArr=[data[i].tekurzbezeich,data[i].startTime,data[i].endTime,'有'+data[i].alarmYellow+'个警报数据',data[i].prvorname];
									/*if(data[i].wv0063Id=='1'){
										normalObj.color='#CAE1FF';
									}else if(data[i].wv0063Id=='2'){
										normalObj.color='#104E8B';
									}else if(data[i].wv0063Id=='3'){
										normalObj.color='#7A7A7A';
									}else if(data[i].wv0063Id=='4'){
										normalObj.color='#7B68EE';
									}else if(data[i].wv0063Id=='5'){
										normalObj.color='#E0BC78';
									}else if(data[i].wv0063Id=='6'){
										normalObj.color='#72B362';
									} else{
										normalObj.color='#080808';
									}*/
									normalObj.color=data[i].chartColor;
								}
								obj.value=valueArr;
								itemStyleObj.normal=normalObj;
								obj.itemStyle=itemStyleObj;
								chartDataArr.push(obj);
								pcArr.push(data[i].tekurzbezeich);
							}
							pcArr.sort();
							var yValueArr=new Array();
							var firstPc=pcArr[0];
							yValueArr.push(firstPc);
							for(var i=0;i<pcArr.length;i++){
								if(pcArr[i]!=firstPc){
									yValueArr.push(pcArr[i]);
									firstPc=pcArr[i];
								}
							}
							if(3>=yValueArr.length){
								$('#charts').height('170px');
							}else{
								$('#charts').height(yValueArr.length*50+'px');
							}
							mmchart=initChart(yValueArr,chartDataArr,'charts');
						}else if(chartType=='2'){
							var plArr=new Array();
							var chartDataArr=new Array();
							for(var i=0;i<data.length;i++){
								var obj=new Object();
								obj.name=data[i].tekostst;
								obj.TETEILNR=data[i].teteilnr;
								obj.TETEIL=data[i].teteil;
								//obj.TEPRGRUNDBEZ=data[i].teprgrundbez;
								obj.WV0063=data[i].wv0063;
								obj.WV0063ID=data[i].wv0063Id;
								obj.WVWERTNR=data[i].wvwertnr;
								obj.TEKURZBEZEICH=data[i].tekurzbezeich;
								var valueArr=new Array();
								var itemStyleObj=new Object();
								var normalObj=new Object();
								if(data[i].alarmRed>0){
									valueArr=[data[i].tekostst,data[i].startTime,data[i].endTime,'有'+data[i].alarmRed+'个超差数据',data[i].prvorname];
									normalObj.color='#EE0000';
								}else if((data[i].alarmYellow>0)){
									valueArr=[data[i].tekostst,data[i].startTime,data[i].endTime,'有'+data[i].alarmYellow+'个警报数据',data[i].prvorname];
									normalObj.color='#FFFF00';
								}else if(data[i].alarmRed<=0&data[i].alarmYellow<=0){
									//normalObj.color='#00FA00';
									valueArr=[data[i].tekostst,data[i].startTime,data[i].endTime,'有'+data[i].alarmYellow+'个警报数据',data[i].prvorname];
									/*if(data[i].wv0063Id=='1'){
										normalObj.color='#CAE1FF';
									}else if(data[i].wv0063Id=='2'){
										normalObj.color='#104E8B';
									}else if(data[i].wv0063Id=='3'){
										normalObj.color='#7A7A7A';
									}else if(data[i].wv0063Id=='4'){
										normalObj.color='#7B68EE';
									}else if(data[i].wv0063Id=='5'){
										normalObj.color='#E0BC78';
									}else if(data[i].wv0063Id=='6'){
										normalObj.color='#72B362';
									} else{
										normalObj.color='#080808';
									}*/
									normalObj.color=data[i].chartColor;
								}
								obj.value=valueArr;
								itemStyleObj.normal=normalObj;
								obj.itemStyle=itemStyleObj;
								chartDataArr.push(obj);
								plArr.push(data[i].tekostst);
							}
							plArr.sort();
							var yValueArr=new Array();
							var firstPl=plArr[0];
							yValueArr.push(firstPl);
							for(var i=0;i<plArr.length;i++){
								if(plArr[i]!=firstPl){
									yValueArr.push(plArr[i]);
									firstPl=plArr[i];
								}
							}
							if(3>=yValueArr.length){
								$('#charts').height('170px');
							}else{
								$('#charts').height(yValueArr.length*50+'px');
							}
							mmchart=initChart(yValueArr,chartDataArr,'charts');
						}else if(chartType=='3'){
							var k1202Arr=new Array();
							var chartDataArr=new Array();
							for(var i=0;i<data.length;i++){
								var obj=new Object();
								obj.name=data[i].tepreinrnr;
								obj.TETEILNR=data[i].TETEILNR;
								//obj.TEPRGRUNDBEZ=data[i].teprgrundbez;
								obj.WV0063=data[i].wv0063;
								obj.WV0063ID=data[i].wv0063Id;
								obj.WVWERTNR=data[i].WVWERTNR;
								obj.TETEIL=data[i].TETEIL;
								var valueArr=new Array();
								var itemStyleObj=new Object();
								var normalObj=new Object();
								if(data[i].alarmCount1>0|data[i].alarmCount2>0|data[i].alarmCount65536>0){
									var count=parseInt(data[i].alarmCount1)+parseInt(data[i].alarmCount2)+parseInt(data[i].alarmCount65536);
									valueArr=[data[i].tepreinrnr,data[i].startTime,data[i].endTime,'有'+count+'个超差数据',data[i].prvorname];
									normalObj.color='#EE0000';
								}else if((data[i].alarmCount1==0|data[i].alarmCount2==0|data[i].alarmCount65536==0)&(data[i].alarmCount16>0|data[i].alarmCount32>0)){
									var count=parseInt(data[i].alarmCount16)+parseInt(data[i].alarmCount32);
									valueArr=[data[i].tepreinrnr,data[i].startTime,data[i].endTime,'有'+count+'个警报数据',data[i].prvorname];
									normalObj.color='#FFFF00';
								}else if(data[i].alarmRed<=0&data[i].alarmYellow<=0){
									//normalObj.color='#00FA00';
									valueArr=[data[i].tepreinrnr,data[i].startTime,data[i].endTime,'有'+count+'个警报数据',data[i].prvorname];
									/*if(data[i].wv0063Id=='1'){
										normalObj.color='#CAE1FF';
									}else if(data[i].wv0063Id=='2'){
										normalObj.color='#104E8B';
									}else if(data[i].wv0063Id=='3'){
										normalObj.color='#7A7A7A';
									}else if(data[i].wv0063Id=='4'){
										normalObj.color='#7B68EE';
									}else if(data[i].wv0063Id=='5'){
										normalObj.color='#E0BC78';
									}else if(data[i].wv0063Id=='6'){
										normalObj.color='#72B362';
									} else{
										normalObj.color='#080808';
									}*/
									normalObj.color=data[i].chartColor;
								}
								obj.value=valueArr;
								itemStyleObj.normal=normalObj;
								obj.itemStyle=itemStyleObj;
								chartDataArr.push(obj);
								k1202Arr.push(data[i].tepreinrnr);
							}
							k1202Arr.sort();
							var yValueArr=new Array();
							var firstMachine=k1202Arr[0];
							yValueArr.push(firstMachine);
							for(var i=0;i<k1202Arr.length;i++){
								if(k1202Arr[i]!=firstMachine){
									yValueArr.push(k1202Arr[i]);
									firstMachine=k1202Arr[i];
								}
							}
							if(3>=yValueArr.length){
								$('#charts').height('170px');
							}else{
								$('#charts').height(yValueArr.length*50+'px');
							}
							mmchart=initChart(yValueArr,chartDataArr,'charts');
						}else if(chartType=='4'){
							var plgxArr=new Array();
							var chartDataArr=new Array();
							for(var i=0;i<data.length;i++){
								var obj=new Object();
								obj.name=data[i].tepreinrnr;
								obj.TETEILNR=data[i].teteilnr;
								obj.TETEIL=data[i].teteil;
								//obj.TEPRGRUNDBEZ=data[i].teprgrundbez;
								obj.WV0063=data[i].wv0063;
								obj.WV0063ID=data[i].wv0063Id;
								obj.WVWERTNR=data[i].wvwertnr;
								obj.TEKURZBEZEICH=data[i].tekurzbezeich;
								var valueArr=new Array();
								var itemStyleObj=new Object();
								var normalObj=new Object();
								if(data[i].alarmRed>0){
									valueArr=[data[i].tekostst+"\n "+data[i].teauftraggbbez,data[i].startTime,data[i].endTime,'有'+data[i].alarmRed+'个超差数据',data[i].prvorname];
									normalObj.color='#EE0000';
								}else if(data[i].alarmYellow>0){
									valueArr=[data[i].tekostst+"\n "+data[i].teauftraggbbez,data[i].startTime,data[i].endTime,'有'+data[i].alarmYellow+'个警报数据',data[i].prvorname];
									normalObj.color='#FFFF00';
								}else if(data[i].alarmRed<=0&data[i].alarmYellow<=0){
									//normalObj.color='#00FA00';
									valueArr=[data[i].tekostst+"\n "+data[i].teauftraggbbez,data[i].startTime,data[i].endTime,'无超差数据',data[i].prvorname];
									/*if(data[i].wv0063Id=='1'){
										normalObj.color='#CAE1FF';
									}else if(data[i].wv0063Id=='2'){
										normalObj.color='#104E8B';
									}else if(data[i].wv0063Id=='3'){
										normalObj.color='#7A7A7A';
									}else if(data[i].wv0063Id=='4'){
										normalObj.color='#7B68EE';
									}else if(data[i].wv0063Id=='5'){
										normalObj.color='#E0BC78';
									}else if(data[i].wv0063Id=='6'){
										normalObj.color='#72B362';
									} else{
										normalObj.color='#080808';
									}*/
									normalObj.color=data[i].chartColor;
								}
								obj.value=valueArr;
								itemStyleObj.normal=normalObj;
								obj.itemStyle=itemStyleObj;
								chartDataArr.push(obj);
								plgxArr.push(data[i].tekostst+"\n "+data[i].teauftraggbbez);
							}
							plgxArr.sort();
							var yValueArr=new Array();
							var firstobj=plgxArr[0];
							yValueArr.push(firstobj);
							for(var i=0;i<plgxArr.length;i++){
								if(firstobj!=plgxArr[i]){
									firstobj=plgxArr[i];
									yValueArr.push(firstobj);
								}
							}
							if(3>=yValueArr.length){
								$('#charts').height('170px');
							}else{
								$('#charts').height(yValueArr.length*50+'px');
							}
							console.log(chartDataArr);
							mmchart=initChart(yValueArr,chartDataArr,'charts');
						}
					}else{
						if(mmchart!=null&mmchart!=''){
							mmchart.clear();
						}
					}
				}
			})
		}

		function renderItem(params, api) {
			    var categoryIndex = api.value(0);
			    var start = api.coord([api.value(1), categoryIndex]);
			    var end = api.coord([api.value(2), categoryIndex]);
			   // var height = api.size([0, 1])[1] * 0.6;
				var height=25;
			    var rectShape = echarts.graphic.clipRectByRect({
			        x: start[0],
			        y: start[1] - height / 2,
			        //width: end[0] - start[0],
			        width:5,
			        height: height
			    }, {
			        x: params.coordSys.x,
			        y: params.coordSys.y,
			        width: params.coordSys.width,
			        height: params.coordSys.height
			    });
			    return rectShape && {
			        type: 'rect',
			        shape: rectShape,
			        style: api.style()
			    };
			}

		function initChart(categories,data,divId){
			var myChart = echarts.init(document.getElementById(divId),'mytheme');
			option = {
			    tooltip: {
			        formatter: function (params) {
			            return params.marker + '零件号：'+params.data.TETEILNR+'<br>'+
			            '检验原因：'+params.data.WV0063+'<br>'+
			            '开始时间：'+params.value[1]+'<br>'+
			            '结束时间：'+params.value[2]+'<br>'+
			             '检测员：'+params.value[4]+'<br>'+
			            params.name + ': ' + params.value[3];
			        },
			        confine:true
			    },
			    dataZoom: [{
			        type: 'slider',
			        filterMode: 'weakFilter',
			        showDataShadow: false,
			        //top: 100,
			        height: 10,
			        borderColor: 'transparent',
			        backgroundColor: '#e2e2e2',
			        handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
			        handleSize: 20,
			        handleStyle: {
			            shadowBlur: 6,
			            shadowOffsetX: 1,
			            shadowOffsetY: 2,
			            shadowColor: '#aaa'
			        },
			        labelFormatter: '',
			        end:100
			    }, {
			        type: 'inside',
			        filterMode: 'weakFilter'
			    }],
			    grid: {
	                left: '3%',
	                right: '7%',
	                top:'1%',
	                bottom: '50px',
	                containLabel: true
	            },
			    xAxis: {
			       type:'time',
			    	name:'时间',
			    	max: function (value) {
					    return value.max+(value.max-value.min)*0.1;
					},
			    	//data: xValues,
			    	splitLine:{
	                    show:false
	                },
	                axisLine: {show: true},
	                axisTick: {
	                    show: true
	                }
			    },
			    yAxis: {
			        data: categories,
			        axisLabel:{
				        interval:0
				    }
			    },
			    series: [{
			        type: 'custom',
			        renderItem: renderItem,
			        itemStyle: {
			            normal: {
			                opacity: 1
			            }
			        },
			        encode: {
			            x: [1, 2],
			            y: 0
			        },
			        data: data
			    }]
			};
			if (option && typeof option === "object") {
			    myChart.setOption(option, true);
			    myChart.off('click');
			    myChart.on('click',function (params) {
				    $('#mmPanel').panel('close');
					$('#mmDetailsPage').panel('open');
					$('#mmDetailsPage').panel('resize');
					$('#mmTwoLi').html('&gt;&nbsp;&nbsp;主界面');
					$('#mmDetailsPageCenterBox').panel('refresh','<%=basePath%>mc/initMissionManageTwo?teilId='+params.data.TETEIL+'&teilNum='+params.data.TETEILNR+'&wvwertnr='+params.data.WVWERTNR+'&checkMan='+encodeURI(params.value[4])+'&tekurzbezeich='+encodeURI(params.data.TEKURZBEZEICH)+'&wv0063Id='+encodeURI(params.data.WV0063ID)+'&wv0063='+encodeURI(params.data.WV0063));
				});
			    myChart.resize();
			}
			return myChart;
		}
		function chartResize(){
			if(mmchart!=null&mmchart!=''){
				mmchart.resize();
			}
		}
		function getDetailsPage(row){
			$('#mmPanel').panel('close');
			$('#mmDetailsPage').panel('open');
			$('#mmDetailsPage').panel('resize');
			$('#mmTwoLi').html('&gt;&nbsp;&nbsp;主界面');
			$('#mmDetailsPageCenterBox').panel('refresh','<%=basePath%>mc/initMissionManageTwo?teilId='+row.TETEIL+'&wvwertnr='+row.WVWERTNR);
		}
		function timeChange(checked){
			if(checked){
				$('#dataTimeFormOne').hide();
				$('#dataTimeFormTwo').show();
			}else{
				$('#dataTimeFormTwo').hide();
				$('#dataTimeFormOne').show();
			}
		}
		function mmDateTimeBoxSearch(newDate,index){
			if(index==1){
				startTime=newDate;
				endTime=$('#mmEndDateTimeBox').datetimebox('getValue');
			}else{
				startTime=$('#mmStartDateTimeBox').datetimebox('getValue');
				endTime=newDate;
			}
			$('#planTable').datagrid('reload',{
				startTime:startTime,
				endTime:endTime,
				productClass:$('#mmSearchProductClass').combobox('getValue'),
				productLine:$('#mmSearchProductLine').combobox('getValue'),
				checkType:$('#mmSearchCheckType').combobox('getValue'),
				checkPlanNum:$('#mmSearchCheckPlanNum').combobox('getValue'),
				teilName:$('#mmSearchTeilName').combobox('getValue'),
				checkMan:$('#mmSearchCheckMan').combobox('getValue'),
				factoryName: $('#mmFactoryName').val(),
				workShopName: $('#mmWorkShopName').val(),
				teilNum:$('#mmSearchTeilNum').val(),
				procedure:$('#mmProcedure').combobox('getValue')
			});
			if(mmchart!=null&mmchart!=''){
							mmchart.clear();
						}
			getChartData($('#mmSearchProductClass').combobox('getValue'),$('#mmSearchProductLine').combobox('getValue'),$('#mmSearchCheckType').combobox('getValue'),$('#mmSearchCheckPlanNum').combobox('getValue'),$('#mmSearchTeilName').combobox('getValue'),$('#mmSearchCheckMan').combobox('getValue'),$('#mmSearchTeilNum').val(),$('#mmProcedure').combobox('getValue'),chartType);
		}
		function timestampToTime(timestamp) {
	       /*  var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
	        var Y = date.getFullYear() + ' -';
	        var M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + ' -';
	        var D = (date.getDate() < 10 ? '0'+date.getDate() : date.getDate()) + ' ';
	        var h = (date.getHours() < 10 ? '0'+date.getHours() : date.getHours()) + ' :';
	        var m = (date.getMinutes() < 10 ? '0'+date.getMinutes() : date.getMinutes()) + ' :';
	        var s = (date.getSeconds() < 10 ? '0'+date.getSeconds() : date.getSeconds());
	        var dd=Y+M+D+h+m+s;
	        console.log(Date.parse(dd.replace(/-/g,"/")));
	        return Date.parse(dd.replace(/-/g,"/")); */
	        return timestamp;
	    }
	    function changeChartType(index){
	    	chartType=index;
	    	if(mmchart!=null&mmchart!=''){
							mmchart.clear();
						}
	    	getChartData($('#mmSearchProductClass').combobox('getValue'),$('#mmSearchProductLine').combobox('getValue'),$('#mmSearchCheckType').combobox('getValue'),$('#mmSearchCheckPlanNum').combobox('getValue'),$('#mmSearchTeilName').combobox('getValue'),$('#mmSearchCheckMan').combobox('getValue'),$('#mmSearchTeilNum').val(),$('#mmProcedure').combobox('getValue'),chartType);
	    }
	    $('#exportExcel').click(function(){
	    	var url="<%=basePath%>mc/mcExportExcel?startTime="+startTime+"&endTime="+endTime+"&productClass="+$('#mmSearchProductClass').combobox('getValue')+"&productLine="+$('#mmSearchProductLine').combobox('getValue')+
	    	"&checkType="+$('#mmSearchCheckType').combobox('getValue')+"&checkPlanNum="+$('#mmSearchCheckPlanNum').combobox('getValue')+"&teilName="+$('#mmSearchTeilName').combobox('getValue')+
	    	"&checkMan="+$('#mmSearchCheckMan').combobox('getValue')+"&factoryName="+$('#mmFactoryName').val()+"&workShopName="+$('#mmWorkShopName').val()+"&teilNum="+$('#mmSearchTeilNum').val()+
	    	"&procedure="+$('#mmProcedure').combobox('getValue');
	    	window.location.href=encodeURI(url);
	    })
	</script>
</body>
</html>
