<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<table class="table table-hover">
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
    <c:forEach items="${mmList}" var="list" varStatus="index">
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
    </c:forEach>
</table>
<input type="hidden" value="${mmMap.TETEILNR}" id="mmDetailsK1001">
<input type="hidden" value="${mmMap.TEBEZEICH}" id="mmDetailsK1002">
<input type="hidden" value="${mmMap.TEKURZBEZEICH}" id="mmDetailsK1003">
<script type="text/javascript">
    $(function () {
        // location.href='#mmDetailsTableDiv';
    })
    function initDetailsTable() {
        $('#mmDetailsTitle').html($('#mmDetailsK1001').val()+"/"+$('#mmDetailsK1002').val()+"/"+$('#mmDetailsK1003').val());
    }
    function mmMerkmalRowClick(teilId,merkmalId) {
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
    }
</script>
</body>
</html>
