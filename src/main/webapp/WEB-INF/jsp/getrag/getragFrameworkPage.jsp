<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../base/meta.jsp" %>
<html>
<head>
    <script type="text/javascript">
        function addPanel(tabName){
            var tabs = $('#mainTab').tabs('tabs');
            console.log(tabs.length);
            for(var i=0;i<tabs.length;i++){
                console.log(tabs[i].panel('options').title)
            }
            $('#mainTab').tabs('add',{
                title: tabName,
                closable: true,
                href:'<%=basePath%>qbGetrag/initQb'
            });
        }
    </script>
</head>
<body>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'west',split:true,collapsed:true" title="mokuai" style="width:100px;">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="addPanel('质量看板')" style="width:100%" data-options="iconCls:'icon-large-picture',size:'large',iconAlign:'top'">质量看板</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="addPanel('任务管理')" style="width:100%" data-options="iconCls:'icon-large-shapes',size:'large',iconAlign:'top'">任务管理</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="addPanel('质量分析')"  data-options="iconCls:'icon-large-smartart',size:'large',iconAlign:'top'">质量分析</a>
    </div>
    <div data-options="region:'center'">
            <div  id="mainTab" class="easyui-tabs"  data-options="tools:'#tab-tools',border:false,fit:true"></div>
    </div>
    <div id="tab-tools">
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-reload'" onclick="addPanel()"></a>
    </div>
</div>
</body>
</body>
</html>
