<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <body>
  	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
  		<div data-options="region:'west',title:'参数选择',split:false,collapsible:true" style="width:300px">
  			<div id='checkboxDIV' class="easyui-layout" fit='true'>
			    <div data-options="region:'north',split:false,collapsible:false,border:false" style="height:10%;padding: 5px">
			    	<div style="width: 100%;height: 50%">
			    		<input class="easyui-datetimebox" id="qaMerkmalStartTime" name="qaMerkmalStartTime" data-options="editable:false,label:'开始时间:',labelAlign:'right',onChange:function(newDate,oldDate){qaDateTimeBoxSearch(newDate,1)}" style="width:90%">
			    	</div>
			    	<div style="width: 100%;height: 50%">
			    		<input class="easyui-datetimebox" id="qaMerkmalEndTime" name="qaMerkmalEndTime" data-options="editable:false,label:'结束时间:',labelAlign:'right',onChange:function(newDate,oldDate){qaDateTimeBoxSearch(newDate,2)}" style="width:90%">
			    	</div>
			    </div>
			    <div data-options="region:'center',border:false,title:'定量参数'" style="padding: 5px">
			    	<form id="checkFormDL">
				    	<input type="hidden" id="chartPageTeilId" value="${qaTeilNum }">
				    	<input type="hidden" id="qaMerkmalPlName" value="${qaMerkmalPlName }">
				    	<input type="hidden" id="qaMerkmalProcessName" value="${qaMerkmalProcessName }">
				    	<input type="hidden" id="qaMerkmalMachineName" value="${qaMerkmalMachineName }">
				    	<input type="hidden" id="qaMerkmalId" value="${qaMerkmalId }">
				    	<input type="hidden" id="qaMerkmalName" value="${qaMerkmalName }">
				    	<c:forEach items="${qaMerkmalList}" var="merkmalList">
				    		<c:if test="${merkmalList.MEMERKART!=1 }">
				    			<div style="margin-bottom:20px">
						            <input class="easyui-checkbox" value="${merkmalList.MEMERKMAL }"
						            data-options="onChange:function(checked){initChartDL(checked,'${merkmalList.METEIL }','${merkmalList.MEMERKMAL }')}">&nbsp;&nbsp;<a onclick="openDataDig('${merkmalList.METEIL }','${merkmalList.MEMERKMAL }')" style="cursor:pointer;">${merkmalList.MEMERKBEZ }</a>
						        </div>
				    		</c:if>
					    </c:forEach>
				    </form>
			    </div>
			    <div data-options="region:'south',title:'定性参数',split:false,collapsible:false,border:false" style="height:40%;padding: 5px">
			    	<form id="checkFormDX">
				    	<c:forEach items="${qaMerkmalList}" var="merkmalList">
				    		<c:if test="${merkmalList.MEMERKART==1 }">
				    			<div style="margin-bottom:20px">
						            <input class="easyui-checkbox" value="${merkmalList.MEMERKMAL }"
						            	data-options="onChange:function(checked){initChartDX(checked,'${merkmalList.METEIL }','${merkmalList.MEMERKMAL }')}">&nbsp;&nbsp;<a onclick="openDataDig('${merkmalList.METEIL }','${merkmalList.MEMERKMAL }')"style="cursor:pointer;">${merkmalList.MEMERKBEZ }</a>
						        </div>
				    		</c:if>
					    </c:forEach>
				    </form>
			    </div>
			  
			</div>
	    </div>
	    <div id="chartsDiv" data-options="region:'center',border:false,onResize:function(){}" style="overflow: auto;">
	    	
		</div>
 	</div>
 	<div id="qaMerkmalDataDIV">
 		<table id="dztDataTable">
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
 	<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
 	<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
 	<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
 	<script type="text/javascript">
 	$(function(){
 		var merkmalInitId=$('#qaMerkmalId').val();
 		if(merkmalInitId!=''&merkmalInitId!=undefined&merkmalInitId!=null){
 			$('#checkboxDIV').find('.easyui-checkbox').each(function(index,element){
	 			if($(element).val()==merkmalInitId&$(element).next().html()==$('#qaMerkmalName').val()){
	 				$(element).checkbox().checkbox('check');
	 			}
	 		})
 		}
 		$('#qaMerkmalDataDIV').dialog({
			    title: '测量数据',
			    width: $(window).width()-100,
			    height: $(window).height()-100,
			    closed: true,
			    cache: false,
			    modal: true
			});
		$('#dztDataTable').datagrid({
			fitColumns:true,
			singleSelect:true,
			fit:true,
			border:false
 		})
 	})
 	var qaMerkmalStartTime='';
	var qaMerkmalEndTime='';
 	function initChartDL(checked,meteil,merkmal){
 		if(checked){
 			$('#chartsDiv').append('<div id="teil'+meteil+'merkmal'+merkmal+'" style="width: 46%;height: 300px;margin: 5px;float:left;"></div>');
	 		$.ajax({
	 			type:'post',
				url:'<%=basePath%>qa/getDztChartData',
				data:{
					teilId:meteil,
					merkmalId:merkmal,
					startTime:qaMerkmalStartTime,
					endTime:qaMerkmalEndTime
					},
				success:function(data){
					var upLimit;
					var downLimit;
					var chartTitle;
					var mdata;
					var xValue=[];
					var yValue=[];
					var tooltipTime=[];
					var tooltipPRVORNAME=[];
					var tooltipPMBEZ=[];
					if(data.length>0){
						upLimit=data[0].MEOGW;
						downLimit=data[0].MEUGW;
						chartTitle=data[0].MEMERKBEZ;
						mdata=data[0].MENENNMAS;
						for(var i=0;i<data.length;i++){
							tooltipTime.push(data[i].WVDATZEIT);
							tooltipPRVORNAME.push(data[i].PRVORNAME);
							tooltipPMBEZ.push($('#qaMerkmalMachineName').val());
							xValue.push(data[i].WVWERTNR);
							yValue.push(data[i].WVWERT)
						}
					}
					initLineChart('teil'+meteil+'merkmal'+merkmal,xValue,yValue,upLimit,downLimit,mdata,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ,chartTitle);
				}
	 			
	 		})
 		}else{
 			$('#teil'+meteil+'merkmal'+merkmal).remove();
 			
 		}
 		
 	}
 	function initChartDX(checked,meteil,merkmal){
 		if(checked){
 			$('#chartsDiv').append('<div id="teil'+meteil+'merkmal'+merkmal+'" style="width: 46%;height: 300px;margin: 5px;float:left;"></div>');
 			$.ajax({
	 			type:'post',
				url:'<%=basePath%>qa/getDztChartData',
				data:{
					teilId:meteil,
					merkmalId:merkmal,
					startTime:qaMerkmalStartTime,
					endTime:qaMerkmalEndTime
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
						initBarAndPie('teil'+meteil+'merkmal'+merkmal,xData,yData,pieArr,title);	
				}
	 			
	 		})
 		}
 	}
 	function qaDateTimeBoxSearch(newDate,index){
 		if(index==1){
			qaMerkmalStartTime=newDate;
			qaMerkmalEndTime=$('#qaMerkmalEndTime').datetimebox('getValue');
		}else{
			qaMerkmalStartTime=$('#qaMerkmalStartTime').datetimebox('getValue');
			qaMerkmalEndTime=newDate;
		}
		$('#chartsDiv').empty();
		$('#checkFormDL').find('.easyui-checkbox').each(function(index,element){
	 		if($(element).checkbox('options').checked==true){
	 			$(element).checkbox('uncheck')
	 		}
	 	})
 	}
 	function openDataDig(teil,merkmal){
 		$('#qaMerkmalDataDIV').dialog('open');
 		$.ajax({
	 			type:'post',
				url:'<%=basePath%>qa/getDztChartData',
				data:{
					teilId:teil,
					merkmalId:merkmal,
					startTime:qaMerkmalStartTime,
					endTime:qaMerkmalEndTime
					},
				success:function(data){
					$('#dztDataTable').datagrid('loadData',data);
				}
	 			
	 		})
 	}
 	</script>
  </body>
</html>
