<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<head>
<title>bi Page</title>
<link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" type="image/x-icon">
	<script type="text/javascript">
		$(function(){
			$('#teilDataAcc').panel({
				href:'<%=basePath%>teil/initTeilDataPage'
			});
			$('#teilAcc').accordion({
				onSelect:function(title,index){
					if(index==1){
						if($('#teilTable').datagrid('getSelected')==null){
							$.messager.show({
								title:'提示信息',
								msg:'请选中一个零件',
								timeout:3000,
								showType:'slide'
							});
						}
					}else if(index==2){
						if($('#merkmalTable').datagrid('getSelected')==null){
							$.messager.show({
								title:'提示信息',
								msg:'请选中一个测量参数',
								timeout:3000,
								showType:'slide'
							});
						}
					}
				
				}
			});
		})
	</script>
</head>
<body>
	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
		<div data-options="region:'north',split:false,collapsible:false,border:false" style="background-color: #2dc3e8;height: 60px" >
			<div style="float: left;margin-left: 20px;height: 100%"><small> <img src="<%=basePath%>resources/images/qdas-logo.png" alt="" /></small></div>
		</div>
	    <div data-options="region:'center',border:false" style="overflow: hidden;">
	    	<div id="teilAcc" class="easyui-accordion" data-options="multiple:false,fit:true" style="width:100%;height:100%;">
		        <div id="teilDataAcc" title="零件" style="overflow:auto;">
		        </div>
		        <div id="merkmalAcc" title="测量参数" style="padding:0px;">
		        </div>
		        <div id="wertevarAcc" title="测量值">
				        
		        </div>
		    </div>
	    </div>
	</div>
</body>
</html>

