<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Home</title>
	<!-- fontawesome -->   
	<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
	<!-- Bootstrap stylesheet -->
	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
	<!-- stylesheet -->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!-- 校园课程样式 -->
	<link href="css/detailExample.css" rel="stylesheet" type="text/css" media="all" />
	<!-- meta tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />
	<!--fonts-->
	<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
	<!-- 校园生活帮 样式 -->
	<link href="css/campusLost.css" rel="stylesheet" type="text/css" media="all" />
	<!--//fonts-->
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>

</head>
<body>
<!-- 头部导航栏 -->
	<header>
		<div class="w3layouts-top-strip">
			<div class="container">
				<div class="logo">
					<h1><a href="index.html">校园<span>视听说</span></a></h1>
				</div>
				<!--登录注册-->
				<div class="w3ls-social-icons">
					<a href="login.html"><i class="fa fa-users"></i></a>		
				</div>
				<!--联系方式-->
				<div class="agileits-contact-info text-right">
					<ul>
						<li><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span><a href="mailto:1722560019@qq.com">1722560019@qq.com</a></li>
						<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>17356533767</li>
					</ul>
				</div>				
				<div class="clearfix"></div>
			</div>
		</div>
		<nav class="navbar navbar-default">
		  <div class="container">
			<div class="navbar-header">
			  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			  </button>
			</div>
			<!--顶部目录   首页、校园生活帮、校园周边、高校直通车 -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			  <ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath }/second" class="active">首页</a></li>
				<li class="dropdown">
				  <a href="campusLost.html" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">校园生活帮<span class="caret"></span></a>
				  <ul class="dropdown-menu">
				  <li><a href="campusLost.html">失物招领</a></li>
				  <li><a href="campusLost.html">宠物之家</a></li>
				  <li><a href="campusLost.html">招租求租</a></li>	
				  </ul>
				</li>
				<li class="dropdown">
				  <a href="campusCourse.html" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">校园课程<span class="caret"></span></a>
				  <ul class="dropdown-menu">
					  <li><a href="shortTerm.html">小学期选课</a></li>
					  <li><a href="campusCourse.html">专业课课表</a></li>
					  <li><a href="campusCourse.html">资源共享</a></li>						
				  </ul>
				</li>
				<li class="dropdown">
				  <a href="campusPeriphery.html" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">学校周边<span class="caret"></span></a>
				  <ul class="dropdown-menu">
					  <li><a href="campusPeriphery.html">校内</a></li>
					  <li><a href="campusPeriphery.html">校周边</a></li>
					  <li><a href="campusPeriphery.html">市内</a></li>						
				  </ul>
				</li>
				<li><a href="campusDirect.html">高校直通车</a></li>
				<li><a href="contact.html">论坛</a></li>
			  </ul>
			</div>
		  </div>
		</nav>
	</header>


<!-- 返回提示 -->
	<div class="container">
		<div class="back row">
			<span>文章信息</span>
		</div>
	</div>
<!-- 文章具体内容介绍 -->
<div id="articleExample" class="fade2">
	<div class="container">		
		<div class="row">
			<article>
				<h2><c:out value="${getCathedra.name }"></c:out></h2>
				<div class="article_bar">
					<ul>
						<li class="time"><c:out value="${getCathedra.time }"></c:out></li>
						<li class="time"><c:out value="${getCathedra.countId }"></c:out></li>
					</ul>
					<div class="article_tag">
						<!-- <div class="col-md-2"></div> -->
						<!-- <div class="col-md-8">
							<img src="images/2.jpg" class="img-responsive">
						</div> -->
						<div class="article">
							<p><c:out value="${getCathedra.content }"></c:out></p>
						</div>
					</div>
				</div>
			</article>
		</div>
	</div>
</div>


 <!-- 底部-->
	<div class="footer-top">
		<div class="container">
		<!-- 群众要求 -->
			<div class="col-md-3 w3ls-footer-top">
				<h3>群众 <span>要求</span></h3>
					<ul>
						<li><a href="#">投 诉</a></li>
						<li><a href="#">吐 槽</a></li>
						<li><a href="#">建 议</a></li>
						<li><a href="#">夸 赞</a></li>
						<li><a href="#">打 赏</a></li>
					</ul>
			</div>
		<!-- 赞助联系 -->
			<div class="col-md-4 wthree-footer-top">
				<h3>友情<span>赞助</span></h3>
					<ul>
						<li><span aria-hidden="true">超星尔雅&nbsp;&nbsp;&nbsp;&nbsp;恋恋有词</span></li>
						<li><span aria-hidden="true">百度网盘&nbsp;&nbsp;&nbsp;&nbsp;星火英语</span></li>
						<li><span aria-hidden="true">慕课网&nbsp;&nbsp;&nbsp;&nbsp;网易云课堂</span></li>
					</ul>
			</div>			
			<div class="col-md-5 w3l-footer-top">
				<h3>我们的<span>寄语</span></h3>
				<p>亲爱的用户，我们也是第一次做产品，所以有什么不好的地方记得给我们吐槽</p>
					<form action="#" method="post" class="newsletter">
						<input class="email" type="email" placeholder="Your email..." required="">
						<input type="submit" class="submit"  value="">
					</form>
			</div>
			<div class="clearfix"></div>
			<div class="footer-w3layouts">
				<div class="agile-copy">
					<p>Copyright &copy; 2019 All Rights Reserved</p>
				</div>
			</div>
		</div>
	</div>
	<!-- 公用js start -->
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/numscroller-1.0.js"></script>

</body>
</html>
