var point='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';
function initLineChart(divId,xValues,yValues,upLimitData,downLimitData,mData,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ,title,lowcl,upcl,tooltipMeasure){
	var upanddown;
	if(notBlank(downLimitData)&notBlank(upLimitData)){
		upanddown=(parseFloat(upLimitData)-parseFloat(downLimitData))/0.8;
	}else if((!notBlank(downLimitData))&notBlank(upLimitData)){
		upanddown=0;
	}else if((!notBlank(upLimitData))&notBlank(downLimitData)){
		upanddown=0;
	}
	var warnData=getWarnData(downLimitData,upLimitData);
	var averageLine={
            type : 'average',
            lineStyle:{
                color:"#00a9e0",
            },
            name : '平均值',
            label:{
                position:"start",
                    show:true,
                    formatter:'{c}'+'平均值',
                    color:'#00a9e0'
            }
        };
	var makeLineData=new Array();
	makeLineData.push(averageLine);
	if(upLimitData!=null&upLimitData!==''&upLimitData!=undefined){
		var upLimitDataLine={
	    		silent:false,
	            lineStyle:{
	                type:"solid",
	                color:"#f00",
	            },
	    		yAxis:parseFloat(upLimitData),
	            name:upLimitData,
	    		label:{
	                position:"end",
	                    show:true,
	                    formatter:'{c}'+'上公差限'
	            }
	    	};
		makeLineData.push(upLimitDataLine);
	}
	if(downLimitData!=null&downLimitData!==''&downLimitData!=undefined){
		var downLimitDataLine={
	    		silent:false,
	            lineStyle:{
	                type:"solid",
	                color:"#f00",
	            },
	    		yAxis:parseFloat(downLimitData),
	            name:downLimitData,
	    		label:{
	                position:"end",
	                    show:true,
	                    formatter:'{c}'+'下公差限'
	            }
	    	};
		makeLineData.push(downLimitDataLine);
	}
	if(mData!=null&mData!==''&mData!=undefined){
		var mDataLine={
	    		silent:false,
	            lineStyle:{
	                type:"dashed",
	                color:"#00a9e0",
	            },
	    		yAxis:parseFloat(mData),
	            name:mData,
	    		label:{
	                position:"start",
	                    show:true,
	                    formatter:'{c}'+'名义值'
	            }
	    	};
		makeLineData.push(mDataLine);
	}
	if(lowcl!=null&lowcl!==''&lowcl!=undefined){
		var lowclDataLine={
	    		silent:false,
	            lineStyle:{
	                type:"solid",
	                color:"#00a9e0",
	            },
	    		yAxis:parseFloat(lowcl),
	            name:downLimitData,
	    		label:{
	                position:"end",
	                    show:true,
	                    formatter:'{c}'+'下控制限'
	            }
	    	};
		makeLineData.push(lowclDataLine);
	}
	if(upcl!=null&upcl!==''&upcl!=undefined){
		var upclDataLine={
	    		silent:false,
	            lineStyle:{
	                type:"solid",
	                color:"#00a9e0",
	            },
	    		yAxis:parseFloat(upcl),
	            name:downLimitData,
	    		label:{
	                position:"end",
	                    show:true,
	                    formatter:'{c}'+'上控制限'
	            }
	    	};
		makeLineData.push(upclDataLine);
	}
	if(warnData.lowWarn!=null&warnData.lowWarn!==''&warnData.lowWarn!=undefined){
		var lowWarnDataLine={
	    		silent:false,
	            lineStyle:{
	                type:"dashed",
	                color:"#EEAD0E",
	            },
	    		yAxis:parseFloat(warnData.lowWarn),
	            name:downLimitData,
	    		label:{
	                position:"end",
	                    show:true,
	                    formatter:'{c}'+'下警戒限'
	            }
	    	};
		makeLineData.push(lowWarnDataLine);
	}
	if(warnData.upWarn!=null&warnData.upWarn!==''&warnData.upWarn!=undefined){
		var upWarnDataLine={
	    		silent:false,
	            lineStyle:{
	                type:"dashed",
	                color:"#EEAD0E",
	            },
	    		yAxis:parseFloat(warnData.upWarn),
	            name:downLimitData,
	    		label:{
	                position:"end",
	                    show:true,
	                    formatter:'{c}'+'上警戒限'
	            }
	    	};
		makeLineData.push(upWarnDataLine);
	}
	var lineChart=echarts.init(document.getElementById(divId),'mytheme');
	option = {
			 title : {
			        text: title,
			        x: 'center',
			        	fontSize:'5px'
			    },
			grid: {
				top:'15px',
                left: '10%',
                right: '15%',
                bottom: '40px',
                containLabel: false
            },
			 tooltip: {
	            trigger: 'axis',
	            formatter:function(params){
	            	var res='<div><p>测量值：'+params[0].data+'</p><p>时间：'+tooltipTime[params[0].dataIndex]+'</p><p>测量人员：'+tooltipPRVORNAME[params[0].dataIndex]+'</p><p>测量设备：'+tooltipPMBEZ[params[0].dataIndex]+'</p><p>事件：'+tooltipMeasure[params[0].dataIndex]+'</p></div>';
	            	return res;
	            },
				 confine:true
	        },
		    xAxis: {
		   		type : 'category',
		    	//name:'检测序号',
		    	data: xValues,
		    	splitLine:{
                    show:false
                },
                axisLine: {show: false},
                axisTick: {
                    show: false
                }
		    },
		    yAxis : [
                {
                    type : 'value',
                    name:'测量值',
                    splitLine:{
                        show:false
                    },
                    axisLine: {show: true},
                    axisTick: {
                        show: false
                    },
                    scale:true,
                    min: function(value) {
                        //判断y轴最大最小值
                    	var minnum;
                    	if((downLimitData==null|downLimitData===''|downLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
                    		minnum= value.min;
                    	}else if(value.min<(parseFloat(downLimitData)-upanddown*0.1)){
                    		minnum= value.min;
                    	}else if((downLimitData==null|downLimitData===''|downLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.min>parseFloat(mData)){
                    		minnum= parseFloat(mData)-parseFloat(upanddown)*0.1;
                         }else{
                        	 minnum= parseFloat(downLimitData)-parseFloat(upanddown)*0.1;
                          }
                    	return parseFloat(minnum).toFixed(5);
                    },
                    max: function(value) {
                    	var maxnum;
                    	if((upLimitData==null|upLimitData===''|upLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
                    		maxnum= value.max;
                    	}else if(value.max>(parseFloat(upLimitData)+upanddown*0.1)){
                        	maxnum= value.max;
                    	}else if((upLimitData==null|upLimitData===''|upLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.max<parseFloat(mData)){
                    		maxnum= parseFloat(mData)+parseFloat(upanddown)*0.1;
                         }else{
                        	 maxnum= parseFloat(upLimitData)+parseFloat(upanddown)*0.1;
                          }
                        return parseFloat(maxnum).toFixed(5);
                    }
                }
            ],
            dataZoom: [
                {
                	bottom:'10px',
                	type: 'slider',
 			        filterMode: 'weakFilter',
 			        showDataShadow: false,
 			       // top: '93%',
 			        height: 8,
 			        borderColor: 'transparent',
 			        backgroundColor: '#e2e2e2',
 			        handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
 			        handleSize: 20,
 			        handleStyle: {
 			            shadowBlur: 6,
 			            shadowOffsetX: 1,
 			            shadowOffsetY: 2,
 			            shadowColor: '#aaa'
 			        }
                },
                {
                	orient:'vertical',
                	type: 'slider',
 			        filterMode: 'weakFilter',
 			        showDataShadow: 'auto',
 			        top: '10%',
 			        left:8,
 			        bottom:'10%',
 			       // height: '80%',
 			        width:7,
 			        borderColor: 'transparent',
 			        backgroundColor: '#e2e2e2',
 			        handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
 			        handleSize: 20,
 			        handleStyle: {
 			            shadowBlur: 6,
 			            shadowOffsetX: 1,
 			            shadowOffsetY: 2,
 			            shadowColor: '#aaa'
 			        }
                }
            ],
		    series: [
		    	{
		        data: yValues,
		        type: 'line',
		        symbol:'image://data:image/gif;base64,'+point,
		        symbolSize:'5',
		        showAllSymbol:true,
		       // color:'#008B00',
		        itemStyle : {
                    normal : {
                        lineStyle:{
                            width:0.5,//折线宽度
                            color:"#008B00"//折线颜色
                        }
                    }
                },
		        	markLine:{
		           		precision:5,
			        	data:makeLineData
			        }
		    }]
		};
	lineChart.setOption(option,true);
	lineChart.resize();
	return lineChart;
}
function initLineChart2(divId,xValues,yValues,upLimitData,downLimitData,mData,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ){
	var upanddown;
	if(notBlank(downLimitData)&notBlank(upLimitData)){
		upanddown=(parseFloat(upLimitData)-parseFloat(downLimitData))/0.8;
	}else if((!notBlank(downLimitData))&notBlank(upLimitData)){
		/*if(notBlank(mData)){
			upanddown=(parseFloat(upLimitData)-parseFloat(mData))/0.8;
		}else{
			upanddown=(parseFloat(upLimitData)-0)/0.8;
		}*/
		/*if(upLimitData>0){
			upanddown=upLimitData-0
		}else{
			upanddown=0-upLimitData;
		}*/
		upanddown=0;
	}else if((!notBlank(upLimitData))&notBlank(downLimitData)){
		/*if(notBlank(mData)){
			upanddown=(parseFloat(mData)-parseFloat(downLimitData))/0.8;
		}else{
			upanddown=(0-parseFloat(downLimitData))/0.8;
		}*/
		/*if(downLimitData>0){
			upanddown=downLimitData-0
		}else{
			upanddown=0-downLimitData;
		}*/
		upanddown=0;
	}
	/*if(upanddown<0){
		upanddown=0-upanddown;
		
	}*/
	var upLimitDataLine={
    		silent:false,
            lineStyle:{
                type:"solid",
                color:"#f00",
            },
    		yAxis:parseFloat(upLimitData),
            name:upLimitData,
    		label:{
                position:"end",
                normal:{
                    show:true,
                    formatter:'{c}'+'上公差限'
                }
            }
    	};
	var downLimitDataLine={
    		silent:false,
            lineStyle:{
                type:"solid",
                color:"#f00",
            },
    		yAxis:parseFloat(downLimitData),
            name:downLimitData,
    		label:{
                position:"end",
                normal:{
                    show:true,
                    formatter:'{c}'+'下公差限'
                }
            }
    	};
	var mDataLine={
    		silent:false,
            lineStyle:{
                type:"dashed",
                color:"#00a9e0",
            },
    		yAxis:parseFloat(mData),
            name:mData,
    		label:{
                position:"end",
                normal:{
                    show:true,
                    formatter:'{c}'+'名义值'
                }
            }
    	};
	var averageLine={
            type : 'average',
            lineStyle:{
                color:"#00a9e0",
            },
            name : '平均值',
            label:{
                position:"end",
                normal:{
                    show:true,
                    formatter:'{c}'+'平均值',
                    color:'#00a9e0'
                }
            }
        };
	var makeLineData=new Array();
	makeLineData.push(averageLine);
	if(upLimitData!=null&upLimitData!==''&upLimitData!=undefined){
		makeLineData.push(upLimitDataLine);
	}
	if(downLimitData!=null&downLimitData!==''&downLimitData!=undefined){
		makeLineData.push(downLimitDataLine);
	}
	if(mData!=null&mData!==''&mData!=undefined){
		makeLineData.push(mDataLine);
	}
	var lineChart=echarts.init(document.getElementById(divId),'mytheme');
	option = {
			toolbox: {
		        show: true,
		        feature: {
		            dataZoom: {
		                yAxisIndex: 'none'
		            },
		            dataView: {readOnly: false},
		            magicType: {type: ['line','bar']},
		            restore: {},
		            saveAsImage: {}
		        }
		    },grid: {
                left: '3%',
                right: '7%',
                bottom: '3%',
                containLabel: true
            },
			 tooltip: {
	            trigger: 'axis',
	            formatter:function(params){
	            	var res='<div><p>测量值：'+params[0].data+'</p><p>时间：'+tooltipTime[params[0].dataIndex]+'</p><p>测量人员：'+tooltipPRVORNAME[params[0].dataIndex]+'</p><p>测量设备：'+tooltipPMBEZ[params[0].dataIndex]+'</p></div>';
	            	return res;
	            },
	            position: [10, 10]
	        },
		    xAxis: {
		   		type : 'category',
		    	//name:'检测序号',
		    	data: xValues,
		    	splitLine:{
                    show:false
                },
                axisLine: {show: false},
                axisTick: {
                    show: false
                }
		    },
		    yAxis : [
                {
                    type : 'value',
                    name:'测量值',
                    splitLine:{
                        show:false
                    },
                    axisLine: {show: true},
                    axisTick: {
                        show: false
                    },
                    scale:true,
                    min: function(value) {
                        //判断y轴最大最小值
                    	var minnum;
                    	if((downLimitData==null|downLimitData===''|downLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
                    		minnum= value.min;
                    	}else if(value.min<(parseFloat(downLimitData)-upanddown*0.1)){
                    		minnum= value.min;
                    	}else if((downLimitData==null|downLimitData===''|downLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.min>parseFloat(mData)){
                    		minnum= parseFloat(mData)-parseFloat(upanddown)*0.1;
                         }else{
                        	 minnum= parseFloat(downLimitData)-parseFloat(upanddown)*0.1;
                          }
                    	return parseFloat(minnum).toFixed(5);
                    },
                    max: function(value) {
                    	var maxnum;
                    	if((upLimitData==null|upLimitData===''|upLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
                    		maxnum= value.max;
                    	}else if(value.max>(parseFloat(upLimitData)+upanddown*0.1)){
                        	maxnum= value.max;
                    	}else if((upLimitData==null|upLimitData===''|upLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.max<parseFloat(mData)){
                    		maxnum= parseFloat(mData)+parseFloat(upanddown)*0.1;
                         }else{
                        	 maxnum= parseFloat(upLimitData)+parseFloat(upanddown)*0.1;
                          }
                        return parseFloat(maxnum).toFixed(5);
                    }
                }
            ],
            dataZoom: [{
	            type: 'slider'
	        }],
		    series: [
		    	{
		        data: yValues,
		        type: 'line',
		        symbol:'image://data:image/gif;base64,'+point,
		        symbolSize:'5',
		        showAllSymbol:true,
		       // color:'#008B00',
		        itemStyle : {
                    normal : {
                        lineStyle:{
                            width:0.5,//折线宽度
                            color:"#008B00"//折线颜色
                        }
                    }
                },
		        	markLine:{
		           		precision:5,
			        	data:makeLineData
			        		/*[{
			        		silent:false,
                            lineStyle:{
                                type:"dashed",
                                color:"#f00",
                            },
			        		yAxis:upLimitData,
                            name:upLimitData,
			        		label:{
                                position:"end",
                                normal:{
                                    show:true,
                                    formatter:'{c}'+'上公差限'
                                }
                            }
			        	},{
			        		silent:false,
                            lineStyle:{
                                type:"dashed",
                                color:"#f00",
                            },
			        		yAxis:downLimitData,
                            name:downLimitData,
			        		label:{
                                position:"end",
                                normal:{
                                    show:true,
                                    formatter:'{c}'+'下公差限'
                                }
                            }
			        	},{
			        		silent:false,
                            lineStyle:{
                                type:"dashed",
                                color:"#00EE00",
                            },
			        		yAxis:mData,
                            name:mData,
			        		label:{
                                position:"end",
                                normal:{
                                    show:true,
                                    formatter:'{c}'+'名义值'
                                }
                            }
			        	}]*/
			        }
		    }]
		};
	lineChart.setOption(option,true);
	lineChart.resize();
	return lineChart;
}
function initBarAndPie(divId,xValues,yValues,pieData,title){
	var chart=echarts.init(document.getElementById(divId),'mytheme');
	option = {
			title : {
		        text: title,
		        x: 'center'
		    },
			color:['#22C37F','#F73F49'],
		     grid: [{
		        top: 10,
		        width: '50%',
		        bottom: 10,
		        left: 10,
		        containLabel: true
		    }],
		    tooltip:{
		    	trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"},
		    xAxis: {
		        type: 'category',
		        data: xValues
		    },
		yAxis: {
			splitLine:{
				show:false
			},
		        type: 'value'
		    },
		    series: [{
		    	name:'个数',
		        data: yValues,
		        type: 'bar',
		        itemStyle: {
					normal: {
						label: {
							show: true, //开启显示
							position: 'top', //在上方显示
							textStyle: { //数值样式
								color: '#555',
								fontSize: 18
							}
						},
						color:function(params){
							var colorList=['#22C37F','#FB614D'];
							return colorList[params.dataIndex];
						}
					}
				}
		    },{       
		    		name:'个数',
		            type: 'pie',
		            label: {
	                    formatter: '{b}: {@2012} ({d}%)',
	                    fontSize:20
	                },
		            radius : '40%',
		            center: ['75%', '50%'],
		            data:pieData,
		            // itemStyle: {
		            //     emphasis: {
		            //         shadowBlur: 10,
		            //         shadowOffsetX: 0,
		            //         shadowColor: 'rgba(0, 0, 0, 0.5)'
		            //     }
		            // }
		        }    
		    
		    ]
		};
		chart.setOption(option,true);
		chart.resize();
		return chart;
	
}
function notBlank(str){
	if(str!=null&str!==''&str!=undefined){
		return true;
	}else{
		return false;
	}
}
function getWarnData(lowLim,upLim){
	var lowWarn,upWarn;
	/*if(lowLim!=null&lowLim!==''&lowLim!=undefined){
		if(parseFloat(lowLim)>0){
			lowWarn=lowLim*1.1;
		}else if(parseFloat(lowLim)<0){
			lowWarn=lowLim+(0-lowLim*0.1);
		}else{
			lowWarn='';
		}
	}
	if(upLim!=null&upLim!==''&upLim!=undefined){
		if(parseFloat(upLim)>0){
			upWarn=upLim-(upLim*0.1);
		}else if(parseFloat(upLim)<0){
			upWarn=upLim+(upLim*0.1);
		}else{
			upWarn='';
		}
	}*/
	if(lowLim!=null&lowLim!==''&lowLim!=undefined&upLim!=null&upLim!==''&upLim!=undefined){
		var limData=(parseFloat(upLim)-parseFloat(lowLim))*0.1;
		if(parseFloat(lowLim)!==0){
			lowWarn=lowLim+limData;
		}else{
			lowWarn='';
		}
		if(parseFloat(upLim)!==0){
			upWarn=upLim-limData;
		}else{
			upWarn='';
		}
		
	}else if((lowLim!=null&lowLim!==''&lowLim!=undefined)&(upLim==null|upLim===''|upLim==undefined)){
		if(parseFloat(lowLim)>0){
			lowWarn=lowLim+(lowLim*0.1);
		}else if(parseFloat(lowLim)<0){
			lowWarn=lowLim-(lowLim*0.1);
		}else{
			lowWarn='';
		}
		upWarn='';
	}else if((lowLim==null|lowLim===''|lowLim==undefined)&(upLim!=null&upLim!==''&upLim!=undefined)){
		if(parseFloat(upLim)>0){
			upWarn=upLim-(upLim*0.1);
		}else if(parseFloat(upLim)<0){
			upWarn=upLim+(upLim*0.1);
		}else{
			upWarn='';
		}
		lowWarn='';
	}else if((lowLim==null|lowLim===''|lowLim==undefined)&(upLim==null|upLim===''|upLim==undefined)){
		lowWarn='';
		upWarn='';
	}
	
	var warnObj=new Object();
	warnObj.lowWarn=lowWarn;
	warnObj.upWarn=upWarn;
	return warnObj;
}
function initQbLineChart(divId,xValues,yValues,upLimitData,downLimitData,mData,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ,title){
	var upanddown;
	if(notBlank(downLimitData)&notBlank(upLimitData)){
		upanddown=(parseFloat(upLimitData)-parseFloat(downLimitData))/0.8;
	}else if((!notBlank(downLimitData))&notBlank(upLimitData)){
		upanddown=0;
	}else if((!notBlank(upLimitData))&notBlank(downLimitData)){
		upanddown=0;
	}
	var averageLine={
		type : 'average',
		lineStyle:{
			color:"#00a9e0",
		},
		name : '平均值',
		label:{
			position:"start",
			show:true,
			formatter:'{c}'+'平均值',
			color:'#00a9e0'
		}
	};
	var makeLineData=new Array();
	makeLineData.push(averageLine);
	if(upLimitData!=null&upLimitData!==''&upLimitData!=undefined){
		var upLimitDataLine={
			silent:false,
			lineStyle:{
				type:"solid",
				color:"#f00",
			},
			yAxis:parseFloat(upLimitData),
			name:upLimitData,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'上公差限'
			}
		};
		makeLineData.push(upLimitDataLine);
	}
	if(downLimitData!=null&downLimitData!==''&downLimitData!=undefined){
		var downLimitDataLine={
			silent:false,
			lineStyle:{
				type:"solid",
				color:"#f00",
			},
			yAxis:parseFloat(downLimitData),
			name:downLimitData,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'下公差限'
			}
		};
		makeLineData.push(downLimitDataLine);
	}
	if(mData!=null&mData!==''&mData!=undefined){
		var mDataLine={
			silent:false,
			lineStyle:{
				type:"dashed",
				color:"#00a9e0",
			},
			yAxis:parseFloat(mData),
			name:mData,
			label:{
				position:"start",
				show:true,
				formatter:'{c}'+'名义值'
			}
		};
		makeLineData.push(mDataLine);
	}
	var lineChart=echarts.init(document.getElementById(divId),'mytheme');
	option = {
		title : {
			text: title,
			x: 'center',
			fontSize:'5px'
		},
		grid: {
			top:'15px',
			left: '10%',
			right: '15%',
			bottom: '40px',
			containLabel: false
		},
		tooltip: {
			trigger: 'axis',
			formatter:function(params){
				var res='<div><p>测量值：'+params[0].data+'</p><p>时间：'+tooltipTime[params[0].dataIndex]+'</p><p>测量人员：'+tooltipPRVORNAME[params[0].dataIndex]+'</p><p>测量设备：'+tooltipPMBEZ[params[0].dataIndex]+'</p></div>';
				return res;
			},
			confine:true
		},
		xAxis: {
			type : 'category',
			//name:'检测序号',
			data: xValues,
			splitLine:{
				show:false
			},
			axisLine: {show: false},
			axisTick: {
				show: false
			}
		},
		yAxis : [
			{
				type : 'value',
				name:'测量值',
				splitLine:{
					show:false
				},
				axisLine: {show: true},
				axisTick: {
					show: false
				},
				scale:true,
				min: function(value) {
					//判断y轴最大最小值
					var minnum;
					if((downLimitData==null|downLimitData===''|downLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
						minnum= value.min;
					}else if(value.min<(parseFloat(downLimitData)-upanddown*0.1)){
						minnum= value.min;
					}else if((downLimitData==null|downLimitData===''|downLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.min>parseFloat(mData)){
						minnum= parseFloat(mData)-parseFloat(upanddown)*0.1;
					}else{
						minnum= parseFloat(downLimitData)-parseFloat(upanddown)*0.1;
					}
					return parseFloat(minnum).toFixed(5);
				},
				max: function(value) {
					var maxnum;
					if((upLimitData==null|upLimitData===''|upLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
						maxnum= value.max;
					}else if(value.max>(parseFloat(upLimitData)+upanddown*0.1)){
						maxnum= value.max;
					}else if((upLimitData==null|upLimitData===''|upLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.max<parseFloat(mData)){
						maxnum= parseFloat(mData)+parseFloat(upanddown)*0.1;
					}else{
						maxnum= parseFloat(upLimitData)+parseFloat(upanddown)*0.1;
					}
					return parseFloat(maxnum).toFixed(5);
				}
			}
		],
		dataZoom: [
			{
				bottom:'10px',
				type: 'slider',
				filterMode: 'weakFilter',
				showDataShadow: false,
				// top: '93%',
				height: 8,
				borderColor: 'transparent',
				backgroundColor: '#e2e2e2',
				handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
				handleSize: 20,
				handleStyle: {
					shadowBlur: 6,
					shadowOffsetX: 1,
					shadowOffsetY: 2,
					shadowColor: '#aaa'
				}
			}
		],
		series: [
			{
				data: yValues,
				type: 'line',
				symbol:'image://data:image/gif;base64,'+point,
				symbolSize:'10',
				showAllSymbol:true,
				// color:'#008B00',
				itemStyle : {
					normal : {
						lineStyle:{
							width:1,//折线宽度
							color:"#008B00"//折线颜色
						}
					}
				},
				markLine:{
					precision:5,
					data:makeLineData
				}
			}]
	};
	lineChart.setOption(option,true);
	lineChart.resize();
	return lineChart;
}
function initQbLineChartWithNewLimit(divId,xValues,yValues,upLimitData,downLimitData,newupLimit,newdownLimit,mData,tooltipTime,tooltipPRVORNAME,tooltipPMBEZ,title){
	var upanddown;
	if(notBlank(downLimitData)&notBlank(upLimitData)){
		upanddown=(parseFloat(upLimitData)-parseFloat(downLimitData))/0.8;
	}else if((!notBlank(downLimitData))&notBlank(upLimitData)){
		upanddown=0;
	}else if((!notBlank(upLimitData))&notBlank(downLimitData)){
		upanddown=0;
	}
	var averageLine={
		type : 'average',
		lineStyle:{
			color:"#00a9e0",
		},
		name : '平均值',
		label:{
			position:"start",
			show:true,
			formatter:'{c}'+'平均值',
			color:'#00a9e0'
		}
	};
	var makeLineData=new Array();
	makeLineData.push(averageLine);
	if(newupLimit!=null&newupLimit!==''&newupLimit!=undefined){
		var newupLimitLine={
			silent:false,
			lineStyle:{
				//type:"solid",
				color:'#FF00FF'
			},
			yAxis:parseFloat(newupLimit),
			name:newupLimit,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'上警戒限'
			}
		};
		makeLineData.push(newupLimitLine);
	}
	if(newdownLimit!=null&newdownLimit!==''&newdownLimit!=undefined){
		var newdownLimitLine={
			silent:false,
			lineStyle:{
				//type:"solid",
				color:'#FF00FF'
			},
			yAxis:parseFloat(newdownLimit),
			name:newdownLimit,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'上警戒限'
			}
		};
		makeLineData.push(newdownLimitLine);
	}
	if(upLimitData!=null&upLimitData!==''&upLimitData!=undefined){
		var upLimitDataLine={
			silent:false,
			lineStyle:{
				type:"solid",
				color:"#f00",
			},
			yAxis:parseFloat(upLimitData),
			name:upLimitData,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'上公差限'
			}
		};
		makeLineData.push(upLimitDataLine);
	}
	if(downLimitData!=null&downLimitData!==''&downLimitData!=undefined){
		var downLimitDataLine={
			silent:false,
			lineStyle:{
				type:"solid",
				color:"#f00",
			},
			yAxis:parseFloat(downLimitData),
			name:downLimitData,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'下公差限'
			}
		};
		makeLineData.push(downLimitDataLine);
	}
	if(mData!=null&mData!==''&mData!=undefined){
		var mDataLine={
			silent:false,
			lineStyle:{
				type:"dashed",
				color:"#00a9e0",
			},
			yAxis:parseFloat(mData),
			name:mData,
			label:{
				position:"start",
				show:true,
				formatter:'{c}'+'名义值'
			}
		};
		makeLineData.push(mDataLine);
	}
	var lineChart=echarts.init(document.getElementById(divId),'mytheme');
	option = {
		title : {
			text: title,
			x: 'center',
			fontSize:'5px'
		},
		grid: {
			top:'15px',
			left: '10%',
			right: '15%',
			bottom: '40px',
			containLabel: false
		},
		tooltip: {
			trigger: 'axis',
			formatter:function(params){
				var res='<div><p>测量值：'+params[0].data+'</p><p>时间：'+tooltipTime[params[0].dataIndex]+'</p><p>测量人员：'+tooltipPRVORNAME[params[0].dataIndex]+'</p><p>测量设备：'+tooltipPMBEZ[params[0].dataIndex]+'</p></div>';
				return res;
			},
			confine:true
		},
		xAxis: {
			type : 'category',
			//name:'检测序号',
			data: xValues,
			splitLine:{
				show:false
			},
			axisLine: {show: false},
			axisTick: {
				show: false
			}
		},
		yAxis : [
			{
				type : 'value',
				name:'测量值',
				splitLine:{
					show:false
				},
				axisLine: {show: true},
				axisTick: {
					show: false
				},
				scale:true,
				min: function(value) {
					//判断y轴最大最小值
					var minnum;
					if((downLimitData==null|downLimitData===''|downLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
						minnum= value.min;
					}else if(value.min<(parseFloat(downLimitData)-upanddown*0.1)){
						minnum= value.min;
					}else if((downLimitData==null|downLimitData===''|downLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.min>parseFloat(mData)){
						minnum= parseFloat(mData)-parseFloat(upanddown)*0.1;
					}else{
						minnum= parseFloat(downLimitData)-parseFloat(upanddown)*0.1;
					}
					return parseFloat(minnum).toFixed(5);
				},
				max: function(value) {
					var maxnum;
					if((upLimitData==null|upLimitData===''|upLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
						maxnum= value.max;
					}else if(value.max>(parseFloat(upLimitData)+upanddown*0.1)){
						maxnum= value.max;
					}else if((upLimitData==null|upLimitData===''|upLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.max<parseFloat(mData)){
						maxnum= parseFloat(mData)+parseFloat(upanddown)*0.1;
					}else{
						maxnum= parseFloat(upLimitData)+parseFloat(upanddown)*0.1;
					}
					return parseFloat(maxnum).toFixed(5);
				}
			}
		],
		dataZoom: [
			{
				bottom:'10px',
				type: 'slider',
				filterMode: 'weakFilter',
				showDataShadow: false,
				// top: '93%',
				height: 8,
				borderColor: 'transparent',
				backgroundColor: '#e2e2e2',
				handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
				handleSize: 20,
				handleStyle: {
					shadowBlur: 6,
					shadowOffsetX: 1,
					shadowOffsetY: 2,
					shadowColor: '#aaa'
				}
			}
		],
		series: [
			{
				data: yValues,
				type: 'line',
				symbol:'image://data:image/gif;base64,'+point,
				symbolSize:'10',
				showAllSymbol:true,
				// color:'#008B00',
				itemStyle : {
					normal : {
						lineStyle:{
							width:1,//折线宽度
							color:"#008B00"//折线颜色
						}
					}
				},
				markLine:{
					precision:5,
					data:makeLineData
				}
			}]
	};
	lineChart.setOption(option,true);
	lineChart.resize();
	return lineChart;
}
function initQaLineChart(divId,xValues,yValues,upLimitData,downLimitData,mData,title){
	var upanddown;
	if(notBlank(downLimitData)&notBlank(upLimitData)){
		upanddown=(parseFloat(upLimitData)-parseFloat(downLimitData))/0.8;
	}else if((!notBlank(downLimitData))&notBlank(upLimitData)){
		upanddown=0;
	}else if((!notBlank(upLimitData))&notBlank(downLimitData)){
		upanddown=0;
	}
	var averageLine={
		type : 'average',
		lineStyle:{
			color:"#00a9e0",
		},
		name : '平均值',
		label:{
			position:"start",
			show:true,
			formatter:'{c}'+'平均值',
			color:'#00a9e0'
		}
	};
	var makeLineData=new Array();
	makeLineData.push(averageLine);
	if(upLimitData!=null&upLimitData!==''&upLimitData!=undefined){
		var upLimitDataLine={
			silent:false,
			lineStyle:{
				type:"solid",
				color:"#f00",
			},
			yAxis:parseFloat(upLimitData),
			name:upLimitData,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'上公差限'
			}
		};
		makeLineData.push(upLimitDataLine);
	}
	if(downLimitData!=null&downLimitData!==''&downLimitData!=undefined){
		var downLimitDataLine={
			silent:false,
			lineStyle:{
				type:"solid",
				color:"#f00",
			},
			yAxis:parseFloat(downLimitData),
			name:downLimitData,
			label:{
				position:"end",
				show:true,
				formatter:'{c}'+'下公差限'
			}
		};
		makeLineData.push(downLimitDataLine);
	}
	if(mData!=null&mData!==''&mData!=undefined){
		var mDataLine={
			silent:false,
			lineStyle:{
				type:"dashed",
				color:"#00a9e0",
			},
			yAxis:parseFloat(mData),
			name:mData,
			label:{
				position:"start",
				show:true,
				formatter:'{c}'+'名义值'
			}
		};
		makeLineData.push(mDataLine);
	}
	var lineChart=echarts.init(document.getElementById(divId),'mytheme');
	option = {
		title : {
			text: title,
			x: 'center',
			fontSize:'5px'
		},
		grid: {
			top:'15px',
			left: '10%',
			right: '15%',
			bottom: '40px',
			containLabel: true
		},
		tooltip: {
			trigger: 'axis',
			confine:true
		},
		xAxis: {
			type : 'category',
			//name:'检测序号',
			data: xValues,
			splitLine:{
				show:false
			},
			axisLine: {show: false},
			axisTick: {
				show: false
			}
		},
		yAxis : [
			{
				type : 'value',
				name:'测量值',
				splitLine:{
					show:false
				},
				axisLine: {show: true},
				axisTick: {
					show: false
				},
				axisLabel: {
					showMinLabel:false,
					showMaxLabel:false
				},
				scale:true,
				min: function(value) {
					//判断y轴最大最小值
					var minnum;
					if((downLimitData==null|downLimitData===''|downLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
						minnum= value.min;
					}else if(value.min<(parseFloat(downLimitData)-upanddown*0.1)){
						minnum= value.min;
					}else if((downLimitData==null|downLimitData===''|downLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.min>parseFloat(mData)){
						minnum= parseFloat(mData)-parseFloat(upanddown)*0.1;
					}else{
						minnum= parseFloat(downLimitData)-parseFloat(upanddown)*0.1;
					}
					return parseFloat(minnum).toFixed(5);
				},
				max: function(value) {
					var maxnum;
					if((upLimitData==null|upLimitData===''|upLimitData==undefined)&(mData==null|mData===''|mData==undefined)){
						maxnum= value.max;
					}else if(value.max>(parseFloat(upLimitData)+upanddown*0.1)){
						maxnum= value.max;
					}else if((upLimitData==null|upLimitData===''|upLimitData==undefined)&mData!=null&mData!==''&mData!=undefined&value.max<parseFloat(mData)){
						maxnum= parseFloat(mData)+parseFloat(upanddown)*0.1;
					}else{
						maxnum= parseFloat(upLimitData)+parseFloat(upanddown)*0.1;
					}
					return parseFloat(maxnum).toFixed(5);
				}
			}
		],
		dataZoom: [
			{
				bottom:'10px',
				type: 'slider',
				filterMode: 'weakFilter',
				showDataShadow: false,
				// top: '93%',
				height: 8,
				borderColor: 'transparent',
				backgroundColor: '#e2e2e2',
				handleIcon: 'M10.7,11.9H9.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4h1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7v-1.2h6.6z M13.3,22H6.7v-1.2h6.6z M13.3,19.6H6.7v-1.2h6.6z', // jshint ignore:line
				handleSize: 20,
				handleStyle: {
					shadowBlur: 6,
					shadowOffsetX: 1,
					shadowOffsetY: 2,
					shadowColor: '#aaa'
				}
			}
		],
		series: [
			{
				data: yValues,
				type: 'line',
				symbol:'image://data:image/gif;base64,'+point,
				symbolSize:'6',
				showAllSymbol:true,
				// color:'#008B00',
				itemStyle : {
					normal : {
						lineStyle:{
							width:0.6,//折线宽度
							color:"#008B00"//折线颜色
						}
					}
				},
				markLine:{
					precision:5,
					data:makeLineData
				}
			}]
	};
	lineChart.setOption(option,true);
	lineChart.resize();
	return lineChart;
}
