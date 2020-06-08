<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>
  	
  </head>
  
  <body>
	  <div class="easyui-layout" fit="true">
	  	<div id="qaPlChartDiv" data-options="region:'center',onResize:function(){qaProductLineChartResize()}"
	  	 style="background-image: url(<%=basePath%>resources/images/factoryImg/${factoryBgImg });background-repeat: no-repeat;background-size:100% 100%; filter:alpha(opacity=20);"></div>
	    <div data-options="region:'south',split:false,border:false,collapsible:false" style="height:50%;">
	    	<table id="qaProductLineTable">
  				<thead>
		            <tr>
		                <th data-options="field:'TEKOSTST',width:50,align:'center'">产线</th>
		                <th data-options="field:'lh',width:100,align:'center',formatter:plLhFormatter">量化程度</th>
		                <th data-options="field:'pr',width:100,align:'center',formatter:plPassRateFormatter">合格率</th>
		                <th data-options="field:'cpk',width:100,align:'center',formatter:plCPKFormatter">能力汇总</th>
		            </tr>
		        </thead>
  			</table>
	    </div>
	  </div>
	  <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qa.css" />
  	<script type="text/javascript">
  		var qaPlMonthReportChart;
  		$(function(){
  			$('#qaProductLineTable').datagrid({
    			url:'<%=basePath%>qa/getProductLineData',
    			queryParams:{
    				factoryName:$('#qmFactoryName').val()
    			},
    			border : false,
				pagination : false,
				fit : true,
				autoRowHeight:true,
    			rownumbers : false,
				fitColumns : true,
				singleSelect : true,
				onSelect:function(index,row){
					$('#qaProductLineAbility').panel('close');
					$('#qaMachineAbility').panel('open');
					$('#qaMachineAbility').panel('refresh','<%=basePath%>qa/initQaMachineAbility?productLineName='+row.TEKOSTST);
					$('#qaMachineAbility').panel('resize');
					$('#qaProductLineLi').html("&gt;&nbsp;&nbsp;"+row.TEKOSTST);
					panelIndex=1;
				}
    		})
  			$('.datagrid-header-row').find('td').each(function(index,ele){
  				$(ele).click(function(){
  					qaPlMonthReportChart.clear();
  					qaPlMonthReportChart=qaMonthReportClick($(ele)[0].innerText);
  				})
  			
  			})
  			qaPlMonthReportChart=qaMonthReportClick('量化程度');
  		})
    		
    		function plLhFormatter(value,row,index){
    			var allCount=0;
    			var lhCount=0;
    			for(var i=0;i<row.COUNTLIST.length;i++){
    				allCount +=parseInt(row.COUNTLIST[i].MERKMALCOUNT);
    				lhCount +=parseInt(row.COUNTLIST[i].DLCOUNT);
    			}
    			var lhValue=((lhCount/allCount)*100).toFixed(2);
    			var dxValue=(100-lhValue).toFixed(2);
    			var progress="<div class=\"progress\">"+
  								"<div class=\"progress-bar progress-bar-dl\" style=\"width: "+lhValue+"%\">"+
  									"<span>"+lhValue+"% (定量)</span>"+
  								"</div>"+
  								"<div class=\"progress-bar progress-bar-dx\" style=\"width: "+dxValue+"%\">"+
  									"<span>"+dxValue+"% (定性)</span>"+
  								"</div>"+
  							"</div>";
  				return progress;
    		}
    		function plPassRateFormatter(value,row,index){
    			var allCount=0;
    			var alarmCount=0;
    			var nokCount=0;
    			for(var i=0;i<row.COUNTLIST.length;i++){
    				for(var j=0;j<row.COUNTLIST[i].WVCOUNTLIST.length;j++){
    					allCount += parseInt(row.COUNTLIST[i].WVCOUNTLIST[j].TOTALCOUNT);
    					alarmCount += parseInt(row.COUNTLIST[i].WVCOUNTLIST[j].ALARMCOUNT);
    					nokCount += parseInt(row.COUNTLIST[i].WVCOUNTLIST[j].NOKCOUNT);
    				}
    			}
    			var alarmValue=((alarmCount/allCount)*100).toFixed(2);
    			var nokValue=((nokCount/allCount)*100).toFixed(2);
    			var okValue;
    			if(alarmCount===0&nokCount===0){
    				okValue=100;
    			}else{
    				okValue=(100-alarmValue-nokValue).toFixed(2);
    			}
    			var progress="<div class=\"progress\">"+
  								"<div class=\"progress-bar progress-bar-success\" style=\"width: "+okValue+"%\">"+
  									"<span>"+okValue+"%</span>"+
  								"</div>"+
  								"<div class=\"progress-bar progress-bar-warning\" style=\"width: "+alarmValue+"%\">"+
  									"<span>"+alarmValue+"%</span>"+
  								"</div>"+
  								"<div class=\"progress-bar progress-bar-danger\" style=\"width: "+nokValue+"%\">"+
  									"<span>"+nokValue+"%</span>"+
  								"</div>"+
  							"</div>";
  				return progress;
    		}
    		function plCPKFormatter(value,row,index){
    			var dlMerkmalCount=0;
    			var warnCPKCount=0;
    			var failCPKCount=0;
    			for(var i=0;i<row.COUNTLIST.length;i++){
    				dlMerkmalCount += parseInt(row.COUNTLIST[i].DLCOUNT);
    				for(var j=0;j<row.COUNTLIST[i].WVCOUNTLIST.length;j++){
    					if(row.COUNTLIST[i].WVCOUNTLIST[j].CPKALARM == '1'){
    						warnCPKCount +=1;
    					}else if(row.COUNTLIST[i].WVCOUNTLIST[j].CPKALARM == '2'){
    						failCPKCount +=1;
    					}
    				}
    			}
    			var warnCPKValue=0;
    			var failCPKValue=0;
    			warnCPKValue = ((parseInt(warnCPKCount)/parseInt(dlMerkmalCount))*100).toFixed(2);
    			failCPKValue = ((parseInt(failCPKCount)/parseInt(dlMerkmalCount))*100).toFixed(2);
    			var okValue=100;
    			if(warnCPKCount!==0|failCPKCount!==0){
    				okValue=(100-failCPKValue-warnCPKValue).toFixed(2);
    			}
    			var progress="<div class=\"progress\">"+
  								"<div class=\"progress-bar progress-bar-success-nl\" style=\"width: "+okValue+"%\">"+
  									"<span>"+okValue+"%</span>"+
  								"</div>"+
  								"<div class=\"progress-bar progress-bar-warning-nl\" style=\"width: "+warnCPKValue+"%\">"+
  									"<span>"+warnCPKValue+"%</span>"+
  								"</div>"+
  								"<div class=\"progress-bar progress-bar-danger-nl\" style=\"width: "+failCPKValue+"%\">"+
  									"<span>"+failCPKValue+"%</span>"+
  								"</div>"+
  							"</div>";
  				return progress;
    		}
    		/* var qaProductLineChart=initQaChart('qaProductLineChart',['DP Rack Line','DP Worm Line'],[80,70],[10,20],[10,10]); */
  			function rentunProgress(success,warning,danger){
  				var progress="<div class=\"progress\">"+
  								"<div class=\"progress-bar progress-bar-success\" style=\"width: "+success+"\">"+
  									"<span>"+success+" (success)</span>"+
  								"</div>"+
  								"<div class=\"progress-bar progress-bar-warning\" style=\"width: "+warning+"\">"+
  									"<span>"+warning+" (warning)</span>"+
  								"</div>"+
  								"<div class=\"progress-bar progress-bar-danger\" style=\"width: "+danger+"\">"+
  									"<span>"+danger+" (danger)</span>"+
  								"</div>"+
  							"</div>";
  				return progress;
  			}
  			function qaProductLineChartResize(){
				if(qaPlMonthReportChart!=null&qaPlMonthReportChart!=''){
					qaPlMonthReportChart.resize();
				}
			}
			function qaMonthReportClick(index){
				$.ajax({
	 					type:'post',
	 					url:'<%=basePath%>qa/getPlMonthReportData',
	 					data:{
	 						//year:$('#monthReportYear').combobox('getValue'),
	 						factoryName:$('#qmFactoryName').val()
	 					},
	 					success:function(data){
	 						var dimensionsArr=new Array();
	 						dimensionsArr[0]='productLine';
	 						var lhSource=new Array();
	 						var prSource=new Array();
	 						var cpkSource=new Array();
	 						var dateArr=new Array();
	 						for(var i=0;i<data.length;i++){
	 							dimensionsArr.push(data[i].TEKOSTST);
	 							var infoArr=data[i].DATELIST;
	 							for(var j=0;j<infoArr.length;j++){
	 								dateArr.push(infoArr[j].MONTH)
	 								var countArr=infoArr[j].PASSRATELIST
	 								var monthRate=0;
	 								var dlMerkmal=0;
	 								var monthCpkAlarmCount=0;
	 								for(var k=0;k<countArr.length;k++){
	 									monthRate+=parseInt(countArr[k].PASSRATE);
	 									if(countArr[k].MEMERKART!=='1'){
	 										dlMerkmal+=1;
	 									}
	 									if(countArr[k].CPKALARM=='2'){
	 										monthCpkAlarmCount += 1;
	 									}
	 								}
	 								infoArr[j].MONTHCPK=(((dlMerkmal-monthCpkAlarmCount)/dlMerkmal)*100).toFixed(2);
	 								infoArr[j].MONTHRATE=(monthRate/countArr.length).toFixed(2);
	 								infoArr[j].MONTHDX=(dlMerkmal*100/countArr.length).toFixed(2);
	 							}
	 						}
	 						/* var aaa=new Set(dateArr);
	 						console.log(aaa);
	 						dateArr=Array.from(new Set(dateArr)).sort(); */
							var newDateArry = dateArr.filter(function(currenValue,index,arr){
							    return index == arr.indexOf(currenValue);
							})
							newDateArry.sort()
	 						for(var i=0;i<newDateArry.length;i++){
	 							var fmdate=newDateArry[i].substr(0, newDateArry[i].indexOf('-'))+"年"+newDateArry[i].substr(newDateArry[i].indexOf('-')+1, 2)+"月";
	 							var prInfoStr='{"productLine":"'+fmdate+'"';
	 							var lhInfoStr='{"productLine":"'+fmdate+'"';
	 							var cpkInfoStr='{"productLine":"'+fmdate+'"';
	 							for(var j=0;j<data.length;j++){
	 								var monthDataArr=data[j].DATELIST; 
	 								//var monthPassRate=0;
	 								for(var k=0;k<monthDataArr.length;k++){
	 									if(monthDataArr[k].MONTH==newDateArry[i]){
	 										//monthPassRate=monthDataArr[k].MONTHRATE;
	 										prInfoStr += ",\""+data[j].TEKOSTST+"\":\""+monthDataArr[k].MONTHRATE+'"';
	 										lhInfoStr += ",\""+data[j].TEKOSTST+"\":\""+monthDataArr[k].MONTHDX+'"';
	 										cpkInfoStr += ",\""+data[j].TEKOSTST+"\":\""+monthDataArr[k].MONTHCPK+'"';
	 									}
	 								}
	 							}
	 							prInfoStr+='}';
	 							lhInfoStr+='}';
	 							cpkInfoStr+='}';
	 							prSource.push(JSON.parse(prInfoStr));
	 							lhSource.push(JSON.parse(lhInfoStr));
	 							cpkSource.push(JSON.parse(cpkInfoStr));
	 						}
	 						if(index=='量化程度'){
	 							qaPlMonthReportChart=initMonthRepotLineChart('qaPlChartDiv',dimensionsArr,lhSource);
	 						}else if(index=='合格率'){
	 							qaPlMonthReportChart=initMonthRepotLineChart('qaPlChartDiv',dimensionsArr,prSource);
	 						}else if(index=='能力汇总'){
	 							qaPlMonthReportChart=initMonthRepotLineChart('qaPlChartDiv',dimensionsArr,cpkSource);
	 						}
	 					}
	 				})
			
			}
  	</script>
  </body>
</html>
