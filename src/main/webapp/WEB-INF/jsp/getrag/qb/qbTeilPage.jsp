<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div id="plBtnDiv" data-options="region:'center',border:false" style="padding: 5px">
        <c:forEach items="${teilList}" var="teil" varStatus="index">
            <c:choose>
                <c:when test="${teil.qualityLevel==\"0\"}">
                    <a class="easyui-linkbutton c1 buttonText" data-options="size:'large'" style="width:18%;height: 100px;"
                       onclick="getProcedure('${index.index}','${teil.TETEILNR }','${teil.TEBEZEICH }','${teil.TEKURZBEZEICH }');">
                        <span class="buttonText">${teil.TETEILNR  }<br>${teil.TEBEZEICH  }<br>${teil.TEKURZBEZEICH  }</span>
                    </a>
                </c:when>
                <c:when test="${teil.qualityLevel==\"2\"}">
                    <a class="easyui-linkbutton c5 buttonText" data-options="size:'large'" style="width:18%;height: 100px;"
                       onclick="getProcedure('${index.index}','${teil.TETEILNR }','${teil.TEBEZEICH }','${teil.TEKURZBEZEICH }');">
                        <span class="buttonText">${teil.TETEILNR  }<br>${teil.TEBEZEICH  }<br>${teil.TEKURZBEZEICH  }</span>
                    </a>
                </c:when>
            </c:choose>
        </c:forEach>
    </div>
</div>
<script type="text/javascript">
    function getProcedure(btnIndex, teilNum,teilName,productClass) {
        $('#plBtnDiv').find('.easyui-linkbutton').each(function (index, ele) {
            if (btnIndex == index) {
                $(ele).linkbutton({
                    iconCls: 'icon-large-gou'
                });
            } else {
                $(ele).linkbutton({
                    iconCls: ''
                });
            }
        })
        $('#qbAcc').accordion('select', 1);
        $('#teilAcc').panel('refresh', '<%=basePath%>qbGetrag/initProcedurePage?startTime=' + startTime + "&endTime=" + endTime + "&teilNum=" + teilNum+ "&teilName=" + teilName+ "&productClass=" + productClass);
    }
</script>
</body>
</html>
