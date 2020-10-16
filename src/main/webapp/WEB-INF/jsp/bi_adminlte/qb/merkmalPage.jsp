<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<input type="hidden" value="${qbTeilIdValue}" id="qbTeilIdValue">
<div class="row" id="merkmalRow">
    <%--<c:forEach items="${merkmalList}" var="pl" varStatus="index">
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
                            <input type="hidden" value="${pl.MEMERKMAL}">
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getChart(this,'${pl.WVTEIL}','${pl.MEMERKMAL}');" data-toggle="modal" data-target="#dzt-modal-default">
                            查看统计图形 <i class="fa fa-arrow-circle-right"></i>
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
                            <i id="merkmal${index.index}" datamerkmal="${pl.MEMERKMAL}" class="ion ion-pie-graph merkmalchangeion"></i>  &lt;%&ndash;ion-checkmark-circled&ndash;%&gt;
                            <input type="hidden" value="${pl.MEMERKMAL}">
                        </div>
                        <a class="small-box-footer" style="cursor:pointer" onclick="getChart(this,'${pl.WVTEIL}','${pl.MEMERKMAL}');" data-toggle="modal" data-target="#dzt-modal-default">
                            查看统计图形 <i class="fa fa-arrow-circle-right"></i>
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
                url:'<%=basePath%>baqb/getMerkmalQbData',
                data:{
                    startTime: startTime,
                    endTime: endTime,
                    teilId: $('#qbTeilIdValue').val()
                },
                success:function (data) {
                    for(var i=0;i<data.length;i++){
                        var wvList = data[i].wvList;
                        var nokcount = 0;
                        var totalcount = wvList.length;
                        if(data[i].MEMERKART!=='1'){
                            if(overallDicideStandardType==='1'){
                                var obj=toleranceChange(data[i].MEUGW,data[i].MEOGW,$('#toleranceMultiple').val());
                                data[i].newmeugw=obj.meugw;
                                data[i].newmeogw=obj.meogw;
                            }else{
                                var obj=toleranceChange(data[i].MEUGW,data[i].MEOGW,$('#warningLimitMultiple').val());
                                data[i].newmeugw=obj.meugw;
                                data[i].newmeogw=obj.meogw;
                            }
                        }
                        for(var j=0;j<wvList.length;j++){
                            if(data[i].MEMERKART ==='1'){
                                if (wvList[j].WVWERT.toString().indexOf('.') !== 0 & parseFloat(wvList[j].WVWERT.toString().substring(wvList[j].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                    nokcount += 1;
                                }
                            }else{
                                if ((!isBlank(data[i].newmeugw) & parseFloat(data[i].newmeugw) > parseFloat(wvList[j].WVWERT))
                                    | (!isBlank(data[i].newmeogw)& parseFloat(data[i].newmeogw) < parseFloat(wvList[j].WVWERT))) {
                                    nokcount += 1;
                                }
                            }
                        }
                        var okcount = totalcount - nokcount;
                        var passrate = (parseFloat(okcount) * 100 / parseFloat(totalcount)).toFixed(2);
                        if (nokcount > 0) {
                            var appendDiv="<div class=\"col-md-3 col-xs-12 col-sm-6\" id=\"merkmalDiv"+data[i].MEMERKMAL+"\">"+
                                            "<div class=\"small-box bg-red\">"+
                                            "<div class=\"inner\">"+
                                            "<h4>合格率："+passrate+"%</h4>"+
                                            "<p>"+data[i].MEMERKBEZ+"</p>"+
                                            "</div>"+
                                             "<div class=\"icon\" style=\"position: absolute;top: 5px;\">"+
                                            "<i id=\"merkmal"+i+"\" datamerkmal=\""+data[i].MEMERKMAL+"\" class=\"ion ion-pie-graph merkmalchangeion\"></i>"+
                                            "<input type=\"hidden\" value=\""+data[i].MEMERKMAL+"\">"+
                                            "</div>"+
                                            "<a class=\"small-box-footer\" style=\"cursor:pointer\" onclick=\"getChart(this,"+data[i].WVTEIL+",'"+data[i].MEMERKMAL+"');\" data-toggle=\"modal\" data-target=\"#dzt-modal-default\">"+
                                           " 查看统计图形 <i class=\"fa fa-arrow-circle-right\"></i></a></div></div>"
                            $('#merkmalRow').append(appendDiv);
                        } else {
                            var appendDiv="<div class=\"col-md-3 col-xs-12 col-sm-6\" id=\"merkmalDiv"+data[i].MEMERKMAL+"\">"+
                                "<div class=\"small-box bg-green\">"+
                                "<div class=\"inner\">"+
                                "<h4>合格率："+passrate+"%</h4>"+
                                "<p>"+data[i].MEMERKBEZ+"</p>"+
                                "</div>"+
                            "<div class=\"icon\" style=\"position: absolute;top: 5px;\">"+
                            "<i id=\"merkmal"+i+"\" datamerkmal=\""+data[i].MEMERKMAL+"\" class=\"ion ion-pie-graph merkmalchangeion\"></i>"+
                            "<input type=\"hidden\" value=\""+data[i].MEMERKMAL+"\">"+
                            "</div>"+
                            "<a class=\"small-box-footer\" style=\"cursor:pointer\" onclick=\"getChart(this,"+data[i].WVTEIL+",'"+data[i].MEMERKMAL+"');\" data-toggle=\"modal\" data-target=\"#dzt-modal-default\">"+
                            " 查看统计图形 <i class=\"fa fa-arrow-circle-right\"></i></a></div></div>"
                            $('#merkmalRow').append(appendDiv);
                        }
                    }
                }
            })
        })
    })
    function getChart(ele,teilId,merkmalId) {
        var ww= $(window).width();
        var hh=$(window).height();
        $('#modal_panel').parent().css("margin-left",ww*0.05);
        $('#modal_panel').width(ww*0.9);
        $('#modalChart').width(ww*0.85);
        $('#modalChart').height(hh*0.7);
        dztSearchTeil=teilId;
        dztSearchMerkmal=merkmalId;
        $('#merkmalRow').find('.merkmalchangeion').each(function (index,ele) {
            $(ele).removeClass('ion-checkmark-circled').addClass('ion-pie-graph');
        })
        $(ele).prev('div').children('i').removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        initMerkmalChart(teilId,merkmalId);
        getKztDataXR(teilId,merkmalId);
    }
</script>
</body>
</html>
