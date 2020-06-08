<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
<head>
</head>

<body>
	<input type="hidden" id="qaTeilPlName" value="${qaTeilPlName }">
	<input type="hidden" id="qaTeilMachineName"
		value="${qaTeilMachineName }">
	<input type="hidden" id="qaTeilProcessNum" value="${qaTeilProcessNum }">
	<div class="easyui-layout" fit="true">
		<div
			data-options="region:'north',split:false,border:false,collapsible:false,title:'量化程度',onResize:qaTeilChartResize"
			style="height:33%;">
			<div id="qaTeilLhLayout" class="easyui-layout" fit="true">
				<div id="qaTeilLhChart" data-options="region:'center'"></div>
			</div>
		</div>
		<div
			data-options="region:'center',border:false,onResize:qaMachineResize,title:'合格率',onResize:qaTeilChartResize">
			<div id="qaTeilPassRateLayout" class="easyui-layout" fit="true">
				<div id="qaTeilPassRateChart" data-options="region:'center'"></div>
			</div>
		</div>
		<div
			data-options="region:'south',split:false,border:false,collapsible:false,title:'能力汇总',onResize:qaTeilChartResize"
			style="height:33%;">
			<div id="qaTeilCPKLayout" class="easyui-layout" fit="true">
				<div id="qaTeilCPKChart" data-options="region:'center'"></div>
			</div>
		</div>
	</div>
	<div id="qaTeilMorePie">
		<div id="showAllPieCharts" style="width:100%"></div>
	</div>
	<script type="text/javascript">
		var qaTeilLhChart,
			qaTeilPassRateChart,
			qaTeilCPKChart;
		$('#qaTeilMorePie').dialog({
			    title: '图表',
			    width: $(window).width(),
			    height: $(window).height(),
			    closed: true,
			    cache: false,
			    modal: false
			});
		$.ajax({
			type : 'post',
			url : '<%=basePath%>qa/getQaTeilAbilityData',
			data : {
				productLineName : $('#qaTeilPlName').val(),
				machineName : $('#qaTeilMachineName').val(),
				processNum : $('#qaTeilProcessNum').val()
			},
			success : function(data) {
				if (data.length > 0) {
					var titleInfoArr = new Array();
					var pieDataArr = new Array();
					var piePrArr = new Array();
					var pieCpkArr = new Array();
					for (var i = 0; i < data.length; i++) {
						var lhValue = ((data[i].DLCOUNT / data[i].MERKMALCOUNT) * 100).toFixed(2);
						var dxValue = (100 - lhValue).toFixed(2);
						var pieArr = [ {
							name : '定量参数',
							value : lhValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						}, {
							name : '定性参数',
							value : dxValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						} ];
						pieDataArr.push(pieArr);
						titleInfoArr.push(data[i].TETEILNR + "\n" + data[i].TEBEZEICH);
						var prWarnCount = 0;
						var prFailCount = 0;
						var prTotalCount = 0;
						var warnCPKCount = 0;
						var failCPKCount = 0;
						for (var j = 0; j < data[i].WVCOUNTLIST.length; j++) {
							prWarnCount += parseInt(data[i].WVCOUNTLIST[j].ALARMCOUNT);
							prFailCount += parseInt(data[i].WVCOUNTLIST[j].NOKCOUNT);
							prTotalCount += parseInt(data[i].WVCOUNTLIST[j].TOTALCOUNT);
							if (data[i].WVCOUNTLIST[j].CPKALARM == '1') {
								warnCPKCount += 1;
							} else if (data[i].WVCOUNTLIST[j].CPKALARM == '2') {
								failCPKCount += 1;
							}
						}
						var prWarnValue,
							prFailValue,
							prSuccessValue;
						if (prWarnCount === 0) {
							prWarnValue = 0;
						} else {
							prWarnValue = (prWarnCount / prTotalCount * 100).toFixed(2);
						}
						if (prFailCount === 0) {
							prFailValue = 0;
						} else {
							prFailValue = (prFailCount / prTotalCount * 100).toFixed(2);
						}
						prSuccessValue = (100 - prWarnValue - prFailValue).toFixed(2);
						var prIndexArr = [ {
							name : '合格',
							value : prSuccessValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						}, {
							name : '超警戒',
							value : prWarnValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						}, {
							name : '不合格',
							value : prFailValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						} ];
						piePrArr.push(prIndexArr);
	
						var cpkWarnValue,
							cpkFailValue,
							cpkSuccessValue;
						if (warnCPKCount == 0) {
							cpkWarnValue = 0;
						} else {
							cpkWarnValue = ((warnCPKCount / data[i].DLCOUNT) * 100).toFixed(2);
						}
						if (failCPKCount == 0) {
							cpkFailValue = 0;
						} else {
							cpkFailValue = ((failCPKCount / data[i].DLCOUNT) * 100).toFixed(2);
						}
						cpkSuccessValue = (100 - cpkFailValue - cpkWarnValue).toFixed(2);
						var cpkIndexArr = [ {
							name : 'cpk>1.67',
							value : cpkSuccessValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						}, {
							name : '1.33<cpk<1.67',
							value : cpkWarnValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						}, {
							name : 'cpk<1.33',
							value : cpkFailValue,
							TETEIL : data[i].TETEIL,
							K1001 : data[i].TETEILNR
						} ];
						pieCpkArr.push(cpkIndexArr);
					}
					/* for(var i=0;i<4;i++){
						titleInfoArr=titleInfoArr.concat(titleInfoArr);
						pieDataArr=pieDataArr.concat(pieDataArr);
						piePrArr=piePrArr.concat(piePrArr);
						pieCpkArr=pieCpkArr.concat(pieCpkArr);
					} */
					if (titleInfoArr.length >= 8) {
						lhEast(pieDataArr, titleInfoArr, '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
						passRateEast(piePrArr, titleInfoArr, '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
						cpkEast(pieCpkArr, titleInfoArr, '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
						qaTeilLhChart = initQaLhPie('qaTeilLhChart', pieDataArr.slice(0, 8), titleInfoArr.slice(0, 8), '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
						qaTeilPassRateChart = initQaPassRatePie('qaTeilPassRateChart', piePrArr.slice(0, 8), titleInfoArr.slice(0, 8), '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
						qaTeilCPKChart = initQaCPKPie('qaTeilCPKChart', pieCpkArr.slice(0, 8), titleInfoArr.slice(0, 8), '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
					}else{
						qaTeilLhChart = initQaLhPie('qaTeilLhChart', pieDataArr, titleInfoArr, '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
						qaTeilPassRateChart = initQaPassRatePie('qaTeilPassRateChart', piePrArr, titleInfoArr, '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
						qaTeilCPKChart = initQaCPKPie('qaTeilCPKChart', pieCpkArr, titleInfoArr, '<%=basePath%>qa/initQaMerkmalAbility?productLineName=' + $('#qaTeilPlName').val() + "&machineName=" + $('#qaTeilMachineName').val() + "&processNum=" + $('#qaTeilProcessNum').val());
					}
				}
	
			}
		})
		function lhEast(dataArr,titleArr,url) {
			var region = 'east';
			var options = {
				region : region
			};
			options.height = '100%';
			options.width = 50;
			options.split = false;
			options.id = "qaTeilLhLayoutEast";
			$('#qaTeilLhLayout').layout('add', options);
			$("#qaTeilLhLayoutEast").css("vertical-align", "middle");
			$("#qaTeilLhLayoutEast").css("display", "table-cell");
			$("#qaTeilLhLayoutEast").css("text-align", "center");
			$("#qaTeilLhLayoutEast").css("cursor", "pointer");
			$("#qaTeilLhLayoutEast").append("<img src='<%=basePath%>resources/images/qaMore.png' style='width:45px'/>");
			$("#qaTeilLhLayoutEast").click(function() {
				$('#qaTeilMorePie').dialog('open');
				var pieRows=Math.ceil(titleArr.length/10);
				$('#showAllPieCharts').height(pieRows*210+'px');
				initQaLhPie("showAllPieCharts", dataArr, titleArr, url);
			})
	
		}
		function passRateEast(dataArr,titleArr,url) {
			var region = 'east';
			var options = {
				region : region
			};
			options.height = '100%';
			options.width = 50;
			options.split = false;
			options.id = "qaTeilPassRateLayoutEast";
			$('#qaTeilPassRateLayout').layout('add', options);
			$("#qaTeilPassRateLayoutEast").css("vertical-align", "middle");
			$("#qaTeilPassRateLayoutEast").css("display", "table-cell");
			$("#qaTeilPassRateLayoutEast").css("text-align", "center");
			$("#qaTeilPassRateLayoutEast").css("cursor", "pointer");
			$("#qaTeilPassRateLayoutEast").append("<img src='<%=basePath%>resources/images/qaMore.png' style='width:45px'/>");
			$("#qaTeilPassRateLayoutEast").click(function() {
				$('#qaTeilMorePie').dialog('open');
				var pieRows=Math.ceil(titleArr.length/10);
				$('#showAllPieCharts').height(pieRows*210+'px');
				initQaPassRatePie("showAllPieCharts", dataArr, titleArr, url);
			})
	
		}
		function cpkEast(dataArr,titleArr,url) {
			var region = 'east';
			var options = {
				region : region
			};
			options.height = '100%';
			options.width = 50;
			options.split = false;
			options.id = "qaTeilCPKLayoutEast";
			$('#qaTeilCPKLayout').layout('add', options);
			$("#qaTeilCPKLayoutEast").css("vertical-align", "middle");
			$("#qaTeilCPKLayoutEast").css("display", "table-cell");
			$("#qaTeilCPKLayoutEast").css("text-align", "center");
			$("#qaTeilCPKLayoutEast").css("cursor", "pointer");
			$("#qaTeilCPKLayoutEast").append("<img src='<%=basePath%>resources/images/qaMore.png' style='width:45px'/>");
			$("#qaTeilCPKLayoutEast").click(function() {
				$('#qaTeilMorePie').dialog('open');
				var pieRows=Math.ceil(titleArr.length/10);
				$('#showAllPieCharts').height(pieRows*210+'px');
				initQaCPKPie("showAllPieCharts", dataArr, titleArr, url);
			})
	
		}
		function qaTeilChartResize() {
			if (qaTeilLhChart != null & qaTeilLhChart != '') {
				qaTeilLhChart.resize();
			}
			if (qaTeilPassRateChart != null & qaTeilPassRateChart != '') {
				qaTeilPassRateChart.resize();
			}
			if (qaTeilCPKChart != null & qaTeilCPKChart != '') {
				qaTeilCPKChart.resize();
			}
		}
	</script>
</body>
</html>
