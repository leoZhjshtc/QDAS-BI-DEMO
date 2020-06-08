<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../framework/meta.jsp" %>
<html>
<head>
</head>
<body>
<!-- Main content -->
<section class="content" id="main">
    <!-- Main content -->
    <section class="content container-fluid" style="padding-top: 0px">
        <c:forEach items="${teilList}" var="teil" varStatus="index">
            <c:choose>
                <c:when test="${teil.qualityLevel==\"0\"}">
                    <div class="col-md-4">
                        <div class="box box-success box-solid">
                            <div class="box-header">
                                <h3 class="box-title">${teil.TETEILNR  }<br>${teil.TEBEZEICH  }<br>${teil.TEKURZBEZEICH  }</h3>
                                <div class="box-tools pull-right">
                                    <button type="button" class="btn btn-default btn-dm" data-widget="collapse"><i class="fa fa-minus"></i>
                                    </button>
                                    <button type="button" class="btn btn-default btn-dm" data-widget="remove"><i class="fa fa-times"></i>
                                    </button>
                                </div>
                            </div>
                            <div class="box-body" style="height:250px" id="chartDiv${index.index}">
                            </div>
                            <!-- /.box-body -->
                            <!-- Loading (remove the following to stop the loading)-->
                            <div class="overlay">
                                <i class="fa fa-refresh fa-spin"></i>
                            </div>
                            <!-- end loading -->
                        </div>
                    </div>
                </c:when>
                <c:when test="${teil.qualityLevel==\"2\"}">
                    <div class="col-md-4">
                        <div class="box box-danger box-solid">
                            <div class="box-header">
                                <h3 class="box-title">${teil.TETEILNR  }<br>${teil.TEBEZEICH  }<br>${teil.TEKURZBEZEICH  }</h3>
                                <div class="box-tools pull-right">
                                    <button type="button" class="btn btn-default btn-dm" data-widget="collapse"><i class="fa fa-minus"></i>
                                    </button>
                                    <button type="button" class="btn btn-default btn-dm pull-right" data-widget="remove"><i class="fa fa-times"></i>
                                    </button>
                                </div>
                            </div>
                            <div class="box-body" style="height:250px" id="chartDiv${index.index}">
                            </div>
                        </div>
                    </div>
                </c:when>
            </c:choose>
        </c:forEach>
    </section>
    <!-- /.content -->
</section>
<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
<script type="text/javascript">
    var chartArr=new Array();
    $(function () {
        <c:forEach items="${teilList}" var="teil" varStatus="index">
            var dataArr=new Array();
            var okobj=new Object();
            okobj.name='合格';
            okobj.value='${teil.passrate}'
            var nokobj=new Object();
            nokobj.name='不合格';
            nokobj.value=(100-parseFloat('${teil.passrate}')).toFixed(2);
            dataArr.push(okobj);
            dataArr.push(nokobj);
            var chartobj=new Object();
            chartobj.chart=initPieChart('chartDiv${index.index}',dataArr);
            chartArr.push(chartobj);
        </c:forEach>
    })
    window.onresize=function(){
        if(chartArr.length>0){
            for(var i=0;i<chartArr.length;i++){
                chartArr[i].chart.resize();
            }
        }
    }
    function initPieChart(divElement,data) {
        var dom = document.getElementById(divElement);
        var myChart = echarts.init(dom);
        option = null;
        option = {
            tooltip: {
                trigger: 'item',
                formatter: '{a} <br/>{b}: {c}%'
            },
            series: [
                {
                    name: '合格率',
                    type: 'pie',
                    label: {
                        show: true,
                        formatter: '{b}: {c}%'
                    },
                    radius: '95%',
                    center: ['50%', '50%'],
                   /* emphasis: {
                        label: {
                            show: true,
                            fontSize: '30',
                            fontWeight: 'bold'
                        }
                    },*/
                    labelLine: {
                        show: true
                    },
                    color:['#00a65a','#f56954'],
                    data: data
                }
            ]
        };
        if (option && typeof option === "object") {
            myChart.setOption(option, true);
            myChart.resize();
        }
        return myChart;
    }
</script>
</body>
</html>
