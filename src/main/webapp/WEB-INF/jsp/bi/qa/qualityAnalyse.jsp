<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>
  <script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
  <script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
	<script type="text/javascript" src="<%=basePath%>resources/js/qa.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qa.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qm.css" />
	<script type="text/javascript">
	var machineReportLineChart,machineReportLineChart2,machineReportLineChart3;
	var compareArr=new Array();
	var compareCharts=new Array();
	var panelIndex=0
		$(function(){
			<%-- $('#qaTeilPanel').panel('refresh','<%=basePath%>qa/initQaTeilPage'); --%>
			$('#qaProductLineAbility').panel('refresh','<%=basePath%>qa/initQualityAnalyseAbility?factoryName='+encodeURI('${qaFactoryName}'));
			$('#plReportDig').dialog({
			    title: '月报',
			    width: $(window).width(),
			    height: $(window).height(),
			    closed: true,
			    cache: false,
			    modal: true
			});
			$('#machineReportDig').dialog({
			    title: '月报',
			    width: $(window).width(),
			    height: $(window).height()*0.95,
			    closed: true,
			    cache: false,
			    modal: true
			});
			$('#searchMonthReport').click(function(){
				/* var reportId;
				$('#qaPanels').find('.easyui-panel').each(function(index,element){
	 				if($(element).panel('options').closed==false){
	 					reportId=$(element).panel('options').id;
	 				}
	 			}) */
	 			if(panelIndex===0){
	 				$('#plReportDig').panel('setTitle','产线月报');
	 				$('#plReportDig').dialog('open');
	 				$('#qaPlMRLH').parent().find('.panel-header').css('height','40px');
	 				$('#qaPlMRLH').parent().find('.panel-title').css('float','left');
	 				$('#qaPlMRLH').parent().find('.panel-tool').css({'float':'right','height':'100%','margin-top':'-15px'});
	 				initQaPlMrChart($('#qaPlMRLHComboBox').combobox('getValue'));
	 			}else if(panelIndex===1){
	 				getProcessByPl();
	 				$('#machineReportDig').panel('setTitle','设备月报');
	 				$('#machineReportDig').dialog('open');
	 				$('#qaMachineMRLH').parent().find('.panel-header').css('height','40px');
	 				$('#qaMachinepProcessDiv').parent().find('.panel-header').css('height','40px');
	 				$('#qaMachineMRLH').parent().find('.panel-title').css('float','left');
	 				$('#qaMachineMRLH').parent().find('.panel-tool').css({'float':'right','height':'100%','margin-top':'-15px'});
	 				initMachineReportChart();
	 			}else if(panelIndex===2){
	 				$('#plReportDig').panel('setTitle','零件月报');
	 				$('#plReportDig').dialog('open');
	 				$('#qaPlMRLH').parent().find('.panel-header').css('height','40px');
	 				$('#qaPlMRLH').parent().find('.panel-title').css('float','left');
	 				$('#qaPlMRLH').parent().find('.panel-tool').css({'float':'right','height':'100%','margin-top':'-15px'});
	 				initQaTeilChart($('#qaPlMRLHComboBox').combobox('getValue'));
	 			}
			})
			$('#choiceTeil').click(function(){
				var panelStatus=$('#qaMerkmalAbility').panel('options');
				if(!panelStatus.closed){
					var rows=$('#qaMerkmalDetailsTable').datagrid('getChecked');
					for(var i=0;i<rows.length;i++){
						var pushFlag=true;
						for(var j=0;j<compareArr.length;j++){
							if(compareArr[j].teilId==rows[i].METEIL&compareArr[j].merkmalId==rows[i].MEMERKMAL){
								pushFlag=false;
							}
						}
						if(pushFlag){
							var compObj=new Object();
							compObj.teilId=rows[i].METEIL;
							compObj.merkmalId=rows[i].MEMERKMAL;
							compObj.MEMERKART=rows[i].MEMERKART;
							compObj.titleInfo=$('#qaMerkmalPlName').val()+" | "+$('#qaMerkmalProcessName').val()+" | "+$('#qaMerkmalMachineName').val()+" | "+$('#chartPageTeilId').val()
							compareArr.push(compObj);
							var appendRow="<div data-options=\"iconCls:'icon-cancel'\" class=\"menu-item\" style=\"height: 32px;\" id='menuteil"+rows[i].METEIL+"merkmal"+rows[i].MEMERKMAL+"'>" +
											"<div class=\"menu-text\" style=\"height: 30px; line-height: 30px;\" onclick='delCompareArr("+rows[i].METEIL+","+rows[i].MEMERKMAL+")'>"+
									$('#qaMerkmalPlName').val()+" | "+$('#qaMerkmalProcessName').val()+" | "+$('#qaMerkmalMachineName').val()+" | "+$('#chartPageTeilId').val()+" | "+rows[i].MEMERKBEZ+
											"</div><div class=\"menu-icon icon-cancel\"></div></div>";

							var testAppend="<div data-options=\"iconCls:'icon-undo'\" onclick='delCompareArr()'>Undo</div>";
							$('#compBtnTb').append(appendRow);
						}
					}
					/*$('#showCompBtn').linkbutton({
					    text:'('+compareArr.length+') 查看对比'
					});*/
					//$.parser.parse($('#showCompBtn'));
				}
				
			})
			$('#showCompBtn').click(function(){
				$('#compareDIV').empty();
				$('#compareDIV').dialog('open');
				for(var i=0;i<compareArr.length;i++){
					initChart2(compareArr[i])
				}
			})
		})
	function delCompareArr(teilId,merkmal) {
		for(var i=0;i<compareArr.length;i++){
			if(compareArr[i].teilId==teilId&compareArr[i].merkmalId==merkmal){
				compareArr.splice(i,1);
			}
		}
		$('#menuteil'+teilId+'merkmal'+merkmal).remove();
	}
	function goToFactory(){
  			var currentUrl = window.location.href;
  			window.location.href='<%=basePath%>main/factoryList?currentUrl='+currentUrl;
  		
  		}
  		function machineGoBackToPl(){
  			$('#qaMachineAbility').panel('close');
			$('#qaProductLineAbility').panel('open');
			$('#qaProductLineLi').html('');
			$('#qaMachineLi').html('');
			$('#qaProcessLi').html('');
			$('#qaTeilLi').html('');
  			$('#qaProductLineAbility').panel('resize');
  			panelIndex=0;
  		}
  		function teilGoBackToMachine(){
  			$('#qaTeilAbility').panel('close');
			$('#qaMachineAbility').panel('open');
			$('#qaMachineLi').html('');
			$('#qaTeilLi').html('');
  			$('#qaMachineAbility').panel('resize');
  			panelIndex=1;
  		}
  		function merkmalGoBackToTeil(){
  			$('#qaMerkmalAbility').panel('close');
			$('#qaTeilAbility').panel('open');
			$('#qaTeilLi').html('');
  			$('#qaTeilAbility').panel('resize');
  			panelIndex=2;
  		}
  		function getProcessByPl(){
  			$.ajax({
  				type:'post',
	 			url:'<%=basePath%>qa/getProcessByPl',
	 			data:{
					productLineName:$('#qaMachinePlName').val()
	 			},
	 			async: false,
	 			success:function(data){
	 				$("#machineReportProcessDiv").empty();
	 				for(var i=0;i<data.length;i++){
	 					/* var appendRadio=$('<div style="margin-bottom:0px;float: left;margin-top: 10px;">'+
					            '<input id="firstProcess" class="easyui-radiobutton" name="process" value="'+data[i].TEAUFTRAGSTR+'" label="'+data[i].TEAUFTRAGGBBEZ+'/'+data[i].TEAUFTRAGSTR+'" labelPosition="after" labelWidth="150"'+
					            'data-options="onChange:function(checked){if(checked){reportRadiobuttonChange(this)}}"></div>').appendTo("#machineReportProcessDiv");
	 					$.parser.parse(appendRadio); */
	 					var newP="<div style='margin-top: 5px'>"+
									"<ul class='process' onclick=\"reportRadiobuttonChange(\'"+data[i].TEAUFTRAGSTR+"\');\">"+
										"<li class='green' value="+data[i].TEAUFTRAGSTR+" id='qaReportProcess"+data[i].TEAUFTRAGSTR.replace(" ","_")+"'><div style='width: 20px;height: 20px;background-color: #22c37f; border-radius: 50%;float: left;margin-right: 10px;'></div>"+data[i].TEAUFTRAGSTR+" / "+data[i].TEAUFTRAGGBBEZ+"</li>"+
									"</ul> </div>"
	 					$("#machineReportProcessDiv").append(newP);
	 				}
	 			}
  			
  			})
  		}
  		/* function ybProcessSelect(pid){
  			initMachineReportChart(pid);
  		} */
  		function reportRadiobuttonChange(ele){
  			$('#machineReportProcessDiv').find('li').each(function(index,element){
	 			$(element).removeClass('processSelect');
		 	})
	  		$('#qaReportProcess'+ele.replace(" ","_")).addClass('processSelect');
  			initMachineReportChart(ele,$('#qaMachineMRLHComboBox').combobox('getValue'));
  		}
  		function initMachineReportChart(processNum,year){
  			if(machineReportLineChart!=null&machineReportLineChart!=undefined&machineReportLineChart!=''){
  				machineReportLineChart.clear()
  			}
  			if(machineReportLineChart2!=null&machineReportLineChart2!=undefined&machineReportLineChart2!=''){
  				machineReportLineChart2.clear()
  			}
  			if(machineReportLineChart3!=null&machineReportLineChart3!=undefined&machineReportLineChart3!=''){
  				machineReportLineChart3.clear()
  			}
  			$.ajax({
  				type:'post',
	 			url:'<%=basePath%>qa/getMachineMonthReportData',
	 			data:{
					productLineName:$('#qaMachinePlName').val(),
					processNum:processNum,
					year:year
	 			},
	 			success:function(data){
	 				var dimensionsArr=new Array();
	 						dimensionsArr[0]='machine';
	 						var prSource=new Array();
	 						var lhSource=new Array();
	 						var cpkSource=new Array();
	 						var dateArr=new Array();
	 						for(var i=0;i<data.length;i++){
	 							dimensionsArr.push(data[i].TEPREINRNR);
	 							var infoArr=data[i].DATELIST;
	 							for(var j=0;j<infoArr.length;j++){
	 								dateArr.push(infoArr[j].MONTH)
	 								var countArr=infoArr[j].PASSRATELIST
	 								var monthRate=0;
	 								var dlMerkmal=0;
	 								var monthCpkAlarmCount=0
	 								for(var k=0;k<countArr.length;k++){
	 									monthRate+=parseInt(countArr[k].PASSRATE);
	 									if(countArr[k].MEMERKART!=='1'){
	 										dlMerkmal+=1;
	 									}
	 									if(countArr[k].CPKALARM=='2'){
	 										monthCpkAlarmCount += 1;
	 									}
	 								}
	 								infoArr[j].MONTHRATE=(monthRate/countArr.length).toFixed(2);
	 								infoArr[j].MONTHDX=(dlMerkmal*100/countArr.length).toFixed(2);
	 								infoArr[j].MONTHCPK=(((dlMerkmal-monthCpkAlarmCount)/dlMerkmal)*100).toFixed(2);
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
	 							var prInfoStr='{"machine":"'+fmdate+'"';
	 							var lhInfoStr='{"machine":"'+fmdate+'"';
	 							var cpkInfoStr='{"machine":"'+fmdate+'"';
	 							for(var j=0;j<data.length;j++){
	 								var monthDataArr=data[j].DATELIST; 
	 								//var monthPassRate=0;
	 								for(var k=0;k<monthDataArr.length;k++){
	 									if(monthDataArr[k].MONTH==newDateArry[i]){
	 										//monthPassRate=monthDataArr[k].MONTHRATE;
	 										prInfoStr += ",\""+data[j].TEPREINRNR+"\":\""+monthDataArr[k].MONTHRATE+'"';
	 										lhInfoStr += ",\""+data[j].TEPREINRNR+"\":\""+monthDataArr[k].MONTHDX+'"';
	 										cpkInfoStr += ",\""+data[j].TEPREINRNR+"\":\""+monthDataArr[k].MONTHCPK+'"';
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
	 						machineReportLineChart=initMonthRepotLineChart('qaMachineMRPR',dimensionsArr,prSource);
	 						machineReportLineChart2=initMonthRepotLineChart('qaMachineMRLH',dimensionsArr,lhSource);
	 						machineReportLineChart3=initMonthRepotLineChart('qaMachineMRCPK',dimensionsArr,cpkSource);
	 			}
  			
  			})
  		}
  		function initQaPlMrChart(year){
  			$.ajax({
	 					type:'post',
	 					url:'<%=basePath%>qa/getPlMonthReportData',
	 					data:{
	 						year:year,
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
	 						initMonthRepotLineChart('qaPlMRLH',dimensionsArr,lhSource);
	 						initMonthRepotLineChart('qaPlMRPR',dimensionsArr,prSource);
	 						initMonthRepotLineChart('qaPlMRCPK',dimensionsArr,cpkSource);
	 					}
	 				})
  		}
  		function initQaTeilChart(year){
  			$.ajax({
	 					type:'post',
	 					url:'<%=basePath%>qa/getTeilMonthReportData',
	 					data:{
	 						productLineName:$('#qaTeilPlName').val(),
	 						machineName:$('#qaTeilMachineName').val(),
	 						processNum:$('#qaTeilProcessNum').val(),
	 						year:year
	 					},
	 					success:function(data){
	 						var dimensionsArr=new Array();
	 						dimensionsArr[0]='teil';
	 						var lhSource=new Array();
	 						var prSource=new Array();
	 						var cpkSource=new Array();
	 						var dateArr=new Array();
	 						for(var i=0;i<data.length;i++){
	 							dimensionsArr.push(data[i].TETEILNR+'/'+data[i].TEBEZEICH);
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
	 								infoArr[j].MONTHRATE=(monthRate/countArr.length).toFixed(2);
	 								infoArr[j].MONTHDX=(dlMerkmal*100/countArr.length).toFixed(2);
	 								infoArr[j].MONTHCPK=(((dlMerkmal-monthCpkAlarmCount)/dlMerkmal)*100).toFixed(2);
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
	 							var prInfoStr='{"teil":"'+fmdate+'"';
	 							var lhInfoStr='{"teil":"'+fmdate+'"';
	 							var cpkInfoStr='{"teil":"'+fmdate+'"';
	 							for(var j=0;j<data.length;j++){
	 								var monthDataArr=data[j].DATELIST;
	 								for(var k=0;k<monthDataArr.length;k++){
	 									if(newDateArry[i]==monthDataArr[k].MONTH){
	 										prInfoStr += ",\""+data[j].TETEILNR+'/'+data[j].TEBEZEICH+"\":\""+monthDataArr[k].MONTHRATE+'"';
	 										lhInfoStr += ",\""+data[j].TETEILNR+'/'+data[j].TEBEZEICH+"\":\""+monthDataArr[k].MONTHDX+'"';
	 										cpkInfoStr += ",\""+data[j].TETEILNR+'/'+data[j].TEBEZEICH+"\":\""+monthDataArr[k].MONTHCPK+'"';
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
	 						initMonthRepotLineChart('qaPlMRPR',dimensionsArr,prSource);
	 						initMonthRepotLineChart('qaPlMRLH',dimensionsArr,lhSource);
	 						initMonthRepotLineChart('qaPlMRCPK',dimensionsArr,cpkSource);
	 					}
	 				})
  		
  		
  		}
  		function comboboxFirst(){
  			var data = $('#monthReportYear').combobox('getData');
  			if(data.length>0){
  				$('#monthReportYear').combobox('select',data[0].MONTH);
  			}
  		}
  		function initChart2(row){
			$('#compareDIV').append('<div id="compareteil'+row.teilId+'merkmal'+row.merkmalId+'" style="width: 99%;height: 300px;"></div>');
			if(row.MEMERKART!=1){
				$.ajax({
		 			type:'post',
					url:'<%=basePath%>qa/getDztChartData',
					data:{
							teilId:row.teilId,
							merkmalId:row.merkmalId,
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
							chartTitle=row.titleInfo+" | "+data[0].MEMERKBEZ;
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
						var newChart=new Object();
						newChart.chartt= initLineChart('compareteil'+row.teilId+'merkmal'+row.merkmalId,xValue,yValue,upLimit,downLimit,mdata,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ,chartTitle,lowcl,upcl,tooltipMeasure);
						compareCharts.push(newChart);
					}
		 			
		 		})
			
			}else{
				$.ajax({
		 			type:'post',
					url:'<%=basePath%>qa/getDztChartData',
					data:{
						teilId:row.teilId,
						merkmalId:row.merkmalId,
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
							var newChart=new Object();
							newChart.chartt= initBarAndPie('compareteil'+row.teilId+'merkmal'+row.merkmalId,xData,yData,pieArr,title);	
							compareCharts.push(newChart);
					}
		 		})
			} 
			
		}
		function qaPlMRLHComboBoxSelect(record){
			if(panelIndex===0){
				initQaPlMrChart(record.value);
			}else if(panelIndex===2){
				initQaTeilChart(record.value);
			}
		}
		function qaMachineMRLHComboBoxSelect(record){
		    var processNum='';
			$('#machineReportProcessDiv').find('li').each(function(index,element){
	 			if($(element).hasClass('processSelect')){
	 				processNum=element.value;
	 			}
		 	})
			initMachineReportChart(processNum,record.value);
		}
	</script>
  </head>
  
  <body>
  	<input type="hidden" id="qmFactoryName" value="${qaFactoryName }">
  	<div class="easyui-layout" fit="true">
  		<div data-options="region:'center'">
  			 <div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
  			 	<div data-options="region:'north',split:false,border:false" style="height:30px;overflow: hidden;display: table-cell;vertical-align: middle;background-color: #f3f3f3;font-size:15px;">
	    			<div style="float: left">
	    				<span id="currentWsName"></span>
						<ul class="placeul">
							<li><a id="qaFactoryLi" onclick="goToFactory()" style="cursor:hand">${qaFactoryName }</a></li>
							<li><a id="qaProductLineLi" onclick="machineGoBackToPl()" style="cursor:hand"></a></li>
							<li><a id="qaProcessLi" onclick="teilGoBackToMachine()" style="cursor:hand"></a></li>
							<li><a id="qaMachineLi" onclick="teilGoBackToMachine()" style="cursor:hand"></a></li>
							<li><a id="qaTeilLi" onclick="merkmalGoBackToTeil()" style="cursor:hand"></a></li>
							<li><a id="qaMerkmalLi" onclick="merkmalGoBackToPl()" style="cursor:hand"></a></li>
						</ul>
	    			</div>
	    			<div style="float: right">
	    				<a id="choiceTeil" class="easyui-linkbutton" data-options="iconCls:'icon-add'">加入对比</a>
						<a id="showCompBtn" class="easyui-menubutton" data-options="menu:'#compBtnTb',iconCls:'icon-search',plain:false">查看对比</a>
	    				<%--<a id="showCompBtn" class="easyui-linkbutton" data-options="iconCls:'icon-search'" >查看对比</a>--%>
	    				<%-- <input id="monthReportYear" class="easyui-combobox" name="monthReportYear"  style="margin: 0px;width: 80px"
	    					data-options="editable:false,valueField:'MONTH',textField:'MONTH',url:'<%=basePath%>qa/getMonthReportCombobox',onLoadSuccess:function(){comboboxFirst()}" > --%>
						<a id="searchMonthReport" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="margin: 0px">查看月报</a>
						<div id="compBtnTb" style="width:400px;">
						</div>
	    			</div>
					
	  			</div>
		  		<div id="qaPanels" data-options="region:'center',border:false" style="overflow: hidden;">
		  			<div id="qaProductLineAbility" class="easyui-panel" data-options="fit:true,border:false" style="overflow:hidden;">
			  		</div>
			  		<div id="qaMachineAbility" class="easyui-panel" data-options="fit:true,closed:true,border:false" style="overflow:hidden;">
			  		</div>
		  			<div id="qaTeilAbility" class="easyui-panel" data-options="fit:true,closed:true,border:false" style="overflow:hidden;">
			  		</div>
			  		<div id="qaMerkmalAbility" class="easyui-panel" data-options="fit:true,closed:true,border:false" style="overflow:hidden;">
			  				
			  		</div>
		  		</div>
		  	</div>
  		</div>
  	</div>
  	<div id="plReportDig">
		    	<div class="easyui-layout" fit="true">
		  			<div id="qaPlMRLH" data-options="region:'north',title:'量化',split:false,collapsible:false,border:false,tools:'#qaPlMRLHCombo'" style="height:33%;"></div>
		  			<div id="qaPlMRPR" data-options="region:'center',border:false,title:'合格率'" style=""></div>
		  			<div id="qaPlMRCPK" data-options="region:'south',title:'能力',split:false,collapsible:false,border:false" style="height:33%;"></div>
		  		</div>
  	</div>
  	<div id="machineReportDig">
  		<div class="easyui-layout" fit="true">
  			<div id="qaMachinepProcessDiv" data-options="region:'west',title:'工序',split:false,collapsible:false,border:false" style="width:200px;padding: 5px">
  				<div id="machineReportProcessDiv" ></div>
  			</div>
  			<div data-options="region:'center'" >
  				<div class="easyui-layout" fit="true">
  					<div id="qaMachineMRLH" data-options="region:'north',title:'量化',split:false,collapsible:false,border:false,tools:'#qaMachineMRLHCombo'" style="height:33%;"></div>
	  				<div id="qaMachineMRPR" data-options="region:'center',border:false,title:'合格率'" style=""></div>
	  				<div id="qaMachineMRCPK" data-options="region:'south',title:'能力',split:false,collapsible:false,border:false" style="height:33%;"></div>
	  			</div>
  			</div>
  		</div>
  	</div>
  	<div id="qaPlMRLHCombo">
  		<input id="qaPlMRLHComboBox" class="easyui-combobox" name=""  style="margin: 0px;width: 150px"
	    					data-options="editable:false,valueField:'value',textField:'text',url:'<%=basePath%>qa/getMonthReportCombobox',onSelect:qaPlMRLHComboBoxSelect" >
  	
  	</div>
  	<div id="qaMachineMRLHCombo">
  		<input id="qaMachineMRLHComboBox" class="easyui-combobox" name=""  style="margin: 0px;width: 150px"
	    					data-options="editable:false,valueField:'value',textField:'text',url:'<%=basePath%>qa/getMonthReportCombobox',onSelect:qaMachineMRLHComboBoxSelect" >
  	
  	</div>
  	<div id="compareDIV" class="easyui-dialog" data-options="title: '参数对比',width: $(window).width(),height: $(window).height(),closed: true,modal: true"></div>
  </body>
</html>
