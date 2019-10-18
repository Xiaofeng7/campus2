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
 	<c:out value="${getTips.name}"></c:out><br><br>
 	<c:out value="${getTips.content}"></c:out><br><br>
 	<c:out value="${getTips.time}"></c:out><br><br>
 	<c:out value="${getTips.countId}"></c:out>
</body>
</html>