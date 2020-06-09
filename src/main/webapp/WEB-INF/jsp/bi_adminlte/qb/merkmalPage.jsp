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
<input type="hidden" value="${qbTeilIdValue}" id="qbTeilIdValue">
<div class="row" id="merkmalRow">
    <c:forEach items="${merkmalList}" var="pl" varStatus="index">
        <c:choose>
            <c:when test="${pl.qualityLevel==\"0\"}">
                <div class="col-md-3 col-xs-12 col-sm-6" id="merkmalDiv${pl.MEMERKMAL}">
                    <!-- small box -->
                    <div class="small-box bg-green">
                        <div class="inner">
                            <h4>合格率：${pl.passrate}</h4>
                            <p>${pl.MEMERKBEZ} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i id="merkmal${index.index}" datamerkmal="${pl.MEMERKMAL}" class="ion ion-pie-graph merkmalchangeion"></i>
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getChart(this,'${pl.WVTEIL}','${pl.MEMERKMAL}');">
                            查看单值图 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
            <c:when test="${pl.qualityLevel==\"2\"}">
                <div class="col-md-3 col-xs-12 col-sm-6" id="merkmalDiv${pl.MEMERKMAL}">
                    <!-- small box -->
                    <div class="small-box bg-red">
                        <div class="inner">
                            <h4>合格率：${pl.passrate}%</h4>
                            <p>${pl.MEMERKBEZ} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i id="merkmal${index.index}" datamerkmal="${pl.MEMERKMAL}" class="ion ion-pie-graph merkmalchangeion"></i>  <%--ion-checkmark-circled--%>
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getChart(this,'${pl.WVTEIL}','${pl.MEMERKMAL}');">
                            查看单值图 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
        </c:choose>
    </c:forEach>
</div>
<script type="text/javascript">
    var clickIndex=0;
    $(function () {
        //$('#merkmal0').removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        $('#merkmal0').parent('div').next().click();
    })
    function getChart(ele,teilId,merkmalId) {
        $('#merkmalRow').find('.merkmalchangeion').each(function (index,ele) {
            $(ele).removeClass('ion-checkmark-circled').addClass('ion-pie-graph');
        })
        $(ele).prev('div').children('i').removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        initMerkmalChart(teilId,merkmalId);
        if(clickIndex!=0){
            window.location.href = '#maodian1';
        }
        clickIndex=1;
    }
</script>
</body>
</html>
