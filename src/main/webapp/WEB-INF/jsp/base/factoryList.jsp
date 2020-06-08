<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="meta.jsp"%>
<html>
  <head>
	<title>qdas</title>
<link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" type="image/x-icon">
<script type="text/javascript">
	$(function(){
		$('#factorySetup').click(function(){
		window.location.href='<%=basePath%>system/initPage';
	
		})
	
	
	})

</script>
  </head>
  
  <body>
    <div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
    	<div data-options="region:'center'" style="">
    		<table id="factoryTable">
			    <thead>
			        <tr>
			            <th data-options="field:'factoryIcon',width:100"></th>
			            <th data-options="field:'factory_name',width:40"></th>
			           <!--  <th data-options="field:'workShopIcon',width:60"></th> -->
			            <th data-options="field:'workShop_name',width:60"></th>
			        </tr>
			    </thead>
			</table>
    	</div>
    </div>
    <div id="factoryTableTB" style="padding: 5px">
    	<a id="factorySetup" class="easyui-linkbutton" data-options="iconCls:'icon-shezhi'">工厂设置</a>
    
    </div>
    <style type="text/css">
    	.datagrid-header{position: absolute;visibility: hidden;}
    </style>
    <script type="text/javascript">
    	$(function(){
    		$('#factoryTable').datagrid({
    			url:'<%=basePath%>main/getAllFactory',
    			toolbar:'#factoryTableTB',
    			border : false,
				pagination : false,
				fit : true,
				rownumbers : false,
				fitColumns : true,
				singleSelect : true,
				/* rowStyler: function(index,row){
					return 'height:50px';
				}, */
				onClickRow:function(rowIndex,rowData){
					<%-- $('#plCenterbox').panel('refresh','<%=basePath%>qb/getProductLineData?workShopName='+rowData.workShop_name+'&workShopDrawingStr='+rowData.workShop_drawing+'&factoryName='+rowData.factory_name); --%>
					window.location.href='<%=basePath%>main/mainPage?workShopName='+rowData.workShop_name+'&workShopDrawingStr='+rowData.workShop_drawing+'&factoryName='+rowData.factory_name;
				},
				onLoadSuccess:function(data){
					var rows=data.rows;
					var indexObj=new Object();
					indexObj['factory_name']='index';
					rows.push(indexObj);
					var factoryName=rows[0].factory_name;
					var mergeArr=new Array();
					var index=0;
					var rowspan=0;
					for(var i=0;i<rows.length;i++){
						if(factoryName===rows[i].factory_name){
							rowspan+=1
						}else{
							var map=new Object();
							map.index=index;
							map.rowspan=rowspan;
							map.fname=factoryName;
							mergeArr.push(map);
							factoryName=rows[i].factory_name;
							index+=rowspan;
							rowspan=0;
							i=i-1;
						}
					
					}
					 for(var i=0; i<mergeArr.length; i++){
		                $(this).datagrid('mergeCells',{
		                    index: mergeArr[i].index,
		                    field: 'factoryIcon',
		                    rowspan: mergeArr[i].rowspan
		                });
		                $(this).datagrid('mergeCells',{
		                    index: mergeArr[i].index,
		                    field: 'factory_name',
		                    rowspan: mergeArr[i].rowspan
		                });
		            }
				}
    		})
    		
    	
    	
    	})
    
    
    
    </script>
  </body>
</html>
