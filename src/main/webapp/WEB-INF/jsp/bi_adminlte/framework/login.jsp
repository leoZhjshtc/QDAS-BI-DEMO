<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="meta.jsp"%>
<html>
<head>
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><img src="<%=basePath%>resources/images/qdas-logo.png"></a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg"></p>

        <form id="loginForm" action="<%=basePath%>ba/doLogin" method="post">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="账号" value="admin">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="密码" value="123456">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
        </form>

        <div class="social-auth-links text-center">
            <p></p>
            <button onclick="loginSubmit()" class="btn btn-primary btn-block btn-flat">登录</button>
        </div>
        <!-- /.social-auth-links -->

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->
<script>
    function loginSubmit() {
        $('#loginForm').submit();
    }
</script>
</body>
</html>
