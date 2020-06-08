<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <body>
  	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
  		<div data-options="region:'west',title:'参数选择',split:false,collapsible:true" style="width:300px">
  			<div class="easyui-panel" style="width: 100%;height: 50%;padding: 5px" data-options="border:false,title:'定量参数'">
  				<form id="checkFormDL">
			    	<input type="hidden" id="chartPageTeilId" value="${qaTeilId }">
			    	<c:forEach items="${qaMerkmalList}" var="merkmalList">
			    		<c:if test="${merkmalList.MEMERKART!=0 }">
			    			<div style="margin-bottom:20px">
					            <input class="easyui-checkbox" value="${merkmalList.MEMERKMAL }" memerkart="${merkmalList.MEMERKART }" data-options="label:'${merkmalList.MEMERKBEZ }',labelWidth:'200',labelPosition:'after',onChange:function(checked){initChartDL(checked,this)}">
					        </div>
			    		</c:if>
				    </c:forEach>
			    </form>
  			</div>
		    <div class="easyui-panel" style="width: 100%;height: 50%;padding: 5px" data-options="border:false,title:'定性参数'">
  				<form id="checkFormDX">
			    	<c:forEach items="${qaMerkmalList}" var="merkmalList">
			    		<c:if test="${merkmalList.MEMERKART==1 }">
			    			<div style="margin-bottom:20px">
					            <input class="easyui-checkbox" value="${merkmalList.MEMERKMAL }" memerkart="${merkmalList.MEMERKART }" data-options="label:'${merkmalList.MEMERKBEZ }',labelWidth:'200',labelPosition:'after',onChange:function(checked){initChartDX(this)}">
					        </div>
			    		</c:if>
				    </c:forEach>
			    </form>
  			</div>
	    </div>
	    <div id="charts" data-options="region:'center',onResize:function(){chartResize()}" style="background:#eee;padding: 5px">
		</div>
 	</div>
 	<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
 	<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
 	<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
 	<script type="text/javascript">
 	var lineChart;
 	$(function(){
 	
 		
 	})
 	
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
			      /*   type:'time',
			    	name:'时间',
			    	//data: xValues,
			    	splitLine:{
	                    show:true
	                },
	                axisLine: {show: true},
	                axisTick: {
	                    show: true
	                } */
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
 		function initChartDL(checked,thisEle){
 			var chcekedCount=$('#checkFormDL').find('.checkbox-checked').length;
 			if(chcekedCount>0){
 				$('#checkFormDX').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('disable');
	 			})
 				var selectedMerkmalIds=new Array();
	 			var merkmalNames=new Array();
	 			$('#checkFormDL').find('.easyui-checkbox').each(function(index,element){
	 				if($(element).checkbox('options').checked==true){
	 					selectedMerkmalIds.push($(element).val());
	 					merkmalNames.push($(element).checkbox('options').label);
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
	 					var seriesArr=new Array();
	 					for(var i=0;i<merkmalNames.length;i++){
	 						var serieObj=new Object();
	 						serieObj.name=merkmalNames[i];
	 						serieObj.type='line';
	 						var dataArr=new Array();
	 						for(var j=0;j<data.length;j++){
	 							if(merkmalNames[i]==data[j].MEMERKBEZ){
	 								var valueAndDate=new Array();
	 								valueAndDate.push(data[j].WVWERT);
	 								valueAndDate.push(data[j].WVWERTNR);
	 								dataArr.push(valueAndDate);
	 							}
	 							
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
 			}else{
 				$('#checkFormDX').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('enable');
	 			})
 				lineChart.clear();
 			}
 		}
 		function initChartDX(thisEle){
 			var chcekedCount=$('#checkFormDX').find('.checkbox-checked').length;
 			if(chcekedCount>0){
 				$('#checkFormDL').find('.easyui-checkbox').each(function(index,element){
	 				$(element).checkbox('disable');
	 			})
 				var selectedMerkmalIds=new Array();
	 			var merkmalNames=new Array();
	 			$('#checkFormDX').find('.easyui-checkbox').each(function(index,element){
	 				if($(element).checkbox('options').checked==true){
	 					selectedMerkmalIds.push($(element).val());
	 					merkmalNames.push($(element).checkbox('options').label);
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
 			}
 		}
 	
 	</script>
  </body>
</html>
