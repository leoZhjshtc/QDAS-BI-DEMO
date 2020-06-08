<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>

  </head>
  
  <body>
    <div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
  		<div data-options="region:'center',border:false" style="overflow: hidden;">
  			<table id="qaMerkmalTable"></table>
  		</div>
  	</div>
  	<div id="qaMerkmalTableTB" style="padding: 5px">
  		<input class="easyui-datetimebox" name="birthday" data-options="editable:false,label:'查询从:',labelAlign:'right'" style="width:300px">
  		<input class="easyui-datetimebox" name="birthday" data-options="editable:false,label:'至:',labelAlign:'right',labelWidth:50" style="width:300px">的数据
  		<br>
  		<input class="easyui-textbox" data-options="label:'零件号:',labelAlign:'right'" style="width:300px">
  		<input class="easyui-textbox" data-options="label:'零件名:',labelAlign:'right'" style="width:300px">
  		<input class="easyui-textbox" data-options="label:'产线:',labelAlign:'right'" style="width:300px">
  		<a id="btn" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="float: right">查询</a>
  	</div>
  	<script type="text/javascript">
  		$('#qaMerkmalTable').datagrid({
  			toolbar: '#qaMerkmalTableTB',
		    url:'<%=basePath%>qa/getQaTeilTableData',
		    fitColumns:true,
		    fit:true,
		    striped:false, 
		    nowrap:true,
		    rownumbers:true,
		    singleSelect:true,
		    columns:[[
		    	{field:'TETEIL',title:'零件ID',width:100,hidden:true},
		        {field:'TETEILNR',title:'零件号',width:100,align:'center'},
		        {field:'TEBEZEICH',title:'零件名',width:100,align:'center'},
		        {field:'TEKOSTST',title:'产线',width:100,align:'center'}
		    ]],
		    rowStyler:function(index,row){
		    	if(row.alarmCount1>0|row.alarmCount2>0|row.alarmCount65536>0){
		    		return 'background-color:#EE0000;color:#fff;';
		    	}else if(row.alarmCount16>0|row.alarmCount32>0){
		    		return 'background-color:#FFFF00;color:#0000FF;';
		    	}else{
		    		return 'background-color:#00EE00;color:#0000FF;';
		    	}
		    },
		    onClickRow:function(index,row){
		    	$('#qaAcc').accordion('select',1); 
		    	$('#merkmalAcc').panel('refresh','<%=basePath%>qa/initQaMerkmalPage?teilId='+row.TETEIL);
		    	var accSelected = $('#qaAcc').accordion('getPanel',0);
				accSelected.panel('setTitle', '零件(零件号名：'+row.TETEILNR+')');
		    }
		});
		  	
  	
  	</script>
  </body>
</html>
