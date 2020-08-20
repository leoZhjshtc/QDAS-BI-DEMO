function renderItem(params, api) {
    var categoryIndex = api.value(0);
    var start = api.coord([api.value(1), categoryIndex]);
    var end = api.coord([api.value(2), categoryIndex]);
    // var height = api.size([0, 1])[1] * 0.6;
    var height=30;
    var rectShape = echarts.graphic.clipRectByRect({
        x: start[0],
        y: start[1] - height / 2,
        //width: end[0] - start[0],
        width:5,
        height: height
    }, {
        x: params.coordSys.x,
        y: params.coordSys.y,
        width: params.coordSys.width,
        height: params.coordSys.height
    });
    return rectShape && {
        type: 'rect',
        shape: rectShape,
        style: api.style()
    };
}

function initChart(categories,data,divId){
    var myChart = echarts.init(document.getElementById(divId),'mytheme');
    option = {
        tooltip: {
            formatter: function (params) {
                return params.marker + '零件号：'+params.name+'<br>'+
                    ' 检验原因：'+params.data.WV0063+'<br>'+
                    ' 开始时间：'+params.value[1]+'<br>'+
                    ' 结束时间：'+params.value[2]+'<br>'+
                    ' 检测员：'+params.value[4]+'<br>'+
                    params.name + ': ' + params.value[3];
            },
            confine:true
        },
        dataZoom: [{
            type: 'slider',
            filterMode: 'weakFilter',
            showDataShadow: false,
            //top: 100,
            height: 10,
            borderColor: 'transparent',
            backgroundColor: '#e2e2e2',
            handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
            handleSize: 20,
            handleStyle: {
                shadowBlur: 6,
                shadowOffsetX: 1,
                shadowOffsetY: 2,
                shadowColor: '#aaa'
            },
            labelFormatter: '',
            end:100
        }, {
            type: 'inside',
            filterMode: 'weakFilter'
        }],
       /* grid: {
            left: '3%',
            right: '7%',
            top:'1%',
            bottom: '50px',
            containLabel: true
        },*/
        grid: {
            top:'1%',
            left: '5%',
            right: '3%',
            bottom: '80px',
            containLabel: false
        },
        xAxis: {
            type:'time',
            name:'时间',
            max: function (value) {
                return value.max+(value.max-value.min)*0.1;
            },
            //data: xValues,
            splitLine:{
                show:false
            },
            axisLine: {show: true},
            axisTick: {
                show: true
            }


        },
        yAxis: {
            data: categories,
            axisLabel:{
                interval:0
            }
        },
        series: [{
            type: 'custom',
            renderItem: renderItem,
            itemStyle: {
                normal: {
                    opacity: 1
                }
            },
            encode: {
                x: [1, 2],
                y: 0
            },
            data: data
        }]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
        myChart.resize();
    }
    return myChart;
}
function renderItemAdminlte(params, api) {
    var categoryIndex = api.value(0);
    var start = api.coord([api.value(1), categoryIndex]);
    var end = api.coord([api.value(2), categoryIndex]);
    // var height = api.size([0, 1])[1] * 0.6;
    var height=25;
    var rectShape = echarts.graphic.clipRectByRect({
        x: start[0],
        y: start[1] - height / 2,
        //width: end[0] - start[0],
        width:5,
        height: height
    }, {
        x: params.coordSys.x,
        y: params.coordSys.y,
        width: params.coordSys.width,
        height: params.coordSys.height
    });
    return rectShape && {
        type: 'rect',
        shape: rectShape,
        style: api.style()
    };
}
function initChartAdminlte(categories,data,divId){
    var myChart = echarts.init(document.getElementById(divId),'mytheme');
    option = {
        tooltip: {
            formatter: function (params) {
                return params.marker + '零件号：'+params.name+'<br>'+
                    ' 检验原因：'+params.data.WV0063+'<br>'+
                    ' 开始时间：'+params.value[1]+'<br>'+
                    ' 结束时间：'+params.value[2]+'<br>'+
                    ' 检测员：'+params.value[4]+'<br>'+
                    params.name + ': ' + params.value[3];
            },
            confine:true
        },
        dataZoom: [{
            type: 'slider',
            filterMode: 'weakFilter',
            showDataShadow: false,
            //top: 100,
            height: 10,
            borderColor: 'transparent',
            backgroundColor: '#e2e2e2',
            handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
            handleSize: 20,
            handleStyle: {
                shadowBlur: 6,
                shadowOffsetX: 1,
                shadowOffsetY: 2,
                shadowColor: '#aaa'
            },
            labelFormatter: '',
            end:100
        }],
        /* grid: {
             left: '3%',
             right: '7%',
             top:'1%',
             bottom: '50px',
             containLabel: true
         },*/
        grid: {
            top:'1%',
            left: '5%',
            right: '3%',
            bottom: '80px',
            containLabel: false
        },
        xAxis: {
            type:'time',
            name:'时间',
            max: function (value) {
                return value.max+(value.max-value.min)*0.1;
            },
            //data: xValues,
            splitLine:{
                show:false
            },
            axisLine: {show: true},
            axisTick: {
                show: true
            }


        },
        yAxis: {
            data: categories,
            axisTick: {
                show: true
            },
            axisLabel:{
                interval:0
            }
        },
        series: [{
            type: 'custom',
            renderItem: renderItemAdminlte,
            itemStyle: {
                normal: {
                    opacity: 1
                }
            },
            encode: {
                x: [1, 2],
                y: 0
            },
            data: data
        }]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
        myChart.resize();
    }
    return myChart;
}
function initChartSmall(categories,data,divId){
    var myChart = echarts.init(document.getElementById(divId),'mytheme');
    option = {
        tooltip: {
            formatter: function (params) {
                return params.marker + '零件号：'+params.name+'<br>'+
                    ' 检验原因：'+params.data.WV0063+'<br>'+
                    ' 开始时间：'+params.value[1]+'<br>'+
                    ' 结束时间：'+params.value[2]+'<br>'+
                    ' 检测员：'+params.value[4]+'<br>'+
                    params.name + ': ' + params.value[3];
            },
            confine:true
        },
        dataZoom: [
            {
                type: 'slider',
                show: true,
                handleSize: 5,
                height: 10,
                top: 90
            },
            {
                type: 'inside'
            }
        ],
        grid: {
            top:'1%',
            left: '1%',
            right: '3%',
            bottom: '5px',
            containLabel: false
        },
        xAxis: {
            type:'time',
            name:'时间',
            /*max: function (value) {
                return value.max+(value.max-value.min)*0.05;
            },
            //data: xValues,
            splitLine:{
                show:false
            },
            axisLine: {show: true},
            axisTick: {
                show: true
            }*/
            show:false


        },
        yAxis: {
            data: categories,
            /*axisTick: {
                show: true
            },
            axisLabel:{
                interval:0
            }*/
            show:false

        },
        series: [{
            type: 'custom',
            renderItem: renderItemSmall,
            itemStyle: {
                normal: {
                    opacity: 1
                }
            },
            encode: {
                x: [1, 2],
                y: 0
            },
            data: data
        }]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
        myChart.resize();
    }
    return myChart;
}
function renderItemSmall(params, api) {
    var categoryIndex = api.value(0);
    var start = api.coord([api.value(1), categoryIndex]);
    var end = api.coord([api.value(2), categoryIndex]);
    var height = api.size([0, 1])[1] * 0.7;
    // var height=35;
    var rectShape = echarts.graphic.clipRectByRect({
        x: start[0],
        y: start[1] - height / 2,
        //width: end[0] - start[0],
        width:3,
        height: height
    }, {
        x: params.coordSys.x,
        y: params.coordSys.y,
        width: params.coordSys.width,
        height: params.coordSys.height
    });
    return rectShape && {
        type: 'rect',
        shape: rectShape,
        style: api.style()
    };
}