<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>使用exception对象获取异常信息</title>
</head>
<body>
<%
request.setAttribute("price","109.6元");	//保存单价到request范围内的变量price中
//获取单价，并转换为float型
float price=Float.parseFloat(request.getAttribute("price").toString());	
%>
</body>
</html>