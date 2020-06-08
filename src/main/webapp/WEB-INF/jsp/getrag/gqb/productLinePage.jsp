<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../base/meta.jsp" %>
<html>
<head>
</head>
<body>
<div class="easyui-layout" fit="true">
    <div data-options="region:'center',border:false" style="overflow: hidden;">
        <div id="plarea" class="area" style="background-image: url(<%=basePath%>resources/images/chejianbg.png); background-size: cover;">
            <div style="display: flex;height:50%">
                <div class="area1" style="width:100%">
                    <div class="arow">
                        <div class="mitem ablock">
                            <div class="innerNoData" id="div7501052107DPRack80">
                                <div class="divTitle">
                                    <p>7501052107</p><p>DP Rack</p><p>80</p>
                                </div>
                                <div class="divData" id="7501052107DPRack80">
                                </div>
                            </div>
                        </div>
                        <div class="sitem ablock">
                            <div class="innerNoData" id="div7501052103DPRackDPRack">
                                <div class="divTitle">
                                    <p>7501052103</p><p>DP Rack</p><p>DP Rack</p>
                                </div>
                                <div class="divData" id="7501052103DPRackDPRack">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="arow">
                        <div class="litem ablock">
                            <div class="innerNoData" id="div7501052106DPRack80">
                                <div class="divTitle">
                                    <p>7501052106</p><p>DP Rack</p><p>80</p>
                                </div>
                                <div class="divData" id="7501052106DPRack80">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="arow">
                        <div class="litem ablock">
                            <div class="innerNoData">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div style="display: flex;height:50%">
                <div class="area3" style="width:43%">
                    <div class="arow">
                        <div class="mitem ablock">
                            <div class="innerNoData">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                        <div class="sitem ablock">
                            <div class="innerNoData">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="arow">
                        <div class="mitem ablock">
                            <div class="innerNoData">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                        <div class="sitem ablock">
                            <div class="inner">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="arow">
                        <div class="litem ablock">
                            <div class="inner">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="area4" style="width:57%">
                    <div class="arow" style="height:49.5%">
                        <div class="litem ablock">
                            <div class="innerNoData">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="arow" style="height:49.5%">
                        <div class="litem ablock">
                            <div class="innerNoData">
                                <div class="divTitle">
                                    <p>EPSp-FA-1</p><p>EPSp-FA-1</p>
                                </div>
                                <div class="divData">
                                    <p></p>
                                    <p></p>
                                    <p></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<style>
   /* body {
        background-image: url(<%=basePath%>resources/images/chejianbg.png);
        background-size: cover;
    }*/
    .area {
        /* display: grid;
        display: -ms-grid;
        -ms-grid-columns: 58% 42%;
        grid-template-columns: 58% 42%;
        -ms-grid-rows: 50% 50%;
        grid-template-rows: 50% 50%; */
        width: 100%;
        height: 100%;
    }
    .area2 {
        display: flex;
        flex-direction: column;
    }
    /*.namearea {
        height: 66%;
        width: 100%;
        background: url(nameborder.png);
        background-size: 100% 100%;
        background-repeat: no-repeat;
        display: flex;
        align-items: center;
        justify-content: center;
    }*/
    .arow {
        display: flex;
        height: 33%;
    }
    .sitem {
        width: 30%;
    }
    .mitem {
        width: 70%;
    }
    .litem {
        width: 100%;
    }
    .ablock {
        background: rgba(61, 171, 132, 0.059);
        border-radius: 5px;
        padding: 6px;
        border: 2px solid rgba(105, 155, 135, 0.239);
        margin: 5px;
        cursor:hand;
    }
    .ablock .inner {
        padding: 5px;
        width: 100%;
        height: 100%;
        border-radius: 5px;
        /*background: rgba(106, 156, 136, 0.239);*/
        background: #5AC594;
        /*display: flex;
        align-items: center;
        justify-content: center;*/
        font-size: 25px;
        color: #0a7d6f;
    }
    .ablock .innerFail {
        padding: 5px;
        width: 100%;
        height: 100%;
        border-radius: 5px;
        background: #E98B7F;
        /*display: flex;
        align-items: center;
        justify-content: center;*/
        font-size: 25px;
        color: #d33724;
    }
    .ablock .innerNoData {
        padding: 5px;
        width: 100%;
        height: 100%;
        border-radius: 5px;
        background: #B3BABB;
        /*display: flex;
        align-items: center;
        justify-content: center;*/
        /*font-size: 25px;*/
        color: #6C7070;
    }
    body {
        font-family: Microsoft YaHei, 微软雅黑;
    }
    .divTitle{
        font-size: 25px;
        float: left;
        max-width: 50%;
    }
    .divData{
        font-size: 20px;
        float: right;
        max-width: 50%;
    }
</style>
<script type="text/javascript">
    $(function () {
        getProductLineData();
    })
    function getProductLineData() {
        $.ajax({
            type:'post',
            data:{
                startTime:startTime,
                endTime:endTime
            },
            url:'<%=basePath%>gqb/getProductLineData',
            beforeSend:function(){
                initLoading('plarea', 'loadingplarea');
            },
            success:function (data) {
                if(data.length>0){
                    for(var i=0;i<data.length;i++){
                        var teilNum=data[i].TETEILNR;
                        var teilK1003=data[i].TEKURZBEZEICH;
                        var processNum=data[i].TEAUFTRAGSTR;
                        var divId=data[i].TETEILNR.replace(/\s/g, "")+data[i].TEKURZBEZEICH.replace(/\s/g, "")+data[i].TEAUFTRAGSTR.replace(/\s/g, "");
                        var qflag=0;
                        for (var j = 0; j < data[i].wvList.length; j++) {
                            if (data[i].wvList[j].MEMERKART == '1') {
                                if (data[i].wvList[j].WVWERT.toString().indexOf('.') !== 0 & parseFloat(data[i].wvList[j].WVWERT.toString().substring(data[i].wvList[j].WVWERT.toString().indexOf(".") - 1) > 0)) {
                                    qflag=1;
                                    break;
                                }
                            } else {
                                if (data[i].wvList[j].MEUGW != undefined & data[i].wvList[j].MEUGW != '' & data[i].wvList[j].MEUGW != 'null' & parseFloat(data[i].wvList[j].MEUGW) > parseFloat(data[i].wvList[j].WVWERT)) {
                                    qflag=2;
                                    break;
                                }else if(data[i].wvList[j].MEOGW != undefined & data[i].wvList[j].MEOGW != '' & data[i].wvList[j].MEOGW != 'null' & parseFloat(data[i].wvList[j].MEOGW) < parseFloat(data[i].wvList[j].WVWERT)){
                                    qflag=3;
                                    break;
                                }
                            }
                        }
                        if(qflag==0){
                            $('#div'+divId).removeClass('innerNoData').addClass('inner');
                            $('#div'+divId).on("click", {teilNum: teilNum,teilK1003:teilK1003,processNum:processNum}, plDivClick);
                        }else if(qflag==1){
                            $('#'+divId).append('<p>参数：'+data[i].wvList[j].MEMERKBEZ+'</p><p>日期：'+data[i].wvList[j].WVDATZEIT+'</p><p>情况：不合格</p>');
                            $('#div'+divId).removeClass('innerNoData').addClass('innerFail');
                            $('#div'+divId).on("click", {teilNum: teilNum,teilK1003:teilK1003,processNum:processNum}, plDivClick);
                        }else if(qflag==2){
                            $('#'+divId).append('<p>参数：'+data[i].wvList[j].MEMERKBEZ+'</p><p>日期：'+data[i].wvList[j].WVDATZEIT+'</p><p>情况：超下公差</p>');
                            $('#div'+divId).removeClass('innerNoData').addClass('innerFail');
                            $('#div'+divId).on("click", {teilNum: teilNum,teilK1003:teilK1003,processNum:processNum}, plDivClick);
                        }else if(qflag==3){
                            $('#'+divId).append('<p>参数：'+data[i].wvList[j].MEMERKBEZ+'</p><p>日期：'+data[i].wvList[j].WVDATZEIT+'</p><p>情况：超上公差</p>');
                            $('#div'+divId).removeClass('innerNoData').addClass('innerFail');
                            $('#div'+divId).on("click", {teilNum: teilNum,teilK1003:teilK1003,processNum:processNum}, plDivClick);
                        }
                    }
                }
                removeLoading('loadingplarea');
            }
        })
    }
    function plDivClick(event){
        var teilNum=event.data.teilNum;
        var teilK1003=event.data.teilK1003;
        var processNum=event.data.processNum;
        $('#gobackBtn').linkbutton('enable');
        $('#qbPlPanel').panel('close');
        $('#qbChartPanel').panel('open').panel('refresh','<%=basePath%>gqb/initProcessPage?teilNum='+teilNum+'&teilK1003='+teilK1003+'&processNum='+processNum);
    }
</script>
</body>
</html>
