<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <input type="hidden" id="merkmalPageTeilId" value="${merkmalPageTeilId}">
    <div id="qbMerkmalBtnDiv" data-options="region:'west',split:false" style="width:20%;padding: 5px">
        <c:forEach items="${merkmalList}" var="merkmal" varStatus="index">
            <c:choose>
                <c:when test="${merkmal.qualityLevel==\"0\"}">
                    <a class="easyui-linkbutton c1" data-options="size:'large'" style="width:95%;height: 100px;"
                       onclick="merkmalBtnClick('${merkmal.MEMERKMAL}','${merkmal.WVTEIL }','${index.index}');">${merkmal.MEMERKBEZ  }</a>
                </c:when>
                <c:when test="${merkmal.qualityLevel==\"2\"}">
                    <a class="easyui-linkbutton c5" data-options="size:'large'" style="width:95%;height: 100px;"
                       onclick="merkmalBtnClick('${merkmal.MEMERKMAL}','${merkmal.WVTEIL }','${index.index}');">${merkmal.MEMERKBEZ  }</a>
                </c:when>
            </c:choose>
        </c:forEach>
    </div>
    <div data-options="region:'center'" style="">
        <div class="easyui-layout" fit="true">
            <div data-options="region:'north',split:false" style="height: 40px;padding: 4px;overflow: hidden">
                显示从：<input id="chartStartTime" type="text" name="chartStartTime">
                至：<input id="chartEndTime" type="text" name="chartEndTime">
               <a id="merkmalQbShow" class="easyui-linkbutton" data-options="iconCls:'icon-kanbanicon'" style="float: right" onclick="plOpenQbShow();">打开轮播看板</a>
            </div>
            <div id="dztChart" data-options="region:'center',onResize:function(){chartResize()}" style=""></div>
        </div>
    </div>
</div>
<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
<script type="text/javascript">
    var chartStartTime;
    var chartEndTime;
    var qbLinechart;
    var chartInfoObj=new Object();
    $(function () {
        if(chartStartTime==undefined|chartStartTime==null){
            chartStartTime=startTime;
        }
        if(chartEndTime==undefined|chartEndTime==null){
            chartEndTime=endTime;
        }
        $('#chartStartTime').datetimebox({
            value: chartStartTime,
            showSeconds: true,
            onChange:function(newDate,oldDate){
                chartStartTime=newDate;
                initChart(chartInfoObj.teilId,chartInfoObj.merkmal,chartStartTime,chartEndTime);
            }
        });
        $('#chartEndTime').datetimebox({
            value: chartEndTime,
            showSeconds: true,
            onChange:function(newDate,oldDate){
                chartEndTime=newDate;
                initChart(chartInfoObj.teilId,chartInfoObj.merkmal,chartStartTime,chartEndTime);
            }
        });
        $('#qbMerkmalBtnDiv').find('.easyui-linkbutton').each(function (index, ele) {
            if (index == 0) {
                $(ele).click();
            }
        });
    })

    function merkmalBtnClick(merkmal, teilId, merkmalIndex) {
        $('#qbMerkmalBtnDiv').find('.easyui-linkbutton').each(function (index, ele) {
            if (index == merkmalIndex) {
                $(ele).linkbutton({
                    iconCls: 'icon-large-gou'
                })
            } else {
                $(ele).linkbutton({
                    iconCls: ''
                })
            }
        })
        chartInfoObj.teilId=teilId;
        chartInfoObj.merkmal=merkmal;
        initChart(teilId, merkmal,chartStartTime,chartEndTime);
    }

    function initChart(teilId, merkmal,startTime,endTime) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>qbGetrag/getChartData',
            data: {
                teilId: teilId,
                merkmalId: merkmal,
                startTime: startTime,
                endTime: endTime
            },
            success: function (data) {
                if (data[0].MEMERKART!=1){
                    var upLimit;
                    var downLimit;
                    var chartTitle;
                    var mdata;
                    var xValue = [];
                    var yValue = [];
                    var tooltipTime = [];
                    var tooltipPRVORNAME = [];
                    var tooltipPMBEZ = [];
                    if (data.length > 0) {
                        upLimit = data[0].MEOGW;
                        downLimit = data[0].MEUGW;
                        chartTitle = data[0].MEMERKBEZ;
                        mdata = data[0].MENENNMAS;
                        for (var i = 0; i < data.length; i++) {
                            tooltipTime.push(data[i].WVDATZEIT);
                            tooltipPRVORNAME.push(data[i].PRVORNAME==undefined?'':data[i].PRVORNAME);
                            tooltipPMBEZ.push('');
                            xValue.push(data[i].WVDATZEIT);
                            yValue.push(data[i].WVWERT)
                        }
                    }
                    qbLinechart = initQbLineChart('dztChart', xValue, yValue, upLimit, downLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
                }else{
                    var xData=['合格','不合格'];
                    var yData=[];
                    var pieArr=[];
                    var okCount=0;
                    var nokCount=0;
                    var title;
                    if(data.length>0){
                        title=data[0].MEMERKBEZ
                        for(var i=0;i<data.length;i++){
                            if(data[i].WVWERT.toString().indexOf('.')!==0&parseFloat(data[i].WVWERT.toString().substring(data[i].WVWERT.toString().indexOf(".")-1)>0)){
                                nokCount +=1;
                            }else{
                                okCount +=1;
                            }
                        }
                    }
                    yData=[okCount,nokCount];
                    pieArr=[{name:'合格',value:okCount},{name:'不合格',value:nokCount}];
                    qbLinechart=initBarAndPie('dztChart',xData,yData,pieArr,title);

                }

            }
        })
    }
    function chartResize() {
        if(qbLinechart!=null&qbLinechart!=undefined){
            qbLinechart.resize();
        }
    }
</script>
</body>
</html>
