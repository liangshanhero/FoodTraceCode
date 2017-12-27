<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.wgh.MyTool" %>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="message" class="com.wgh.MessageBean" scope="page">
	<jsp:setProperty name="message" property="*"/>
</jsp:useBean>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>显示留言信息页面</title>
<style type="text/css">
ul {
	list-style: none; /*设置不显示项目符号*/
	margin:0px;			/*设置外边距*/
	padding:5px;		/*设置内边距*/
}

li {
	padding:5px; /*设置内边距*/
}
</style>
</head>
<body>
	<ul>
		<li>留 &nbsp;言 &nbsp;者：<%=message.getAuthor()%></li>
		<li>留言标题：<%=message.getTitle()%></li>
		<!-- 对留言内容进行处理 -->
		<li>留言内容：</li>
		<li style="border:1px #000 solid"><%=message.getContent()%></li>
		<li><a href="index.jsp">[ 返回 ]</a></li>
	</ul>
</body>
</html>