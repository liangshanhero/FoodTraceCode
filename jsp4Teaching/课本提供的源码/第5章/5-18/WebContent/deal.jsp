<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="page" class="com.wgh.UserBean" type="com.wgh.UserBean">
	<jsp:setProperty name="user" property="*" />
</jsp:useBean>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>显示用户登录信息</title>
</head>
<body>
用户名：<%=user.getName() %><br>
密码：<%=user.getPwd() %>
</body>
</html>