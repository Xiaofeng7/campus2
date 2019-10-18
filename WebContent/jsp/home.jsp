<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Home</title>
	<!-- 图标 css -->   
	<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/scroll.css" rel="stylesheet" type="text/css" media="all" />
	<!-- Bootstrap 样式 -->
	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
	<!-- 通用样式 css -->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!-- 首页index css-->
	<link href="css/index.css" rel="stylesheet" type="text/css" media="all" />
	<!-- meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />

	<!--字体 css-->
	<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
	<link href="http://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
	<!-- jquery js  (要放在首端) -->
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<!-- 主轮播模块 js -->
	<script src="js/skdslider.min.js"></script>
	<link href="css/skdslider.css" rel="stylesheet">
	<script type="text/javascript">
			jQuery(document).ready(function(){
				jQuery('#demo1').skdslider({'delay':5000, 'animationSpeed': 2000,'showNextPrev':true,'showPlayButton':true,'autoSlide':true,'animationType':'fading'});
							
				jQuery('#responsive').change(function(){
				  $('#responsive_wrapper').width(jQuery(this).val());
				});
				
			});
	</script>	
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
				<li><a class="active" href="index.html">首页</a></li>
				<li class="dropdown">
				  <a href="campusLost.html" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">校园生活帮<span class="caret"></span></a>
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
				<li><a href="#">论坛</a></li>
			  </ul>
			</div>
		  </div>
		</nav>
	</header>
<!-- 顶部轮播图-->
	<div class="w3-slider">	
		<ul id="demo1">
			<li>
				<img src="images/1.jpg" alt="" />
				<div class="slide-desc">
					<h3>安徽农业大学</h3>
					<p>第一张图片，你有什么想说的话 </p>
				</div>
			</li>
			<li>
				<img src="images/2.jpg" alt="" />
				  <div class="slide-desc">
					<h3>MAKE THE SUN WORK FOR YOU </h3>
					<p>第2张图片，你有什么想说的话</p>
				</div>
			</li>
			<li>
				<img src="images/1.jpg" alt="" />
				<div class="slide-desc">
					<h3>AFFORDABLE POWER SOLUTIONS</h3>
					<p>第3张图片，你有什么想说的话</p>
				</div>
			</li>
			<li>
				<img src="images/4.png" alt="" />
				<div class="slide-desc">
					<h3>MAKE THE SUN WORK FOR YOU </h3>
					<p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. </p>
				</div>
			</li>
		</ul>
	</div>
<!-- 模仿学校官网的公示公告 -->
	<div id="myIndexInfo">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-8" >
					<ul id="indexInfo" class="nav nav-tabs">
						<li class="active">
							<a href="#competition" data-toggle="tab">
								 比赛通知</a></li>										
						<li><a href="#lifetip" data-toggle="tab">生活贴士</a></li>
						<li><a href="#academy" data-toggle="tab">院级概述</a></li>
						<li><a href="#corporation" data-toggle="tab">社团介绍</a></li>
					</ul>
					<div id="indexInfoContent" class="tab-content">
						<!-- 比赛通知 -->
						<div class="tab-pane fade in active" id="competition">
							<div class="alunbo">
								<div id="myCarousel" class="carousel slide">
								    <!-- 轮播（Carousel）指标 -->
								    <ol class="carousel-indicators">
								        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								        <li data-target="#myCarousel" data-slide-to="1"></li>
								        <li data-target="#myCarousel" data-slide-to="2"></li>
								    </ol>   
								    <!-- 轮播（Carousel）项目 -->
								    <div class="carousel-inner">
								        <div class="item active">
								            <img src="images/annews_1.png" alt="First slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Second slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 2</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Third slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 3</div>
								        </div>
								    </div>
								</div>
							</div>						
							<div class="annews">
								<ul>
								<c:forEach var="com" items="${competitionList }">
									<li>
										<a href="${pageContext.request.contextPath }/getCompetition?cid=${com.id }"><c:out value="${com.name }"></c:out></a>
										<i><c:out value="${com.time }"></c:out></i>
									</li>
								</c:forEach>
								</ul>
							</div>
						</div>
						<!-- 生活贴士 -->
						<div class="tab-pane fade" id="lifetip">
							<div class="alunbo">
								<div id="myCarousel" class="carousel slide">
								    <!-- 轮播（Carousel）指标 -->
								    <ol class="carousel-indicators">
								        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								        <li data-target="#myCarousel" data-slide-to="1"></li>
								        <li data-target="#myCarousel" data-slide-to="2"></li>
								    </ol>   
								    <!-- 轮播（Carousel）项目 -->
								    <div class="carousel-inner">
								        <div class="item active">
								            <img src="images/annews_1.png" alt="First slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Second slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 2</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Third slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 3</div>
								        </div>
								    </div>
								</div>
							</div>						
							<div class="annews">
								<ul>
									<c:forEach var="tip" items="${tipsList }">
									<li>
										<a href="${pageContext.request.contextPath }/getTips?tid=${tip.id }"><c:out value="${tip.name }"></c:out></a>
										<i><c:out value="${tip.time }"></c:out></i>
									</li>
								</c:forEach>
								</ul>
							</div>
						</div>
						<!-- 院校概述 -->
						<div class="tab-pane fade" id="academy">
							<div class="alunbo">
								<div id="myCarousel" class="carousel slide">
								    <!-- 轮播（Carousel）指标 -->
								    <ol class="carousel-indicators">
								        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								        <li data-target="#myCarousel" data-slide-to="1"></li>
								        <li data-target="#myCarousel" data-slide-to="2"></li>
								    </ol>   
								    <!-- 轮播（Carousel）项目 -->
								    <div class="carousel-inner">
								        <div class="item active">
								            <img src="images/annews_1.png" alt="First slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Second slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 2</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Third slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 3</div>
								        </div>
								    </div>
								</div>
							</div>						
							<div class="annews">
								<ul>
									<c:forEach var="aca" items="${academyList }">
									<li>
										<a href="${pageContext.request.contextPath }/getAcademy?aid=${aca.id }"><c:out value="${aca.name }"></c:out></a>
										<i><c:out value="${aca.time }"></c:out></i>
									</li>
								</c:forEach>
								</ul>
							</div>				
						</div>
						<!-- 社团介绍 -->
						<div class="tab-pane fade" id="corporation">
							<div class="alunbo">
								<div id="myCarousel" class="carousel slide">
								    <!-- 轮播（Carousel）指标 -->
								    <ol class="carousel-indicators">
								        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								        <li data-target="#myCarousel" data-slide-to="1"></li>
								        <li data-target="#myCarousel" data-slide-to="2"></li>
								    </ol>   
								    <!-- 轮播（Carousel）项目 -->
								    <div class="carousel-inner">
								        <div class="item active">
								            <img src="images/annews_1.png" alt="First slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Second slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 2</div>
								        </div>
								        <div class="item">
								            <img src="images/annews_1.png" alt="Third slide">
								            <div class="carousel-caption">学校召开党委中心组会议进展中 3</div>
								        </div>
								    </div>
								</div>
							</div>						
							<div class="annews">
								<ul>
									<c:forEach var="club" items="${clubList }">
									<li>
										<a href="${pageContext.request.contextPath }/getClub?cid=${club.id }"><c:out value="${club.name }"></c:out></a>
										<i><c:out value="${club.time }"></c:out></i>
									</li>
								</c:forEach>
								</ul>
							</div>		
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-4" >
					<ul id="indexInfo_2" class="nav nav-tabs">
						<li class="active">
							<a href="#inform" data-toggle="tab">
								 通知公告
							</a>
						</li>				
						<li><a href="#lecture" data-toggle="tab">报告讲座</a></li>
					</ul>
					<div id="indexInfoContent_2" class="tab-content">
						<!-- 通知公告 -->
						<div class="tab-pane fade in active" id="inform">
							<div class="news-grids-bottom">
								<div class="box">
									<div class="bcon">
										<!-- 代码开始 -->
										<div class="list_lh">
											<ul>
											<c:forEach var="noti" items="${notificationList }">
												<li>
													<p><a href="${pageContext.request.contextPath }/getNotification?nid=${noti.id }" target="_blank"><c:out value="${noti.name }"></c:out></a><a href="${pageContext.request.contextPath }/getNotification?nid=${noti.id }" target="_blank" class="btn_lh">查看</a></p>
												</li>
											</c:forEach>	
											</ul>
										</div>
										<!-- 代码结束 -->
									</div>	
								</div>
								<%-- <div id="design" class="date">
									<div id="cycler">   
									<c:forEach var="noti" items="${notificationList }">
										<div class="date-text">
											<span class="textSpecial"><i><c:out value="${noti.time }"></c:out></span>
											<p><c:out value="${noti.name }"></c:out></p>
										</div>
									</c:forEach>	
									</div>
									<script>
										function cycle($item, $cycler){
											setTimeout(cycle, 3000, $item.next(), $cycler);
											
											$item.slideUp(1000,function(){
												$item.appendTo($cycler).show();        
											});
							
											}
										cycle($('#cycler div:first'),  $('#cycler'));
									</script>
								</div> --%>
								<!-- //date -->
							</div>
						</div>
						<!-- 报告讲座 -->
						<div class="tab-pane fade" id="lecture">
							<div class="news-grids-bottom">
								<div class="box">
									<div class="bcon">
										<!-- 代码开始 -->
										<div class="list_lh">
											<ul>
											<c:forEach var="ca" items="${cathedraList }">
												<li>
													<p><a href="${pageContext.request.contextPath }/getCathedra?cid=${ca.id }" target="_blank"><c:out value="${ca.name }"></c:out></a><a href="${pageContext.request.contextPath }/getCathedra?cid=${ca.id }" target="_blank" class="btn_lh">查看</a></p>
												</li>
											</c:forEach>	
											</ul>
										</div>
										<!-- 代码结束 -->
									</div>	
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>

<!-- 有颜色的分割线 -->
	<hr id="fengexian">
<!-- 品牌赞助广告 -->
	<div class="agileinfo-work-top">
		<div class="container">
			<div class="agileits-w3layouts-rides-grids row">
				<div class="col-sm-3 rides-grid">
					<div class="agileinfo-work">
					<div class="list-img">
						<img src="images/ad1.png" class="img-responsive" alt="">
						<div class="textbox"></div>
						</div>
						<h4>慕课网</h4>
						<p>慕课网是垂直的互联网IT技能免费学习网站。以独家视频教程、在线编程工具、学习计划、问答社区为核心特色。</p>
						<ul>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">实战派老师</a></li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">实用性内容</a></li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">个性化视角 </a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-3 rides-grid">
					<div class="agileinfo-work">
					<div class="list-img">
						<img src="images/ad2.png" class="img-responsive" alt="">
						<div class="textbox"></div>
						</div>
						<h4>成长必修</h4>
						<p>本门课程中，熊老师围绕大学生学习、生活中所遇到的现实问题，给出了明确的回答和切实可行的行动指南。</p>
						<ul>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">掌握如何科学规划大学的学习生活各方面</a></li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">培养正确的大学生价值观，积极面对大学各类挑战</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-3 rides-grid">
					<div class="agileinfo-work">
					<div class="list-img">
						<img src="images/ad3.png" class="img-responsive" alt="">
						<div class="textbox"></div>
					</div>
						<h4>思想格局</h4>
						<p>为大学生带来最精准、最鲜明、最深刻的形势与政策分析，正确认识时代趋势，培养深切家国情怀。</p>
						<ul>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">准确理解习近平新时代中国特色社会主义思想</a></li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">掌握剖析热点问题、分析大势走向的方法与能力</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-3 rides-grid">
					<div class="agileinfo-work">
					<div class="list-img">
						<img src="images/ad4.png" class="img-responsive" alt="">
						<div class="textbox"></div>
					</div>
						<h4>创新创业</h4>
						<p>由长期执教创业创新课程的同济大学张玉臣教授团队授课，结合丰富案例，把握新时代创新创业脉搏，培养全链条式创新创业人才。</p>
						<ul>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#"> 培养学生创新创业意识，激发学生创新创业动力</a></li>
							<li><i class="fa fa-arrow-right" aria-hidden="true"></i> <a href="#">开拓视野，训练学生的创新方法和创业技能</a></li>
						</ul>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- 底部 -->
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

<!-- jQuery / bootstrap js -->
<script src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/numscroller-1.0.js"></script>
<!-- index一些特别的动画 js-->
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript" src="js/scroll.js"></script>
<!-- 纵向滚动样式时间控制 -->
<script type="text/javascript">
$(document).ready(function(){
	$('.list_lh li:even').addClass('lieven');
})
$(function(){
	$("div.list_lh").myScroll({
		speed:40, //数值越大，速度越慢
		rowHeight:68 //li的高度
	});
});
</script>
</body>
</html>