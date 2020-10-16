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
<input type="hidden" id="qaMerkmalTeilIdValue" value="${qaMerkmalTeilIdValue}">
<table class="table table-condensed" id="medTable">
    <tr>
        <th style="width: 10px">#</th>
        <th>参数名</th>
        <th>名义值</th>
        <th>下公差</th>
        <th>上公差</th>
        <th>下警戒限</th>
        <th>上警戒限</th>
        <th>单位</th>
        <th>合格率</th>
        <th>近25条</th>
        <th>近25条折线</th>
        <th>箱形图</th>
        <th>CPK</th>
        <th>操作</th>
    </tr>
    <%--<c:forEach items="${qaMerkmalList}" var="list" varStatus="index">
        <tr onclick="merkmalRowClick('${list.METEIL}','${list.MEMERKMAL}')" class="qaMerkmalHandRow" data-toggle="modal" data-target="#dzt-modal-default">
            <td>${list.MEMERKMAL}</td>
            <td>${list.MEMERKBEZ}</td>
            <td>${list.MENENNMAS}</td>
            <td>${list.MEUGW}</td>
            <td>${list.MEOGW}</td>
            <td>${list.NEWMEUGW}</td>
            <td>${list.NEWMEOGW}</td>
            <td>${list.MEEINHEITTEXT}</td>
            <c:choose>
                <c:when test="${list.qualityLevel==\"0\"}">
                    <td><span class="badge bg-green">${list.passrate}</span></td>
                </c:when>
                <c:when test="${list.qualityLevel==\"2\"}">
                    <td><span class="badge bg-red">${list.passrate}%</span></td>
                </c:when>
            </c:choose>
            <td><span class="sparktristate">${list.barStr}</span><br></td>
            <td>
                <c:if test="${list.MEMERKART!=\"1\"}">
                    <span class="normalline" sparkNormalRangeMin="${list.MEUGW}" sparkNormalRangeMax="${list.MEOGW}" sparkHeight="30px" sparkWidth="150px"
                     sparkSpotColor="false" sparkSpotRadius="3" sparkFillColor="false" sparkValueSpots="{':2': 'red', '5:': 'red'}" sparkMinSpotColor="false" sparkMaxSpotColor="false">
                            ${list.lineStr}</span>
                </c:if>
            </td>
            <td  onclick="merkmalRowClick('${list.METEIL}','${list.MEMERKMAL}')">
                <c:if test="${list.MEMERKART!=\"1\"}">
                    <span class="sparkboxplotraw" sparkType="box" sparkRaw="false" sparkShowOutliers="false" sparkTarget="${list.MENENNMAS}" sparkHeight="30px" sparkWidth="100px"
                          >${list.boxPlotStr}</span>
                    &lt;%&ndash;<span class="sparkboxplot">
                        652.42676,652.77734,652.9035,653.0287,653.1145,652.8634,652.69037,652.49115,652.9948,653.162,653.09937,652.67285,652.495,652.78033,653.1086,653.13416,653.2775,652.3883,653.254,652.56805
                    </span>&ndash;%&gt;
                </c:if>
            </td>
            <td id="cpk${list.METEIL}${list.MEMERKMAL}"></td>
            <td>
                <button type="button" class="btn btn-info btn-xs" onclick="getCpkData(1,'${list.METEIL}','${list.MEMERKMAL}');">近125条数据CPK</button>
                <button type="button" class="btn btn-info btn-xs" onclick="getCpkData(2,'${list.METEIL}','${list.MEMERKMAL}');">时间查询CPK</button>
            </td>
        </tr>
    </c:forEach>--%>
</table>
<style>
    .qaMerkmalHandRow{
        cursor: pointer;
    }
</style>
<script type="text/javascript"
        src="<%=basePath%>resources/AdminLTE/bower_components/jquery-sparkline/dist/jquery.sparkline.js"></script>
<script type="text/javascript">
    $(function () {
        $.ajax({
            type:'post',
            url:'<%=basePath%>baqb/getQaMerkmalData',
            data:{
                startTime: startTime,
                endTime: endTime,
                teilId: $('#qaMerkmalTeilIdValue').val()
            },
            cache:false,
            async:false,
            success:function (data) {
                for(var i=0;i<data.length;i++){
                    var newTol=toleranceChange(data[i].MEUGW,data[i].MEOGW,$('#toleranceMultiple').val());
                    var newWarn=toleranceChange(data[i].MEUGW,data[i].MEOGW,$('#warningLimitMultiple').val());
                    //小数点。。。
                    var fixCount=0;
                    var fixstr;
                    if(!isBlank(data[i].MEUGW)&&data[i].MEUGW.toString().indexOf('.')>-1){
                        fixstr=data[i].MEUGW.toString().substring(data[i].MEUGW.toString().indexOf('.')+1)
                    }else if(!isBlank(data[i].MEOGW)&&data[i].MEOGW.toString().indexOf('.')>-1){
                        fixstr=data[i].MEOGW.toString().substring(data[i].MEOGW.toString().indexOf('.')+1)
                    }
                    if(!isBlank(fixstr)){
                        fixCount=fixstr.length;
                    }
                    //小数点。。。
                    data[i].newMEUGW=newTol.meugw!==undefined?newTol.meugw.toFixed(fixCount+2):"";
                    data[i].newMEOGW=newTol.meogw!==undefined?newTol.meogw.toFixed(fixCount+2):"";
                    data[i].downWarn=newWarn.meugw!==undefined?newWarn.meugw.toFixed(fixCount+2):"";
                    data[i].upWarn=newWarn.meogw!==undefined?newWarn.meogw.toFixed(fixCount+2):"";
                    var wvList = data[i].wvList;
                    var nokcount=0;
                    var totalcount=wvList.length;
                    var barSb=new Array();
                    var lineList=new Array();
                    for(var j=0;j<wvList.length;j++){
                        if(data[i].MEMERKART ==='1'){
                            if (wvList[j].WVWERT.toString().indexOf('.') !== 0 & parseFloat(wvList[j].WVWERT.toString().substring(wvList[j].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                nokcount += 1;
                                barSb.push(1);
                            }else{
                                barSb.push(0);
                            }
                        }else{
                            lineList.push(wvList[j].WVWERT);
                            var downlimit,uplimit;
                            if(overallDicideStandardType==='1'){
                                downlimit=data[i].newMEUGW;
                                uplimit=data[i].newMEOGW;
                            }else{
                                downlimit=data[i].downWarn;
                                uplimit=data[i].upWarn;
                            }
                            if (!isBlank(downlimit) & parseFloat(downlimit) > parseFloat(wvList[j].WVWERT)) {
                                nokcount += 1;
                                barSb.push(-1);
                            }else if(!isBlank(uplimit)& parseFloat(uplimit) < parseFloat(wvList[j].WVWERT)){
                                nokcount += 1;
                                barSb.push(1);
                            }else{
                                barSb.push(0);
                            }
                        }
                    }
                    var okcount = totalcount - nokcount;
                    var passrate = (parseFloat(okcount) * 100 / parseFloat(totalcount)).toFixed(2);
                    var barStr;
                    if(barSb.length>25){
                        barStr=barSb.slice(barSb.length-25).join(',');
                    }else{
                        barStr=barSb.join(',')
                    }
                    var appendRow;
                    var passrateStr;
                    if(nokcount>0){
                        passrateStr="<td><span class=\"badge bg-red\">"+passrate+"%</span></td>";
                    }else{
                        passrateStr="<td><span class=\"badge bg-green\">"+passrate+"%</span></td>";
                    }
                    if(data[i].MEMERKART =='1'){
                        appendRow="<tr onclick=\"merkmalRowClick('"+data[i].METEIL+"','"+data[i].MEMERKMAL+"')\" class=\"qaMerkmalHandRow\" data-toggle=\"modal\" data-target=\"#dzt-modal-default\">"+
                            "<td>"+data[i].MEMERKMAL+"</td>"+
                            "<td>"+data[i].MEMERKBEZ+"</td>"+
                            "<td></td>"+
                            "<td></td>"+
                            "<td></td>"+
                            "<td></td>"+
                            "<td></td>"+
                            "<td></td>"+
                            passrateStr+
                            "<td><span class=\"sparktristate\">"+barStr+"</span><br></td>"+
                            "<td>"+
                            /*"<span class=\"normalline\" sparkNormalRangeMin=\""+data[i].MEUGW+"\" sparkNormalRangeMax=\""+data[i].MEOGW+"\" sparkHeight=\"30px\" sparkWidth=\"150px\""+
                            "sparkSpotColor=\"false\" sparkSpotRadius=\"3\" sparkFillColor=\"false\" sparkValueSpots=\"{':2': 'red', '5:': 'red'}\" sparkMinSpotColor=\"false\" sparkMaxSpotColor=\"false\">"+
                            lineStr+"</span>"+*/
                            "</td>"+
                            "<td>"+
                            /*"<span class=\"sparkboxplotraw\" sparkType=\"box\" sparkRaw=\"false\" sparkShowOutliers=\"false\" sparkTarget=\""+data[i].MENENNMAS+"\" sparkHeight=\"30px\" sparkWidth=\"100px\">"+
                            lineStr+"</span>"+*/
                            "</td>"+
                            "<td id=\"cpk"+data[i].METEIL+data[i].MEMERKMAL+"\"></td>"+
                            "<td>"+
                            "<button type=\"button\" class=\"btn btn-info btn-xs\" onclick=\"getCpkData(1,'"+data[i].METEIL+"','"+data[i].MEMERKMAL+"');\">近125条数据CPK</button>"+
                            "<button type=\"button\" class=\"btn btn-info btn-xs\" onclick=\"getCpkData(2,'"+data[i].METEIL+"','"+data[i].MEMERKMAL+"');\">时间查询CPK</button>"+
                            "</td>"+
                            "</tr>";
                    }else{
                        var lineStr;
                        if(lineList.length>25){
                            lineStr=lineList.slice(lineList.length-25).join(',');
                        }else{
                            lineStr=lineList.join(',');
                        }
                        var MENENNMAS=data[i].MENENNMAS!==undefined?data[i].MENENNMAS:"";
                        appendRow="<tr onclick=\"merkmalRowClick('"+data[i].METEIL+"','"+data[i].MEMERKMAL+"')\" class=\"qaMerkmalHandRow\" data-toggle=\"modal\" data-target=\"#dzt-modal-default\">"+
                            "<td>"+data[i].MEMERKMAL+"</td>"+
                            "<td>"+data[i].MEMERKBEZ+"</td>"+
                            "<td>"+MENENNMAS+"</td>"+
                            "<td>"+data[i].newMEUGW+"</td>"+
                            "<td>"+data[i].newMEOGW+"</td>"+
                            "<td>"+data[i].downWarn+"</td>"+
                            "<td>"+data[i].upWarn+"</td>"+
                            "<td>"+data[i].MEEINHEITTEXT+"</td>"+
                            passrateStr+
                            "<td><span class=\"sparktristate\">"+barStr+"</span><br></td>"+
                            "<td>"+
                            "<span class=\"normalline\" sparkNormalRangeMin=\""+data[i].newMEUGW+"\" sparkNormalRangeMax=\""+data[i].newMEOGW+"\" sparkHeight=\"30px\" sparkWidth=\"150px\""+
                            "sparkSpotColor=\"false\" sparkSpotRadius=\"3\" sparkFillColor=\"false\" sparkValueSpots=\"{':2': 'red', '5:': 'red'}\" sparkMinSpotColor=\"false\" sparkMaxSpotColor=\"false\">"+
                            lineStr+"</span>"+
                            "</td>"+
                            "<td>"+
                            "<span class=\"sparkboxplotraw\" sparkType=\"box\" sparkRaw=\"false\" sparkShowOutliers=\"false\" sparkTarget=\""+data[i].MENENNMAS+"\" sparkHeight=\"30px\" sparkWidth=\"100px\">"+
                            lineStr+"</span>"+
                            "</td>"+
                            "<td id=\"cpk"+data[i].METEIL+data[i].MEMERKMAL+"\"></td>"+
                            "<td>"+
                            "<button type=\"button\" class=\"btn btn-info btn-xs\" onclick=\"getCpkData(1,'"+data[i].METEIL+"','"+data[i].MEMERKMAL+"');\">近125条数据CPK</button>"+
                            "<button type=\"button\" class=\"btn btn-info btn-xs\" onclick=\"getCpkData(2,'"+data[i].METEIL+"','"+data[i].MEMERKMAL+"');\">时间查询CPK</button>"+
                            "</td>"+
                            "</tr>";
                    }
                    $('#medTable').append(appendRow);
                }
            }
        })



        $('.normalline').sparkline('html',
            {
                enableTagOptions: true
            });
        $('.sparktristate').sparkline('html', {
            type: 'tristate',
            colorMap: {'-1': '#f22', '1': '#f22', '0': '#5f5'},
            tooltipValueLookups: {map: {'-1': '不合格', '0': '合格', '1': '不合格'}}
        });
        $('.sparkboxplotraw').sparkline('html',
            {enableTagOptions: true});
        // $('.sparkboxplot').sparkline('html', {type: 'box'});
    })
    function getCpkData(index,teilId,merkmalId) {
        $.ajax({
            type:'post',
            data:{
                teilId:teilId,
                merkmalId:merkmalId,
                type:index,
                startTime:startTime,
                endTime:endTime
            },
            url:'<%=basePath%>baqb/getCpkData',
            beforeSend:function(){
                $('#cpk'+teilId+merkmalId).append('<img style="width:32px;height:30px;" src=\"<%=basePath%>resources/images/qdasLoading.gif\"/>');
            },
            success:function (data) {
                if(data.mess===1){
                    if(parseFloat(data.cpk)<1.33){
                        $('#cpk'+teilId+merkmalId).empty().append('<span class="badge bg-red">'+data.cpk+'</span>');
                    }else if(parseFloat(data.cpk)>1.33&parseFloat(data.cpk)<1.67){
                        $('#cpk'+teilId+merkmalId).empty().append('<span class="badge bg-yellow">'+data.cpk+'</span>');
                    }else{
                        $('#cpk'+teilId+merkmalId).empty().append('<span class="badge bg-green">'+data.cpk+'</span>');
                    }
                }

            }
        })
    }
    function merkmalRowClick(teilId,merkmalId) {
        /*window.location.href = '#maodian1';
        initMerkmalChart(teilId,merkmalId);
        $('#merkmalRow').find('.merkmalchangeion').each(function (index,ele) {
            $(ele).removeClass('ion-checkmark-circled').addClass('ion-pie-graph');
        })
        $('#merkmalDiv'+merkmalId).find('.merkmalchangeion').each(function (index,ele) {
            $(ele).removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
        })*/
        var ww= $(window).width();
        var hh=$(window).height();
        $('#modal_panel').parent().css("margin-left",ww*0.1);
        $('#modal_panel').width(ww*0.8);
        $('#modalChart').width(ww*0.8);
        $('#modalChart').height(hh*0.7);
        dztSearchTeil=teilId;
        dztSearchMerkmal=merkmalId;
        initMerkmalChart(teilId,merkmalId);
        getKztDataXR(teilId,merkmalId);
    }
</script>
</body>
</html>
