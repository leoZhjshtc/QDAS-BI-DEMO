<%--
  Created by IntelliJ IDEA.
  User: leo.zhou
  Date: 2020/4/7
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-panel" title="车间轮播间隔" style="width:100%;padding:20px;height: 150px">
    <input id="intervalBar" class="easyui-slider" style="width:300px;" data-options="showTip:true,tipFormatter: function(value){
                return value+' 秒';
            },min:10,max:60,value:${qmInterval}">
    <a id="qmIntervalBtn" class="easyui-linkbutton" style="margin-top: 5px;width: 100px" data-options="">确定</a>
</div>
<script type="text/javascript">
    $(function () {
        $('#qmIntervalBtn').click(function () {
            $.messager.progress();
            $.ajax({
                type:'post',
                url:'<%=basePath%>system/qmIntervalSetup',
                data:{
                    intervalTime:$('#intervalBar').slider('getValue')
                },
                success:function (data) {
                    if(data.mess=1){
                        $.messager.show({
                            title:'提示',
                            msg:'修改成功',
                            timeout:3000,
                            showType:'slide'
                        });
                    }else{
                        $.messager.alert('提示','修改失败   原因未知','info');
                    }
                    $.messager.progress('close');
                }
            })
        })
    })
</script>
</body>
</html>
