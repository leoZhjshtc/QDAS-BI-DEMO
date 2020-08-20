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

    <style type="text/css">
        .box-title small {
            color: #FFFFFF;
        }
    </style>
</head>
<body class="hold-transition skin-black-light layout-top-nav fixed" data-spy="scroll" style="position: relative;">
<div class="wrapper">
    <header class="main-header">
        <nav id="nav" class="navbar navbar-static-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="http://www.q-das.cn/" class="navbar-img"><span class="logo-md"><img
                            src="<%=basePath%>resources/images/qdas-logo.png" style="height: 50px"></span></a>

                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                            data-target="#navbar-collapse">
                        <i class="fa fa-bars"></i>
                    </button>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse pull-right" id="navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="#">产线看板</a></li>
                        <li><a href="#maodian1">任务图表</a></li>
                        <li><a href="#maodian2">质量分析</a></li>
                        <li><a href="#maodian3">零件参数</a></li>
                        <li><a href="#maodian4" onclick="openQbShow();">轮播看板</a></li>
                        <li>
                            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
            <!-- /.container-fluid -->
        </nav>
    </header>
    <!-- Full Width Column -->
    <div id="mainContent" class="content-wrapper" style="padding-top: 45px;">
        <div class="container-fluid">
            <section class="content-header">
                <div class="input-group col-md-5 col-xs-12">
                    <div class="input-group-addon">
                        <i class="fa fa-clock-o"></i>
                    </div>
                    <input type="text" class="form-control pull-right" id="reservationtime">
                </div>
<%--                <div class="input-group col-md-2 col-xs-4">--%>
<%--                    <span class="input-group-addon">--%>
<%--                        <input id="searchByWertCheckbox" type="checkbox" class="flat-red">--%>
<%--                    </span>--%>
<%--                    <input id="searchByWertCount" type="text" class="form-control" disabled onkeyup="numberCheck(this)">--%>
<%--                    <span class="input-group-btn">--%>
<%--                      <button id="searchByWertBtn" type="button" class="btn btn-info btn-flat" disabled onclick="searchByWert()">查看测量值个数</button>--%>
<%--                    </span>--%>
<%--                </div>--%>
            </section>
            <!-- Main content -->
            <section class="content">
                <div class="row">
                    <div class="col-md-12">
                        <div id="qbbox" class="box box-solid bg-teal-gradient">
                            <div class="box-header">
                                <h3 class="box-title">产线看板 &nbsp;&nbsp;<small id="qbTitle1"></small><small
                                        id="qbTitle2"></small></h3>
                                <div class="box-tools pull-right">
                                    <button type="button" class="btn bg-teal btn-md refresh-btn" id="qbboxRefreshHidden"
                                            style="display: none"><i
                                            class="fa fa-refresh"></i>
                                    </button>
                                    <button type="button" class="btn bg-teal btn-md <%--refresh-btn--%>"
                                            id="qbboxRefresh" onclick="qbBoxRefresh(1)"><i
                                            class="fa fa-refresh"></i>
                                    </button>
                                    <button type="button" class="btn bg-teal btn-md" href="#plCarousel"
                                            onclick="plChartCarouselPrev();" data-slide="prev"><i
                                            class="fa fa-arrow-left"></i>
                                    </button>
                                    <button type="button" class="btn bg-teal btn-md" data-widget="collapse"><i
                                            class="fa fa-minus"></i>
                                    </button>
                                </div>
                            </div>
                            <div class="box-body"></div>
                        </div>
                    </div>
                </div>
                <span id="maodian1" style="display:block;height:50px;margin-top:-50px;"></span>
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
                            <div class="box-body" style="background-color: #F3F3F3"></div>
                        </div>
                    </div>
                </div>
                <span id="maodian2" style="display:block;height:50px;margin-top:-50px;"></span>
                <div class="row">
                    <div class="col-md-12">
                        <div id="qachartbox" class="box box-solid box-info">
                            <div class="box-header">
                                <i class="fa fa-bar-chart-o"></i>
                                <h3 class="box-title">质量分析 &nbsp;&nbsp;<small id="qaTitle1"></small><small
                                        id="qaTitle2"></small></h3>
                                <div class="box-tools pull-right">
                                    <button type="button" class="btn bg-teal btn-md refresh-btn"
                                            id="qachartboxRefreshHidden" style="display: none"><i
                                            class="fa fa-refresh"></i>
                                    </button>
                                    <button type="button" class="btn btn-info btn-md <%--refresh-btn--%>"
                                            id="qachartboxRefresh" onclick="qaBoxRefresh(1)"><i
                                            class="fa fa-refresh"></i>
                                    </button>
                                    <button type="button" class="btn btn-info btn-md" data-widget="collapse"><i
                                            class="fa fa-minus"></i>
                                    </button>
                                </div>
                            </div>
                            <div class="box-body" id="qaMainBoxBody"></div>
                        </div>
                    </div>
                </div>
                <span id="maodian3" style="display:block;height:50px;margin-top:-50px;"></span>
                <div class="row">
                    <div class="col-md-12">
                        <div class="box box-solid box-warning" id="mmMerkmalBox">
                            <div class="box-header">
                                <h3 class="box-title">零件参数&nbsp;&nbsp;<small id="mmDetailsTitle"></small></h3>

                                <div class="box-tools">
                                    <button type="button" class="btn btn-warning btn-md" data-widget="collapse"><i
                                            class="fa fa-minus"></i>
                                    </button>
                                </div>
                            </div>
                            <div id="mmDetailsTableDiv" class="box-body"></div>
                        </div>
                    </div>
                </div>
                <span id="maodian4" style="display:block;height:50px;margin-top:-50px;"></span>
                <div class="row">
                    <div class="col-md-12">
                        <div id="qbShowBox" class="box box-solid box-success collapsed-box">
                            <div class="box-header">
                                <i class="fa fa-bar-chart-o"></i>
                                <h3 class="box-title">轮播看板</h3>
                                <div class="box-tools pull-right">
                                    <select class="form-control" style="width: 100px;float: left;height: 100%"
                                            id="intervalTime" onchange="lbTimeChange();">
                                        <option selected="selected" value="10">10秒</option>
                                        <option value="20">20秒</option>
                                        <option value="30">30秒</option>
                                        <option value="60">1分钟</option>
                                        <option value="5">5秒</option>
                                    </select>
                                    <button type="button" class="btn btn-success btn-md" data-widget="collapse"><i
                                            class="fa fa-plus"></i>
                                    </button>
                                </div>
                            </div>
                            <div class="box-body">
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- /.content -->
        </div>
        <!-- /.container -->
    </div>
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Create the tabs -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
            <li class="active"><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a>
            </li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
            <!-- Settings tab content -->
            <div class="tab-pane active" id="control-sidebar-settings-tab">
                <form method="post">
<%--                    <h3 class="control-sidebar-heading">警戒限设置</h3>--%>
                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            是否启用警戒限
                            <input id="ifSetupTolerance" type="checkbox" class="pull-right"
                                   onclick="ifSetupToleranceClick(this)">
                        </label>
                        <label for="tolerance" class="control-label">警戒限倍数</label>
                        <div>
                            <input type="text" class="form-control" id="tolerance" placeholder="">
                        </div>
                    </div>
<%--                    <span style="color: red" id="toleranceWarn"></span>--%>
<%--                    <button type="button" onclick="setupTolerance();" class="btn btn-info pull-right">确定</button>--%>
                </form>
                <form method="post" style="margin-top: 30px">
                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            是否自定义显示测量值个数
                            <input id="ifQbSerchWertCount" type="checkbox" class="pull-right"
                                   onclick="ifSetupQbSerchWertCountClick(this)">
                        </label>
                        <label for="tolerance" class="control-label">测量值个数</label>
                        <div>
                            <input type="text" class="form-control" id="qbSerchWertCount" onkeyup="numberCheck(this)" >
                        </div>
                    </div>
<%--                    <span style="color: red" id="qbSerchWertCountWarn"></span>--%>
<%--                    <button type="button" onclick="setupQbSerchWertCount();" class="btn btn-info pull-right">确定</button>--%>
                </form>
                <form method="post" style="margin-top: 30px">
<%--                    <h3 class="control-sidebar-heading">测量值小数点设置</h3>--%>
                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            是否自定义小数点位
                            <input id="ifSetupDecimal" type="checkbox" class="pull-right"
                                   onclick="ifSetupDecimalClick(this)">
                        </label>
                        <label>小数点位数</label>
                        <input id="decimal" type="text" class="form-control" placeholder="">
                    </div>
                    <span style="color: red" id="decimalWarn"></span>
                    <button type="button" onclick="setupConfig();" class="btn btn-info pull-right">确定</button>
                </form>
                <form method="post" style="margin-top: 90px">
<%--                    <h3 class="control-sidebar-heading">实时监控设置</h3>--%>
                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            是否打开实时监控
                            <input id="ifOpenRealTime" type="checkbox" class="pull-right" onclick="ifSetupRealTimeClick(this)">
                        </label>
                        <label>刷新间隔</label>
                        <select class="form-control" id="intervalRealTime" disabled>
                            <option selected="selected" value="20">20秒</option>
                            <option value="10">10秒</option>
                            <option value="30">30秒</option>
                            <option value="60">1分钟</option>
                        </select>
                    </div>
                    <span style="color: red" id="intervalWarn"></span>
                    <button id="realTimeBtn" type="button" onclick="setupRealTime();" class="btn btn-info pull-right" disabled>确定</button>
                </form>
            </div>
            <!-- /.tab-pane -->
        </div>
    </aside>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
    immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
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
    var startTime = moment().startOf('second').add(-24, 'hour').format('YYYY-MM-DD HH:mm:ss');
    var endTime = moment().startOf('second').format('YYYY-MM-DD HH:mm:ss');
    var ifQbShowOpen = false;
    var qbCarouselIndex = 0;
    var runRealTime;
    $(function () {
        $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
            checkboxClass: 'icheckbox_flat-blue',
            radioClass   : 'iradio_flat-blue'
        })

        $("#qbbox").boxRefresh({
            source: '<%=basePath%>baqb/initQualityBoardPage',
            // params: {startTime:startTime,endTime:endTime},
            content: '.box-body',
            // trigger: '#qbRefresh',
            loadInContent: true,
            overlayTemplate: '<div class="overlay"><div class="fa fa-refresh fa-spin"></div></div>',
            onLoadStart: function () {
            },
            onLoadDone: function (response) {
            }
        });
        $("#qbchartbox").boxRefresh({
            source: '<%=basePath%>baqb/initMissionManagePage',
            // params: {startTime:startTime,endTime:endTime},
            content: '.box-body',
            //是否自动加载内容
            loadInContent: true,
            overlayTemplate: '<div class="overlay"><div class="fa fa-refresh fa-spin"></div></div>',
            onLoadStart: function () {
            },
            onLoadDone: function (response) {
            }
        });
        $("#qachartbox").boxRefresh({
            source: '<%=basePath%>baqb/initQualityAnalysePage',
            // params: {startTime:startTime,endTime:endTime},
            content: '#qaMainBoxBody',
            //是否自动加载内容
            loadInContent: true,
            overlayTemplate: '<div class="overlay"><div class="fa fa-refresh fa-spin"></div></div>',
            onLoadStart: function () {
            },
            onLoadDone: function (response) {
            }
        });
        $("#qbShowBox").boxRefresh({
            source: '<%=basePath%>baqb/initQbShowPage',
            // params: {startTime:startTime,endTime:endTime},
            content: '.box-body',
            //是否自动加载内容
            loadInContent: true,
            // ajax spinner(ajax请求过程中在该Box中展示当前正处于加载过程中的动画效果)的HTML template.
            overlayTemplate: '<div class="overlay"><div class="fa fa-refresh fa-spin"></div></div>',
            onLoadStart: function () {
            },
            onLoadDone: function (response) {
            }
        });
        $('#reservationtime').daterangepicker({
            timePicker: true,
            timePicker24Hour: true,
            timePickerIncrement: 10,
            startDate: moment().startOf('second').add(-24, 'hour'),
            endDate: moment().startOf('second'),
            locale: {format: 'YYYY-MM-DD HH:mm:ss'},
        }, function (start, end, label) {
            console.log("选择了一个新的日期: " + start.format('YYYY-MM-DD') + ' to ' + end.format('YYYY-MM-DD'));
            startTime = start.format('YYYY-MM-DD HH:mm:ss');
            endTime = end.format('YYYY-MM-DD HH:mm:ss');
            $('#qbboxRefreshHidden').click();
            $('#qbchartboxRefreshHidden').click();
            $('#qachartboxRefreshHidden').click();
        });
        initSetupTolerance();
        // runRealTime = setInterval("startRealTime()", parseInt($('#intervalRealTime').val()) * 1000);
        // runRealTime=setInterval(startRealTime(),10*1000);
        // $('#searchByWertCheckbox').on('ifChanged', function(event){
        //     if($('#searchByWertCheckbox').prop('checked')){
        //         $('#searchByWertCount').attr("disabled",false);
        //         $('#searchByWertBtn').attr("disabled",false);
        //     }else{
        //         $('#searchByWertCount').attr("disabled",true);
        //         $('#searchByWertBtn').attr("disabled",true);
        //     }
        // });
    })

    function plChartCarouselPrev() {
        $('#plChartCarousel').carousel('prev');
        $('#qaChartCarousel').carousel('prev');
        if ($('#plCarousel').find('.active').children()[0].id == 'merkmalDiv') {
            $('#qbTitle2').html('');
            $('#mmTitle2').html('');
            $('#qaTitle2').html('');
        } else if ($('#plCarousel').find('.active').children()[0].id == 'processDiv') {
            $('#qbTitle1').html('');
            $('#mmTitle1').html('');
            $('#qaTitle1').html('');
        }
        if(manyMmchartArr!==undefined){
            manyMmchartArr=[];
        }
    }

    function openQbShow() {
        clearInterval(qbShowInterval);
        $('#qbShowBox').boxWidget('expand')
        ifQbShowOpen = true;
        //$('#qbShow').height($(window).height()-100)
    }

    function ifSetupToleranceClick(checkbox) {
        if (checkbox.checked == true) {
            $('#tolerance').attr("disabled", false);
        } else {
            $('#tolerance').attr("disabled", true);
        }
    }

    function ifSetupDecimalClick(checkbox) {
        if (checkbox.checked == true) {
            $('#decimal').attr("disabled", false);
        } else {
            $('#decimal').attr("disabled", true);
        }
    }
    function ifSetupQbSerchWertCountClick(checkbox) {
        if (checkbox.checked == true) {
            $('#qbSerchWertCount').attr("disabled", false);
        } else {
            $('#qbSerchWertCount').attr("disabled", true);
        }
    }

    function ifSetupRealTimeClick(checkbox) {
        if (checkbox.checked == true) {
            $('#intervalRealTime').attr("disabled", false);
            $('#realTimeBtn').attr("disabled", false);
        } else {
            $('#intervalRealTime').attr("disabled", true);
            $('#realTimeBtn').attr("disabled", true);
        }
    }
    function initSetupTolerance() {
        $.ajax({
            url: '<%=basePath%>baqb/initSetupTolerance',
            type: 'post',
            success: function (data) {
                if (data.ifSetupTolerance == 1) {
                    $('#ifSetupTolerance').prop("checked", true);
                    $('#tolerance').val(data.tolerance);
                } else {
                    $('#ifSetupTolerance').prop("checked", false);
                    $('#tolerance').val(data.tolerance);
                    $('#tolerance').attr("disabled", true);

                }
                if (data.ifSetupDecimal == 1) {
                    $('#ifSetupDecimal').prop("checked", true);
                    $('#decimal').val(data.decimal);
                } else {
                    $('#ifSetupDecimal').prop("checked", true);
                    $('#decimal').val(data.decimal);
                    $('#decimal').attr("disabled", true);
                }
                if (data.ifQbSerchWertCount == 1) {
                    $('#ifQbSerchWertCount').prop("checked", true);
                    $('#qbSerchWertCount').val(data.qbSerchWertCount);
                } else {
                    $('#ifQbSerchWertCount').prop("checked", true);
                    $('#qbSerchWertCount').val(data.qbSerchWertCount);
                    $('#qbSerchWertCount').attr("disabled", true);
                }
            }
        })
    }
    function setupConfig() {
        var toleranceFlag=0;
        var decimalFlag=0;
        var wertCountFlag=0;
        var toleranceReg = /^([+]\d+[.]\d+|[-]\d+[.]\d+|\d+[.]\d+|[+]\d+|[-]\d+|\d+)$/gi;
        var decimalReg = /^([1-9]\d*|[0]{1,1})$/;
        if ($('#ifSetupTolerance').prop("checked")) {
            toleranceFlag = 1;
            if($('#tolerance').val() == 0|!toleranceReg.test($('#tolerance').val())){
                $('#decimalWarn').html("警戒限输入有误！！！")
                return;
            }
        }
        if ($('#ifSetupDecimal').prop("checked")) {
            decimalFlag = 1;
            if(!decimalReg.test($('#decimal').val())){
                $('#decimalWarn').html("小数点位输入有误！！！")
                return;
            }
        }
        if ($('#ifQbSerchWertCount').prop("checked")) {
            wertCountFlag = 1;
        }
        $.ajax({
            url: '<%=basePath%>baqb/setupAppConfig',
            type: 'post',
            data: {
                ifSetupTolerance: toleranceFlag,
                tolerance: $('#tolerance').val(),
                ifSetupDecimal: decimalFlag,
                decimal: $('#decimal').val(),
                ifQbSerchWertCount: wertCountFlag,
                qbSerchWertCount: $('#qbSerchWertCount').val()
            },
            success:function (data) {
                if (data.mess == 1) {
                    window.location.reload();
                } else {
                    $('#decimalWarn').html("设置失败！！！")
                }
            }
        })
    }

    function startRealTime() {
        qbBoxRefresh(1);
        mmBoxRefresh(1);
        qaBoxRefresh(1);
    }

    function qbBoxRefresh(index) {
        var selectMerkmalEle;
        if (index == 1) {
            endTime = moment().startOf('second').format('YYYY-MM-DD HH:mm:ss');
            if (qbCarouselIndex == 2){
                $('#merkmalRow').find('.merkmalchangeion').each(function (index, ele) {
                    if ($(ele).hasClass('ion-checkmark-circled')) {
                        selectMerkmalEle = ele.id;
                    }
                })
            }
        }
        // var ifQbSerchWertCount=0
        // if($('#searchByWertCheckbox').prop('checked')){
        //     ifQbSerchWertCount=1
        // }
        if (qbCarouselIndex == 0) {
            // $('#plDiv').empty();
            $('#plDiv').load('<%=basePath%>baqb/initPruductLineQbPage', {startTime: startTime, endTime: endTime});
        } else if (qbCarouselIndex == 1) {
            $('#processDiv').load('<%=basePath%>baqb/initProcessQbPage', {
                teilNum: $('#qbTeilNumValue').val(),
                teilName: $('#qbTeilNameValue').val(),
                teilK1003: $('#qbTeilK1003Value').val(),
                startTime: startTime,
                endTime: endTime
            });
        } else if (qbCarouselIndex == 2) {
            $('#merkmalDiv').load('<%=basePath%>baqb/initMerkmalQbPage', {
                teilId: $('#qbTeilIdValue').val(),
                startTime: startTime,
                endTime: endTime
            },function () {
                $('#'+selectMerkmalEle).removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
            });
        }
    }

    function mmBoxRefresh(index) {
        if (index == 1) {
            endTime = moment().startOf('second').format('YYYY-MM-DD HH:mm:ss');
        }
        if (qbCarouselIndex == 0) {
            initPlmmChart();
        } else if (qbCarouselIndex == 1) {
            initProcessMmChart($('#qbTeilNumValue').val(), $('#qbTeilNameValue').val(), $('#qbTeilK1003Value').val());
        } else if (qbCarouselIndex == 2) {
            var aa = 0;
            $('#merkmalRow').find('.merkmalchangeion').each(function (index, ele) {
                if ($(ele).hasClass('ion-checkmark-circled')) {
                    aa = ele.datamerkmal;
                }
            })
            // console.log(aa)
            // initMerkmalChart($('#qbTeilIdValue').val(), aa);
        }
    }

    function qaBoxRefresh(index) {
        if (index == 1) {
            endTime = moment().startOf('second').format('YYYY-MM-DD HH:mm:ss');
        }
        if (qbCarouselIndex == 0) {
            initPlRecentChart();
        } else if (qbCarouselIndex == 1) {
            initProcessRecentChart();
        } else if (qbCarouselIndex == 2) {
            $('#qaMerkmalChartDiv').load('<%=basePath%>baqb/initQaMerkmalPage', {
                teilId: $('#qbTeilIdValue').val(),
                startTime: startTime,
                endTime: endTime
            });
        }
    }

    function setupRealTime() {
        clearInterval(runRealTime);
        if ($('#ifOpenRealTime').prop('checked')) {
            runRealTime = setInterval("startRealTime()", parseInt($('#intervalRealTime').val()) * 1000);
        } else {
            clearInterval(runRealTime);
        }
    }

    // function searchByWert() {
    //     $('#qbboxRefreshHidden').click();
    //     $('#qbchartboxRefreshHidden').click();
    //     $('#qachartboxRefreshHidden').click();
    //
    // }
    function numberCheck(ele) {
        var num = ele.value;
        var re=/^\d*$/;
        if(!re.test(num)){
            isNaN(parseInt(num))?ele.value=0:ele.value=parseInt(num);
        }
    }
</script>
</body>
</html>
