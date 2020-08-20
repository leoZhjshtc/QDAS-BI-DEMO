//柱状图  合格率3种颜色堆叠
function initQaChart(ele,xValueArr,successArr,warnArr,failArr,url){
	var dom = document.getElementById(ele);
	var myChart = echarts.init(dom,'mytheme');
	option = null;
	option = {
			grid: {
                left: '3%',
                right: '90',
                bottom: '0',
                top:'10%',
                containLabel: true
            },
	    tooltip : {
	        trigger: 'axis',
	        formatter: '{b}<br />{a0}: {c0}%<br />{a1}: {c1}%<br />{a2}: {c2}%'
	    },
	    legend: {
	        data: ['合格', '超警戒','不合格'],
	        orient:'vertical',
	        x:'right',
	        y:'center'
	    },
	    xAxis: {
	        data: xValueArr,
	        axisTick: {show: false},
	        axisLabel: {  
	           interval:0,  
	           rotate:10  
	        } 
	    },
	    yAxis: {
	        // splitLine: {show: false},
	        axisLabel: {
	            show: true,
	            textStyle: {
	                // color: 'black',
					fontFamily: '微软雅黑',
					fontSize: '16'
	            },
	            interval: 0,
	            showMinLabel: true,
	            formatter: '{value} %'
	        }
	    },
	   
	    series: [
	        {
	            name: '合格',
	            type: 'bar',
	            barMaxWidth:200,
	            stack: '产线',
	            label: {
	                    show: true,
	                    rotate:0,
	                    position: 'insideBottom',
	                    color:'#555',
	                    formatter:'{a}: {c}%'
	            },
	            itemStyle:{
	                color: '#22C37F'
	            },
	            data: successArr
	        }, {
	            name: '超警戒',
	            type: 'bar',
	            stack: '产线',
	            label: {
	                    show: true,
	                    position: 'insideTop',
						color:'#555',
	                    formatter:'{a}: {c}%'
	            },
	            itemStyle:{
	                color:'#FFE361'
	            },
	            data: warnArr
	        }, {
	            name: '不合格',
	            type: 'bar',
	            stack: '产线',
	            label: {
	                    show: true,
					position: 'top',
					color:'#555',
	                    formatter:'{a}: {c}%'
	            },
	            itemStyle:{
	                color:'#F73F49'//'#FF634E'
	            },
	            data: failArr
	        }]
	};
	if (option && typeof option === "object") {
	    myChart.setOption(option, true);
	    myChart.resize();
	    myChart.off('click');
	    myChart.on('click',function (params) {
	    	$('#qaMachineAbility').panel('close');
	    	$('#qaTeilAbility').panel('open');
			$('#qaTeilAbility').panel('refresh',url+'&machineName='+params.name+'&processNum='+params.data.TEAUFTRAGSTR);
			$('#qaTeilAbility').panel('resize');
			$('#qaMachineLi').html("&gt;&nbsp;&nbsp;"+params.name);
			panelIndex=2;
	    })
	}
	return myChart;
}

//柱状图  CPK种颜色堆叠
function initQaCPKChart(ele,xValueArr,successArr,warnArr,failArr,url){
	var dom = document.getElementById(ele);
	var myChart = echarts.init(dom,'mytheme');
	option = null;
	option = {
			grid: {
                left: '3%',
                right: '90',
                bottom: '0',
                top:'10%',
                containLabel: true
            },
	    tooltip : {
	        trigger: 'axis',
	        formatter: '{b}<br />{a0}: {c0}%<br />{a1}: {c1}%<br />{a2}: {c2}%'
	    },
	    legend: {
	        data: ['cpk>1.67', '1.33<cpk<1.67','cpk<1.33'],
	        orient:'vertical',
	        x:'right',
	        y:'center'
	    },
	    xAxis: {
	        data: xValueArr,
	        axisTick: {show: false},
	        axisLabel: {  
	           interval:0,  
	           rotate:10  
	        } 
	    },
	    yAxis: {
	        // splitLine: {show: false},
	        axisLabel: {
	            show: true,
	            textStyle: {
					//   color: 'black',
					fontFamily: '微软雅黑',
					fontSize: '16'
	            },
	            interval: 0,
	            showMinLabel: true,
	            formatter: '{value} %'
	        }
	    },
	   
	    series: [
	        {
	            name: 'cpk>1.67',
	            type: 'bar',
	            barMaxWidth:200,
	            stack: '产线',
	            label: {
					show: true,
					rotate: 0,
					position: 'insideBottom',
					color:'#555',
					formatter: '{a}: {c}%'
	            },
	            itemStyle:{
	                color:'#3ba745'
	            },
	            data: successArr
	        }, {
	            name: '1.33<cpk<1.67',
	            type: 'bar',
	            stack: '产线',
	            label: {
	                    show: true,
	                    position: 'insideTop',
	                    color:'#555',
	                    formatter:'{a}: {c}%'
	            },
	            itemStyle:{
	                color:'#FFBF09'
	            },
	            data: warnArr
	        }, {
	            name: 'cpk<1.33',
	            type: 'bar',
	            stack: '产线',
	            label: {
	                    show: true,
	                    position: 'top',
						color:'#555',
	                    formatter:'{a}: {c}%'
	            },
	            itemStyle:{
	                color:'#C1232B'
	            },
	            data: failArr
	        }]
	};
	if (option && typeof option === "object") {
	    myChart.setOption(option, true);
	    myChart.resize();
	    myChart.off('click');
	    myChart.on('click',function (params) {
	    	$('#qaMachineAbility').panel('close');
	    	$('#qaTeilAbility').panel('open');
			$('#qaTeilAbility').panel('refresh',url+'&machineName='+params.name+'&processNum='+params.data.TEAUFTRAGSTR);
			$('#qaTeilAbility').panel('resize');
			$('#qaMachineLi').html("&gt;&nbsp;&nbsp;"+params.name);
			panelIndex=2;
	    })
	}
	return myChart;
}
////柱状图  量化 2种颜色堆叠
function initQaLhChart(ele,xValueArr,successArr,failArr,url){
	var dom = document.getElementById(ele);
	var myChart = echarts.init(dom,'mytheme');
	option = null;
	option = {
			grid: {
                left: '3%',
                right: '90',
                bottom: '0',
                top:'10%',
                containLabel: true
            },
	    tooltip : {
	        trigger: 'axis',
	        formatter: '{b}<br />{a0}: {c0}%<br />{a1}: {c1}%'
	    },
	    legend: {
	        data: ['定量参数','定性参数'],
	        orient:'vertical',
	        x:'right',
	        y:'center'
	    },
	    xAxis: {
	        data: xValueArr,
	        axisTick: {show: false},
	        axisLabel: {  
	           interval:0,  
	           rotate:10  
	        } 
	    },
	    yAxis: {
	        // splitLine: {show: false},
	        axisLabel: {
	            show: true,
	            textStyle: {
	         //   color: 'black',
			 fontFamily: '微软雅黑',
			 fontSize: '16'
	            },
	            interval: 0,
	            showMinLabel: true,
	            formatter: '{value} %'
	        }
	    },
	   
	    series: [
	        {
	            name: '定量参数',
	            type: 'bar',
	            barMaxWidth:200,
	            stack: '产线',
	            label: {
	                    show: true,
	                    position: 'inside',
	                    rotate:0,
	                    color:'#555',
	                    formatter:'{a}: {c}%'
	            },
	            itemStyle:{
	                color:'#FC9B6E'
	            },
	            data: successArr
	        }, {
	            name: '定性参数',
	            type: 'bar',
	            stack: '产线',
	            label: {
	                    show: true,
					position: 'top',
					color:'#555',
	                    formatter:'{a}: {c}%'
	            },
	            itemStyle:{
	                color:'#7199A9'
	            },
	            data: failArr
	        }]
	};
	if (option && typeof option === "object") {
	    myChart.setOption(option, true);
	    myChart.resize();
	    myChart.off('click');
	    myChart.on('click',function (params) {
	    	$('#qaMachineAbility').panel('close');
	    	$('#qaTeilAbility').panel('open');
			$('#qaTeilAbility').panel('refresh',url+'&machineName='+params.name+'&processNum='+params.data.TEAUFTRAGSTR);
			$('#qaTeilAbility').panel('resize');
			$('#qaMachineLi').html("&gt;&nbsp;&nbsp;"+params.name);
			panelIndex=2;
	    })
	}
	return myChart;
}
//零件层饼图  量化 
function initQaLhPie(divId,pieData,titleData,url){
	var chart=echarts.init(document.getElementById(divId),'mytheme');
	var divWidth=$('#'+divId).width();
	var seriesArr=new Array();
	var titleArr=new Array();
	if(titleData.length > 8){
		var totalRow=Math.ceil(titleData.length/10);
		for(var i=0;i<pieData.length;i++){
			var seriesData={       
		    		name:'比例',
					type: 'pie',
					hoverAnimation:false,
		            label: {
	                    formatter: '{d}%',
	                    fontSize:15
	                },
		            radius : [divWidth/40, divWidth/20-5],
		            center: [((i%10)*10+5)+'%', ((parseInt(i/10)+1)*100/totalRow-100/totalRow/2)+'%'],
		           label: {
	                    //formatter: "{b} : {d}%"
		        	   show:false
	                },
		            data:pieData[i]
		        } 
			seriesArr.push(seriesData);
		}
		for(var i=0;i<titleData.length;i++){
			var titleInfo={
			        text: titleData[i],
			        x: ((i%10)*10+5)+'%',
			        y: ((parseInt(i/10)+1)*100/totalRow-100/totalRow/1.8)+'%',
			        textAlign: 'center',
			        textStyle:{
			        	color:'#555',
			        	fontSize:13
			        }
			    }
			titleArr.push(titleInfo);
		}
		
	}else{
		for(var i=0;i<pieData.length;i++){
			var seriesData={       
		    		name:'比例',
					type: 'pie',
					hoverAnimation:false,
		            label: {
	                    formatter: '{d}%',
	                    fontSize:15
	                },
		            radius : ['40%', '70%'],
		            center: [(100/8)*(i+0.5)+'%', '50%'],
		           label: {
	                    //formatter: "{b} : {d}%"
		        	   show:false
	                },
		            data:pieData[i]
		        } 
			seriesArr.push(seriesData);
		}
		for(var i=0;i<titleData.length;i++){
			var titleInfo={
			        text: titleData[i],
			        x: (100/8)*(i+0.5)+'%',
			        y: '45%',
			        textAlign: 'center',
			        textStyle:{
			        	color:'#555',
			        	fontSize:13
			        }
			    }
			titleArr.push(titleInfo);
		}
	}
	option = {
			 legend: {
				 right:'10px'
			    },
			color:['#FC9B6E','#7199A9'],
		     grid: [{
		    	 left: '3%',
	             right: '3%',
	             bottom: '3%',
	             top:'3%',
	             containLabel: true
		    }],
		   title: titleArr,
		   tooltip:{
		    	trigger: 'item',
		        formatter: "{a} <br/>{b} : {d}%"},
		    series:seriesArr
		};
	if (option && typeof option === "object") {
		chart.setOption(option, true);
		chart.resize();
		chart.off('click');
		chart.on('click',function (params) {
			$('#qaTeilMorePie').dialog('close');
			$('#qaTeilAbility').panel('close');
	    	$('#qaMerkmalAbility').panel('open');
			$('#qaMerkmalAbility').panel('refresh',url+'&teilId='+params.data.TETEIL+"&teilNum="+params.data.K1001);
			$('#qaMerkmalAbility').panel('resize');
			$('#qaTeilLi').html("&gt;&nbsp;&nbsp;"+params.data.K1001);
	    })
	}
		return chart;
	
}

//零件层饼图  合格率 
function initQaPassRatePie(divId,pieData,titleData,url){
	var chart=echarts.init(document.getElementById(divId),'mytheme');
	var seriesArr=new Array();
	var titleArr=new Array();
	var divWidth=$('#'+divId).width();
	if(titleData.length > 8){
		var totalRow=Math.ceil(titleData.length/10);
		for(var i=0;i<pieData.length;i++){
			var seriesData={       
		    		name:'比例',
					type: 'pie',
					hoverAnimation:false,
		            label: {
	                    formatter: '{d}%',
	                    fontSize:15
	                },
		            radius : [divWidth/40, divWidth/20-10],
		            center: [((i%10)*10+5)+'%', ((parseInt(i/10)+1)*100/totalRow-100/totalRow/2)+'%'],
		           label: {
	                    //formatter: "{b} : {d}%"
		        	   show:false
	                },
		            data:pieData[i]
		        } 
			seriesArr.push(seriesData);
		}
		for(var i=0;i<titleData.length;i++){
			var titleInfo={
			        text: titleData[i],
			        x: ((i%10)*10+5)+'%',
			        y: ((parseInt(i/10)+1)*100/totalRow-100/totalRow/1.8)+'%',
			        textAlign: 'center',
			        textStyle:{
			        	color:'#555',
			        	fontSize:13
			        }
			    }
			titleArr.push(titleInfo);
		}
		
	}else{
		for(var i=0;i<pieData.length;i++){
			var seriesData={       
		    		name:'比例',
					type: 'pie',
					hoverAnimation:false,
		            label: {
	                    formatter: '{d}%',
	                    fontSize:15
	                },
		            radius : ['40%', '70%'],
		            center: [(100/8)*(i+0.5)+'%', '50%'],
		           label: {
	                    //formatter: "{b} : {d}%"
		        	   show:false
	                },
		            data:pieData[i]
		        } 
			seriesArr.push(seriesData);
		}
		for(var i=0;i<titleData.length;i++){
			var titleInfo={
			        text: titleData[i],
			        x: (100/8)*(i+0.5)+'%',
			        y: '45%',
			        textAlign: 'center',
			        textStyle:{
			        	color:'#555',
			        	fontSize:13
			        }
			    }
			titleArr.push(titleInfo);
		}
	}
	/*for(var i=0;i<pieData.length;i++){
		var seriesData={       
	    		name:'比例',
	            type: 'pie',
	            label: {
                    formatter: '{d}%',
                    fontSize:15
			},
			hoverAnimation:false,
                radius : ['40%', '70%'],
	            center: [(100/8)*(i+0.5)+'%', '50%'],
	            label: {
                   // formatter: "{b} : {d}%"
	            	show:false
                },
	            data:pieData[i]
	        } 
		seriesArr.push(seriesData);
	}
	for(var i=0;i<titleData.length;i++){
		var titleInfo={
		        text: titleData[i],
		        x: (100/8)*(i+0.5)+'%',
			    y: '45%',
		        textAlign: 'center',
		        textStyle:{
		        	color:'#555',
		        	// fontStyle:'oblique',
		        	// fontWeight:'bold',
		        	fontSize:13
		        }
		    }
		titleArr.push(titleInfo);
	}*/
	option = {
			legend: {
		        //data: ['定量参数', '定性参数'],
			 /*formatter: function (name) {
				    return '';
				},
		        orient:'vertical',
		        x:'right',
		        y:'center'*/
				right:'10px'
		    },
			color:['#22C37F','#FFE361','#FF634E'],
		     grid: [{
		    	 left: '3%',
	             right: '3%',
	             bottom: '3%',
	             top:'3%',
	             containLabel: true
		    }],
		   title:titleArr,
		   tooltip:{
		    	trigger: 'item',
		        formatter: "{a} <br/>{b} : {d}%"},
		    series:seriesArr
		};
	if (option && typeof option === "object") {
		chart.setOption(option, true);
		chart.resize();
		chart.off('click');
		chart.on('click',function (params) {
			$('#qaTeilMorePie').dialog('close');
			$('#qaTeilAbility').panel('close');
	    	$('#qaMerkmalAbility').panel('open');
			$('#qaMerkmalAbility').panel('refresh',url+'&teilId='+params.data.TETEIL+"&teilNum="+params.data.K1001);
			$('#qaMerkmalAbility').panel('resize');
			$('#qaTeilLi').html("&gt;&nbsp;&nbsp;"+params.data.K1001);
	    })
	}
		return chart;
	
}


//零件层饼图  cpk合格率
function initQaCPKPie(divId,pieData,titleData,url){
	var chart=echarts.init(document.getElementById(divId),'mytheme');
	var seriesArr=new Array();
	var titleArr=new Array();
	var divWidth=$('#'+divId).width();
	if(titleData.length > 8){
		var totalRow=Math.ceil(titleData.length/10);
		for(var i=0;i<pieData.length;i++){
			var seriesData={       
		    		name:'比例',
					type: 'pie',
					hoverAnimation:false,
		            label: {
	                    formatter: '{d}%',
	                    fontSize:15
	                },
		            radius : [divWidth/40, divWidth/20-10],
		            center: [((i%10)*10+5)+'%', ((parseInt(i/10)+1)*100/totalRow-100/totalRow/2)+'%'],
		           label: {
	                    //formatter: "{b} : {d}%"
		        	   show:false
	                },
		            data:pieData[i]
		        } 
			seriesArr.push(seriesData);
		}
		for(var i=0;i<titleData.length;i++){
			var titleInfo={
			        text: titleData[i],
			        x: ((i%10)*10+5)+'%',
			        y: ((parseInt(i/10)+1)*100/totalRow-100/totalRow/1.8)+'%',
			        textAlign: 'center',
			        textStyle:{
			        	color:'#555',
			        	fontSize:13
			        }
			    }
			titleArr.push(titleInfo);
		}
		
	}else{
		for(var i=0;i<pieData.length;i++){
			var seriesData={       
		    		name:'比例',
					type: 'pie',
					hoverAnimation:false,
		            label: {
	                    formatter: '{d}%',
	                    fontSize:15
	                },
		            radius : ['40%', '70%'],
		            center: [(100/8)*(i+0.5)+'%', '50%'],
		           label: {
	                    //formatter: "{b} : {d}%"
		        	   show:false
	                },
		            data:pieData[i]
		        } 
			seriesArr.push(seriesData);
		}
		for(var i=0;i<titleData.length;i++){
			var titleInfo={
			        text: titleData[i],
			        x: (100/8)*(i+0.5)+'%',
			        y: '45%',
			        textAlign: 'center',
			        textStyle:{
			        	color:'#555',
			        	fontSize:13
			        }
			    }
			titleArr.push(titleInfo);
		}
	}
	/*for(var i=0;i<pieData.length;i++){
		var seriesData={       
	    		name:'比例',
			type: 'pie',
			hoverAnimation:false,
                radius : ['40%', '70%'],
	            center: [(100/8)*(i+0.5)+'%', '50%'],
	            label: {
                   // formatter: "{b} : {d}%"
	            	show:false
                },
	            data:pieData[i]
	        } 
		seriesArr.push(seriesData);
	}
	for(var i=0;i<titleData.length;i++){
		var titleInfo={
		        text: titleData[i],
		        x: (100/8)*(i+0.5)+'%',
			    y: '45%',
		        textAlign: 'center',
		        textStyle:{
		        	color:'#555',
		        	// fontStyle:'oblique',
		        	// fontWeight:'bold',
		        	fontSize:13
		        }
		    }
		titleArr.push(titleInfo);
	}*/
	option = {
			legend: {
		        /*data: ['定量参数', '定性参数'],
			 formatter: function (name) {
				    return '';
				},
		        orient:'vertical',
		        x:'top',
		        y:'center'*/
				right:'10px'
		    },
			color:['#3ba745','#FFBF09','#C1232B'],
		     grid: [{
		    	 left: '3%',
	             right: '3%',
	             bottom: '3%',
	             top:'3%',
	             containLabel: true
		    }],
		   title:titleArr,
		   tooltip:{
		    	trigger: 'item',
		        formatter: "{a} <br/>{b} : {d}%"},
		    series:seriesArr
		};
	if (option && typeof option === "object") {
		chart.setOption(option, true);
		chart.resize();
		chart.off('click');
		chart.on('click',function (params) {
			$('#qaTeilMorePie').dialog('close');
			$('#qaTeilAbility').panel('close');
	    	$('#qaMerkmalAbility').panel('open');
			$('#qaMerkmalAbility').panel('refresh',url+'&teilId='+params.data.TETEIL+"&teilNum="+params.data.K1001);
			$('#qaMerkmalAbility').panel('resize');
			$('#qaTeilLi').html("&gt;&nbsp;&nbsp;"+params.data.K1001);
	    })
	}
		return chart;
	
}
//月报 折线图
function initMonthRepotLineChart(divId,dimensions,source){
	var dom = document.getElementById(divId);
	var myChart = echarts.init(dom,'mytheme');
	var seriesArr=new Array();
	for(var i=1;i<dimensions.length;i++){
		seriesArr.push({type: 'line',symbol:'circle'});
		
	}
	    option = {
	        legend: {
	        	type: 'scroll',
	            orient: 'vertical',
	            right: 10,
	            top: 20,
	            bottom: 20,
	        },
	        grid: {
	        	top:'20px',
                left: '5%',
                right: '8%',
                bottom: '50px',
                containLabel: false
            },
            dataZoom: [
                {
                	/*type: 'slider',
                    show: true,
                    realtime: true,*/
                	bottom:'10px',
                	 type: 'slider',
 			        filterMode: 'weakFilter',
 			        showDataShadow: false,
 			       // top: '93%',
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
                }
            ],
	        tooltip: {
	            trigger: 'axis',
				confine:true,
				formatter:function(params){
					var res='<div><p>'+params[0].axisValue+'</p>'
					for(var i=0;i<params.length;i++){
						var clumn=dimensions[i+1];
						if(params[0].value[clumn]!=undefined&params[0].value[clumn]!=null&params[0].value[clumn]!=''){
							res=res+'<p>'+params[i].marker+clumn+' : '+params[0].value[clumn]+'%</p>';
						}
					}
					return res+'</div>';
				}
	        },
			/*dataset: {
				dimensions: ['productLine', 'Dp Rack Line', 'DP Rack Line', 'ER-PP-3', 'ER-PP-1'],
	            source: [
	                {productLine:'2019年8月', 'Dp Rack Line':41.1, 'DP Rack Line':30.4, 'ER-PP-3':65.1, 'ER-PP-1':53.3},
	                {productLine:'2019年9月', 'Dp Rack Line':86.5, 'DP Rack Line':92.1, 'ER-PP-3':85.7, 'ER-PP-1':83.1},
	                {productLine:'2019年10月', 'Dp Rack Line':24.1, 'DP Rack Line':67.2, 'ER-PP-3':79.5, 'ER-PP-1':86.4}
	            ]
	        },*/
			/*dataset: {
				dimensions: ['productLine',  'DP Rack Line', 'ER-PP-3', 'ER-PP-1'],
				source: [
					{productLine:'2019年8月', 'DP Rack Line':30.4},
					{productLine:'2019年9月', 'DP Rack Line':92.1},
					{productLine:'2019年10月', 'DP Rack Line':67.2},
					{productLine:'2019年8月', 'ER-PP-3':65.1},
					{productLine:'2019年9月', 'ER-PP-3':85.7},
					{productLine:'2019年10月', 'ER-PP-3':79.5},
					{productLine:'2019年8月', 'ER-PP-1':53.3},
					{productLine:'2019年9月', 'ER-PP-1':83.1},
					{productLine:'2019年10月', 'ER-PP-1':86.4}
				]
			},*/
	       dataset:{
	        	dimensions:dimensions,
	        	source:source
	        },
	        xAxis: {
					type: 'category',
					axisTick: {show: false},
					axisLabel: {  
					   interval:0,  
					   rotate:10  
					} 
				},
	        yAxis: {
				// splitLine: {show: false},
		        axisLabel: {
		            show: true,
		            textStyle: {
		                // color: 'black',
		                fontFamily: '微软雅黑',
						fontSize: '16'
		            },
		            interval: 0,
		            showMinLabel: false,
		            formatter: '{value} %'
		        },
		        min: function(value) {
		            return value.min-10;
		        },
		        max: function(value) {
		        	if(value.max > 90){
		        		return 100;
		        	}else{
		        		return value.max+10;
		        	}
		        }
			},
	        series: seriesArr
	    };
	if (option && typeof option === "object") {
	    myChart.setOption(option, true);
	    myChart.resize();
	}
	return myChart;
	
}
//24 折线图
function initRecent24HoursLineChart(divId,legendArr,xValues,seriesArr){
	var dom = document.getElementById(divId);
	var myChart = echarts.init(dom,'mytheme');
	option = {
		tooltip: {
			confine:true,
			trigger: 'axis',
			formatter:function(params){
				var res='<div><p>'+params[0].value[0]+'</p>'
				for(var i=0;i<params.length;i++){
					res=res+'<p>'+params[i].marker+params[i].seriesName+' : '+params[i].data[1]+'%</p>';
				}
				return res+'</div>';
			}
		},
		legend: {
			data: legendArr,
			type: 'scroll',
			orient: 'horizontal',
			top: 0
		},
		grid: {
			top:'20px',
			left: '5%',
			right: '3%',
			bottom: '50px',
			containLabel: false
		},
		dataZoom: [
			{
				/*type: 'slider',
                show: true,
                realtime: true,*/
				bottom:'10px',
				type: 'slider',
				filterMode: 'weakFilter',
				showDataShadow: false,
				// top: '93%',
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
			}
		],
		xAxis: {
			data: xValues,
			type: 'category',
			// type: 'time',
			axisTick: {show: false}/*,
			axisLabel: {
				interval:0,
				rotate:0
			}*/
		},
		yAxis: {
			type:'value',
			axisLabel: {
				show: true,
				textStyle: {
					fontFamily: '微软雅黑',
					fontSize: '16'
				},
				interval: 0,
				showMinLabel: false,
				formatter: '{value} %'
			},
			min: function(value) {
				return value.min-10;
			},
			max: function(value) {
				if(value.max > 90){
					return 100;
				}else{
					return value.max+10;
				}
			}
		},
		series: seriesArr
	};
	if (option && typeof option === "object") {
		myChart.clear();
		myChart.setOption(option, true);
		myChart.resize();
	}
	return myChart;
}
function initRecent24HoursLineChart2(divId,dimensions,source){
	var dom = document.getElementById(divId);
	var myChart = echarts.init(dom,'mytheme');
	var seriesArr=new Array();
	for(var i=1;i<dimensions.length;i++){
		seriesArr.push({type: 'line',symbol:'circle'});

	}
	option = {
		legend: {
			type: 'scroll',
			orient: 'horizontal',
			top: 0
		},
		grid: {
			top:'20px',
			left: '5%',
			right: '3%',
			bottom: '50px',
			containLabel: false
		},
		dataZoom: [
			{
				/*type: 'slider',
                show: true,
                realtime: true,*/
				bottom:'10px',
				type: 'slider',
				filterMode: 'weakFilter',
				showDataShadow: false,
				// top: '93%',
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
			}
		],
		tooltip: {
			trigger: 'axis',
			confine:true,
			formatter:function(params){
				var res='<div><p>'+params[0].axisValue+'</p>'
				for(var i=0;i<params.length;i++){
					if(params[i].componentIndex===0){
						var teilInfo=dimensions[i+1];
						var valueInfo=params[i].value[teilInfo];
						var markpoint;
						for(var j=0;j<params.length;j++){
							if(teilInfo==params[j].seriesName){
								markpoint=params[j].marker;
							}
						}
						res=res+'<p>'+markpoint+teilInfo+' : '+valueInfo+'%</p>';
					}
				}
				return res+'</div>';
			}
		},
		dataset:{
			dimensions:dimensions,
			source:source
		},
		xAxis: {
			type: 'category',
			axisTick: {show: false},
			axisLabel: {
				interval:0,
				rotate:10
			}
		},
		yAxis: {
			// splitLine: {show: false},
			axisLabel: {
				show: true,
				textStyle: {
					// color: 'black',
					fontFamily: '微软雅黑',
					fontSize: '16'
				},
				interval: 0,
				showMinLabel: false,
				formatter: '{value} %'
			},
			min: function(value) {
				return value.min-10;
			},
			max: function(value) {
				if(value.max > 90){
					return 100;
				}else{
					return value.max+10;
				}
			}
		},
		series: seriesArr
	};
	if (option && typeof option === "object") {
		myChart.setOption(option, true);
		myChart.resize();
	}
	return myChart;
}
//柱状图  合格率2种颜色堆叠
function initQaPassRateChart(ele,xValueArr,successArr,failArr){
	var dom = document.getElementById(ele);
	var myChart = echarts.init(dom,'mytheme');
	option = null;
	option = {
		grid: {
			left: '5%',
			right: '90',
			bottom: '45',
			top:'10%',
			containLabel: false
		},
		tooltip : {
			trigger: 'axis',
			formatter:function(params){
				var res='<div><p>'+params[0].name+'</p><p>'+params[0].marker+'合格：'+params[0].value+'%</p><p>'+params[1].marker+'不合格：'+params[1].value+'%</p>'
				return res;
			}
			/*formatter: '{b}<br />{a0}: {c0}%<br />{a1}: {c1}%'*/
		},
		legend: {
			data: ['合格', '不合格'],
			orient:'vertical',
			x:'right',
			y:'center'
		},
		xAxis: {
			data: xValueArr,
			axisTick: {show: false},
			axisLabel: {
				interval:0,
				rotate:0
			}
		},
		yAxis: {
			// splitLine: {show: false},
			axisLabel: {
				show: true,
				textStyle: {
					// color: 'black',
					fontFamily: '微软雅黑',
					fontSize: '16'
				},
				interval: 0,
				showMinLabel: true,
				formatter: '{value} %'
			}
		},

		series: [
			{
				name: '合格',
				type: 'bar',
				barMaxWidth:200,
				stack: '产线',
				label: {
					show: true,
					rotate:0,
					position: 'insideBottom',
					color:'#555',
					formatter:'{a}: {c}%'
				},
				itemStyle:{
					color: '#22C37F'
				},
				data: successArr
			}, /*{
				name: '超警戒',
				type: 'bar',
				stack: '产线',
				label: {
					show: true,
					position: 'insideTop',
					color:'#555',
					formatter:'{a}: {c}%'
				},
				itemStyle:{
					color:'#FFE361'
				},
				data: warnArr
			},*/ {
				name: '不合格',
				type: 'bar',
				stack: '产线',
				label: {
					show: true,
					position: 'top',
					color:'#555',
					formatter:'{a}: {c}%'
				},
				itemStyle:{
					color:'#F73F49'//'#FF634E'
				},
				data: failArr
			}]
	};
	if (option && typeof option === "object") {
		myChart.setOption(option, true);
		myChart.resize();
	}
	return myChart;
}
function initAdminLtePieChart(divElement,data) {
	var dom = document.getElementById(divElement);
	var myChart = echarts.init(dom);
	option = null;
	option = {
		tooltip: {
			trigger: 'item',
			formatter: '{a} <br/>{b}: {c}%'
		},
		series: [
			{
				name: '合格率',
				type: 'pie',
				label: {
					show: true,
					formatter: '{b}: {c}%'
				},
				radius: '85%',
				center: ['50%', '50%'],
				/* emphasis: {
                     label: {
                         show: true,
                         fontSize: '30',
                         fontWeight: 'bold'
                     }
                 },*/
				labelLine: {
					show: true
				},
				color:['#00a65a','#f56954'],
				data: data
			}
		]
	};
	if (option && typeof option === "object") {
		myChart.setOption(option, true);
		myChart.resize();
	}
	return myChart;
}