<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
</head>
<body>
<table class="table table-hover" id="mmDetailsTable">
    <tr>
        <th style="width: 10px">#</th>
        <th>参数名</th>
        <th>测量值</th>
        <th>名义值</th>
        <th>下公差</th>
        <th>上公差</th>
        <th>下警戒限</th>
        <th>上警戒限</th>
        <th>结果</th>
        <th>测量人员</th>
        <th>测量日期</th>
    </tr>
    <%--<c:forEach items="${mmList}" var="list" varStatus="index">
        <tr onclick="mmMerkmalRowClick('${list.TETEIL}','${list.MEMERKMAL}')" data-toggle="modal" data-target="#dzt-modal-default">
            <td>${index.index+1}</td>
            <td>${list.MEMERKBEZ}</td>
            <td>${list.WVWERT}</td>
            <td>${list.MENENNMAS}</td>
            <td>${list.MEUGW}</td>
            <td>${list.MEOGW}</td>
            <td>${list.NEWMEUGW}</td>
            <td>${list.NEWMEOGW}</td>
            <c:choose>
                <c:when test="${list.qualityLevel==\"0\"}">
                    <td><span class="label label-success">合格</span></td>
                </c:when>
                <c:when test="${list.qualityLevel==\"2\"}">
                    <td><span class="label label-danger">不合格</span></td>
                </c:when>
            </c:choose>
            <td>${list.PRVORNAME}</td>
            <td>${list.WVDATZEIT}</td>
        </tr>
    </c:forEach>--%>
</table>
<input type="hidden" value="${mmDetailsTeilId}" id="mmDetailsTeilId">
<input type="hidden" value="${mmDetailsWVnr}" id="mmDetailsWVnr">
<input type="hidden" value="${mmMap.TETEILNR}" id="mmDetailsK1001">
<input type="hidden" value="${mmMap.TEBEZEICH}" id="mmDetailsK1002">
<input type="hidden" value="${mmMap.TEKURZBEZEICH}" id="mmDetailsK1003">
<script type="text/javascript">
    $(function () {
        $.ajax({
            type:'post',
            url:'<%=basePath%>baqb/getMissionManageDetailsData',
            data:{
                teilId: $('#mmDetailsTeilId').val(),
                wvwertnr: $('#mmDetailsWVnr').val()
            },
            success:function (data) {
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        if(data[i].MEMERKART==="1"){

                        }else{
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
                            var newMEUGW=newTol.meugw!==undefined?newTol.meugw.toFixed(fixCount+2):"";
                            var newMEOGW=newTol.meogw!==undefined?newTol.meogw.toFixed(fixCount+2):"";
                            var downWarn=newWarn.meugw!==undefined?newWarn.meugw.toFixed(fixCount+2):"";
                            var upWarn=newWarn.meogw!==undefined?newWarn.meogw.toFixed(fixCount+2):"";

                            var MENENNMAS=data[i].MENENNMAS!==undefined?data[i].MENENNMAS:"";
                            var downlimit,uplimit;
                            if(overallDicideStandardType==='1'){
                                downlimit=data[i].newMEUGW;
                                uplimit=data[i].newMEOGW;
                            }else{
                                downlimit=data[i].downWarn;
                                uplimit=data[i].upWarn;
                            }
                            var colorCell;
                            if (!isBlank(downlimit) & parseFloat(downlimit) > parseFloat(data[i].WVWERT)) {
                                colorCell= "<td><span class=\"label label-danger\">不合格</span></td>";
                            }else if(!isBlank(uplimit)& parseFloat(uplimit) < parseFloat(data[i].WVWERT)){
                                colorCell= "<td><span class=\"label label-danger\">不合格</span></td>";
                            }else{
                                colorCell= "<td><span class=\"label label-success\">合格</span></td>";
                            }
                            var appendRow="<tr onclick=\"mmMerkmalRowClick('${list.TETEIL}','${list.MEMERKMAL}')\" data-toggle=\"modal\" data-target=\"#dzt-modal-default\">"+
                                                "<td>"+data[i].MEMERKMAL+"</td>"+
                                                "<td>"+data[i].MEMERKBEZ+"</td>"+
                                                "<td>"+data[i].WVWERT+"</td>"+
                                                "<td>"+MENENNMAS+"</td>"+
                                                "<td>"+newMEUGW+"</td>"+
                                                "<td>"+newMEOGW+"</td>"+
                                                "<td>"+downWarn+"</td>"+
                                                "<td>"+upWarn+"</td>"+
                                                colorCell+
                                                "<td>"+data[i].PRVORNAME+"</td>"+
                                                "<td>"+data[i].WVDATZEIT+"</td>"+
                                            "</tr>";
                            $('#mmDetailsTable').append(appendRow);
                        }

                    }
                }
            }
        })
    })
    function initDetailsTable() {
        $('#mmDetailsTitle').html($('#mmDetailsK1001').val()+"/"+$('#mmDetailsK1002').val()+"/"+$('#mmDetailsK1003').val());
    }
    function mmMerkmalRowClick(teilId,merkmalId) {
        var ww= $(window).width();
        var hh=$(window).height();
        $('#modal_panel').parent().css("margin-left",ww*0.1);
        $('#modal_panel').width(ww*0.8);
        $('#modalChart').width(ww*0.8);
        $('#modalChart').height(hh*0.7);
        dztSearchTeil=teilId;
        dztSearchMerkmal=merkmalId;
        initMerkmalChart(teilId,merkmalId);
    }
</script>
</body>
</html>
