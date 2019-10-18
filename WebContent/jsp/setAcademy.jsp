<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>发布帖子</title>
</head>
<body>
 	<s:form action="setAcademy" namespace="/" method="post" id="setAcademy" theme="simple"><!-- action="${pageContext.request.contextPath }/registerCoount"  -->
		<label>标题:</label><s:textfield name="name"/>
		<h3><s:actionerror/></h3>
		<s:submit value="发布"></s:submit>
	</s:form>
</body>
</html>