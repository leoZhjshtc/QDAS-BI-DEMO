<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp"%>
<html>
<head>
    <script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/js/qa.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qa.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qm.css" />
    <script type="text/javascript">
        $(function () {
            $('#qaTeilAbility').panel('refresh','<%=basePath%>getragQa/initTeilQualityAnalyse');
        })
        function goBackToTeil() {
            $('#qaProcedureAbility').panel('close');
            $('#qaMerkmalAbility').panel('close');
            $('#qaTeilAbility').panel('open');
            $('#qaTeilLi').html('');
            $('#qaProcedureLi').html('');
        }
        function goBackToProcedure() {
            $('#qaProcedureAbility').panel('open');
            $('#qaMerkmalAbility').panel('close');
            $('#qaProcedureLi').html('');
        }
    </script>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'center'">
        <div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
            <div data-options="region:'north',split:false,border:false" style="height:30px;overflow: hidden;display: table-cell;vertical-align: middle;background-color: #f3f3f3;font-size:15px;">
                <div style="float: left">
                    <span id="currentWsName"></span>
                    <ul class="placeul">
                        <li><a id="qaFactoryLi" style="cursor:hand" onclick="goBackToTeil()">质量分析</a></li>
                        <li><a id="qaTeilLi" onclick="goBackToProcedure()" style="cursor:hand"></a></li>
                        <li><a id="qaProcedureLi" style="cursor:hand"></a></li>
                    </ul>
                </div>
            </div>
            <div id="qaPanels" data-options="region:'center',border:false" style="overflow: hidden;">
                <div id="qaTeilAbility" class="easyui-panel" data-options="fit:true,border:false" style="overflow:hidden;">
                </div>
                <div id="qaProcedureAbility" class="easyui-panel" data-options="fit:true,closed:true,border:false" style="overflow:hidden;">
                </div>
                <div id="qaMerkmalAbility" class="easyui-panel" data-options="fit:true,closed:true,border:false" style="overflow:hidden;">

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
