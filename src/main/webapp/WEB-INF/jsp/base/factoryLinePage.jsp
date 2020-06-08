<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="meta.jsp"%>
<html>
<head>
<style type="text/css">
body {
	background-image: url(<%=basePath %>resources/images/factoryLineBg.png);
	background-size: cover;
}

.area {
	width: 100%;
	height: 100%;
	/* display: flex;
    flex-direction: column;
    justify-content: space-around; */
}

.row {
	display: flex;
	/* flex: auto; */
}

.row-top {
	justify-content: flex-start;
	height: calc(50% - 100px);
}

.row-bottom {
	justify-content: flex-end;
	height: calc(50% - 100px);
}

.row-middle {
	z-index: -1;
	height: 200px;
	position: relative;
	/* width: 95%; */
	margin: 0 40px;
	/* vertical-align: middle; */
	display: flex;
	align-items: center;
}

.row-middle:before {
	content: '';
	width: 100%;
	height: 5px;
	background: #cadcd2;
	margin: 0 auto;
	position: absolute;
	top: 49.5%;
}

.row-top .block {
	margin-top: 10px;
	text-align: left;
}

.row-bottom .block {
	margin-bottom: 10px;
	text-align: right;
}

.block .img {
	border-radius: 2px;
	margin: 0 30px;
	position: relative;
	padding: 10px;
	background-color: #f3f6ef;
	box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);
	cursor: pointer;
}

.block .img:hover {
	box-shadow: 1px 1px 6px 5px rgba(0, 0, 0, 0.175);
}

.block .img {
	max-width: 35vw;
	height: calc(100% - 20px);
}

.name-span {
	position: relative;
	width: 25%;
	text-align: center;
}

.name-span.top {
	margin-top: -95px;
}

.name-span.bottom {
	margin-top: 100px;
}
/* .name-span:after {
    content: '';
    width: 5px;
    height: 200%;
    border-left: 5px dotted #8bb59d;
    position: absolute;
    top: 121%;
    left: 49%;
  }
  .name-span.top:after {
    top: auto;
    left: auto;
    bottom: 120%;
    right: 47%;
    border-color: #8bb59d;
  } */
.name {
	display: inline-block;
	width: 60px;
	height: 60px;
	line-height: 60px;
	background: #8bb59d;
	border-radius: 5px;
	border: 5px solid #cadcd2;
	text-align: center;
	transform: rotate(45deg);
	/* position: relative; */
	/* position: absolute;
      top: 130%;
      left: 45%; */
}

.row-bottom .name {
	top: -69%;
}

.name span {
	display: block;
	font-size: 20px;
	font-weight: bold;
	color: #fff;
	transform: rotate(-45deg);
	text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
}

body {
	font-family: Microsoft YaHei, 微软雅黑;
}
</style>
<script type="text/javascript">

	function goToMainPage(url,fname) {
		window.location.href = encodeURI(url.substr(0, url.indexOf('factoryName=')+12)+fname);

	}
</script>
</head>

<body>
	<div class="area">
		<div class="row row-top">
			<div class="block">
				<img class="img" onclick="goToMainPage('${currentUrl}','上海工厂')" src="<%=basePath %>resources/images/factoryImg/ShP-上海工厂.jpg" />
			</div>
			<div class="block">
				<img class="img" onclick="goToMainPage('${currentUrl}','武汉工厂')" src="<%=basePath %>resources/images/factoryImg/WhP-武汉工厂.jpg" />
			</div>
		</div>
		<div class="row row-middle">
			<div class="name-span top">
				<span class="name"> <span>上海</span></span>
			</div>
			<div class="name-span bottom">
				<span class="name"> <span>烟台</span></span>
			</div>
			<div class="name-span top">
				<span class="name"> <span>武汉</span></span>
			</div>
			<div class="name-span bottom">
				<span class="name"> <span>南京</span></span>
			</div>
		</div>
		<div class="row row-bottom">
			<div class="block">
				<img class="img" onclick="goToMainPage('${currentUrl}','烟台工厂')" src="<%=basePath %>resources/images/factoryImg/YtP-烟台工厂.jpg" />
			</div>
			<div class="block">
				<img class="img" onclick="goToMainPage('${currentUrl}','南京工厂')" src="<%=basePath %>resources/images/factoryImg/NjP-南京工厂.jpg" />
			</div>
		</div>
	</div>
</body>
</html>
