<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="meta.jsp"%>
<html>
  <head>
<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/css/factoryList.css" />
<script type="text/javascript">

function goToMainPage(url){

window.location.href=url;

}

</script>
  </head>
  
  <body>
   					 <ul class="timeline">
                        <li>
                            <div class="timeline-datetime">
                                <span class="timeline-time">
                                   	上海
                                </span>
                            </div>
                            <div class="timeline-badge blue">
                                <i class="fa fa-tag"></i>
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-body" style="text-align:right;">
                                   <img onclick="goToMainPage('${currentUrl}')" src="<%=basePath %>resources/images/factoryImg/ShP-上海工厂.jpg" style="width:400px;height:180px;cursor:hand"/>
                                </div>
                            </div>
                        </li>
                        <li class="timeline-inverted">
                            <div class="timeline-datetime">
                                <span class="timeline-time">
                               	     南京
                                </span>
                            </div>
                            <div class="timeline-badge darkorange">
                                <i class="fa fa-map-marker font-120"></i>
                            </div>
                            <div class="timeline-panel bordered-right-3 bordered-orange">  
                                <div class="timeline-body">
                                     <img onclick="goToMainPage('${currentUrl}')" src="<%=basePath %>resources/images/factoryImg/NjP-南京工厂.jpg" style="width:400px;height:180px;cursor:hand"/>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="timeline-datetime">
                                <span class="timeline-time">
                                  	  武汉
                                </span>
                            </div>
                            <div class="timeline-badge sky">
                                <i class="fa fa-bar-chart-o"></i>
                            </div>
                             <div class="timeline-badge blue">
                                <i class="fa fa-tag"></i>
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-body" style="text-align:right;">
                                   <img onclick="goToMainPage('${currentUrl}')" src="<%=basePath %>resources/images/factoryImg/WhP-武汉工厂.jpg" style="width:400px;height:180px;cursor:hand"/>
                                </div>
                            </div>
                        </li>
                        <li class="timeline-inverted">
                            <div class="timeline-datetime">
                                <span class="timeline-time">
                                  	  烟台
                                </span>
                            </div>
                            <div class="timeline-badge darkorange">
                                <i class="fa fa-map-marker font-120"></i>
                            </div>
                            <div class="timeline-panel bordered-right-3 bordered-orange">  
                                <div class="timeline-body">
                                     <img onclick="goToMainPage('${currentUrl}')" src="<%=basePath %>resources/images/factoryImg/YtP-烟台工厂.jpg" style="width:400px;height:180px;cursor:hand"/>
                                </div>
                            </div>
                        </li>
                    </ul>
  </body>
</html>
