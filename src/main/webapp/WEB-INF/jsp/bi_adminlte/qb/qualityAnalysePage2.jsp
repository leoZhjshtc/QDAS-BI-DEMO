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
        <div class="item active">
            <div id="qaPlChartDiv"></div>
        </div>
        <div class="item">
            <div id="qaProcessChartDiv"></div>
        </div>
        <div class="item">
            <div id="qaMerkmalChartDiv"></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $('#qaChartCarousel').carousel('pause');
        $('#qaPlChartDiv').load('<%=basePath%>baqb/initQaProductLinePage');
    })
</script>
</body>
</html>
