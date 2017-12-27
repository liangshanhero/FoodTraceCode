<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>通过cookie保存并读取用户登录信息</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();	//从request中获得Cookie对象的集合
	String user = "";								//登录用户
	String date = "";								//注册的时间
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {		//遍历cookie对象的集合
			//如果cookie对象的名称为mrCookie
			if (cookies[i].getName().equals("mrCookie")) {
				//获取用户名
				user = URLDecoder.decode(cookies[i].getValue().split("#")[0]);						date = cookies[i].getValue().split("#")[1];			//获取注册时间
			}
		}
	}
	if ("".equals(user) && "".equals(date)) {					//如果没有注册
%>
		游客您好，欢迎您初次光临！<br><br>
		<form action="deal.jsp" method="post">
			请输入姓名：<input name="user" type="text" value="">
			<input type="submit" value="确定">
		</form>
<%
	} else {													//已经注册
%>
		欢迎[<b><%=user %></b>]再次光临<br>
		您注册的时间是：<%=date %>
<%
	}
%>
</body>
</html>