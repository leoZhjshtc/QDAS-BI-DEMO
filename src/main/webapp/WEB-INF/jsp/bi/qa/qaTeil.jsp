<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>

  </head>
  
  <body>
    <div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
  		<div data-options="region:'center',border:false" style="overflow: hidden;">
  			<table id="qaTeilTable">
  				<thead>
		            <tr>
		                <th data-options="field:'TETEIL',width:100,align:'center',hidden:true">零件ID</th>
		                <th data-options="field:'TETEILNR',width:100,align:'center'">零件号</th>
		                <th data-options="field:'TEBEZEICH',width:100,align:'center'">零件名</th>
		                <th data-options="field:'TEKOSTST',width:100,align:'center'">产线</th>
		            </tr>
		        </thead>
  			
  			</table>
  		</div>
  	</div>
  	<div id="qaTeilTableTB" style="padding: 5px">
  		<input class="easyui-datetimebox" id="qaSearchStartTime" name="qaSearchStartTime" data-options="editable:false,label:'查询从:',labelAlign:'right',labelWidth:60" style="width:180px">
  		<input class="easyui-datetimebox" id="qaSearchEndTime" name="qaSearchEndTime" data-options="editable:false,label:'至:',labelAlign:'right',labelWidth:60" style="width:180px">的数据
  		<a id="cancelSearch" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" style="float: right">撤销</a>
  		<br>
  		<input id="qaSearchTeilId" class="easyui-textbox" data-options="label:'零件号:',labelAlign:'right',labelWidth:60" style="width:180px">
  		<input id="qaSearchTeilName" class="easyui-textbox" data-options="label:'零件名:',labelAlign:'right',labelWidth:60" style="width:180px">
  		<input id="qaSearchPlName" class="easyui-textbox" data-options="label:'产线:',labelAlign:'right',labelWidth:50" style="width:180px">
  		<a id="qaTeilTableSearch" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="float: right">查询</a>
  	</div>
  	<div id="qaMerkmalTableTB" style="padding: 2px">
  		<input class="easyui-textbox" id="qaSearchMerkmalNum" data-options="label:'参数号:',labelAlign:'right'" style="width:200px">
  		<input class="easyui-textbox" id="qaSearchMerkmalName" data-options="label:'参数名:',labelAlign:'right'" style="width:200px">
  		<a id="qaMerkmalTableSearch" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="margin-left: 20px">查询</a>
  	</div>
  	<script type="text/javascript" src="<%=basePath%>resources/easyui/datagrid-detailview.js"></script>
  	<script type="text/javascript">
  		var expandIndex;
  		var ddv;
  		$('#qaTeilTable').datagrid({
  			view: detailview,
  			toolbar: '#qaTeilTableTB',
		    url:'<%=basePath%>qa/getQaTeilTableData',
		    fitColumns:true,
		    fit:true,
		    striped:false, 
		    nowrap:true,
		    rownumbers:true,
		    singleSelect:true,
		    rowStyler:function(index,row){
		    	if(row.wvCount==0){
                    return 'background-color:#00BFFF;color:#fff;';
                }else if(row.alarmCount1>0|row.alarmCount2>0|row.alarmCount65536>0){
		    		return 'background-color:#EE0000;color:#fff;';
		    	}else if(row.alarmCount16>0|row.alarmCount32>0){
		    		return 'background-color:#FFFF00;color:#0000FF;';
		    	}else{
		    		return 'background-color:#00EE00;color:#0000FF;';
		    	}
		    },
		    onDblClickRow:function(index,row){
		    	<%-- $('#qaAcc').accordion('select',1);  
		    	$('#chartAcc').panel('refresh','<%=basePath%>qa/initQaChartsPage?teilId='+row.TETEIL); --%>
		    	$('#qaTeilPanel').panel('close');
		    	$('#qaChartPanel').panel('refresh','<%=basePath%>qa/initQaChartsPage?teilId='+row.TETEIL);
		    	$('#qaChartPanel').panel('open');
		    },
		    detailFormatter:function(index,row){
               return '<div style="padding:2px;position:relative;"><table class="ddv"></table></div>';
            },
            onExpandRow: function(index,row){
            		if(expandIndex!==''){
            			$('#qaTeilTable').datagrid('collapseRow',expandIndex);
            		
            		}
                    ddv = $(this).datagrid('getRowDetail',index).find('table.ddv');
                    ddv.datagrid({
                        url:'<%=basePath%>qa/getQaMerkmalTableData',
                        queryParams:{
                        	teilId:row.TETEIL,
                        	startTime:$('#qaSearchStartTime').datetimebox('getValue'),
                        	endTime:$('#qaSearchEndTime').datetimebox('getValue')
                        },
                        fitColumns:true,
                        singleSelect:true,
                        rownumbers:true,
                        toolbar: '#qaMerkmalTableTB',
                        loadMsg:'',
                        height:'auto',
                        columns:[[
                            {field:'MEMERKBEZ',title:'参数名',width:100,align:'center'},
                            {field:'MEMERKNR',title:'参数编号',width:100,align:'center'},
                            {field:'MEUGW',title:'下公差限',width:100,align:'center'},
                            {field:'MEOGW',title:'上公差限',width:100,align:'center'}
                        ]],
                        onResize:function(){
                            $('#qaTeilTable').datagrid('fixDetailRowHeight',index);
                        },
                        onLoadSuccess:function(){
                            setTimeout(function(){
                                $('#qaTeilTable').datagrid('fixDetailRowHeight',index);
                            },0);
                        },
                        onDblClickRow:function(index,row){
					    	var teilRow=$('#qaTeilTable').datagrid('getSelected');
					    	<%-- $('#qaAcc').accordion('select',2); 
					    	$('#detailAcc').panel('refresh','<%=basePath%>qb/initDetailsDataPage?teilId='+teilRow.TETEIL+'&merkmalId='+row.MEMERKMAL); --%>
					    	$('#qaTeilPanel').panel('close');
					    	$('#qaDetailsPanel').panel('open');
					    	$('#qaDetailsPanel').panel('refresh','<%=basePath%>qb/initDetailsDataPage?teilId='+teilRow.TETEIL+'&merkmalId='+row.MEMERKMAL);
					    },
                        rowStyler:function(index,row){
                        	if(row.wvCount==0){
                        		return 'background-color:#00BFFF;color:#fff;';
                        	}else if(row.alarmCount1>0|row.alarmCount2>0|row.alarmCount65536>0){
					    		return 'background-color:#EE0000;color:#fff;';
					    	}else if(row.alarmCount16>0|row.alarmCount32>0){
					    		return 'background-color:#FFFF00;color:#0000FF;';
					    	}else{
					    		return 'background-color:#00EE00;color:#0000FF;';
					    	}
					    }
                    });
                    $('#qaTeilTable').datagrid('fixDetailRowHeight',index);
                    expandIndex=index;
             }
		});
		$('#qaTeilTableSearch').click(function(){
			if($('#qaSearchStartTime').datetimebox('getValue')>$('#qaSearchEndTime').datetimebox('getValue')){
				$.messager.alert('提示信息','结束时间必须大于起始时间','info');
				return false;
			}
			$('#qaTeilTable').datagrid('reload',{
				startTime:$('#qaSearchStartTime').datetimebox('getValue'),
				endTime:$('#qaSearchEndTime').datetimebox('getValue'),
				teilNum:$('#qaSearchTeilId').textbox('getValue'),
				teilName:$('#qaSearchTeilName').textbox('getValue'),
				productLineName:$('#qaSearchPlName').textbox('getValue')
			});
		
		})
  		$('#qaMerkmalTableSearch').click(function(){
  			ddv.datagrid('reload',{
  				startTime:$('#qaSearchStartTime').datetimebox('getValue'),
				endTime:$('#qaSearchEndTime').datetimebox('getValue'),
				merkmalName:$('#qaSearchMerkmalName').textbox('getValue'),
				merkmalNum:$('#qaSearchMerkmalNum').textbox('getValue')
  			
  			});
  		})
  		
  	</script>
  </body>
</html>
