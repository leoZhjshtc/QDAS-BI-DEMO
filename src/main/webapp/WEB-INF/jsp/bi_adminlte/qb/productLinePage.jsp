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
<div id="plRow">
    <%--<c:forEach items="${plList}" var="pl" varStatus="index">
        <c:choose>
            <c:when test="${pl.qualityLevel==\"0\"}">
                <div class="col-md-3 col-xs-12 col-sm-6">
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
                        <a class="small-box-footer" style="cursor:pointer"
                           onclick="getProcess(this,'${pl.TETEILNR}','${pl.TEBEZEICH}','${pl.TEKURZBEZEICH}');">
                            查看零件 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
            <c:when test="${pl.qualityLevel==\"2\"}">
                <div class="col-md-3 col-xs-12 col-sm-6">
                    <div class="small-box bg-red">
                        <div class="inner">
                            <h4>合格率：${pl.passrate}%</h4>
                            <p>${pl.TETEILNR} </p>
                            <p>${pl.TEBEZEICH} </p>
                            <p>${pl.TEKURZBEZEICH} </p>
                        </div>
                        <div class="icon" style="position: absolute;top: 5px;">
                            <i class="ion ion-pie-graph plchangeion"></i> &lt;%&ndash;ion-checkmark-circled&ndash;%&gt;
                        </div>
                        <a class="small-box-footer" style="cursor:pointer"
                           onclick="getProcess(this,'${pl.TETEILNR}','${pl.TEBEZEICH}','${pl.TEKURZBEZEICH}');">
                            查看零件 <i class="fa fa-arrow-circle-right"></i>
                        </a>
                    </div>
                </div>
            </c:when>
        </c:choose>
    </c:forEach>--%>
</div>
<script type="text/javascript">
    var mmProcessParamsObj = new Object();
    $(function () {
        $.ajax({
            type:'post',
            url:'<%=basePath%>baqb/getPruductLineQbData',
            data:{
                startTime: startTime,
                endTime: endTime
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
                            "<p>"+data[i].TETEILNR+"</p>"+
                            "<p>"+data[i].TEBEZEICH+"</p>"+
                            "<p>"+data[i].TEKURZBEZEICH+"</p>"+
                            "</div>"+
                            "<div class=\"icon\" style=\"position: absolute;top: 5px;\">"+
                            "<i class=\"ion ion-pie-graph plchangeion\"></i>"+
                            "</div>"+
                            "<a class=\"small-box-footer\" style=\"cursor:pointer\" onclick=\"getProcess(this,"+data[i].TETEILNR+",'"+data[i].TEBEZEICH+"','"+data[i].TEKURZBEZEICH+"');\">查看零件 <i class=\"fa fa-arrow-circle-right\"></i></a>"+
                            "</div>"+
                            "</div>";
                        $('#plRow').append(appendDivG);
                    } else {
                        var appendDivG= "<div class=\"col-md-3 col-xs-12 col-sm-6\">"+
                            "<div class=\"small-box bg-green\">"+
                            "<div class=\"inner\">"+
                            "<h4>合格率：100%</h4>"+
                            "<p>"+data[i].TETEILNR+"</p>"+
                            "<p>"+data[i].TEBEZEICH+"</p>"+
                            "<p>"+data[i].TEKURZBEZEICH+"</p>"+
                            "</div>"+
                            "<div class=\"icon\" style=\"position: absolute;top: 5px;\">"+
                            "<i class=\"ion ion-pie-graph plchangeion\"></i>"+
                            "</div>"+
                            "<a class=\"small-box-footer\" style=\"cursor:pointer\" onclick=\"getProcess(this,"+data[i].TETEILNR+",'"+data[i].TEBEZEICH+"','"+data[i].TEKURZBEZEICH+"');\">查看零件 <i class=\"fa fa-arrow-circle-right\"></i></a>"+
                            "</div>"+
                            "</div>";
                        $('#plRow').append(appendDivG);
                    }
                }
            }
        })
    })

    function getProcess(ele, teilNum, teilName, teilK1003) {
        $('#plRow').find('.plchangeion').each(function (index, ele) {
            $(ele).removeClass('ion-checkmark-circled').addClass('ion-pie-graph');
        })
        $(ele).prev('div').children('i').removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        $('#plCarousel').carousel('next');
        // var ifQbSerchWertCount=0
        // if($('#searchByWertCheckbox').prop('checked')){
        //     ifQbSerchWertCount=1
        // }
        $('#processDiv').load('<%=basePath%>baqb/initProcessQbPage', {
            teilNum: teilNum,
            teilName: teilName,
            teilK1003: teilK1003/*,
            startTime: startTime,
            endTime: endTime*/
        });
        $('#plChartCarousel').carousel('next');
        $('#qaChartCarousel').carousel('next');
        if (manyMmchartArr !== undefined) {
            manyMmchartArr = [];
        }
        mmProcessParamsObj.teilNum = teilNum;
        mmProcessParamsObj.teilName = teilName;
        mmProcessParamsObj.teilK1003 = teilK1003;
        $('#qaProcessChartDiv').load('<%=basePath%>baqb/initQaProcessPage', {
            teilNum: teilNum,
            teilName: teilName,
            teilK1003: teilK1003
        });
        $('#processChartDiv').empty();
        initProcessMmChart(teilNum, teilName, teilK1003);
        // $('#mmDetailsTableDiv').empty();
        $('#qbTitle1').html(teilNum + '/' + teilName + '/' + teilK1003);
        $('#mmTitle1').html(teilNum + '/' + teilName + '/' + teilK1003);
        $('#qaTitle1').html(teilNum + '/' + teilName + '/' + teilK1003);
    }
</script>
</body>
</html>
