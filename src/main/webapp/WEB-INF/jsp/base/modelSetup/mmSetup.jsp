<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../meta.jsp" %>
<html>
<head>

</head>
<body>
<div class="easyui-panel" title="检验原因设置" style="width:500px;height: 550px">
    <table id="mmTable">
        <thead>
        <tr>
            <th data-options="field:'BEZ',width:50,align:'center'">检验原因</th>
            <th data-options="field:'a',width:50,align:'center',formatter:colorFormatter">颜色</th>
            <th data-options="field:'b',width:50,align:'center',formatter:btnFormatter">操作</th>
        </tr>
        </thead>
    </table>
    <div id="mmTableTB">
        <input class="easyui-color" id="colorCombo">
    </div>
</div>
<script type="text/javascript" src="<%=basePath%>resources/js/jquery.color.js"></script>
<script type="text/javascript">
    $('#mmTable').datagrid({
        url: '<%=basePath%>system/getAllCheckType',
        toolbar: '#mmTableTB',
        border: false,
        pagination: false,
        fit: true,
        rownumbers: true,
        fitColumns: true,
        singleSelect: true,
        checkOnSelect: true,
        selectOnCheck: true,
        pageSize: 20,
        pageList: [20, 40, 60, 80],
        dndRow: false,
        enableHeaderClickMenu: false,
        enableHeaderContextMenu: true,
        enableRowContextMenu: false,
        rowTooltip: false,
    })
    function colorFormatter(value, row, index) {
        return "<div style='width: 20px;height: 20px;background-color: "+row.color+"'></div>"
    }
    function btnFormatter(value, row, index) {
        return "<input type=\"button\" value='设为选定的颜色' onclick=\"setTextColor('" + row.KATKEY + "')\">";
    }

    function setTextColor(katkey) {
        var selectColor=$('#colorCombo').combo('getValue');
        if(selectColor==''|selectColor==undefined){
            $.messager.alert('信息','请先选定颜色！','info');
        }else{
            $.messager.progress();
            $.ajax({
                type: 'post',
                url: '<%=basePath%>system/mmColorSetup',
                data: {
                    katkey: katkey,
                    katkeyColor: selectColor
                },
                success: function (data) {
                    if (data.mess = 1) {
                        $.messager.show({
                            title: '提示',
                            msg: '修改成功',
                            timeout: 3000,
                            showType: 'slide'
                        });
                    } else {
                        $.messager.alert('提示', '修改失败   原因未知', 'info');
                    }
                    $.messager.progress('close');
                    $('#mmTable').datagrid('reload');
                }
            })
        }
    }
</script>
</body>
</html>
