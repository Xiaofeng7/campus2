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
				<li><a href="index.html" class="active">首页</a></li>
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
				<h2>Android性能优化：手把手带你全面了解 内存泄露</h2>
				<div class="article_bar">
					<ul>
						<li class="time">2018.3.10 14:52</li>
						<li>标签</li>
						<li><a href="">深度学习</a></li>
						<li><a href="">安卓</a></li>
					</ul>
					<div class="article_tag">
						<!-- <div class="col-md-2"></div> -->
						<div class="col-md-8">
							<img src="images/3.jpg" class="img-responsive">
						</div>
						<div class="article">
							<p>它有非凡的能力，可以进行亿次的运算；它有无限的存储空间，能容纳海量信息；它有便捷的操作方式，可以随时随地办公；它有相对低廉的价格，用户可以按需购买；它有强大的整合能力，将资源、数据与业务完美融合。它就是云计算。</p>

							<p>2006年，谷歌首次提出了“云计算”的概念。经过12年的发展，中国在云计算领域取得了可观的成绩，甚至有的中国企业已跻身全球云计算市场第一梯队。业内普遍认为：从全球范围来看，中美两国共同站在云计算高速发展的起跑线上，领先其它国家。</p>

							<p>2017年，深圳龙岗区发生了一起儿童被拐案件。通常来说，儿童被拐案件因为留下的线索很少，所以侦破率非常低。国内外的打拐经验证明，案发后几个小时是救寻儿童的黄金时间。一旦错过，案件侦破难度将加大，儿童获救可能性将大为降低。但深圳警方利用视频云平台，把握住了救寻儿童的黄金时间，成功地救回了被拐儿童。</p>

							<p>案发后，在以云计算为基础的视频云平台上，深圳警方清晰地看到犯罪嫌疑人带着孩子出现在哪里、买了什么票、上了哪列火车的哪节车厢。于是，深圳警方顺藤摸瓜，迅速将犯罪嫌疑人抓捕归案。此案能顺利侦破，一方面要归功于警方的部署得宜和卓越的侦破能力，另一方面，存储量大、运算速度快的视频云平台也是“神助攻”。因为它在深圳全市的视频系统中建立起了“信息桥梁”，通过平台内部信息驱动引擎，将不同系统间的信息整合、交换、共享，大大地提高了工作效率。</p>

							<p>　建设这样一个高大上的云平台，是否需要巨额的资金投入呢？答案是否定的。实际上，“用最少的钱买最优质的服务”恰恰是云计算的主要卖点。作为一种商业模式，云计算是基于互联网的软硬件服务，其核心是“卖服务”。很多业内人士将它的服务模式比作购买电的过程。通常来讲，用户用电的需求有两种办法可以满足，一是用户自己建设发电机组、自己发电，二是从发电厂直接购买电。显然，从发电厂购买的方案非常划算，具有维护简单、成本低、灵活准确、动态可扩展等诸多好处。也正因为如此，“企业上云”成为趋势。</p>

							<p>云计算在中国发展得如火如荼，在全球市场亦是如此。不少中国企业扬帆出海，开拓国际云服务市场。前不久，华为更是喊出了致力成为未来全球前“五朵云”的目标。</p>
							<p>“目前，中国企业已经开始进军全球公有云市场并取得了不俗的成绩，市场份额不断增大，阿里云更是跻身全球前三，以超100%的增速不断发展。同时，大批创新创业型企业也纷纷投身云计算。”范东睿说。</p>

							<p>业内人士认为，中国云服务商在国际市场上前景广阔。以公有云为例，高德纳2017年10月发布的预测报告显示：2017年全球公有云服务营收将达2602亿美元，较2016年的2196亿美元增长18.5%。到2020年，全球公有云服务营收将增长至4114亿美元。从公有云服务的市场来看，无论是国际领先的亚马逊AWS还是国内阿里云的营收规模，都还有巨大的增长空间。</p>

							<p>范东睿认为，中国云计算企业在海外发展的最大优势就在于快速的市场反应速度和扎实的技术基础。国内高体量用户市场直接检验了云计算技术水平的扎实性，而在市场反应方面，中国企业能够在最短的时间内做出灵活的调整，这是其他企业很难做到的。</p>





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
