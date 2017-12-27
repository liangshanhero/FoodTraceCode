<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>page对象各方法的应用</title>
</head>
<body>
<%!	Object object; 	//声明一个Object型的变量		%>
<ul>
<li>getClass()方法的返回值:<%=page.getClass()%></li>
<li>hashCode()方法的返回值:<%=page.hashCode()%></li>
<li>toString()方法的返回值:<%=page.toString()%></li>
<li>与Object对象比较的返回值:<%=page.equals(object)%></li>
<li>与this对象比较的返回值:<%=page.equals(this)%></li>
</ul>
</body>
</html>