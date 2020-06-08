<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../framework/meta.jsp" %>
<html>
<head>
</head>
<body data-spy="scroll" style="position: relative;">
<section class="content container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div id="qbbox" class="box box-solid bg-teal-gradient">
                <div class="box-header">
                    <h3 class="box-title">产线</h3>
                    <div class="box-tools pull-right">
                        <button type="button" class="btn bg-teal btn-md" href="#plCarousel" onclick="plChartCarouselPrev();" data-slide="prev"><i class="fa fa-arrow-left"></i>
                        </button>
                        <button type="button" class="btn bg-teal btn-md" data-widget="collapse"><i class="fa fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="box-body">
                    <div id="plCarousel" class="carousel slide carousel-vertical" data-wrap="false" data-interval="false">
                        <%--<ol class="carousel-indicators">
                            <li data-target="#plCarousel" data-slide-to="0" class="active"></li>
                            <li data-target="#plCarousel" data-slide-to="1" class=""></li>
                            <li data-target="#plCarousel" data-slide-to="2" class=""></li>
                        </ol>--%>
                        <div class="carousel-inner">
                            <div class="item active">
                                <div id="plDiv">
                                </div>
                            </div>
                            <div class="item">
                                <div id="processDiv"></div>
                            </div>
                            <div class="item">
                                <div id="merkmalDiv"></div>
                            </div>
                        </div>
                        <%--<a class="left carousel-control" href="#plCarousel" data-slide="prev">
                            <span class="fa fa-angle-left"></span>
                        </a>
                        <a class="right carousel-control" href="#plCarousel" data-slide="next">
                            <span class="fa fa-angle-right"></span>
                        </a>--%>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%----%>
    <div class="row">
        <div class="col-md-12">
            <div id="qbchartbox" class="box box-primary">
                <div class="box-header">
                    <i class="fa fa-bar-chart-o"></i>
                    <h3 class="box-title">图表</h3>
                    <div class="box-tools pull-right">
                       <%-- <button type="button" class="btn btn-primary btn-md" href="#plCarousel" data-slide="prev"><i class="fa fa-arrow-left"></i>
                        </button>--%>
                        <button type="button" class="btn btn-primary btn-md" data-widget="collapse"><i class="fa fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div class="box-body">
                    <div id="plChartCarousel" class="carousel slide carousel-vertical" data-wrap="false" data-interval="false">
                        <div class="carousel-inner">
                            <div class="item active">
                                <div id="plChartDiv">
                                </div>
                            </div>
                            <div class="item">
                                <div id="processChartDiv"></div>
                            </div>
                            <div class="item">
                                <div id="merkmalChartDiv"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">任务管理详情</h3>

                    <div class="box-tools">
                        <button type="button" class="btn btn-primary btn-md" data-widget="collapse"><i class="fa fa-minus"></i>
                        </button>
                    </div>
                </div>
                <div id="mmDetailsTableDiv" class="box-body table-responsive no-padding">

                </div>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript" src="<%=basePath%>resources/AdminLTE/bower_components/bootstrap/js/carousel.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mmChart.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
<script type="text/javascript">
    var mmPlchart,mmProcesschart,qbLinechart;
    $(function () {
        $('#plCarousel').carousel('pause');
        $('#plChartCarousel').carousel('pause');
        $('#plDiv').load('<%=basePath%>baqb/initPruductLineQbPage')
        initPlmmChart();
        $(window).resize(function(){
            if(mmPlchart!=undefined){
                mmPlchart.resize();
            }
            if(mmProcesschart!=undefined){
                mmProcesschart.resize();
            }
            if(qbLinechart!=undefined){
                qbLinechart.resize();
            }
        });
    })
    function plChartCarouselPrev() {
        $('#plChartCarousel').carousel('prev');
    }
    function initPlmmChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getPlMissionManageChartData',
            success: function (data) {
                if (data.length > 0) {
                    if(data.length==1){
                        $('#plChartDiv').height(data.length*150+'px');
                    }else if(data.length==2){
                        $('#plChartDiv').height(data.length*100+'px');
                    }else{
                        $('#plChartDiv').height(data.length*80+'px');
                    }
                    var yValueArr = new Array();
                    var chartDataArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        yValueArr.push(data[i].TETEILNR + "\n" + data[i].TEBEZEICH + "\n" + data[i].TEKURZBEZEICH);
                        for (var j = 0; j < data[i].wvnrList.length; j++) {
                            var valueObj = new Object();
                            valueObj.name = data[i].TETEILNR;
                            valueObj.teilId = data[i].wvnrList[j].TETEIL;
                            valueObj.wvwertnr = data[i].wvnrList[j].WVWERTNR;
                            valueObj.value = new Array();
                            valueObj.value.push(data[i].TETEILNR + "\n" + data[i].TEBEZEICH + "\n" + data[i].TEKURZBEZEICH);
                            valueObj.value.push(data[i].wvnrList[j].wvList[0].WVDATZEIT);
                            valueObj.value.push(data[i].wvnrList[j].wvList[data[i].wvnrList[j].wvList.length - 1].WVDATZEIT);
                            var redAlarm = 0;
                            for (var k = 0; k < data[i].wvnrList[j].wvList.length; k++) {
                                if (data[i].wvnrList[j].wvList[k].MEMERKART == '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                        redAlarm += 1;
                                    }
                                } else {
                                    if ((data[i].wvnrList[j].wvList[k].MEUGW != undefined & data[i].wvnrList[j].wvList[k].MEUGW != '' & data[i].wvnrList[j].wvList[k].MEUGW != 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEUGW) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (data[i].wvnrList[j].wvList[k].MEOGW != undefined & data[i].wvnrList[j].wvList[k].MEOGW != '' & data[i].wvnrList[j].wvList[k].MEOGW != 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEOGW) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
                                        redAlarm += 1;
                                    }
                                }
                            }
                            valueObj.value.push("有" + redAlarm + "个超差数据");
                            valueObj.itemStyle = new Object()
                            valueObj.itemStyle.normal = new Object();
                            if (redAlarm > 0) {
                                valueObj.itemStyle.normal.color = '#EE0000';
                            } else {
                                valueObj.itemStyle.normal.color = '#48B18A';
                            }
                            chartDataArr.push(valueObj);
                        }
                    }
                    mmPlchart = initChartAdminlte(yValueArr, chartDataArr, "plChartDiv");
                    mmPlchart.off('click');
                    mmPlchart.on('click', function (params) {
                        $('#mmDetailsTableDiv').load('<%=basePath%>baqb/getMissionManageDetails',{teilId:params.data.teilId,wvwertnr:params.data.wvwertnr});
                    });
                }
            }
        })
    }
    function initProcessMmChart(teilNum,teilName,teilK1003) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getProcessMissionManageChartData',
            data:{
                teilNum:teilNum,
                teilName:teilName,
                teilK1003:teilK1003
            },
            success: function (data) {
                if (data.length > 0) {
                    if(data.length==1){
                        $('#processChartDiv').height(data.length*150+'px');
                    }else if(data.length==2){
                        $('#processChartDiv').height(data.length*100+'px');
                    }else{
                        $('#processChartDiv').height(data.length*80+'px');
                    }
                    var yValueArr = new Array();
                    var chartDataArr = new Array();
                    for (var i = 0; i < data.length; i++) {
                        yValueArr.push(data[i].TEAUFTRAGSTR);
                        for (var j = 0; j < data[i].wvnrList.length; j++) {
                            var valueObj = new Object();
                            valueObj.name = data[i].wvnrList[j].TETEILNR;
                            valueObj.teilId = data[i].wvnrList[j].TETEIL;
                            valueObj.wvwertnr = data[i].wvnrList[j].WVWERTNR;
                            valueObj.value = new Array();
                            valueObj.value.push(data[i].TEAUFTRAGSTR);
                            valueObj.value.push(data[i].wvnrList[j].wvList[0].WVDATZEIT);
                            valueObj.value.push(data[i].wvnrList[j].wvList[data[i].wvnrList[j].wvList.length - 1].WVDATZEIT);
                            var redAlarm = 0;
                            for (var k = 0; k < data[i].wvnrList[j].wvList.length; k++) {
                                if (data[i].wvnrList[j].wvList[k].MEMERKART == '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                        redAlarm += 1;
                                    }
                                } else {
                                    if ((data[i].wvnrList[j].wvList[k].MEUGW != undefined & data[i].wvnrList[j].wvList[k].MEUGW != '' & data[i].wvnrList[j].wvList[k].MEUGW != 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEUGW) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (data[i].wvnrList[j].wvList[k].MEOGW != undefined & data[i].wvnrList[j].wvList[k].MEOGW != '' & data[i].wvnrList[j].wvList[k].MEOGW != 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEOGW) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
                                        redAlarm += 1;
                                    }
                                }
                            }
                            valueObj.value.push("有" + redAlarm + "个超差数据");
                            valueObj.itemStyle = new Object()
                            valueObj.itemStyle.normal = new Object();
                            if (redAlarm > 0) {
                                valueObj.itemStyle.normal.color = '#EE0000';
                            } else {
                                valueObj.itemStyle.normal.color = '#48B18A';
                            }
                            chartDataArr.push(valueObj);
                        }
                    }
                    mmProcesschart = initChartAdminlte(yValueArr, chartDataArr, "processChartDiv");
                    mmProcesschart.off('click');
                    mmProcesschart.on('click', function (params) {
                        $('#mmDetailsTableDiv').load('<%=basePath%>baqb/getMissionManageDetails',{teilId:params.data.teilId,wvwertnr:params.data.wvwertnr});
                    });
                }
            }
        })
    }
    function initMerkmalChart(teilId,merkmalId) {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getMerkmalChartData',
            data: {
                teilId: teilId,
                merkmalId: merkmalId
            },
            success: function (data) {
                if(data.length>0){
                    $('#merkmalChartDiv').height('500px');
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
                        qbLinechart = initQbLineChart('merkmalChartDiv', xValue, yValue, upLimit, downLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
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
                        qbLinechart=initBarAndPie('merkmalChartDiv',xData,yData,pieArr,title);

                    }
                }
            }
        })
    }
</script>
</body>
</html>