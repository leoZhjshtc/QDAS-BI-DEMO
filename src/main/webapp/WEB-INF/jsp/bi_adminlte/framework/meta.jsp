<%-- 资源文件页面 --%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Q-DAS</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" type="image/x-icon">


<link rel="stylesheet" href="<%=basePath %>resources/AdminLTE/bower_components/pace/themes/blue/pace-theme-flash.css">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet" href="<%=basePath %>resources/AdminLTE/bower_components/bootstrap/dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="<%=basePath %>resources/AdminLTE/bower_components/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="<%=basePath %>resources/AdminLTE/bower_components/Ionicons/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="<%=basePath %>resources/AdminLTE/dist/css/AdminLTE.css">

<link rel="stylesheet" href="<%=basePath %>resources/AdminLTE/dist/css/skins/_all-skins.min.css">

<!-- jQuery 3 -->
<script type="text/javascript" src="<%=basePath %>resources/AdminLTE/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script type="text/javascript" src="<%=basePath %>resources/AdminLTE/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>resources/AdminLTE/dist/js/adminlte.js"></script>
<!-- Slimscroll -->
<script src="<%=basePath %>resources/AdminLTE/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="<%=basePath %>resources/AdminLTE/bower_components/fastclick/lib/fastclick.js"></script>
<script type="text/javascript" src="<%=basePath %>resources/AdminLTE/bower_components/pace/pace.min.js"></script>