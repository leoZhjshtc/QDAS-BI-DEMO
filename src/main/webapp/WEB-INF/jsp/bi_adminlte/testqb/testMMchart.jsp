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
                <div class="col-md-6">
                    <!-- Custom Tabs -->
                    <div class="nav-tabs-custom">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#tab_1" data-toggle="tab">Tab 1</a></li>
                            <li><a href="#tab_2" data-toggle="tab">Tab 2</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="tab_1">
                                <p>Exactly like the original bootstrap tabs except you should use
                                    the custom wrapper <code>.nav-tabs-custom</code> to achieve this style.</p>
                                A wonderful serenity has taken possession of my entire soul,
                                like these sweet mornings of spring which I enjoy with my whole heart.
                                I am alone, and feel the charm of existence in this spot,
                                which was created for the bliss of souls like mine. I am so happy,
                                my dear friend, so absorbed in the exquisite sense of mere tranquil existence,
                                that I neglect my talents. I should be incapable of drawing a single stroke
                                at the present moment; and yet I feel that I never was a greater artist than now.
                            </div>
                            <!-- /.tab-pane -->
                            <div class="tab-pane" id="tab_2">
                                The European languages are members of the same family. Their separate existence is a myth.
                                For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ
                                in their grammar, their pronunciation and their most common words. Everyone realizes why a
                                new common language would be desirable: one could refuse to pay expensive translators. To
                                achieve this, it would be necessary to have uniform grammar, pronunciation and more common
                                words. If several languages coalesce, the grammar of the resulting language is more simple
                                and regular than that of the individual languages.
                            </div>

                        </div>
                        <!-- /.tab-content -->
                    </div>
                    <!-- nav-tabs-custom -->
                </div>
                <!-- /.col -->
                <div class="col-md-12">
                    <div id="qbbox" class="box box-solid bg-teal-gradient">
                        <div class="box-header">
                            <h3 class="box-title">产线看板 &nbsp;&nbsp;<small id="qbTitle1"></small><small
                                    id="qbTitle2"></small></h3>
                            <div class="box-tools pull-right">
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="nav-tabs-custom bg-teal-gradient">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#tab_1" data-toggle="tab">Tab 1</a></li>
                                    <li><a href="#tab_2" data-toggle="tab">Tab 2</a></li>
                                </ul>
                                <div class="tab-content bg-teal-gradient">
                                    <div class="tab-pane active" id="tab_1">
                                        <p>Exactly like the original bootstrap tabs except you should use
                                            the custom wrapper <code>.nav-tabs-custom</code> to achieve this style.</p>
                                        A wonderful serenity has taken possession of my entire soul,
                                        like these sweet mornings of spring which I enjoy with my whole heart.
                                        I am alone, and feel the charm of existence in this spot,
                                        which was created for the bliss of souls like mine. I am so happy,
                                        my dear friend, so absorbed in the exquisite sense of mere tranquil existence,
                                        that I neglect my talents. I should be incapable of drawing a single stroke
                                        at the present moment; and yet I feel that I never was a greater artist than now.
                                    </div>
                                    <!-- /.tab-pane -->
                                    <div class="tab-pane bg-teal-gradient" id="tab_2">
                                        The European languages are members of the same family. Their separate existence is a myth.
                                        For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ
                                        in their grammar, their pronunciation and their most common words. Everyone realizes why a
                                        new common language would be desirable: one could refuse to pay expensive translators. To
                                        achieve this, it would be necessary to have uniform grammar, pronunciation and more common
                                        words. If several languages coalesce, the grammar of the resulting language is more simple
                                        and regular than that of the individual languages.
                                    </div>

                                </div>
                                <!-- /.tab-content -->
                            </div>

                        </div>
                    </div>
                </div>
            <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>
                <p>11111111</p>
                <p>11111111</p>
                <p>11111111</p><p>11111111</p>


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
</script>
</body>
</html>
