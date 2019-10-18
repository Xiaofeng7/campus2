<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>刚发布的帖子</title>
</head>
<body>
 	<c:out value="${getNotification.name}"></c:out><br><br>
 	<c:out value="${getNotification.content}"></c:out><br><br>
 	<c:out value="${getNotification.time}"></c:out><br><br>
 	<c:out value="${getNotification.countId}"></c:out>
 	<a href="${pageContext.request.contextPath }/doloadAccessory?fileId=${getNotification.id}">下载附件</a>
</body>
</html>