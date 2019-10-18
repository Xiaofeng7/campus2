<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/login.css">
<title>登录界面</title>
</head>
<body>
<div>
	<div class="login-page">
	  	<div class="form">
	    <form class="register-form" action="${pageContext.request.contextPath }/register" method="post">
	   	  <input type="text" placeholder="用户名"  required="required" name="userName" />      
	      <input type="password" placeholder="密码"  required="required" name="passWord" />
	      <input type="text" placeholder="昵称"  required="required" name="nickName" />
	      <input type="text" placeholder="生日(YYY-MM-DD)"  required="required"  name="birthday" />
	      <input type="text" placeholder="电话号码"  required="required" name="tel" />
	      <input type="text" placeholder="邮箱"  required="required" name="email" />
	      <input type="text" placeholder="地址"  required="required" name="address" />
	      <input type="text" placeholder="学号"  required="required" name="studentNumber" />
	      <input type="text" placeholder="学校"  required="required" name="university" />
	      <input type="text" placeholder="学院"  required="required" name="academy" />
	      <input type="text" placeholder="专业"  required="required" name="profession" />
	      <input type="text" placeholder="年级"  required="required" name="grade" />
	      <input type="submit" value="注册"/>
	      <p class="message">已有账号<a href="#">登录</a></p>
	    </form>
	    <form class="login-form" action="${pageContext.request.contextPath }/start" method="post">
	      <input type="text" placeholder="学号" name="userName"/>
	      <input type="password" placeholder="密码" name="passWord"/>
	      <input type="submit" value="登录" />
	      <p class="message"> <a href="#">注册</a></p>
	    </form>
	  	</div>
	</div>
</div>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
</script>
<script type="text/javascript">
$('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});


</script>

</body>
</html>