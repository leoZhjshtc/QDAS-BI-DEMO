<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/mm.css" />
    <script type="text/javascript">
        var today=new Date();
        var mmStartTime = today.getFullYear() + "-" + (today.getMonth() + 1) + "-" + today.getDate() + " 00:00:00";
        var mmEndTime;
        $(function () {
            $('#mmPanel').panel('refresh','<%=basePath%>getragInitMissionManage');
        })
        function goBack(){
            $('#mmDetailsPage').panel('close');
            $('#mmTwoLi').html('');
            $('#mmPanel').panel('open');
            $('#mmPanel').panel('resize');

        }
    </script>
</head>
<body>
<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
    <div data-options="region:'north',split:false,border:false"
         style="height:30px;overflow: hidden;display: table-cell;vertical-align: middle;text-align: center;background-color:#f3f3f3;font-size:15px;">
        <span id="currentWsName"></span>
        <ul class="placeul">
            <li><a id="mmFactoryLi">任务管理</a></li>
            <li><a id="mmTwoLi" onclick="goBack()" style="cursor:hand"></a></li>
        </ul>
    </div>
    <div data-options="region:'center',border:false" style="overflow: hidden;">
        <div id="mmPanel" class="easyui-panel" data-options="fit:true,border:false" style="overflow:hidden;">

        </div>
        <div id="mmDetailsPage" class="easyui-panel" data-options="fit:true,closed:true,border:false"
             style="overflow:hidden;">
            <div class="easyui-layout" fit="true">
                <div id="mmDetailsPageCenterBox" data-options="region:'center'"></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
