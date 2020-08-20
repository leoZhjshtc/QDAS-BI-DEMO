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
<input type="hidden" value="${qbTeilNumValue}" id="qbTeilNumValue">
<input type="hidden" value="${qbTeilNameValue}" id="qbTeilNameValue">
<input type="hidden" value="${qbTeilK1003Value}" id="qbTeilK1003Value">
<div class="row" id="processRow">
    <c:forEach items="${processList}" var="pl" varStatus="index">
        <c:choose>
            <c:when test="${pl.qualityLevel==\"0\"}">
                <div class="col-md-3 col-xs-12 col-sm-6">
                    <!-- small box -->
                    <div class="small-box bg-green">
                        <div class="inner">
                            <h4>合格率：${pl.passrate}%</h4>
                            <p>${pl.TEAUFTRAGSTR} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i class="ion ion-pie-graph processchangeion"></i>
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getMerkmal(this,'${pl.TETEIL}','${pl.TEAUFTRAGSTR}');">
                            查看参数 <i class="fa fa-arrow-circle-right"></i>
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
                            <p>${pl.TEAUFTRAGSTR} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i class="ion ion-pie-graph processchangeion"></i>  <%--ion-checkmark-circled--%>
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getMerkmal(this,'${pl.TETEIL}','${pl.TEAUFTRAGSTR}');">
                            查看参数 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
        </c:choose>
    </c:forEach>
</div>
<script type="text/javascript">
    function getMerkmal(ele,teilId,process) {
        $('#processRow').find('.processchangeion').each(function (index,ele) {
            $(ele).removeClass('ion-checkmark-circled').addClass('ion-pie-graph');
        })
        $(ele).prev('div').children('i').removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        $('#plCarousel').carousel('next');
        // var ifQbSerchWertCount=0
        // if($('#searchByWertCheckbox').prop('checked')){
        //     ifQbSerchWertCount=1
        // }
        $('#merkmalDiv').load('<%=basePath%>baqb/initMerkmalQbPage',{teilId:teilId,startTime: startTime,endTime: endTime,ifFirstOpenMerkmal:"1"});
        $('#plChartCarousel').carousel('next');
        $('#qaChartCarousel').carousel('next');
        $('#qaMerkmalChartDiv').load('<%=basePath%>baqb/initQaMerkmalPage',{teilId:teilId,startTime:startTime,endTime:endTime});
        $('#mmDetailsTableDiv').empty();

        $('#qbTitle2').html("->"+process);
        $('#mmTitle2').html("->"+process);
        $('#qaTitle2').html("->"+process);
    }
</script>
</body>
</html>
