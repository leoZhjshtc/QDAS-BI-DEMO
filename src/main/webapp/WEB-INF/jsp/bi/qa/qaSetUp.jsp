<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
  <body>
    <div id="cc" class="easyui-layout" fit="true">
	    <div data-options="region:'north',title:'数据更新',split:true" style="height:100px;padding:5px;">
	    	<a id="dayBtn" class="easyui-linkbutton c2" data-options="">计算当前所有数据</a>
	    </div>
	    <div data-options="region:'center',title:'月报更新'" style="padding:5px;background:#eee;">
	    	<input id="monthCombobox" name="monthCombobox">
	    	<a id="monthBtn" class="easyui-linkbutton" data-options="">结算月报</a>
	    	
	    </div>
	</div>
	
	<script type="text/javascript">
  		$(function(){
  			var comboData=new Array();
  			var date=new Date;
			var year=date.getFullYear(); 
			var month=date.getMonth()+1;
			for(var i=month;i>0;i--){
				var nowObj=new Object();
				nowObj.monthData=year+'年'+i+"月";
				if(i<10){
					nowObj.monthValue=year+"-"+"0"+i+"-01";
				}else{
					nowObj.monthValue=year+"-"+i+"-01";
				}
				comboData.push(nowObj);
			}
			for(var i=year-1;i>year-3;i--){
				for(var j=12;j>0;j--){
					var agoObj=new Object();
					agoObj.monthData=i+'年'+j+"月";
					if(j<10){
						agoObj.monthValue=i+"-"+"0"+j+"-01";
					}else{
						agoObj.monthValue=i+"-"+j+"-01";
					}
					comboData.push(agoObj);
				}
			}
  			$('#monthCombobox').combobox({
			    valueField: 'monthValue',
				textField: 'monthData',
				data: comboData,
				editable:false
			});
			$('#dayBtn').click(function(){
				$.post('<%=basePath%>qa/doCountPassRate');	
  			})
  			$('#monthBtn').click(function(){
  				var selectValue=$('#monthCombobox').combobox('getValue');
  				var startTime=selectValue+' 07:30:00';
  				var nextMonth=getNextMonthDate(startTime);
  				var endTime=nextMonth.getFullYear()+"-"+(nextMonth.getMonth()+1)+"-"+nextMonth.getDate()+' 07:30:00';
  				$.post('<%=basePath%>qa/doMonthReport',{startTime:startTime,endTime:endTime});
  			})
  		})
		function getNextMonthDate(strDate) { 
		  var st = strDate; 
		  var a = st.split(" "); 
		  var b = a[0].split("-"); 
		  var c = a[1].split(":"); 
		  var date = new Date(b[0], b[1], b[2], c[0], c[1], c[2]);
		  return date; 
		} 
  	</script>
  </body>
</html>
