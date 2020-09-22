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

    </style>
</head>
<body class="hold-transition skin-black-light layout-top-nav fixed" <%--data-spy="scroll" style="position: relative;"--%>>
<div class="wrapper">
    <header class="main-header">
        <nav id="nav" class="navbar navbar-static-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="<%=basePath%>baqb/initFrameworkPage" class="navbar-img"><span class="logo-md"><img
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
                        <li><a href="#maodian3">零件参数</a></li>
                        <li><a href="#maodian2">月度分析</a></li>
                        <li><a href="#maodian4" onclick="openQbShow();">统计轮播</a></li>
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
                <form class="row">
                    <label class="col-md-2 col-xs-4" style="line-height: 34px;">
                        <input type="radio" id="currentSearchType1" name="currentSearchType" class="flat-red" checked>
                        显示时间区间
                    </label>
                    <label class="col-md-2 col-xs-4" style="line-height: 34px;">
                        <input type="radio" id="currentSearchType2" name="currentSearchType" class="flat-red">
                        显示测量值数
                    </label>
                </form>
                <form class="row" style="padding-left: 15px">
                    <div class="input-group col-md-4 col-xs-8" id="currentSearchTypeDiv1">
                        <div class="input-group-addon">
                            <i class="fa fa-clock-o"></i>
                        </div>
                        <input type="text" class="form-control pull-right" id="reservationtime">
                    </div>
                    <div id="currentSearchTypeDiv2" style="display: none">
                        <input id="currentSearchTypeInput" type="text" class="form-control" placeholder="测量值个数" style="width: 200px;float: left">
                        <button  type="button" class="btn btn-info" style="margin-left: 20px;float: left" onclick="searchKztXR()">确定</button>
                    </div>
                </form>
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
                <span id="maodian2" style="display:block;height:50px;margin-top:-50px;"></span>
                <div class="row">
                    <div class="col-md-12">
                        <div id="qachartbox" class="box box-solid box-info">
                            <div class="box-header">
                                <i class="fa fa-bar-chart-o"></i>
                                <h3 class="box-title">月度分析 &nbsp;&nbsp;<small id="qaTitle1"></small><small
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
                <span id="maodian4" style="display:block;height:50px;margin-top:-50px;"></span>
                <div class="row">
                    <div class="col-md-12">
                        <div id="qbShowBox" class="box box-solid box-success collapsed-box">
                            <div class="box-header">
                                <i class="fa fa-bar-chart-o"></i>
                                <h3 class="box-title">统计轮播</h3>
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
                            <input type="text" class="form-control" id="qbSerchWertCount" onkeyup="numberCheck(this)">
                        </div>
                    </div>
                </form>
                <form method="post" style="margin-top: 30px">
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
                <form style="margin-top: 30px">
                    <label style="line-height: 34px;">
                        <input type="radio" id="defaultSearchType1" name="defaultSearchType" class="flat-red">
                        显示时间区间
                    </label>
                    <select id="defaultSearchTime" class="form-control select2" style="width: 100%;">
                        <option value="1">1天</option>
                        <option value="2">2天</option>
                        <option value="3">3天</option>
                        <option value="4">4天</option>
                        <option value="5">5天</option>
                    </select>
                    <label style="line-height: 34px;">
                        <input type="radio" id="defaultSearchType2" name="defaultSearchType" class="flat-red">
                        显示测量值数
                    </label>
                    <input id="defaultSearchCount" type="text" class="form-control" placeholder="" onkeyup="numberCheck(this)">

                </form>

                <form method="post" style="margin-top: 90px">
                    <div class="form-group">
                        <label class="control-sidebar-subheading">
                            是否打开实时监控
                            <input id="ifOpenRealTime" type="checkbox" class="pull-right"
                                   onclick="ifSetupRealTimeClick(this)">
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
                    <button id="realTimeBtn" type="button" onclick="setupRealTime();" class="btn btn-info pull-right"
                            disabled>确定
                    </button>
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
<div class="modal fade" id="dzt-modal-default">
    <div class="modal-dialog">
        <div class="modal-content" id="modal_panel">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">最近测量</h4>
            </div>
            <div class="modal-body">

                <div class="nav-tabs-custom">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#dztChartTab" data-toggle="tab"
                                              onclick="hiddenKztSearchForm()">单值图</a></li>
                        <li><a href="#kztChartTabXR" data-toggle="tab" onclick="showKztSearchForm()">X-R控制图</a></li>
                        <li><a href="#kztChartTabXS" data-toggle="tab" onclick="showKztSearchForm()">X-S控制图</a></li>
                        <li><a href="#kztChartTabIMR" data-toggle="tab" onclick="showKztSearchForm()">I-MR控制图</a></li>
                        <li class="pull-right">
                            <form class="form-horizontal" style="display:none" id="kztSearchForm">
                                <div class="row">
                                    <label class="control-label"
                                           style="float: left;font-size: 15px;font-weight: normal ">样本数:</label>
                                    <input type="text" class="form-control" style="width: 100px;float: left" value="125"
                                           id="kztWvwertCountXR">
                                    <label class="control-label"
                                           style="float: left;font-size: 15px;font-weight: normal;margin-left: 20px">样本容量:</label>
                                    <input type="text" class="form-control" style="width: 100px;float: left" value="5"
                                           id="kztSimpleSizeXR">
                                    <button id="kztChartBtnXR" type="button" class="btn btn-info"
                                            style="margin-left: 20px" onclick="searchKztXR()">确定
                                    </button>
                                </div>
                            </form>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="dztChartTab">
                            <div class="input-group col-md-3 col-xs-12">
                                <input type="text" class="form-control pull-right" id="dztSearchTime">
                            </div>
                            <div id="modalChart"></div>
                        </div>
                        <div class="tab-pane" id="kztChartTabXR">
                            <div id="kztChartDivXR"></div>
                        </div>
                        <div class="tab-pane" id="kztChartTabXS">
                            <div id="kztChartDivXS"></div>
                        </div>
                        <div class="tab-pane" id="kztChartTabIMR">
                            <div id="kztChartDivIMR"></div>
                        </div>
                    </div>
                </div>
            </div>
            <%--            <div class="modal-footer">--%>
            <%--                <button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>--%>
            <%--                <button type="button" class="btn btn-primary">Save changes</button>--%>
            <%--            </div>--%>
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
    var startTime = moment().startOf('second').add(-24, 'hour').format('YYYY-MM-DD HH:mm:ss');
    var endTime = moment().startOf('second').format('YYYY-MM-DD HH:mm:ss');
    var ifQbShowOpen = false;
    var qbCarouselIndex = 0;
    var runRealTime;
    $(function () {
        $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
            checkboxClass: 'icheckbox_flat-blue',
            radioClass: 'iradio_flat-blue'
        })
        $('#currentSearchType1').on('ifChecked', function(event){
            $('#currentSearchTypeDiv1').show();
            $('#currentSearchTypeDiv2').hide();
        });
        $('#currentSearchType2').on('ifChecked', function(event){
            $('#currentSearchTypeDiv1').hide();
            $('#currentSearchTypeDiv2').show();
        });
        $('#defaultSearchType1').on('ifChecked', function(event){
            $('#defaultSearchTime').attr('disabled',false);
            $('#defaultSearchCount').attr('disabled',true);
        });
        $('#defaultSearchType2').on('ifChecked', function(event){
            $('#defaultSearchTime').attr('disabled',true);
            $('#defaultSearchCount').attr('disabled',false);
        });
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
        $("#mmMerkmalBox").boxRefresh({
            source: '<%=basePath%>baqb/initMissionManageDetails',
            // params: {startTime:startTime,endTime:endTime},
            content: '.box-body',
            //是否自动加载内容
            loadInContent: true,
            overlayTemplate: '<div class="overlay"><div class="fa fa-refresh fa-spin"></div></div>',
            onLoadStart: function () {
            },
            onLoadDone: function (response) {
                initDetailsTable();
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
        $('#dztSearchTime').daterangepicker({
            timePicker: true,
            timePicker24Hour: true,
            timePickerIncrement: 10,
            startDate: startTime,
            endDate: endTime,
            locale: {format: 'YYYY-MM-DD HH:mm:ss'},
        }, function (start, end, label) {
            var startTime_search = start.format('YYYY-MM-DD HH:mm:ss');
            var endTime_search = end.format('YYYY-MM-DD HH:mm:ss');
            initMerkmalChart_search(dztSearchTeil, dztSearchMerkmal, startTime_search, endTime_search)
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
        if (qbCarouselIndex !== 2) {
            $('#plChartCarousel').carousel('prev');
            $('#qaChartCarousel').carousel('prev');
        }
        if (qbCarouselIndex === 1) {
            $('#qbTitle1').html('');
            $('#mmTitle1').html('');
            $('#qaTitle2').html('');
        }
        if (manyMmchartArr !== undefined) {
            manyMmchartArr = [];
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
                $('#defaultSearchTime').val(data.defaultSearchTime);
                $('#defaultSearchCount').val(data.defaultSearchCount);
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
                if(data.defaultSearchType == 0){
                    $('#defaultSearchType1').iCheck('check');
                    $('#defaultSearchCount').attr('disabled',true);
                }else if(data.defaultSearchType == 1){
                    $('#defaultSearchType2').iCheck('check');
                    $('#defaultSearchTime').attr('disabled',true);

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
        var toleranceFlag = 0;
        var decimalFlag = 0;
        var wertCountFlag = 0;
        var defaultSearchType;
        var toleranceReg = /^([+]\d+[.]\d+|[-]\d+[.]\d+|\d+[.]\d+|[+]\d+|[-]\d+|\d+)$/gi;
        var decimalReg = /^([1-9]\d*|[0]{1,1})$/;
        if ($('#ifSetupTolerance').prop("checked")) {
            toleranceFlag = 1;
            if ($('#tolerance').val() == 0 | !toleranceReg.test($('#tolerance').val())) {
                $('#decimalWarn').html("警戒限输入有误！！！")
                return;
            }
        }
        if ($('#ifSetupDecimal').prop("checked")) {
            decimalFlag = 1;
            if (!decimalReg.test($('#decimal').val())) {
                $('#decimalWarn').html("小数点位输入有误！！！")
                return;
            }
        }
        if ($('#ifQbSerchWertCount').prop("checked")) {
            wertCountFlag = 1;
        }
        if($('#defaultSearchType1').prop("checked")){
            defaultSearchType=0
        }
        if($('#defaultSearchType2').prop("checked")){
            defaultSearchType=1
        }
        $.ajax({
            url: '<%=basePath%>baqb/setupAppConfig',
            type: 'post',
            data: {
                ifSetupTolerance: toleranceFlag,
                tolerance: $('#tolerance').val(),
                ifSetupDecimal: decimalFlag,
                decimal: $('#decimal').val(),
                defaultSearchType:defaultSearchType,
                defaultSearchTime:$('#defaultSearchTime').val(),
                defaultSearchCount:$('#defaultSearchCount').val(),
                ifQbSerchWertCount: wertCountFlag,
                qbSerchWertCount: $('#qbSerchWertCount').val()
            },
            success: function (data) {
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
            if (qbCarouselIndex == 2) {
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
            }, function () {
                $('#' + selectMerkmalEle).removeClass('ion-pie-graph').addClass('ion-checkmark-circled');
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
        var re = /^\d*$/;
        if (!re.test(num)) {
            isNaN(parseInt(num)) ? ele.value = 0 : ele.value = parseInt(num);
        }
    }

    function initMerkmalChart(teilId, merkmalId) {
        var pdata = {
            teilId: teilId,
            merkmalId: merkmalId,
            startTime: startTime,
            endTime: endTime
        }
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getMerkmalChartData',
            data: pdata,
            success: function (data) {
                if (data.length > 0) {
                    $('#merkmalChartDiv').height('500px');
                    if (data[0].MEMERKART != 1) {
                        var upLimit;
                        var downLimit;
                        var newupLimit;
                        var newdownLimit;
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
                            newupLimit = data[0].NEWMEOGW;
                            newdownLimit = data[0].NEWMEUGW;
                            chartTitle = data[0].MEMERKBEZ;
                            mdata = data[0].MENENNMAS;
                            for (var i = 0; i < data.length; i++) {
                                tooltipTime.push(data[i].WVDATZEIT);
                                tooltipPRVORNAME.push(data[i].PRVORNAME == undefined ? '' : data[i].PRVORNAME);
                                tooltipPMBEZ.push('');
                                xValue.push(data[i].WVDATZEIT);
                                yValue.push(data[i].WVWERT)
                            }
                        }
                        // qbLinechart = initQbLineChartWithNewLimit('merkmalChartDiv', xValue, yValue, upLimit, downLimit,newupLimit,newdownLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
                        qbLinechart = initQbLineChartWithNewLimit('modalChart', xValue, yValue, upLimit, downLimit, newupLimit, newdownLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
                    } else {
                        var xData = ['合格', '不合格'];
                        var yData = [];
                        var pieArr = [];
                        var okCount = 0;
                        var nokCount = 0;
                        var title;
                        if (data.length > 0) {
                            title = data[0].MEMERKBEZ
                            for (var i = 0; i < data.length; i++) {
                                if (data[i].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].WVWERT.toString().substring(data[i].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                    nokCount += 1;
                                } else {
                                    okCount += 1;
                                }
                            }
                        }
                        yData = [okCount, nokCount];
                        pieArr = [{name: '合格', value: okCount}, {name: '不合格', value: nokCount}];
                        // qbLinechart = initBarAndPie('merkmalChartDiv', xData, yData, pieArr, title);
                        qbLinechart = initBarAndPie('modalChart', xData, yData, pieArr, title);
                    }
                }
            }
        })
    }

    function initMerkmalChart_search(teilId, merkmalId, startTime_search, endTime_search) {
        var pdata = {
            teilId: teilId,
            merkmalId: merkmalId,
            startTime: startTime_search,
            endTime: endTime_search
        }
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getMerkmalChartDataByTime',
            data: pdata,
            success: function (data) {
                if (data.length > 0) {
                    $('#merkmalChartDiv').height('500px');
                    if (data[0].MEMERKART != 1) {
                        var upLimit;
                        var downLimit;
                        var newupLimit;
                        var newdownLimit;
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
                            newupLimit = data[0].NEWMEOGW;
                            newdownLimit = data[0].NEWMEUGW;
                            chartTitle = data[0].MEMERKBEZ;
                            mdata = data[0].MENENNMAS;
                            for (var i = 0; i < data.length; i++) {
                                tooltipTime.push(data[i].WVDATZEIT);
                                tooltipPRVORNAME.push(data[i].PRVORNAME == undefined ? '' : data[i].PRVORNAME);
                                tooltipPMBEZ.push('');
                                xValue.push(data[i].WVDATZEIT);
                                yValue.push(data[i].WVWERT)
                            }
                        }
                        // qbLinechart = initQbLineChartWithNewLimit('merkmalChartDiv', xValue, yValue, upLimit, downLimit,newupLimit,newdownLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
                        qbLinechart = initQbLineChartWithNewLimit('modalChart', xValue, yValue, upLimit, downLimit, newupLimit, newdownLimit, mdata, tooltipTime, tooltipPRVORNAME, tooltipPMBEZ, chartTitle);
                    } else {
                        var xData = ['合格', '不合格'];
                        var yData = [];
                        var pieArr = [];
                        var okCount = 0;
                        var nokCount = 0;
                        var title;
                        if (data.length > 0) {
                            title = data[0].MEMERKBEZ
                            for (var i = 0; i < data.length; i++) {
                                if (data[i].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].WVWERT.toString().substring(data[i].WVWERT.toString().indexOf(".") - 1)) > 0) {
                                    nokCount += 1;
                                } else {
                                    okCount += 1;
                                }
                            }
                        }
                        yData = [okCount, nokCount];
                        pieArr = [{name: '合格', value: okCount}, {name: '不合格', value: nokCount}];
                        // qbLinechart = initBarAndPie('merkmalChartDiv', xData, yData, pieArr, title);
                        qbLinechart = initBarAndPie('modalChart', xData, yData, pieArr, title);
                    }
                }
            }
        })
    }

    function showKztSearchForm() {
        $('#kztSearchForm').show();
    }

    function hiddenKztSearchForm() {
        $('#kztSearchForm').hide();
    }

    function getKztDataXR(teilId, merkmalId) {
        var ww = $(window).width();
        var hh = $(window).height();
        $('#kztChartDivXR').width(ww * 0.8);
        $('#kztChartDivXR').height(hh * 0.7);
        $('#kztChartDivXS').width(ww * 0.8);
        $('#kztChartDivXS').height(hh * 0.7);
        var groupCount = $('#kztSimpleSizeXR').val();
        $.ajax({
            type: 'post',
            url: '<%=basePath%>baqb/getKztChartData',
            data: {
                teilId: teilId,
                merkmalId: merkmalId,
                wvwertCount: $('#kztWvwertCountXR').val()
            },
            success: function (data) {
                var dataList = data[0].wvList;
                var meugw = data[0].MEUGW;
                var meogw = data[0].MEOGW;
                var groupArr = new Array();//分组完的List
                var smallArr = new Array();//List中的组
                var tooltipArr = new Array();//tooltip显示数据
                var tooltipSmallArr = new Array();//tooltip显示数据
                for (var i = 0; i < dataList.length; i++) {
                    smallArr.push(dataList[i].WVWERT);
                    tooltipSmallArr.push("测量值：" + dataList[i].WVWERT + " 测量时间：" + dataList[i].WVDATZEIT);
                    if (smallArr.length == groupCount) {
                        groupArr.push(smallArr);
                        tooltipArr.push(tooltipSmallArr);
                        tooltipSmallArr = [];
                        smallArr = [];
                    }
                    if (dataList.length - groupArr.length * groupCount > 0 & dataList.length - groupArr.length * groupCount < groupCount & dataList.length - groupArr.length * groupCount === smallArr.length) {
                        groupArr.push(smallArr);
                        tooltipArr.push(tooltipSmallArr);
                    }
                }
                var averageArr = new Array();//平均值数组
                var rangeArr = new Array();//极差数组
                var sbarArr = new Array();//标准差数组
                var xValue = new Array();
                for (var i = 0; i < groupArr.length; i++) {
                    var garr = new Array();
                    garr = groupArr[i];
                    var gtotal = 0;
                    for (var j = 0; j < garr.length; j++) {
                        gtotal += parseFloat(garr[j]);
                    }
                    averageArr.push(gtotal / garr.length);
                    rangeArr.push(garr.maxValue() - garr.minValue());
                    sbarArr.push(getStddev(garr));
                    xValue.push(i + 1);

                }
                initKztXR("kztChartDivXR", xValue, averageArr, rangeArr, tooltipArr, meugw, meogw);
                initKztXS("kztChartDivXS", xValue, averageArr, sbarArr, tooltipArr, meugw, meogw)
                getKztDataIMR(data);
            }
        })
    }

    function searchKztXR() {
        getKztDataXR(dztSearchTeil, dztSearchMerkmal);
    }

    function getKztDataIMR(data) {
        var ww = $(window).width();
        var hh = $(window).height();
        $('#kztChartDivIMR').width(ww * 0.8);
        $('#kztChartDivIMR').height(hh * 0.7);
        var groupCount = $('#kztSimpleSizeXR').val();
        var dataList = data[0].wvList;
        var meugw = data[0].MEUGW;
        var meogw = data[0].MEOGW;
        var groupArr = new Array();
        var tooltipArr = new Array();//tooltip显示数据
        for (var i = dataList.length - 1; i > 0; i--) {
            var smallArr = new Array();//List中的组
            var tooltipSmallArr = new Array();
            for (var j = 0; j < groupCount; j++) {
                if (i - j >= 0) {
                    smallArr.push(dataList[i - j].WVWERT);
                    tooltipSmallArr.push("测量值：" + dataList[i - j].WVWERT + " 测量时间：" + dataList[i - j].WVDATZEIT);
                }
            }
            groupArr.unshift(smallArr);
            tooltipArr.unshift(tooltipSmallArr);
        }
        var averageArr = new Array();//平均值数组
        var rangeArr = new Array();//极差数组
        var xValue = new Array();
        for (var i = 0; i < groupArr.length; i++) {
            var garr = new Array();
            garr = groupArr[i];
            var gtotal = 0;
            for (var j = 0; j < garr.length; j++) {
                gtotal += parseFloat(garr[j]);
            }
            averageArr.push(gtotal / garr.length);
            rangeArr.push(garr.maxValue() - garr.minValue());
            xValue.push(i + 1);

        }
        initKztIMR("kztChartDivIMR", xValue, averageArr, rangeArr, tooltipArr, meugw, meogw);
    }
</script>
</body>
</html>
