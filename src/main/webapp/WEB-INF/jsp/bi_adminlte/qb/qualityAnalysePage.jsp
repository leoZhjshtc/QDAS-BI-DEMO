<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
</head>
<body>
<div id="qaChartCarousel" class="carousel slide carousel-vertical" data-wrap="false"
     data-interval="false">
    <div class="carousel-inner">
        <div class="item active" id="qaPlChartDiv">
        </div>
        <div class="item" id="qaProcessChartDiv">
        </div>
<%--        <div class="item" id="qaMerkmalChartDiv">--%>
<%--        </div>--%>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        <%--$('#qaPlChartDiv').load('<%=basePath%>baqb/initQaProductLinePage');--%>
        $('#qaPlChartDiv').load('<%=basePath%>baqb/initQaProductLinePage');
    })
</script>
</body>
</html>