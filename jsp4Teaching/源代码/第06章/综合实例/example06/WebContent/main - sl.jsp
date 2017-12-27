<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//获取保存在session范围内的用户名 
String username=(String)session.getAttribute("username");
%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>系统主页</title>
</head>
<body>
您好！[<%=username %>]欢迎您访问！<br>
<a href="exit.jsp">[退出]</a>
</body>
</html>