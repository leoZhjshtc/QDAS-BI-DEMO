<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<table class="table table-hover">
    <tr>
        <th style="width: 10px">#</th>
        <th>参数名</th>
        <th>测量值</th>
        <th>名义值</th>
        <th>下公差</th>
        <th>上公差</th>
        <th>下警戒限</th>
        <th>上警戒限</th>
        <th>结果</th>
        <th>测量人员</th>
        <th>测量日期</th>
    </tr>
    <c:forEach items="${mmList}" var="list" varStatus="index">
        <tr>
            <td>${index.index+1}</td>
            <td>${list.MEMERKBEZ}</td>
            <td>${list.WVWERT}</td>
            <td>${list.MENENNMAS}</td>
            <td>${list.MEUGW}</td>
            <td>${list.MEOGW}</td>
            <td>${list.NEWMEUGW}</td>
            <td>${list.NEWMEOGW}</td>
            <c:choose>
                <c:when test="${list.qualityLevel==\"0\"}">
                    <td><span class="label label-success">合格</span></td>
                </c:when>
                <c:when test="${list.qualityLevel==\"2\"}">
                    <td><span class="label label-danger">不合格</span></td>
                </c:when>
            </c:choose>
            <td>${list.PRVORNAME}</td>
            <td>${list.WVDATZEIT}</td>
        </tr>
    </c:forEach>
</table>
<script type="text/javascript">
    $(function () {
        location.href='#mmDetailsTableDiv';
    })
</script>
</body>
</html>
