<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
    <div class="easyui-layout" fit="true">
        <div id="plBtnDiv" data-options="region:'center',border:false" style="padding: 5px">
            <c:forEach items="${plList}" var="prodectLine" varStatus="index">
                <c:choose>
                    <c:when test="${prodectLine.qualityLevel==\"0\"}">
                        <a class="easyui-linkbutton c1" data-options="size:'large'" style="width:18%;height: 100px;" onclick="getTeil('${index.index}','${prodectLine.TEKOSTST }');">${prodectLine.TEKOSTST  }</a>
                    </c:when>
                    <c:when test="${prodectLine.qualityLevel==\"2\"}">
                        <a class="easyui-linkbutton c5" data-options="size:'large'" style="width:18%;height: 100px;" onclick="getTeil('${index.index}','${prodectLine.TEKOSTST }');">${prodectLine.TEKOSTST  }</a>
                    </c:when>
                </c:choose>
            </c:forEach>
        </div>
    </div>

    <script type="text/javascript">
        function getTeil(btnIndex,plname) {
            $('#plBtnDiv').find('.easyui-linkbutton').each(function (index,ele) {
                if(btnIndex==index){
                    $(ele).linkbutton({
                        iconCls: 'icon-large-gou'
                    });
                }else{
                    $(ele).linkbutton({
                        iconCls: ''
                    });
                }
            })
            $('#qbAcc').accordion('select',1);
            $('#teilAcc').panel('refresh', '<%=basePath%>qb/initTeil?startTime=' + startTime + "&endTime="+ endTime + "&productLineName="+ plname);
        }
    </script>
</body>
</html>
