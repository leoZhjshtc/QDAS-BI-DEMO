<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
</head>
<body>
<div id="plCarousel" class="carousel slide carousel-vertical" data-wrap="false"
     data-interval="false">
    <%--<ol class="carousel-indicators">
        <li data-target="#plCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#plCarousel" data-slide-to="1" class=""></li>
        <li data-target="#plCarousel" data-slide-to="2" class=""></li>
    </ol>--%>
    <div class="carousel-inner">
        <div class="item active">
            <div id="plDiv">
            </div>
        </div>
        <div class="item">
            <div id="processDiv"></div>
        </div>
        <div class="item">
            <%--<div id="merkmalDiv"></div>--%>
            <div class="nav-tabs-custom bg-teal">
                <ul class="nav nav-tabs bg-teal">
                    <li class="active"><a href="#merkmalDiv" data-toggle="tab">参数看板</a></li>
                    <li><a href="#merkmalDetails" data-toggle="tab" onclick="initMerkmalDetails()">参数详情</a></li>
                </ul>
                <div class="tab-content bg-teal">
                    <div class="tab-pane active" id="merkmalDiv">
                    </div>
                    <div class="tab-pane" id="merkmalDetails">
                    </div>

                </div>
            </div>
        </div>
    </div>
    <%--<a class="left carousel-control" href="#plCarousel" data-slide="prev">
        <span class="fa fa-angle-left"></span>
    </a>
    <a class="right carousel-control" href="#plCarousel" data-slide="next">
        <span class="fa fa-angle-right"></span>
    </a>--%>
</div>

<script type="text/javascript">
    $(function () {
        $('#plCarousel').carousel('pause');
        $('#plDiv').load('<%=basePath%>baqb/initPruductLineQbPage'/*, {
            startTime: startTime,
            endTime: endTime
        }*/);
    })
    $('#plCarousel').on('slide.bs.carousel', function (obj) {
        // 当前轮播索引
        var index = $(this).find('.item').index(obj.relatedTarget);
        console.log("索引:" + index);
        qbCarouselIndex = index;
    });

    function initMerkmalDetails() {
        $('#merkmalDetails').load('<%=basePath%>baqb/initQaMerkmalPage', {
            teilId: $('#qbTeilIdValue').val()/*,
            startTime: startTime,
            endTime: endTime*/
        });
    }
</script>
</body>
</html>