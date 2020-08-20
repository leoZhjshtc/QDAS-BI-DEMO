<%--
  Created by IntelliJ IDEA.
  User: jun.zhou
  Date: 2020/8/6
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Q-DAS</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css"
          href="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"
          href="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css"
          href="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/Ionicons/css/ionicons.min.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/AdminLTE-2.4.18/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" type="text/css"
          href="<%=basePath %>resources/AdminLTE-2.4.18/dist/css/skins/_all-skins.min.css">
    <link rel="stylesheet" type="text/css"
          href="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap-daterangepicker/daterangepicker.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/AdminLTE-2.4.18/plugins/iCheck/all.css">
</head>
<body class="hold-transition skin-black-light layout-top-nav fixed">
<div class="wrapper">
    <div id="mainContent" class="content-wrapper" style="padding-top: 45px;">
        <div class="container-fluid">
            <!-- Main content -->
            <section class="content">
                <div class="row">
                    <div class="col-md-12">
                        <div id="qbchartbox" class="box box-solid box-primary">
                            <div class="box-header">
                                <i class="fa fa-bar-chart-o"></i>
                                <h3 class="box-title">任务图表 &nbsp;&nbsp;<small id="mmTitle1"></small><small
                                        id="mmTitle2"></small></h3>
                                <div class="box-tools pull-right">
                                    <button type="button" class="btn bg-teal btn-md refresh-btn"
                                            id="qbchartboxRefreshHidden" style="display: none"><i
                                            class="fa fa-refresh"></i>
                                    </button>
                                    <button type="button" class="btn btn-primary btn-md<%-- refresh-btn--%>"
                                            id="qbchartboxRefresh" onclick="mmBoxRefresh(1)"><i
                                            class="fa fa-refresh"></i>
                                    </button>
                                    <button type="button" class="btn btn-primary btn-md" data-widget="collapse"><i
                                            class="fa fa-minus"></i>
                                    </button>
                                </div>
                            </div>
                            <div class="box-body" style="background-color: #F3F3F3" id="mmchartdiv">



                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
</div>





<script type="text/javascript"
        src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
        src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
        src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript"
        src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/fastclick/lib/fastclick.js"></script>
<script type="text/javascript" src="<%=basePath %>resources/AdminLTE-2.4.18/dist/js/adminlte.min.js"></script>
<script type="text/javascript"
        src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/moment/min/moment.min.js"></script>
<script type="text/javascript"
        src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
<script type="text/javascript"
        src="<%=basePath%>resources/AdminLTE-2.4.18/bower_components/bootstrap/js/carousel.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/mmChart.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/qa.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/js/zhj.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/AdminLTE-2.4.18/plugins/iCheck/icheck.js"></script>
<script type="text/javascript">
    var chardiv="<div class=\"col-md-4 col-sm-2 col-xs-12\">" +
                "   <div class=\"info-box\" style=\"height:150px\">" +
                "       <span class=\"info-box-icon bg-aqua\" style=\"width:10px;height:150px\"></span>" +
                "       <div class=\"info-box-content\" style=\"margin-left:10px\">" +
                "           <span class=\"info-box-text\">CPU Traffic</span>" +
                "           <div style='background-color: #FFE361;border: 1px solid;height: 100px'></div>" +
                "       </div>" +
                "   </div>" +
                "</div>"
    $(function () {
        initPlmmChart();
    })
    function initPlmmChart() {
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getPlMissionManageChartData',
            data:{
                startTime:"2020-08-03 00:00:00",
                endTime:"2020-08-04 00:00:00"
            },
            success: function (data) {
                data=data.concat(data);
                data=data.concat(data);
                if (data.length > 0) {
                    for (var i = 0; i < data.length; i++) {
                        var yValueArr = new Array();
                        var chartDataArr = new Array();
                        yValueArr.push(data[i].TETEILNR + "\n" + data[i].TEBEZEICH + "\n" + data[i].TEKURZBEZEICH);
                        var alarmIndex=0;
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
                                if (data[i].wvnrList[j].wvList[k].MEMERKART === '1') {
                                    if (data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvnrList[j].wvList[k].WVWERT.toString().substring(data[i].wvnrList[j].wvList[k].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                        redAlarm += 1;
                                        alarmIndex=1;
                                    }
                                } else {
                                    if ((data[i].wvnrList[j].wvList[k].MEUGW !== undefined & data[i].wvnrList[j].wvList[k].MEUGW !== '' & data[i].wvnrList[j].wvList[k].MEUGW !== 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEUGW) > parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))
                                        | (data[i].wvnrList[j].wvList[k].MEOGW !== undefined & data[i].wvnrList[j].wvList[k].MEOGW !== '' & data[i].wvnrList[j].wvList[k].MEOGW !== 'null' & parseFloat(data[i].wvnrList[j].wvList[k].MEOGW) < parseFloat(data[i].wvnrList[j].wvList[k].WVWERT))) {
                                        redAlarm += 1;
                                        alarmIndex=1;
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
                        var chardiv="<div class=\"col-md-4 col-sm-2 col-xs-12\">" +
                                    "   <div class=\"info-box\" style=\"height:130px\">" ;
                        if(alarmIndex===0){
                            chardiv +="       <span class=\"info-box-icon bg-green\" style=\"width:10px;height:130px\"></span>";
                        }else{
                            chardiv +="       <span class=\"info-box-icon bg-red\" style=\"width:10px;height:130px\"></span>";
                        }
                        chardiv += "       <div class=\"info-box-content\" style=\"margin-left:10px\">" +
                                    "           <span class=\"info-box-text\">"+data[i].TETEILNR + " / " + data[i].TEBEZEICH + " / " + data[i].TEKURZBEZEICH+"</span>" +
                                    "           <div style='height: 100px' id='plmmchart"+i+"'></div>" +
                                    "       </div>" +
                                    "   </div>" +
                                    "</div>"
                        $('#mmchartdiv').append(chardiv);
                        console.log(yValueArr);
                        console.log(chartDataArr);
                        initChartSmall(yValueArr, chartDataArr, "plmmchart"+i);
                        /*mmPlchart = initChartAdminlte(yValueArr, chartDataArr, "plChartDiv");
                        mmPlchart.off('click');
                        mmPlchart.on('click', function (params) {
                            $('#mmDetailsTitle').html(params.value[0].toString().replace(/\n/g,'/'));
                            $('#mmDetailsTableDiv').load('<%=basePath%>baqb/getMissionManageDetails', {
                                teilId: params.data.teilId,
                                wvwertnr: params.data.wvwertnr
                            },function () {
                                window.location.href = '#maodian3';
                            });
                        });*/
                    }

                }
            }
        })
    }
</script>
</body>
</html>
