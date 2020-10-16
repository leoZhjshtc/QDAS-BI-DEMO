<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
</head>
<body>
<input type="hidden" value="${qbTeilNumValue}" id="qbTeilNumValue">
<input type="hidden" value="${qbTeilNameValue}" id="qbTeilNameValue">
<input type="hidden" value="${qbTeilK1003Value}" id="qbTeilK1003Value">
<div class="row" id="processRow">
    <%--<c:forEach items="${processList}" var="pl" varStatus="index">
        <c:choose>
            <c:when test="${pl.qualityLevel==\"0\"}">
                <div class="col-md-3 col-xs-12 col-sm-6">
                    <!-- small box -->
                    <div class="small-box bg-green">
                        <div class="inner">
                            <h4>合格率：${pl.passrate}</h4>
                            <p>${pl.TEAUFTRAGSTR} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i class="ion ion-pie-graph processchangeion"></i>
                        </div>
                        <a class="small-box-footer" style="cursor:pointer"
                           onclick="getMerkmal(this,'${pl.TETEIL}','${pl.TEAUFTRAGSTR}');">
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
                            <i class="ion ion-pie-graph processchangeion"></i> &lt;%&ndash;ion-checkmark-circled&ndash;%&gt;
                        </div>
                        <a class="small-box-footer" style="cursor:pointer"
                           onclick="getMerkmal(this,'${pl.TETEIL}','${pl.TEAUFTRAGSTR}');">
                            查看参数 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
        </c:choose>
    </c:forEach>--%>
</div>
<script type="text/javascript">
    $(function () {
        $(function () {
            $.ajax({
                type:'post',
                url:'<%=basePath%>baqb/getProcessQbData',
                data:{
                    startTime: startTime,
                    endTime: endTime,
                    teilNum: $('#qbTeilNumValue').val(),
                    teilName: $('#qbTeilNameValue').val(),
                    teilK1003: $('#qbTeilK1003Value').val(),
                },
                success:function (data) {
                    for(var i=0;i<data.length;i++){
                        var meList = data[i].meList;
                        var nokcount = 0;
                        var totalcount = 0;
                        for(var j=0;j<meList.length;j++){
                            var wvList = meList[j].wvList;
                            totalcount+=wvList.length;
                            if(meList[j].MEMERKART!=='1'){
                                if(overallDicideStandardType==='1'){
                                    var obj=toleranceChange(meList[j].MEUGW,meList[j].MEOGW,$('#toleranceMultiple').val());
                                    meList[j].newmeugw=obj.meugw;
                                    meList[j].newmeogw=obj.meogw;
                                }else{
                                    var obj=toleranceChange(meList[j].MEUGW,meList[j].MEOGW,$('#warningLimitMultiple').val());
                                    meList[j].newmeugw=obj.meugw;
                                    meList[j].newmeogw=obj.meogw;
                                }
                            }
                            for(var k=0;k<wvList.length;k++){
                                if(meList[j].MEMERKART ==='1'){
                                    if (wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(wvList[k].WVWERT.toString().substring(wvList[k].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                        nokcount += 1;
                                    }
                                }else{
                                    if ((!isBlank(meList[j].newmeugw) & parseFloat(meList[j].newmeugw) > parseFloat(wvList[k].WVWERT))
                                        | (!isBlank(meList[j].newmeogw)& parseFloat(meList[j].newmeogw) < parseFloat(wvList[k].WVWERT))) {
                                        nokcount += 1;
                                    }
                                }
                            }
                        }
                        if (nokcount > 0) {
                            var okcount = totalcount - nokcount;
                            var passrate = (parseFloat(okcount) * 100 / parseFloat(totalcount)).toFixed(2);
                            var appendDivG= "<div class=\"col-md-3 col-xs-12 col-sm-6\">"+
                                "<div class=\"small-box bg-red\">"+
                                "<div class=\"inner\">"+
                                "<h4>合格率："+passrate+"%</h4>"+
                                "<p>"+data[i].TEAUFTRAGSTR+"</p>"+
                                "</div>"+
                                "<div class=\"icon\" style=\"position: absolute;top: 5px;\">"+
                                "<i class=\"ion ion-pie-graph plchangeion\"></i>"+
                                "</div>"+
                                "<a class=\"small-box-footer\" style=\"cursor:pointer\" onclick=\"getMerkmal(this,"+data[i].TETEIL+",'"+data[i].TEAUFTRAGSTR+"');\">查看参数 <i class=\"fa fa-arrow-circle-right\"></i></a>"+
                                "</div>"+
                                "</div>";
                            $('#processRow').append(appendDivG);
                        } else {
                            var appendDivG= "<div class=\"col-md-3 col-xs-12 col-sm-6\">"+
                                "<div class=\"small-box bg-green\">"+
                                "<div class=\"inner\">"+
                                "<h4>合格率：100%</h4>"+
                                "<p>"+data[i].TEAUFTRAGSTR+"</p>"+
                                "</div>"+
                                "<div class=\"icon\" style=\"position: absolute;top: 5px;\">"+
                                "<i class=\"ion ion-pie-graph plchangeion\"></i>"+
                                "</div>"+
                                "<a class=\"small-box-footer\" style=\"cursor:pointer\" onclick=\"getMerkmal(this,"+data[i].TETEIL+",'"+data[i].TEAUFTRAGSTR+"');\">查看参数 <i class=\"fa fa-arrow-circle-right\"></i></a>"+
                                "</div>"+
                                "</div>";
                            $('#processRow').append(appendDivG);
                        }
                    }
                }
            })
        })
    })
    function getMerkmal(ele, teilId, process) {
        $('#processRow').find('.processchangeion').each(function (index, ele) {
            $(ele).removeClass('ion-checkmark-circled').addClass('ion-pie-graph');
        })
        $(ele).prev('div').children('i').removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        $('#plCarousel').carousel('next');
        // var ifQbSerchWertCount=0
        // if($('#searchByWertCheckbox').prop('checked')){
        //     ifQbSerchWertCount=1
        // }
        $('#merkmalDiv').load('<%=basePath%>baqb/initMerkmalQbPage', {
            teilId: teilId/*,
            startTime: startTime,
            endTime: endTime*/
        });
        // $('#plChartCarousel').carousel('next');
        // $('#qaChartCarousel').carousel('next');
        <%--$('#qaMerkmalChartDiv').load('<%=basePath%>baqb/initQaMerkmalPage',{teilId:teilId,startTime:startTime,endTime:endTime});--%>
        // $('#mmDetailsTableDiv').empty();

        $('#qbTitle2').html("->" + process);
        // $('#mmTitle2').html("->"+process);
        // $('#qaTitle2').html("->"+process);
    }
</script>
</body>
</html>
