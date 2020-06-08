<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
</head>
<body>
<div id="plRow">
    <c:forEach items="${plList}" var="pl" varStatus="index">
        <c:choose>
            <c:when test="${pl.qualityLevel==\"0\"}">
                <div class="col-md-3 col-xs-12 col-sm-6">
                    <!-- small box -->
                    <div class="small-box bg-green">
                        <div class="inner">
                            <h4>合格率：${pl.passrate}</h4>
                            <p>${pl.TETEILNR} </p>
                            <p>${pl.TEBEZEICH} </p>
                            <p>${pl.TEKURZBEZEICH} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i class="ion ion-pie-graph plchangeion"></i>
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getProcess(this,'${pl.TETEILNR}','${pl.TEBEZEICH}','${pl.TEKURZBEZEICH}');">
                            查看零件 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
            <c:when test="${pl.qualityLevel==\"2\"}">
                <div class="col-md-3 col-xs-12 col-sm-6">
                    <!-- small box -->
                    <div class="small-box bg-red">
                        <div class="inner">
                            <h4>合格率：${pl.passrate}%</h4>
                            <p>${pl.TETEILNR} </p>
                            <p>${pl.TEBEZEICH} </p>
                            <p>${pl.TEKURZBEZEICH} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i class="ion ion-pie-graph plchangeion"></i>  <%--ion-checkmark-circled--%>
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getProcess(this,'${pl.TETEILNR}','${pl.TEBEZEICH}','${pl.TEKURZBEZEICH}');">
                            查看零件 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
        </c:choose>
    </c:forEach>
</div>
<script type="text/javascript">
    function getProcess(ele,teilNum,teilName,teilK1003) {
        $('#plRow').find('.plchangeion').each(function (index,ele) {
            $(ele).removeClass('ion-checkmark-circled').addClass('ion-pie-graph');
        })
        $(ele).prev('div').children('i').removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        $('#plCarousel').carousel('next');
        $('#processDiv').load('<%=basePath%>baqb/initProcessQbPage',{teilNum:teilNum,teilName:teilName,teilK1003:teilK1003,startTime:startTime,endTime:endTime});
        $('#plChartCarousel').carousel('next');
        $('#qaChartCarousel').carousel('next');
        $('#qaProcessChartDiv').load('<%=basePath%>baqb/initQaProcessPage',{teilNum:teilNum,teilName:teilName,teilK1003:teilK1003});
        initProcessMmChart(teilNum,teilName,teilK1003);
        $('#mmDetailsTableDiv').empty();
        $('#qbTitle1').html(teilNum+'/'+teilName+'/'+teilK1003);
        $('#mmTitle1').html(teilNum+'/'+teilName+'/'+teilK1003);
        $('#qaTitle1').html(teilNum+'/'+teilName+'/'+teilK1003);
    }
</script>
</body>
</html>
