<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>
	
  </head>
  
 <body>
 	<style type="text/css">
 		.textbox .textbox-text {
 			font-size:18px;
 		} 
 		font{
 			font-size:18px;
 			font-weight:bold
 		}
 	</style>
    <div id="cc" class="easyui-layout" style="width:100%;height:100%;">
	    <div data-options="region:'north',collapsible:false" style="height:56px;padding:5px;overflow: hidden">
			<%-- <form id="titleForm" style="float: left;width: 50%;height: 100%">
				<input class="easyui-textbox" name="TEKOSTST" style="width:30%;" data-options="label:'<font>产线名:</font>',editable:false">
				<input class="easyui-textbox" name="TETEILNR" style="width:30%;" data-options="label:'<font>零件号:</font>',editable:false">
				<input class="easyui-textbox" name="TEBEZEICH" style="width:35%;" data-options="label:'<font>零件名:</font>',editable:false">
			</form> --%>
			<form style="height: 100%">
	    		<span style="margin-left: 20px"><font>轮播间隔：</font></span>
		    	<select id="jgtime" style="width:80px;padding-left: 10px">
				    <option value="10">10秒</option>
				    <option value="20">20秒</option>
				    <option value="30">30秒</option>
				    <option value="60">1分钟</option>
				     <option value="1">1秒</option>
				</select>
							<input id="qbShowSearchTimeType1" name="qbShowSearchTimeType" value="0">		
							&nbsp;<input id="lbStartTime" name="lbStartTime" style="width:100px" >
		        			<font>至</font>&nbsp;<input id="lbEndTime" name="lbEndTime" style="width:100px"> 
		        			<input id="qbShowSearchTimeType2" name="qbShowSearchTimeType" value="1">
		        			<select id="qbSearchInterval" name="qbSearchInterval" style="width:150px;">
									    <option value="0">全部数据</option>
									    <option value="1h">近一小时的数据</option>
									    <option value="1">近一天的数据</option>
									    <option value="7">近一周的数据</option>
									    <option value="30">近一个月(30)的数据</option>
									</select >
							<input id="qbShowSearchTimeType3" name="qbShowSearchTimeType" value="2">
	    	</form>
	    	
	    </div>
	    <div  data-options="region:'south',title:'测量值',collapsible:true,collapsed:true" style="height:50%;">
	    	<table id="wertevarTable">
				<thead>
					<tr>
						<th data-options="field:'WVWERT',width:80,align:'center',formatter:cellFormatter">测量值</th>
						<th data-options="field:'PRVORNAME',width:50,align:'center'">测量人员</th>
						<th data-options="field:'PMNR',width:100,align:'center'">机台编号</th>
						<th data-options="field:'PMBEZ',width:100,align:'center'">机台名</th>
						<!-- <th data-options="field:'WVMASCHINE',width:50,align:'center'">WVMASCHINE</th>
						<th data-options="field:'WVNEST',width:50,align:'center'">WVNEST</th> -->
						<th data-options="field:'WVDATZEIT',width:120,align:'center'">日期</th>
					</tr>
				</thead>
			</table>
	    </div>
	    <div data-options="region:'west',collapsible:false" style="width:30%;padding: 10px">
	    	<form id="dataForm" method="post">
	    		<div style="margin-top:15px">
	                <input class="easyui-textbox" name="TEKOSTST" style="width:100%;padding-left: 20px" data-options="label:'<font>产线名:</font>',editable:false,labelWidth:120">
	            </div>
	            <div style="margin-top:15px">
	               <input class="easyui-textbox" name="TETEILNR" style="width:100%;padding-left: 20px" data-options="label:'<font>零件号:</font>',editable:false,labelWidth:120">
	            </div>
	            <div style="margin-top:15px">
	                <input class="easyui-textbox" name="TEBEZEICH" style="width:100%;padding-left: 20px" data-options="label:'<font>零件名:</font>',editable:false,labelWidth:120">
	            </div>
	            <div style="margin-top:15px">
	                <input class="easyui-textbox textfont" name="MEMERKBEZ" style="width:100%;padding-left: 20px" data-options="label:'<font>参数:</font>',editable:false,labelWidth:120">
	            </div>
	            <div style="margin-top:15px">
	                <input class="easyui-textbox" id="MENENNMAS" name="MENENNMAS" style="width:100%;padding-left: 20px" data-options="label:'<font>名义值:</font>',editable:false,labelWidth:120">
	            </div>
	            <div style="margin-top:15px">
	                <input class="easyui-textbox" id="MEOGW" name="MEOGW" style="width:100%;padding-left: 20px" data-options="label:'<font>上公差上限:</font>',editable:false,labelWidth:120">
	            </div>
	            <div style="margin-top:15px">
	                <input class="easyui-textbox" id="MEUGW" name="MEUGW" style="width:100%;padding-left: 20px" data-options="label:'<font>下公差上限:</font>',editable:false,labelWidth:120">
	            </div>
	            <input type="hidden" id="MEMERKART" name="MEMERKART">
	        </form>
	        <input type="hidden" id="index" name="index" value="${index }">
	        <input type="hidden" id="productLineName" name="productLineName" value="${productLineName }">
	        <input type="hidden" id="teilId" name="teilId" value="${teilId }">
	    </div>
	    <div id="qbCharts" data-options="region:'center'" style="padding:5px;background:#eee;"></div>
	</div>
	<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
		<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
	<script type="text/javascript">
		var index=1;
		var autotime;
		var auto;
		var qbShowCharts;
		var qbRadioIndex=1;
		$(function(){
			$('#lbStartTime').datetimebox({
				disabled:true,
				editable:false
			})
			$('#lbEndTime').datetimebox({
				disabled:true,
				editable:false
			})
			$('#qbShowSearchTimeType1').radiobutton({
				onChange:function(checked){
					if(checked==true){
						qbRadioIndex=0;
						$('#qbSearchInterval').combobox('disable');
						$('#lbEndTime').datetimebox('enable');
						$('#lbStartTime').datetimebox('enable'); 
					}
				}
			})
			$('#qbShowSearchTimeType2').radiobutton({
				checked:true,
				onChange:function(checked){
					if(checked==true){
						qbRadioIndex=1;
						$('#qbSearchInterval').combobox('enable');
						$('#lbEndTime').datetimebox('clear').datetimebox('disable');
						$('#lbStartTime').datetimebox('clear').datetimebox('disable'); 
					}
				}
			})
			$('#qbShowSearchTimeType3').radiobutton({
				checked:false,
				label:'<font>查询近125条数据</font>',
				labelWidth:160,
				labelPosition:'after',
				onChange:function(checked){
					if(checked==true){
						qbRadioIndex=2;
						$('#qbSearchInterval').combobox('disable');
						$('#lbEndTime').datetimebox('clear').datetimebox('disable');
						$('#lbStartTime').datetimebox('clear').datetimebox('disable'); 
					}
				}
			})
			$('#qbSearchInterval').combobox({
				editable:false
			})
		})
		//var qbStartTime,qbEndTime;
		getFormData();
		$("#jgtime").combobox({
			editable:false,
			onSelect:function(record){
				autotime=record.value;
				clearInterval(auto);
				auto=setInterval(getFormData, autotime*1000);
			}
		})
		$('#wertevarTable').datagrid({
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
					onLoadSuccess:function(data){
						initChart(data,$('#MEMERKART').val());
					},
					rowStyler: function(index,row){
						if(row.ALARM_EW=='1'|row.ALARM_EW=='2'|row.ALARM_EW=='65536'){
							return 'background-color:#FF7256;color:#0000CD;';
						}else if(row.ALARM_EW=='16'|row.ALARM_EW=='32'){
							return 'background-color:#FFFF00;color:#0000CD;';
						}
					}
				});
		function getFormData(){
			var startTime,endTime,qbShowDataCount;
			var qbSearch;
			if(qbRadioIndex==0){
				startTime=$('#lbStartTime').datetimebox('getValue');
				endTime=$('#lbEndTime').datetimebox('getValue');
			}else if(qbRadioIndex==1){
				qbSearch=searchTimeInterval($('#qbSearchInterval').combobox('getValue'));
				startTime=qbSearch.startTime;
				endTime=qbSearch.endTime;
			}else {
				qbShowDataCount=125
			}
			$.ajax({
				type:'post',
				data:{
					arrIndex:index,
					startTime:startTime,
					endTime:endTime,
					teilId:$('#teilId').val(),
					productLineName:$('#productLineName').val(),
					index:$('#index').val(),
					showDataCount:qbShowDataCount
				},
				url:'<%=basePath%>qb/getQbForm',
				success:function(data){
					$('#dataForm').form('clear');
					//$('#titleForm').form('clear');
					$('#qbDig').panel('setTitle','质量看板   '+index+'/'+data.total)
					if(data.total==index){
						index=1;
					}else{
						index += 1;
					}
					$('#dataForm').form('load',data.formList);
					//$('#titleForm').form('load',data.formList);
					$('#wertevarTable').datagrid('loadData',data.tableList);
				}
			})
		}
		function initChart(data,lineBar){
			if(data.total==0){
				qbShowCharts.clear();
			}
			var rows=data.rows;
			if(lineBar=='0'){
				var upLimit=$('#MEOGW').textbox('getValue');
				var downLimit=$('#MEUGW').textbox('getValue');
				var mData=$('#MENENNMAS').textbox('getValue');
				var xValue=[];
				var yValue=[];
				var tooltipTime=[];
				var tooltipPRVORNAME=[];
				var tooltipPMBEZ=[];
				for(var i=0;i<rows.length;i++){
					xValue.push(rows[i].WVWERTNR);
					yValue.push(rows[i].WVWERT);
					tooltipTime.push(rows[i].WVDATZEIT);
					tooltipPRVORNAME.push(rows[i].PRVORNAME);
					tooltipPMBEZ.push(rows[i].PMBEZ);
				}
				qbShowCharts=initLineChart2('qbCharts',xValue,yValue,upLimit,downLimit,mData,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ);
			}else if(lineBar=='1'){
				var integerNum=rows[0].WVWERT+'';
						if(integerNum.indexOf('.')!=-1){
							integerNum=integerNum.substring(0, integerNum.indexOf('.'));
							
						}
						var xData=['合格','不合格'];
						var yData=[];
						var pieArr=[];
						var c=0;
						var okCount=0;
						var nokCount=0;
						if(integerNum.length==4){
							for(var i=0;i<rows.length;i++){
								if(rows[i].WVWERT==1000){
									okCount +=1;
								}else{
									nokCount +=1;
								}
							}
						}else{
							for(var i=0;i<rows.length;i++){
								var strNum=rows[i].WVWERT+'';
								if(strNum.indexOf('.')!=-1){
									var frontNum=parseInt(strNum.substring(0, strNum.indexOf('.')))/1000;
									var afterNum=parseFloat(strNum.substring(strNum.indexOf('.')-1))*1000000;
									okCount += frontNum-afterNum;
									nokCount += afterNum;
								}else{
									okCount += (parseInt(strNum)/1000);
								}
							}
						}
						yData=[okCount,nokCount];
						pieArr=[{name:'合格',value:okCount},{name:'不合格',value:nokCount}];
						qbShowCharts=initBarAndPie('qbCharts',xData,yData,pieArr);
			}
		}
		function cellFormatter(value,row,index){
			var strNum=value+'';
			var result=value;
			 if($('#MEMERKART').val()=='1'){
				var integerNum=value+'';
				if(integerNum.indexOf('.')!=-1){
					integerNum=integerNum.substring(0, integerNum.indexOf('.'));
				}
				if(integerNum.length==4){
					if(value!=1000){
						result="不合格";
					}else{
						result="合格";
					}
				}else{
					if(strNum.indexOf('.')!=-1){
						var frontNum=parseInt(strNum.substring(0, strNum.indexOf('.')))/1000;
						var afterNum=parseFloat(strNum.substring(strNum.indexOf('.')-1))*1000000;
						result=frontNum+'个样本缺陷率：'+(parseFloat(afterNum/frontNum).toFixed(4))*100+'%';
					}else{
						result=integerNum/1000+'个样本缺陷率：0%'
					}
				}
			}
			return result;
		}
	</script>
</body>
</html>
