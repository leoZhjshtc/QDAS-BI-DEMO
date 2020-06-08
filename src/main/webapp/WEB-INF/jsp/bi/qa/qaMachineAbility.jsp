<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
  </head>
  
  <body>
  	<input type="hidden" id="qaMachinePlName" value="${qaMachinePlName }">
  	<div class="easyui-layout" fit="true">
  		<div data-options="region:'west',title:'工序',split:true,collapsible:false,border:false" style="width:300px;padding: 5px">
  			<form id="processForm">
  				<c:forEach items="${qaProcessList}" var="list" varStatus="index">
  					<c:choose>
  						<c:when test="${index.index==0 }">
								<%-- <a id="process${list.TEAUFTRAGSTR}" class="easyui-linkbutton c11"
								data-options="size:'large',iconCls:'icon-large-gou',plain:true" text="${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }"
								style="width:90%;height: 50px;margin: 3px;text-align: left;"
								onclick="processSelect('${list.TEAUFTRAGSTR }');"/> --%>
								<div style="margin-top: 5px">
									<ul class="process" onclick="processSelect('${list.TEAUFTRAGSTR }');">
										<li class="green processSelect" id="process${list.TEAUFTRAGSTR}"><div class="greenCircle"></div>${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</li>
									</ul>
								</div>
  						</c:when>
  						<c:otherwise>
								<%-- <a id="process${list.TEAUFTRAGSTR}" class="easyui-linkbutton c11"
								data-options="size:'large',iconCls:'icon-gongxuIcon'"  text="${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }"
								style="width:90%;height: 50px;margin: 3px;text-align: left;"
								onclick="processSelect('${list.TEAUFTRAGSTR }');"/> --%>
								<div style="margin-top: 5px">
									<ul class="process" onclick="processSelect('${list.TEAUFTRAGSTR }');">
										<li class="green" id="process${list.TEAUFTRAGSTR}"><div class="greenCircle"></div>${list.TEAUFTRAGSTR  }/${list.TEAUFTRAGGBBEZ  }</li>
									</ul>
								</div>
  						</c:otherwise>
  					</c:choose>
  					
				</c:forEach>	
  			</form>
  		</div>
  		<div data-options="region:'center'" >
  			<div class="easyui-layout" fit="true">
			    <div id="qaMachineLhChart" data-options="region:'north',split:false,border:false,collapsible:false,title:'量化程度',onResize:qaMachineResize" style="height:33%;"></div>
			    <div id="qaMachinePassRateChart" data-options="region:'center',border:false,onResize:qaMachineResize,title:'合格率'"></div>
			    <div id="qaMachineCPKChart" data-options="region:'south',split:false,border:false,collapsible:false,title:'能力汇总',onResize:qaMachineResize" style="height:33%;"></div>
			  </div>
  		</div>
  	</div>
	  
  	<script type="text/javascript">
  	var lhMachineChart,prMachineChart,cpkMachineChart;
  	$(function(){
	 	var firstProcess=$('.processSelect').html().substring($('.processSelect').html().indexOf("</div>")+6);
	 	var firstProcessStr=firstProcess.substring(0,firstProcess.indexOf('/'));
	 	initQaMachineChart(firstProcessStr);
	 	$("#qaProcessLi").html("&gt;&nbsp;&nbsp;"+firstProcessStr);
  	})
  	function radiobuttonChange(processNum){
  		initQaMachineChart(processNum);
  		$("#qaProcessLi").html("&gt;&nbsp;&nbsp;"+processNum);
  	}
  	function processSelect(processNum){
  		$('#processForm').find('li').each(function(index,element){
	 			$(element).removeClass('processSelect');
	 	})
  		$('#process'+processNum).addClass('processSelect');
  		initQaMachineChart(processNum);
  		$("#qaProcessLi").html("&gt;&nbsp;&nbsp;"+processNum);
  	}
  		function initQaMachineChart(processNum){
    		$.ajax({
    			type:'post',
    			url:'<%=basePath%>qa/getQaMachineData',
    			data:{
    				productLineName:$('#qaMachinePlName').val(),
    				processNum:processNum
    			},
    			success:function(data){
    				if(data.length!=0){
    					var xvalue=new Array()
    					var successLhArr=new Array();
    					var failLhArr=new Array();
    					var successPrArr=new Array();
    					var warnPrArr=new Array();
    					var failPrArr=new Array();
    					var successCPKArr=new Array();
    					var warnCPKArr=new Array();
    					var failCPKArr=new Array();
    					for(var i=0;i<data.length;i++){
    						xvalue.push(data[i].TEPREINRNR);
    						var lhTotalCount=0;
    						var lhCount=0;
    						var prTotalCount=0;
    						var prWarnCount=0;
    						var prFailCount=0;
    						
    						//var dlMerkmalCount=0;
			    			var warnCPKCount=0;
			    			var failCPKCount=0;
    						for(var j=0;j<data[i].COUNTLIST.length;j++){
    							lhTotalCount += parseInt(data[i].COUNTLIST[j].MERKMALCOUNT);
    							lhCount += parseInt(data[i].COUNTLIST[j].DLCOUNT);
    							for(var k=0;k<data[i].COUNTLIST[j].WVCOUNTLIST.length;k++){
    								prTotalCount += parseInt(data[i].COUNTLIST[j].WVCOUNTLIST[k].TOTALCOUNT);
    								prWarnCount += parseInt(data[i].COUNTLIST[j].WVCOUNTLIST[k].ALARMCOUNT);
    								prFailCount += parseInt(data[i].COUNTLIST[j].WVCOUNTLIST[k].NOKCOUNT);
    								if(data[i].COUNTLIST[j].WVCOUNTLIST[k].CPKALARM=='1'){
    									warnCPKCount +=1;
    								}else if(data[i].COUNTLIST[j].WVCOUNTLIST[k].CPKALARM=='2'){
    									failCPKCount +=1;
    								}
    							}
    						}
    						var lhValue=((lhCount/lhTotalCount)*100).toFixed(2);
    						var dxValue=(100-lhValue).toFixed(2);
    						successLhArr.push({'value':lhValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    						failLhArr.push({'value':dxValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    						var prWarnValue,prFailValue,prSuccessValue;
    						if(prWarnCount===0&prFailCount===0){
    							prSuccessValue=100;
    							prWarnValue=0;
    							prFailValue=0;
    						}else{
    							prWarnValue=((prWarnCount/prTotalCount)*100).toFixed(2);
    							prFailValue=((prFailCount/prTotalCount)*100).toFixed(2);
    							prSuccessValue=100-prWarnValue-prFailValue;
    						}
    						successPrArr.push({'value':prSuccessValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    						warnPrArr.push({'value':prWarnValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    						failPrArr.push({'value':prFailValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    						
    						var cpkWarnValue,cpkFailValue,cpkSuccessValue;
    						if(warnCPKCount===0&failCPKCount===0){
    							cpkSuccessValue=100;
    							cpkWarnValue=0;
    							cpkFailValue=0;
    						}else{
    							cpkWarnValue=((warnCPKCount/lhCount)*100).toFixed(2);
    							cpkFailValue=((failCPKCount/lhCount)*100).toFixed(2);
    							cpkSuccessValue=100-prWarnValue-prFailValue;
    						}
    						successCPKArr.push({'value':cpkSuccessValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    						warnCPKArr.push({'value':cpkWarnValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    						failCPKArr.push({'value':cpkFailValue,'TEPREINRNR':data[i].TEPREINRNR,'TEAUFTRAGSTR':data[i].TEAUFTRAGSTR});
    					}
    					console.log(xvalue);
						console.log(successPrArr);
						console.log(warnPrArr);
						console.log(failPrArr);
    					prMachineChart=initQaChart('qaMachinePassRateChart',xvalue,successPrArr,warnPrArr,failPrArr,'<%=basePath%>qa/initQaTeilAbility?productLineName='+$('#qaMachinePlName').val());
    					lhMachineChart=initQaLhChart('qaMachineLhChart',xvalue,successLhArr,failLhArr,'<%=basePath%>qa/initQaTeilAbility?productLineName='+$('#qaMachinePlName').val());
    					cpkMachineChart=initQaCPKChart('qaMachineCPKChart',xvalue,successCPKArr,warnCPKArr,failCPKArr,'<%=basePath%>qa/initQaTeilAbility?productLineName='+$('#qaMachinePlName').val());
    				}
    			}
    		})
    	}
    		//var qaMachineChart=initQaChart('qaMachineChart',['Rz Measuring Device','Thread Inspection','CMM Gear pro'],[50,60,70],[30,20,20],[20,20,10]);
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
  			function qaMachineResize(){
				if(lhMachineChart!=null&lhMachineChart!=''){
					lhMachineChart.resize();
				}
				if(prMachineChart!=null&prMachineChart!=''){
					prMachineChart.resize();
				}
				if(cpkMachineChart!=null&cpkMachineChart!=''){
					cpkMachineChart.resize();
				}
			}
  	</script>
  </body>
</html>
