<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
    <script type="text/javascript" src="<%=basePath%>resources/js/echarts.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/js/mytheme.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/js/charts.js"></script>
    <title>质量看板</title>
    <style type="text/css">
        font {
            font-size: 18px;
            font-weight: bold
        }
        .buttonText{
            font-size:18px;
            line-height: 20px;
        }
    </style>
    <script type="text/javascript">
        var today = new Date();
        var startTime = today.format('yyyy-MM-dd 00:00:00');
        var endTime;
        var pageIndex = 0;
        var plInterval=null;
        $(function () {
            $('#plAcc').panel('refresh', '<%=basePath%>qbGetrag/initTeilPage?startTime=' + startTime);
            $('#qbShowDiv').window({
                width: $(window).width() - 100,
                height: $(window).height() - 100,
                title:'看板',
                cache:false,
                collapsible: false,
                minimizable: false,
                modal: true,
                closed: true,
                href:'<%=basePath%>qbGetrag/initQbShowPage',
                onClose:function () {
                    clearInterval(plInterval);
                }
            });
        })
        function timeRadioClick(checked) {
            var now = new Date();
            if (checked == 1) {
                startTime = now.format('yyyy-MM-dd 00:00:00');
                endTime='';
            } else if (checked == 2) {
                var searchTime = now.getTime() - (86400000);
                var yesday = new Date(searchTime)
                startTime = yesday.format('yyyy-MM-dd 00:00:00');
                endTime = now.format('yyyy-MM-dd 00:00:00');
            } else if (checked == 3) {
                var weekStartDate = new Date(now.getFullYear(), now.getMonth(), now.getDate() - now.getDay());
                startTime = weekStartDate.format('yyyy-MM-dd 00:00:00');
                endTime='';
            }
            $('#plAcc').panel('refresh', '<%=basePath%>qbGetrag/initTeilPage?startTime=' + startTime+"&endTime="+endTime);
        }
        function plOpenQbShow() {
            pageIndex=0;
            $('#qbShowDiv').window('open');
        }
    </script>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'center',border:false" style="overflow: hidden;">
        <div id="qbAcc" class="easyui-accordion" style="height: 100%;width: 100%">
            <div title="零件" data-options="selected:true" style="overflow:auto;">
                <div class="easyui-layout" fit="true">
                    <div data-options="region:'north',border:true" style="height: 40px;padding: 5px;overflow: hidden">
                        <form style="float: left">
                            <input class="easyui-radiobutton"
                                   data-options="checked:true,onChange:function(checked){if(checked){timeRadioClick(1)}}"
                                   name="plDateChose" value="1" label="今日:" labelAlign="right">
                            <input class="easyui-radiobutton"
                                   data-options="onChange:function(checked){if(checked){timeRadioClick(2)}}"
                                   name="plDateChose" value="2" label="昨日:" labelAlign="right">
                            <input class="easyui-radiobutton"
                                   data-options="onChange:function(checked){if(checked){timeRadioClick(3)}}"
                                   name="plDateChose" value="7" label="这周:" labelAlign="right">
                        </form>
                        <a id="plQbShow" class="easyui-linkbutton" data-options="iconCls:'icon-kanbanicon'" onclick="plOpenQbShow();"
                           style="float: right">打开轮播看板</a>
                    </div>
                    <div id="plAcc" data-options="region:'center',border:false"></div>
                </div>
            </div>
            <div id="teilAcc" title="工序" data-options="">

            </div>
            <div id="merkmalAcc" title="参数">
            </div>
        </div>
    </div>
</div>
<div id="qbShowDiv">
</div>
</body>
</html>