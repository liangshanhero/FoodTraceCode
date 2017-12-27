<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id"); //获取id参数的值
	String user = request.getParameter("user");//获取user参数的值
	String pwd = request.getParameter("pwd");//获取pwd参数值
%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>处理页</title>
</head>
<body>
	id参数的值为：<%=id%><br> user参数的值为：<%=user%><br> pwd参数的值为：<%=pwd%>
</body>
</html>