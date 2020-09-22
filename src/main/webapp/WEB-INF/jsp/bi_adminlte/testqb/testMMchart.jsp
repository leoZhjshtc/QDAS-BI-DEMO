<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
   <link rel="stylesheet" type="text/css"
          href="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <%--  <link type="text/css" href="<%=basePath %>resources/test/bootstrap-switch.min.css">
     <script type="text/javascript"
             src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/jquery/dist/jquery.min.js"></script>
     <script type="text/javascript"
             src="<%=basePath %>resources/AdminLTE-2.4.18/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
     <script type="text/javascript" src="<%=basePath %>resources/test/bootstrap-switch.min.js"></script>--%>


    <link href="https://cdn.bootcss.com/bootstrap-switch/4.0.0-alpha.1/css/bootstrap-switch.min.css" rel="stylesheet">

    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>

    <script src="https://cdn.bootcss.com/bootstrap-switch/4.0.0-alpha.1/js/bootstrap-switch.min.js"></script>
</head>
<body>
111111111111111111111111111111111111111111
                <input id="testw" type="checkbox">



</body>
<script type="text/javascript">
$(function () {
    $('#testw').bootstrapSwitch({
        onText:"ON",
        offText:"OFF",
        onColor:"success",
        offColor:"danger",
        size:"small",
        onSwitchChange:function(event,state){
            if(state==true){
                console.log('已打开');
            }else{
                console.log('已关闭');
            }
        }
    });
})


</script>
</html>
