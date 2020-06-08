<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<input type="hidden" id="chartPageTeilId" value="${qaTeilNum }">
	<input type="hidden" id="qaMerkmalPlName" value="${qaMerkmalPlName }">
	<input type="hidden" id="qaMerkmalProcessName" value="${qaMerkmalProcessName }">
	<input type="hidden" id="qaMerkmalMachineName" value="${qaMerkmalMachineName }">
	<input type="hidden" id="qaMerkmalId" value="${qaMerkmalId }">
	<input type="hidden" id="qaTeilId" value="${qaTeilId }">
	<div class="easyui-layout" fit="true">
		<div data-options="region:'west',title:'参数信息',split:true,border:false" style="width:70%;">
			<table id="qaMerkmalDetailsTable">
				<thead>
					<tr>
						<th field="ck" checkbox="true"></th>
						<th data-options="field:'MEMERKBEZ',width:100,align:'left'">参数名</th>
						<th data-options="field:'MENENNMAS',width:50,align:'center'">名义值</th>
						<th data-options="field:'MEUGW',width:50,align:'center'">下公差限</th>
						<th data-options="field:'MEOGW',width:50,align:'center'">上公差限</th>
						<th data-options="field:'MEEINHEITTEXT',width:50,align:'center'">单位</th>
						<th data-options="field:'aa',width:50,align:'center',formatter:passRateFormatter">合格率</th>
						<th data-options="field:'CPK',width:50,align:'center'">CPK</th>
						<th data-options="field:'CPK2',width:50,align:'center'">直方图</th>
						<th data-options="field:'操作',width:30,align:'center',formatter:btnFormatter">操作</th>
					</tr>
				</thead>
			</table>
		</div>
		<div id="chartsDiv" data-options="region:'center',border:false,title:'图表',onResize:function(){chartResize()}" style="overflow: auto;"></div>
	</div>
	<div id="dztDIV" class="easyui-dialog" data-options="title: '测量数据',width: $(window).width(),height: $(window).height(),closed: true,cache: false,modal: true">
 			<table id="dztDataTable" class="easyui-datagrid" data-options="rownumbers:true,fitColumns:true,singleSelect:true,fit:true,border:false,toolbar:'#dztDataTableTB'">
					<thead>
						<tr>
							<th data-options="field:'MEMERKBEZ',width:100,align:'center'">参数名</th>
							<th data-options="field:'WVWERT',width:100,align:'center',formatter:valueFormatter">测量值</th>
							<th data-options="field:'MENENNMAS',width:100,align:'center'">名义值</th>
							<th data-options="field:'MEOGW',width:100,align:'center'">上公差限</th>
							<th data-options="field:'MEUGW',width:100,align:'center'">下公差限</th>
							<th data-options="field:'WVDATZEIT',width:100,align:'center'">测量时间</th>
							<th data-options="field:'PRVORNAME',width:100,align:'center'">测量员</th>
							<th data-options="field:'ETTEXT',width:100,align:'center'">事件</th>
							<th data-options="field:'WV0014',width:100,align:'center'">追溯码</th>
						</tr>
					</thead>
				</table>
 	</div>
 	<div id="tableBar" style="padding: 5px">
 		开始时间：<input id="qaMerkmalStartTime" type="text" class="easyui-datetimebox" data-options="editable:false,onChange:function(newDate,oldDate){qaDateTimeBoxSearch(newDate,1)},onShowPanel:function(){  
	        																							$(this).datetimebox('spinner').timespinner('setValue','07:00:00');}  ">
 		结束时间：<input id="qaMerkmalEndTime" type="text" class="easyui-datetimebox" data-options="editable:false,onChange:function(newDate,oldDate){qaDateTimeBoxSearch(newDate,2)},onShowPanel:function(){  
	        																							$(this).datetimebox('spinner').timespinner('setValue','07:00:00');}  ">
 		<!-- <a id="choiceTeil" class="easyui-linkbutton" data-options="iconCls:'icon-add'">加入对比</a>
 		<a id="showComBtn" /> -->
 	</div>
 	<div id="qdasImgBox" class="easyui-window" title="Q-DAS" style="width:670px;height:400px" data-options="collapsible:false,modal:true,minimizable:false,maximizable:false,closed:true"></div>
 	<div id="dztDataTableTB" style="padding: 5px">
 		 <a id="qaExportExcel" class="easyui-linkbutton" data-options="iconCls:'icon-excelIcon'">导出Excel</a>
 	</div>
	<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
	<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
	<script type="text/javascript">
	var startTimeQA='';
	var endTimeQA='';
	var chartArr=new Array();
	var dataFlag=0;
		/* $('#showComBtn').linkbutton({
		    iconCls: 'icon-search',
		    text:'('+compareArr.length+') 查看'
		}); */
		$('#qaMerkmalDetailsTable').datagrid({
			url:'<%=basePath%>qa/getQaMerkmalDetails',
			queryParams:{
				teilId:$('#qaTeilId').val()
			},
			toolbar:'#tableBar',
			fit:true,
			fitColumns:true,
			striped:true,
			rownumbers:true,
			singleSelect:true,
			selectOnCheck:false,
			checkOnSelect:false,
			onLoadSuccess:function(data){
				var rows=data.rows;
				$(".datagrid-header-check").html("");
				for(var i=0;i<rows.length;i++){
					if(rows[i].METEIL==$('#qaTeilId').val()&rows[i].MEMERKMAL==$('#qaMerkmalId').val()){
						$(this).datagrid('checkRow',i);
						$(this).datagrid('scrollTo',i);
						break;
					}
				}
			},
			onCheck:function(index,row){
				initChart(row);
			},
			onUncheck:function(index,row){
				$('#teil'+row.METEIL+'merkmal'+row.MEMERKMAL).remove();
				for(var i=0;i<chartArr.length;i++){
					if(chartArr[i].teilId==row.METEIL&chartArr[i].merkmalId==row.MEMERKMAL){
						chartArr.splice(i, 1);
					}
				}
			},
			onDblClickRow:function(index,row){
				$('#dztDIV').dialog('open');
				$.ajax({
		 			type:'post',
					url:'<%=basePath%>qa/getDztChartData',
					data:{
						teilId:row.METEIL,
						merkmalId:row.MEMERKMAL,
						startTime:startTimeQA,
						endTime:endTimeQA
						},
					success:function(data){
						$('#dztDataTable').datagrid('loadData',data);
					}
		 		})
			}
		})
		function passRateFormatter(value,row,index){
			var passRate;
			var nok=parseInt(row.NOKCOUNT);
			var total=parseInt(row.TOTALCOUNT);
			if(total===0){
				passRate="无数据";
			}else if(nok===0&total!==0){
				passRate="100%";
			}else{
				passRate=((total-nok)*100/total).toFixed(2)+"%";
			}
			return passRate;
		}
		function initChart(row){
			$('#chartsDiv').append('<div id="teil'+row.METEIL+'merkmal'+row.MEMERKMAL+'" style="width: 99%;height: 300px;"></div>');
			if(row.MEMERKART!=1){
				$.ajax({
		 			type:'post',
					url:'<%=basePath%>qa/getDztChartData',
					data:{
							teilId:row.METEIL,
							merkmalId:row.MEMERKMAL,
							startTime:startTimeQA,
							endTime:endTimeQA 
						},
					success:function(data){
						var lowcl=row.LOWCL;
						var upcl=row.UPCL;
						var upLimit;
						var downLimit;
						var chartTitle;
						var mdata;
						var xValue=[];
						var yValue=[];
						var tooltipTime=[];
						var tooltipPRVORNAME=[];
						var tooltipPMBEZ=[];
						var tooltipMeasure=[];
						if(data.length>0){
							upLimit=data[0].MEOGW;
							downLimit=data[0].MEUGW;
							chartTitle=data[0].MEMERKBEZ;
							mdata=data[0].MENENNMAS;
							for(var i=0;i<data.length;i++){
								tooltipTime.push(data[i].WVDATZEIT);
								tooltipPRVORNAME.push(data[i].PRVORNAME);
								tooltipPMBEZ.push($('#qaMerkmalMachineName').val());
								tooltipMeasure.push(data[i].ETTEXT);
								if((startTimeQA==''|startTimeQA==null|startTimeQA==undefined)&(endTimeQA==''|endTimeQA==null|endTimeQA==undefined)){
									xValue.push(data[i].WVWERTNR);
								}else{
									xValue.push(data[i].WVDATZEIT);
								}
								
								yValue.push(data[i].WVWERT)
							}
						}
						var lineCharts=new Object();
						lineCharts.linechart=initLineChart('teil'+row.METEIL+'merkmal'+row.MEMERKMAL,xValue,yValue,upLimit,downLimit,mdata,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ,chartTitle,lowcl,upcl,tooltipMeasure);
						lineCharts.teilId=row.METEIL;
						lineCharts.MEMERKART=row.MEMERKART;
						lineCharts.merkmalId=row.MEMERKMAL;
						chartArr.push(lineCharts);
					}
		 			
		 		})
			
			}else{
				$.ajax({
		 			type:'post',
					url:'<%=basePath%>qa/getDztChartData',
					data:{
						teilId:row.METEIL,
						merkmalId:row.MEMERKMAL,
						startTime:startTimeQA,
						endTime:endTimeQA
						},
					success:function(data){
						var xData=['合格','不合格'];
							var yData=[];
							var pieArr=[];
							var okCount=0;
							var nokCount=0;
							var title;
							if(data.length>0){
								title=data[0].MEMERKBEZ
								for(var i=0;i<data.length;i++){
									if(data[i].WVWERT.toString().indexOf('.')!==0&parseFloat(data[i].WVWERT.toString().substring(data[i].WVWERT.toString().indexOf(".")-1)>0)){
											nokCount +=1;
										}else{
											okCount +=1;
										}
								}
							}
							yData=[okCount,nokCount];
							pieArr=[{name:'合格',value:okCount},{name:'不合格',value:nokCount}];
							var lineCharts=new Object();
							lineCharts.linechart=initBarAndPie('teil'+row.METEIL+'merkmal'+row.MEMERKMAL,xData,yData,pieArr,title);	
							lineCharts.teilId=row.METEIL;
							lineCharts.merkmalId=row.MEMERKMAL;
							lineCharts.MEMERKART=row.MEMERKART;
							chartArr.push(lineCharts);
					}
		 		})
			}
			
		}
		function chartResize(){
			if(chartArr.length!=0){
				for(var i=0;i<chartArr.length;i++){
					chartArr[i].linechart.resize()
				} 
			}
		}
		function btnFormatter(value,row,index){
			return '<input type="button" style="width:100%" value="获取CPK" onclick="getCPKbyDate('+index+','+row.METEIL+','+row.MEMERKMAL+')">';
		
		}
		function getCPKbyDate(index,meteil,merkmal){
			$.messager.progress(); 
			$.ajax({
				type:'post',
				url:'<%=basePath%>qa/getCpkAndZftByTime',
				data:{
					teilId:meteil,
					merkmalId:merkmal,
					startTime:startTimeQA,
					endTime:endTimeQA
					},
				success:function(data){
					if(data.mess==-1){
						$.messager.alert('错误','获取数据出错！！！','info');
					}else{
						$('#qaMerkmalDetailsTable').datagrid('updateRow',{
							index: index,
							row: {
								CPK: data.cpk,
								CPK2:'<img title=\"直方图\" onclick="showImgDiv(\''+data.zft+'\');" style="width:32px;height:30px;cursor:pointer;" src=\"data:image/bmp;base64,'+data.zft+'\"/>'
							}
						});
					}
					$.messager.progress('close');
				}
			
			})
			
		}
		function showImgDiv(imgstr){
			$('#qdasImgBox').empty();
  			$('#qdasImgBox').append("<img  style=\"width: 650px;height: 350px\" src=\"data:image/bmp;base64,"+imgstr+"\">")
  			$('#qdasImgBox').window('open');
		}
		function qaDateTimeBoxSearch(newDate,index){
			if(index==1){
				startTimeQA=newDate;
				endTimeQA=$('#qaMerkmalEndTime').datetimebox('getValue');
			}else{
				endTimeQA=newDate;
				startTimeQA=$('#qaMerkmalStartTime').datetimebox('getValue');
			}
		}
		
		$('#qaExportExcel').click(function(){
			var rows = $("#dztDataTable").datagrid("getRows");
			var row = rows[0];
			var url="<%=basePath%>qa/qaExportExcel?teilId="+row.WVTEIL+"&merkmalId="+row.WVMERKMAL+"&startTime="+startTimeQA+"&endTime="+endTimeQA;
			window.location.href=encodeURI(url);
		})
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
	</script>
</body>
</html>
