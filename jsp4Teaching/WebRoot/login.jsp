<%@ page language="java" contentType="text/html; charset=UTF-8" import="cn.edu.scau.cmi.liangzaoqing.database.DatabaseUtil, java.sql.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 显示正常登陆后的迎接信息和登陆的人员数量 -->
<jsp:useBean id="user"  class="cn.edu.scau.cmi.liangzaoqing.bean.User">
	<jsp:setProperty name="user" property="*"/>
</jsp:useBean>

<%
	String userQuery="select *from user where name="+"'"+request.getParameter("name")+"'"+ " and password="+"'"+request.getParameter("password")+"'";
	ResultSet userSet=DatabaseUtil.doSelect(userQuery);
	if(userSet.next()){
		System.out.println("有该用户");
		%>
		欢迎你，<%=user.getName() %><br>
		<a href="listUsers.jsp">查看所有的用户</a>
<%
	}
	else{
		System.out.println("对不起，用户名或者密码不对");
		response.sendRedirect("index.jsp");
	}
%>
</body>
</html>