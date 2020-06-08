<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="meta.jsp" %>
<html>
<head>
    <style type="text/css">
        html {
            overflow: hidden;
        }
    </style>
</head>
<body class="hold-transition skin-blue sidebar-mini fixed">
<div class="wrapper">
    <!-- Main Header -->
    <header class="main-header">
        <!-- Logo -->
        <a href="index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><img src="<%=basePath%>resources/images/QDASLogo_blau.png"
                                         style="width: 100%;height: 100%"></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><img src="<%=basePath%>resources/images/qdas-logo.png"
                                       style="width: 100%;height: 100%"></span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->
                            <img src="<%=basePath %>resources/AdminLTE/dist/img/user2-160x160.jpg" class="user-image"
                                 alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">admin</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="<%=basePath %>resources/AdminLTE/dist/img/user2-160x160.jpg"
                                     class="img-circle" alt="User Image">

                                <p>
                                    admin
                                    <small>Member since Nov. 2012</small>
                                </p>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">Profile</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">Sign out</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar Menu -->
            <ul class="sidebar-menu" data-widget="tree">
                <%--<li class="header">菜单</li>
                <li class="treeview active">
                    <a href="#"><i class="fa fa-link"></i> <span>格特拉克</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                          </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a data-addtab="qb" data-url="<%=basePath%>baqb/initQualityBoardPage"><i class="fa fa-circle-o"></i>质量看板</a></li>
                        <li><a><i class="fa fa-circle-o"></i>任务管理</a></li>
                        <li><a><i class="fa fa-circle-o"></i>质量分析</a></li>
                    </ul>
                </li>--%>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper" id="content-wrapper" style="min-height: 421px;">
        <!--bootstrap tab风格 多标签页-->
        <div class="content-tabs">
            <button class="roll-nav roll-left tabLeft" onclick="scrollTabLeft()">
                <i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs menuTabs tab-ui-menu" id="tab-menu">
                <div class="page-tabs-content" style="margin-left: 0px;">

                </div>
            </nav>
            <button class="roll-nav roll-right tabRight" onclick="scrollTabRight()">
                <i class="fa fa-forward" style="margin-left: 3px;"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown tabClose" data-toggle="dropdown">
                    页签操作<i class="fa fa-caret-down" style="padding-left: 3px;"></i>
                </button>
                <ul class="dropdown-menu dropdown-menu-right" style="min-width: 128px;">
                    <li><a class="tabReload" href="javascript:refreshTab();">刷新当前</a></li>
                    <li><a class="tabCloseCurrent" href="javascript:closeCurrentTab();">关闭当前</a></li>
                    <li><a class="tabCloseAll" href="javascript:closeOtherTabs(true);">全部关闭</a></li>
                    <li><a class="tabCloseOther" href="javascript:closeOtherTabs();">除此之外全部关闭</a></li>
                </ul>
            </div>
            <button class="roll-nav roll-right fullscreen" onclick="App.handleFullScreen()"><i
                    class="fa fa-arrows-alt"></i></button>
        </div>
        <div class="content-iframe " style="background-color: #ffffff; ">
            <div class="tab-content " id="tab-content">

            </div>
        </div>
    </div>
    <!-- /.content-wrapper -->
    <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->
<script src="<%=basePath %>resources/AdminLTE/dist/js/app_iframe.js"></script>

<script type="text/javascript">
    function search_menu() {
        //要搜索的值
        var text = $('input[name=q]').val();

        var $ul = $('.sidebar-menu');
        $ul.find("a.nav-link").each(function () {
            var $a = $(this).css("border","");

            //判断是否含有要搜索的字符串
            if ($a.children("span.menu-text").text().indexOf(text) >= 0) {

                //如果a标签的父级是隐藏的就展开
                $ul = $a.parents("ul");

                if ($ul.is(":hidden")) {
                    $a.parents("ul").prev().click();
                }

                //点击该菜单
                $a.click().css("border","1px solid");

//                return false;
            }
        });
    }
    $(function () {
        //onsole.log(window.location);

        App.setbasePath("");
        App.setGlobalImgPath("<%=basePath %>resources/AdminLTE/dist/img/");

        addTabs({
            id: '10008',
            title: '欢迎页',
            close: false,
            url: '<%=basePath%>batq/initTodayPage',
            urlType: "relative"
        });

        App.fixIframeCotent();
        var menus = [
            {
                id: "9000",
                text: "主菜单",
                icon: "",
                isHeader: true
            },
            {
                id: "9001",
                text: "格特拉克",
                icon: "fa fa-laptop",
                isOpen:true,
                children: [
                    {
                        id: "90011",
                        text: "质量看板",
                        icon: "fa fa-circle-o",
                        url: "<%=basePath%>baqb/initQualityBoardPage",
                        targetType: "iframe-tab"
                    },
                    {
                        id: "90012",
                        text: "任务管理",
                        url: "<%=basePath%>baqb/initQualityBoardPage",
                        targetType: "iframe-tab",
                        icon: "fa fa-circle-o"
                    },
                    {
                        id: "90013",
                        text: "质量分析",
                        url: "<%=basePath%>baqb/initQualityBoardPage",
                        targetType: "iframe-tab",
                        icon: "fa fa-circle-o"
                    },
                ]
            }
        ];
        $('.sidebar-menu').sidebarMenu({data: menus});

    });
</script>
</body>
</html>
