<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <body>
  	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
  		<div data-options="region:'west',title:'参数选择',split:false,collapsible:true" style="width:300px">
  			<div class="easyui-layout" fit='true'>
			    <div data-options="region:'north',split:false,collapsible:false" style="height:10%;padding: 5px">
			    	<div style="width: 100%;height: 50%">
			    		<input class="easyui-datetimebox" id="qaMerkmalStartTime" name="qaMerkmalStartTime" data-options="editable:false,label:'开始时间:',labelAlign:'right',onChange:function(newDate,oldDate){qaDateTimeBoxSearch(newDate,1)}" style="width:90%">
			    	</div>
			    	<div style="width: 100%;height: 50%">
			    		<input class="easyui-datetimebox" id="qaMerkmalEndTime" name="qaMerkmalEndTime" data-options="editable:false,label:'结束时间:',labelAlign:'right',onChange:function(newDate,oldDate){qaDateTimeBoxSearch(newDate,2)}" style="width:90%">
			    	</div>
			    </div>
			    <div data-options="region:'center',title:'定量参数'" style="padding: 5px">
			    	<form id="checkFormDL">
				    	<input type="hidden" id="chartPageTeilId" value="${qaTeilNum }">
				    	<input type="hidden" id="qaMerkmalPlName" value="${qaMerkmalPlName }">
				    	<input type="hidden" id="qaMerkmalProcessName" value="${qaMerkmalProcessName }">
				    	<input type="hidden" id="qaMerkmalMachineName" value="${qaMerkmalMachineName }">
				    	<c:forEach items="${qaMerkmalList}" var="merkmalList">
				    		<c:if test="${merkmalList.MEMERKART!=1 }">
				    			<div style="margin-bottom:20px">
						            <input class="easyui-checkbox" value="${merkmalList.MEMERKMAL }" memerkart="${merkmalList.MEMERKART }" 
						            data-options="onChange:function(checked){initChartDL(checked,'${merkmalList.METEIL }','${merkmalList.MEMERKMAL }')}">&nbsp;&nbsp;<a onclick="openDztDig('${merkmalList.METEIL }','${merkmalList.MEMERKMAL }')" style="cursor:pointer;">${merkmalList.MEMERKBEZ }</a>
						        </div>
				    		</c:if>
					    </c:forEach>
				    </form>
			    </div>
			    <div data-options="region:'south',title:'定性参数',split:false,collapsible:false" style="height:40%;padding: 5px">
			    	<form id="checkFormDX">
				    	<c:forEach items="${qaMerkmalList}" var="merkmalList">
				    		<c:if test="${merkmalList.MEMERKART==1 }">
				    			<div style="margin-bottom:20px">
						            <input class="easyui-checkbox" value="${merkmalList.MEMERKMAL }" memerkart="${merkmalList.MEMERKART }" 
						            	data-options="onChange:function(checked){initChartDX(checked,'${merkmalList.METEIL }','${merkmalList.MEMERKMAL }')}">&nbsp;&nbsp;<a style="cursor:pointer;">${merkmalList.MEMERKBEZ }</a>
						        </div>
				    		</c:if>
					    </c:forEach>
				    </form>
			    </div>
			  
			</div>
	    </div>
	    <div id="charts" data-options="region:'center',onResize:function(){chartResize()}" style="background:#eee;padding: 5px">
		</div>
 	</div>
 	<div id="dztDIV" class="easyui-dialog" data-options="title: '单值图',width: $(window).width()-100,height: $(window).height()-100,closed: true,cache: false,modal: true">
 		<div class="easyui-layout" fit='true'>
		    <div data-options="region:'south',title:'数据',split:false,collapsed:true" style="height:50%;">
		    	<table id="dztDataTable" class="easyui-datagrid" data-options="fitColumns:true,singleSelect:true,fit:true,border:false">
					<thead>
						<tr>
							<th data-options="field:'WVWERT',width:100,align:'center'">测量值</th>
							<th data-options="field:'MEOGW',width:100,align:'center'">上公差限</th>
							<th data-options="field:'MEUGW',width:100,align:'center'">下公差限</th>
							<th data-options="field:'WVDATZEIT',width:100,align:'center'">测量时间</th>
							<th data-options="field:'PRVORNAME',width:100,align:'center'">测量员</th>
						</tr>
					</thead>
				</table>
		    </div>
		    <div id="dztChart" data-options="region:'center',onResize:function(){dztChartResize()}" style="padding:5px;">
		    </div>
		</div>
 	</div>
 	<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
 	<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
 	<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
 	<script type="text/javascript">
 	var lineChart,qaDztChart;
 	var objArrDL=new Array();
 	var objArrDX=new Array();
 	var qaMerkmalStartTime='';
 	var qaMerkmalEndTime='';
 		$(function(){
 			
 		})
 		function qaDateTimeBoxSearch(newDate,index){
 			if(index==1){
				qaMerkmalStartTime=newDate;
				qaMerkmalEndTime=$('#qaMerkmalEndTime').datetimebox('getValue');
			}else{
				qaMerkmalStartTime=$('#qaMerkmalStartTime').datetimebox('getValue');
				qaMerkmalEndTime=newDate;
			}
			if(objArrDL.length>0){
				getChartDL(objArrDL);
			}else{
				getChartDX(objArrDX);
			}
			
 		}
 		function showChart(legendData,seriesArr){
 			var dom = document.getElementById("charts");
			var myChart = echarts.init(dom,'light');
			var app = {};
			option = null;
			option = {
			    title: {
			        text: ''
			    },
			    tooltip: {
			        trigger: 'axis'
			    },
			    legend: {
			        data:legendData
			    },
			    grid: {
			         left: '3%',
	                right: '7%',
	                bottom: '3%',
	                containLabel: true
			    },
			    toolbox: {
			        feature: {
			            saveAsImage: {}
			        }
			    },
			    xAxis: {
			       /*  type:'time',
			    	name:'时间',
			    	//data: xValues,
			    	splitLine:{
	                    show:true
	                },
	                axisLine: {show: true},
	                axisTick: {
	                    show: true
	                }  */
	                type : 'category',
			    	name:'检测序号',
			    	//data: xValues,
			    	splitLine:{
	                    show:false
	                },
	                axisLine: {show: false},
	                axisTick: {
	                    show: false
	                } 
			    },
			    yAxis: {
			        type: 'value'
			    },
			    dataZoom: [{
		            type: 'slider'
		        }],
			    series: seriesArr
			};
			if (option && typeof option === "object") {
			    myChart.setOption(option, true);
				myChart.resize();
			}
			return myChart;
 		}
 		function chartResize(){
			if(lineChart!=null&lineChart!=''){
				lineChart.resize();
			}
		}
		function getChartDL(objArrDL){
			var dlObj=new Object();
			dlObj.dlList=objArrDL;
			dlObj.startTime=qaMerkmalStartTime;
			dlObj.endTime=qaMerkmalEndTime;
			$.ajax({
	 				type:'post',
	 				url:'<%=basePath%>qa/getChartDataByTeilAndMerkmal',
	 				data:JSON.stringify(dlObj),
	 				headers: {
				        'Accept': 'application/json',
				        'Content-Type': 'application/json'
				    },
	 				success:function(data){
	 					var merkmalNames=new Array();
	 					var seriesArr=new Array();
	 					for(var i=0;i<data.length;i++){
	 						merkmalNames.push(data[i].MEMERKBEZ);
	 						var serieObj=new Object();
	 						serieObj.name=data[i].MEMERKBEZ;
	 						serieObj.type='line';
	 						var dataArr=new Array();
	 						var valueArr=data[i].WVLIST;
	 						for(var j=valueArr.length-1;j>=0;j--){
	 							var valueAndDate=new Array();
	 							valueAndDate.push(valueArr[j].WVWERT);
	 							valueAndDate.push(valueArr[j].WVWERTNR);
	 							dataArr.push(valueAndDate);
	 							
	 						}
	 						serieObj.data=dataArr;
	 						serieObj.encode={x: 1,y: 0};
	 						serieObj.itemStyle = {
			                    normal : {
			                        lineStyle:{
			                            width:0.5
			                        }
			                    }
			                }
	 						seriesArr.push(serieObj);
	 					}
	 					lineChart=showChart(merkmalNames,seriesArr);
	 				}
	 			})
		}
 		function initChartDL(checked,meteil,memerkmal){
 			if(checked){
 				var newMeObj=new Object();
 				newMeObj.meteil=meteil;
 				newMeObj.memerkmal=memerkmal;
 				objArrDL.push(newMeObj);
 			}else if(checked==false){
 				for(var i=0;i<objArrDL.length;i++){
 					 if(objArrDL[i].meteil==meteil&objArrDL[i].memerkmal==memerkmal){
 						objArrDL.splice(i, 1);
 					} 
 				}
 			}
 			if(objArrDL.length>0){
 				$('#checkFormDX').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('disable');
	 			})
	 			getChartDL(objArrDL);
 			}else if(objArrDL.length==0){
 				$('#checkFormDX').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('enable');
	 			})
	 			lineChart.clear();
 			}
 		
 		}
 		function getChartDX(objArrDX){
 			var dlObj=new Object();
			dlObj.dlList=objArrDX;
			dlObj.startTime=qaMerkmalStartTime;
			dlObj.endTime=qaMerkmalEndTime;
			$.ajax({
	 			type:'post',
	 			url:'<%=basePath%>qa/getChartDataByTeilAndMerkmal',
	 			data:JSON.stringify(dlObj),
	 			headers: {
				        'Accept': 'application/json',
				        'Content-Type': 'application/json'
				},
	 			success:function(data){
	 				var xData=['合格','不合格'];
						var yData=[];
						var pieArr=[];
						var okCount=0;
						var nokCount=0;
						for(var i=0;i<data.length;i++){
							var valueArr=data[i].WVLIST
							for(var j=0;j<valueArr.length;j++){
								if(valueArr[j].WVWERT.toString().indexOf('.')!==0&parseFloat(valueArr[j].WVWERT.toString().substring(valueArr[j].WVWERT.toString().indexOf(".")-1)>0)){
									nokCount +=1;
								}else{
									okCount +=1;
								}
							}
						}
						yData=[okCount,nokCount];
						pieArr=[{name:'合格',value:okCount},{name:'不合格',value:nokCount}];
						lineChart=initBarAndPie('charts',xData,yData,pieArr);	
	 			}
	 		})
 		}
 		function initChartDX(checked,meteil,memerkmal){
 			if(checked){
 				var newMeObj=new Object();
 				newMeObj.meteil=meteil;
 				newMeObj.memerkmal=memerkmal;
 				objArrDX.push(newMeObj);
 			}else if(checked==false){
 				for(var i=0;i<objArrDX.length;i++){
 					 if(objArrDX[i].meteil==meteil&objArrDX[i].memerkmal==memerkmal){
 						objArrDX.splice(i, 1);
 					} 
 				}
 			}
 			if(objArrDX.length>0){
 				$('#checkFormDL').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('disable');
	 			})
	 			getChartDX(objArrDX);
 			}else if(objArrDL.length==0){
 				$('#checkFormDL').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('enable');
	 			})
	 			lineChart.clear();
 			}
 		
 		
 		
 			<%-- var chcekedCount=$('#checkFormDX').find('.checkbox-checked').length;
 			if(chcekedCount>0){
 				$('#checkFormDL').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('disable');
	 			})
 				var selectedMerkmalIds=new Array();
	 			var merkmalNames=new Array();
	 			$('#checkFormDX').find('.easyui-checkbox').each(function(index,element){
	 				if($(element).checkbox('options').checked==true){
	 					selectedMerkmalIds.push($(element).val());
	 					merkmalNames.push($(element).parent().find('a').html());
	 				}
	 			})
	 			$.ajax({
	 				type:'post',
	 				url:'<%=basePath%>qa/getChartDataByMerkmalIds',
	 				data:{
	 					teilNum:$('#chartPageTeilId').val(),
	 					merkmalIds:selectedMerkmalIds
	 				},
	 				traditional: true,
	 				success:function(data){
	 					var xData=['合格','不合格'];
						var yData=[];
						var pieArr=[];
						var c=0;
						var okCount=0;
						var nokCount=0;
						for(var i=0;i<data.length;i++){
							var integerNum=data[i].WVWERT+'';
							if(integerNum.indexOf('.')!=-1){
								integerNum=integerNum.substring(0, integerNum.indexOf('.'));
							}
							if(integerNum.length==4){
								if(data[i].WVWERT==1000){
									okCount +=1;
								}else{
									nokCount +=1;
								}
							
							}else{
								var strNum=data[i].WVWERT+'';
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
						lineChart=initBarAndPie('charts',xData,yData,pieArr);	
	 				}
	 			})
 			}else{
 				$('#checkFormDL').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('enable');
	 			})
 				lineChart.clear();
 			} --%>
 		}
 	function openDztDig(teil,merkmal){
 		$('#dztDIV').dialog('open');
 		$.ajax({
 			type:'post',
			url:'<%=basePath%>qa/getDztChartData',
			data:{
				/* merkmalNum:merkmal,
				teilNum:$('#chartPageTeilId').val(),
				productLineName:$('#qaMerkmalPlName').val(),
				processNum:$('#qaMerkmalProcessName').val(),
				machineName:$('#qaMerkmalMachineName').val() */
				teilId:teil,
				merkmalId:merkmal,
				startTime:qaMerkmalStartTime,
				endTime:qaMerkmalEndTime
				},
			success:function(data){
				if(data.length>0){
					$('#dztDataTable').datagrid('loadData',data);
					var upLimit=data[0].MEOGW;
					var downLimit=data[0].MEUGW;
					var xValue=[];
					var yValue=[];
					var tooltipTime=[];
					var tooltipPRVORNAME=[];
					var tooltipPMBEZ=[];
					for(var i=0;i<data.length;i++){
						tooltipTime.push(data[i].WVDATZEIT);
						tooltipPRVORNAME.push(data[i].PRVORNAME);
						tooltipPMBEZ.push($('#qaMerkmalMachineName').val());
						xValue.push(data[i].WVDATZEIT);
						yValue.push(data[i].WVWERT)
					}
					qaDztChart=initLineChart2('dztChart',xValue,yValue,upLimit,downLimit,data[0].MENENNMAS,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ);
				
				}else{
				$('#dztDataTable').datagrid('loadData',data);
					if(qaDztChart!=null&qaDztChart!=undefined){
							qaDztChart.clear();
						}
				
				}
			}
 			
 		})
 	}
 	function dztChartResize(){
			if(qaDztChart!=null&qaDztChart!=''){
				qaDztChart.resize();
			}
		}
 	</script>
  </body>
</html>
