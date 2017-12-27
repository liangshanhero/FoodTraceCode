<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>应用JSTL显示数据库中的商品信息</title>
</head>
<body>
	<c:redirect url="BookServlet">
		<c:param name="action" value="query"/>
	</c:redirect>
</body>
</html>
