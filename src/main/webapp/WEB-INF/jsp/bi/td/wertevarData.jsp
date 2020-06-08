<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<head>

</head>
<body>
	<div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'center',split:true">
			<table id="wertevarTable">
				<thead>
					<tr>
						<th data-options="field:'WVWERT',width:80,align:'center',sortable:true">WVWERT</th>
						<th data-options="field:'PRVORNAME',width:50,align:'center'">PRVORNAME</th>
						<th data-options="field:'PMNR',width:100,align:'center'">PMNR</th>
						<th data-options="field:'PMBEZ',width:100,align:'center'">PMBEZ</th>
						<th data-options="field:'WVMASCHINE',width:50,align:'center'">WVMASCHINE</th>
						<th data-options="field:'WVNEST',width:50,align:'center'">WVNEST</th>
						<th data-options="field:'WVDATZEIT',width:120,align:'center',sortable:true">WVDATZEIT</th>
					</tr>
				</thead>
			</table>
			<div id='wertevarTb' style="padding: 10px;width: 100%">
				开始时间：<input class="easyui-datetimebox" name="startTime" id="startTime" style="width ：150px "> 
				结束时间：<input class="easyui-datetimebox" name="endTime" id="endTime" style="width ：150px "> 
				<a id="wseBtn" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
				查询近<select id="timecc" class="easyui-combobox" name="dept" style="width:150px;">
					<option value="0">--选择日期查询--</option>
					<option value="1">一天</option>
					<option value="2">两天</option>
					<option value="3">三天</option>
					<option value="7">一周</option>
					<option value="30">一月</option>
					<option value="180">半年</option>
					<option value="365">一年</option>
				</select> 
				<a id="wlBtn" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a> 
				<a id="cancelWertevarSearch" class="easyui-linkbutton" data-options="iconCls:'icon-back'" style="float: right">取消查询</a>
			</div>
		</div>
		<div id="tdCharts" data-options="region:'east',title:'数据图表',split:true" style="width:50%;"></div>
		<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
		<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
		<script type="text/javascript">
			$(function() {
				var lineChart;
				window.onresize=function(){
					if(lineChart!=null&lineChart!=''){
						lineChart.resize();
					}
				}
				$('#wertevarTable').datagrid({
					url:'<%=basePath%>teil/getWertevarData?teilId='+${teilId}+'&merkmalId='+${merkmalId},
					toolbar:'#wertevarTb',
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
						var row2=$('#merkmalTable').datagrid('getSelected');
						if(row2!=null&row2!=""){
							var xV=[]; 
							var yV=[];
							var sizeRows=data.rows;
							for(var i=0;i<sizeRows.length;i++){
								xV.push(sizeRows[i].WVDATZEIT);
								yV.push(sizeRows[i].WVWERT);
							}
							lineChart=initLineChart('tdCharts',xV,yV,row2.MEOGW,row2.MEUGW);
						}
					},
					rowStyler: function(index,row){
						var mrow=$('#merkmalTable').datagrid('getSelected');
						if(mrow!=null&mrow!=''){
							if(mrow.MEUGW!=null&mrow.MEUGW!=''&mrow.MEOGW!=null&mrow.MEOGW!=''){
								if(row.WVWERT<mrow.MEUGW|row.WVWERT>mrow.MEOGW){
									return 'background-color:#FF69B4;color:#0000CD;';
								}
							}
						}
					}
				});
				$('#wseBtn').click(function(){
					var startTime=$("#startTime").datebox('getValue');
					var endTime=$("#endTime").datebox('getValue');
					if((startTime==''|startTime==null)&(endTime==''|endTime==null)){
						$ .messager.alert('错误','查询条件不能为空！','info');
					}
					if(startTime!=''&startTime!=null&endTime!=''&endTime!=null&startTime>endTime){
						$ .messager.alert('错误','起始时间必须结束时间之前！','info');
					}
					var row1=$('#teilTable').datagrid('getSelected');
					var row2=$('#merkmalTable').datagrid('getSelected');
					$('#wertevarTable').datagrid('reload',{
													startTime:startTime,
													endTime:endTime});
				})
				$('#wlBtn').click(function(){
					var days=$('#timecc').combobox('getValue');
					if(days==0|days==""|days==null){
						return false;
					}
					var now=new Date();
					var searchTime=now.getTime()-(days*86400000);
					var ago=new Date(searchTime);
					var startDate=ago.getFullYear()+"-"+(ago.getMonth()+1)+"-"+ago.getDate()+" "+ago.getHours()+":"+ago.getMinutes()+":"+ago.getSeconds();
					var endDate=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds();
					var row1=$('#teilTable').datagrid('getSelected');
					var row2=$('#merkmalTable').datagrid('getSelected');
					$('#wertevarTable').datagrid('reload',{
													startTime:startDate,
													endTime:endDate});
				});
				$('#cancelWertevarSearch').click(function(){
					$('#startTime').datebox('setValue','');
					$('#endTime').datebox('setValue','');
					$('#timecc').combo('setValue','0');
					var row1=$('#teilTable').datagrid('getSelected');
					var row2=$('#merkmalTable').datagrid('getSelected');
					$('#wertevarTable').datagrid('reload',{
													startTime:'',
													endTime:''});
					$('#teilAcc').accordion('select',0);
				})
			})
		</script>
</body>
</html>

