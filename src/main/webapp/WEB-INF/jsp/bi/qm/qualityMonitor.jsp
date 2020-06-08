<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../base/meta.jsp"%>
<html>
  <head>
  <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/qm.css" />
  	<script type="text/javascript">
		var qmIntervalTime = parseInt('${qmInterval}')*1000;
  		var autoQmWorkShop;
  		var workShopPage=1;
  		$(function(){
  			$('#qmPlCenterbox').panel('refresh','<%=basePath%>qm/initProductLine?factoryName='+encodeURI($('#qmFactoryName').val())+"&page="+workShopPage);
  			$('#lastWsPage').click(function(){
				if(workShopPage!=1){
					workShopPage -=1;
					$('#qmPlCenterbox').panel('refresh','<%=basePath%>qm/initProductLine?factoryName='+encodeURI($('#qmFactoryName').val())+"&page="+workShopPage);
				}else{
					workShopPage=$('#qmTotalWP').val();
					$('#qmPlCenterbox').panel('refresh','<%=basePath%>qm/initProductLine?factoryName='+encodeURI($('#qmFactoryName').val())+"&page="+workShopPage);
				}			
  			})
  			$('#nextWsPage').click(function(){
  				if(workShopPage!=$('#qmTotalWP').val()){
  					workShopPage +=1;
  					$('#qmPlCenterbox').panel('refresh','<%=basePath%>qm/initProductLine?factoryName='+encodeURI($('#qmFactoryName').val())+"&page="+workShopPage);
  				}else{
  					workShopPage=1;
  					$('#qmPlCenterbox').panel('refresh','<%=basePath%>qm/initProductLine?factoryName='+encodeURI($('#qmFactoryName').val())+"&page="+workShopPage);
  				}
  			})
  			autoQmWorkShop=setInterval(qmPlRealTime, qmIntervalTime);
  		})
  		function machineGoBack(){
  			$('#qmMachinePanel').panel('close');
			$('#qmProductLinePanel').panel('open');
			$('#qmProcessLi').html('');
			$('#qmMachineLi').html('');
			
			$('#qmMerkmalPlLi').html('');
			$('#qmMerkmalProcessLi').html('');
			$('#qmMerkmalMachineLi').html('');
			$('#qmMerkmalTeilLi').html('');
			
			$('#qmMachineCenterbox').panel('clear');
			var plSwitchState=$('#workShopSwitch').switchbutton('options').checked;
			if(plSwitchState){
				autoQmWorkShop=setInterval(qmPlRealTime, qmIntervalTime);
			}else{
				if(autoQmWorkShop!=null&&autoQmWorkShop!='undefined'){
					clearInterval(autoQmWorkShop)
				}
			}
			$('#qmMachineLi').html('');
  		}
  		function teilGoBack(){
  			$('#qmTeilPanel').panel('close');
			$('#qmMachinePanel').panel('open');
  		}
  		function merkmalGoBack(){
  			$('#qmMerkmalPanel').panel('close');
			$('#qmMachinePanel').panel('open');
  		}
  		function merkmalGoBackToPl(){
  			$('#qmMerkmalPanel').panel('close');
  			$('#qmProductLinePanel').panel('open');
  			$('#qmProcessLi').html('');
			$('#qmMachineLi').html('');
			
			$('#qmMerkmalPlLi').html('');
			$('#qmMerkmalProcessLi').html('');
			$('#qmMerkmalMachineLi').html('');
			$('#qmMerkmalTeilLi').html('');
			
			$('#qmMachineCenterbox').panel('clear');
  		}
  		function qmPlRealTime(){
  			if(workShopPage<$('#qmTotalWP').val()){
  				workShopPage +=1;
  			}else{
  				workShopPage=1;
  			}
  			$('#qmPlCenterbox').panel('refresh','<%=basePath%>qm/initProductLine?factoryName='+encodeURI($('#qmFactoryName').val())+"&page="+workShopPage);
  		}
  		function plSwitchBtnChange(checked){
  			if(checked){
  				autoQmWorkShop=setInterval(qmPlRealTime, qmIntervalTime);
  			}else{
  				if(autoQmWorkShop!=null&&autoQmWorkShop!='undefined'){
					clearInterval(autoQmWorkShop)
				}
  			}
  		}
  		function goToFactory(){
  			var currentUrl = window.location.href;
  			window.location.href='<%=basePath%>main/factoryList?currentUrl='+currentUrl;
  		
  		}
  	</script>
  </head>
  
  <body>
    <input type="hidden" id="qmFactoryName" value="${qmFactoryName }">
	<div class="easyui-layout" fit="true" style="width: 100%;height: 100%">
	    <div data-options="region:'center',border:false" style="overflow: hidden;">
	    	<div id="qmProductLinePanel" class="easyui-panel" data-options="fit:true,border:false" style="overflow:hidden;">
	    		<div class="easyui-layout" fit="true">
	    			<div data-options="region:'north',split:false,border:false" style="height:30px;overflow: hidden;display: table-cell;vertical-align: middle;text-align: center;background-color: #f3f3f3;font-size:15px;">
	    				 <span id="currentWsName"></span>
						    <ul class="placeul">
						   	 <li><a id="qmFactory" onclick="goToFactory()" style="cursor:hand">${qmFactoryName }</a></li>
						   	 <li  id="qmWorkShop"></li>
						    </ul>
	    				<div style="display: inline-block;height: 100%">
	    					<a id="lastWsPage"  class="easyui-linkbutton" data-options="iconCls:'icon-lastPage'" style="margin: 0px">向前</a>
	    					<input id="workShopSwitch" class="easyui-switchbutton" data-options="checked:true,onText:'关闭轮播',offText:'打开轮播',onChange:plSwitchBtnChange" style="width: 100px" />
	    					<a id="nextWsPage"  class="easyui-linkbutton" style="margin: 0px" data-options="iconCls:'icon-nextPage',iconAlign:'right'" >向后</a>
	    				</div>
	  				</div>
	    			<div id="qmPlCenterbox" data-options="region:'center',border:false"> </div>
	    		</div>
	    	</div>
	    	<div id="qmMachinePanel" class="easyui-panel" data-options="fit:true,border:false,closed:true" style="overflow:hidden;">
	    		<div class="easyui-layout" fit="true">
	    			<div class="place" data-options="region:'north',split:false,border:false" style="overflow: hidden;display: table-cell;vertical-align: middle;text-align: center;font-size:15px;">
	    				<!-- <span style="float: left;line-height: 35px">机器</span>
	  					<a class="easyui-linkbutton" data-options="iconCls:'icon-back'" onclick="machineGoBack()" style="float: right">返回</a> -->
					    <span id="currentMachineInfo"></span>
					    <ul class="placeul">
					    	 <li><a onclick="goToFactory()" style="cursor:hand">${qmFactoryName }</a></li>
					   	 <li><a id="qmPlLi" onclick="machineGoBack()" style="cursor:hand"></a></li>
					   	 <li id="qmProcessLi"></li>
					   	 <li id="qmMachineLi"></li>
					    </ul>
	  				</div>
	    			<div data-options="region:'center',border:false">
	    				<div class="easyui-layout" fit="true">
	    					<div id="qmProcessCenterbox"data-options="region:'west',border:false,title:'工序',collapsible:false,split:true" style="width:20%;"></div>
						    <div data-options="region:'center',border:true" >
						    	<div class="easyui-layout" fit="true">
						    		<div id="qmMachineCenterbox" data-options="region:'north',title:'测量设备',split:false,border:false,collapsible:false" style="height:20%;"></div>
						  		  	<div id="qmTeilCenterbox" data-options="region:'center',border:false,title:'零件'" ></div>
						    	</div>
						    </div>
						</div>
	    			</div>
	    		</div>
	    	</div>
	    	<!-- <div id="qmTeilPanel" class="easyui-panel" data-options="fit:true,border:false,closed:true" style="overflow:hidden;">
	    		<div class="easyui-layout" fit="true">
	    			<div data-options="region:'north',split:false,border:false" style="height:42px;padding:5px;overflow: hidden;">
	    				<span style="float: left;line-height: 35px">零件</span>
	  					<a class="easyui-linkbutton" data-options="iconCls:'icon-back'" onclick="teilGoBack()" style="float: right">返回</a>
	  				</div>
	    			<div id="qmTeilCenterbox" data-options="region:'center',border:false"> </div>
	    		</div>
	    	</div> -->
	    	<div id="qmMerkmalPanel" class="easyui-panel" data-options="fit:true,border:false,closed:true" style="overflow:hidden;">
	    		<div class="easyui-layout" fit="true">
	    			<div class="place" data-options="region:'north',split:false,border:false" style="height:30px;overflow: hidden;display: table-cell;vertical-align: middle;text-align: center;font-size:15px;">
	    				<!-- <span style="float: left;line-height: 35px">测量参数</span>
	  					<a class="easyui-linkbutton" data-options="iconCls:'icon-back'" onclick="merkmalGoBack()" style="float: right">返回</a> -->
	  					 <span></span>
					    <ul class="placeul">
					     <li><a onclick="goToFactory()" style="cursor:hand">${qmFactoryName }</a></li>
					   	 <li><a id="qmMerkmalPlLi" onclick="merkmalGoBackToPl()" style="cursor:hand"></a></li>
					   	 <li><a id="qmMerkmalProcessLi" onclick="merkmalGoBack()" style="cursor:hand"></a></li>
					   	 <li><a id="qmMerkmalMachineLi" onclick="merkmalGoBack()" style="cursor:hand"></a></li>
					   	 <li><a id="qmMerkmalTeilLi" onclick="merkmalGoBack()" style="cursor:hand"></a></li>
					    </ul>
	  				</div>
	    			<div id="qmMerkmalCenterbox" data-options="region:'center',border:true"> </div>
	    		</div>
	    	</div>
	    </div>
	</div>
  </body>
</html>
