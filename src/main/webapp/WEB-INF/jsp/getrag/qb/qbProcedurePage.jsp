<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <input id="procedureTeilNum" type="hidden" value="${procedureTeilNum }">
    <input id="procedureTeilName" type="hidden" value="${procedureTeilName }">
    <input id="procedureTeilK1003" type="hidden" value="${procedureTeilK1003 }">
    <div data-options="region:'north',split:false" style="height: 40px;padding: 4px;overflow: hidden">
        <a id="procedureQbShow" class="easyui-linkbutton" data-options="iconCls:'icon-kanbanicon'" style="float: right" onclick="plOpenQbShow();">打开轮播看板</a>
    </div>
    <div id="teilBtnDiv" data-options="region:'center',border:false" style="padding: 5px">
        <c:forEach items="${procedureList}" var="procedure" varStatus="index">
            <c:choose>
                <c:when test="${procedure.qualityLevel==\"0\"}">
                    <a class="easyui-linkbutton c1" data-options="size:'large'" style="width:18%;height: 100px;"
                       onclick="getMerkmal('${index.index}','${procedure.TETEIL }');"><span class="buttonText">${procedure.TEAUFTRAGSTR  }</span></a>
                </c:when>
                <c:when test="${procedure.qualityLevel==\"2\"}">
                    <a class="easyui-linkbutton c5" data-options="size:'large'" style="width:18%;height: 100px;"
                       onclick="getMerkmal('${index.index}','${procedure.TETEIL }');"><span class="buttonText">${procedure.TEAUFTRAGSTR  }</span></a>
                </c:when>
            </c:choose>
        </c:forEach>
    </div>
</div>
<script type="text/javascript">
    function getMerkmal(teilIndex, teilId) {
        $('#teilBtnDiv').find('.easyui-linkbutton').each(function (index, ele) {
            if (teilIndex == index) {
                $(ele).linkbutton({
                    iconCls: 'icon-large-gou'
                });
            } else {
                $(ele).linkbutton({
                    iconCls: ''
                });
            }
        })
        $('#qbAcc').accordion('select', 2);
        $('#merkmalAcc').panel('refresh', '<%=basePath%>qbGetrag/initMerkmal?startTime=' + startTime + "&endTime=" + endTime + "&teilId=" + teilId);
    }

</script>
</body>
</html>
