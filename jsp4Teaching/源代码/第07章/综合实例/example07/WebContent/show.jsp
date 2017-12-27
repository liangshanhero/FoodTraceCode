<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.wgh.MyTools" %>

<!-- 获取request范围内名称为messageBean的MessageBean类实例 -->
<jsp:useBean id="messageBean" class="com.wgh.MessageBean" scope="request"/>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>显示留言信息</title>
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
		<!-- 获取留言者后进行转码操作 -->
		<li>留 &nbsp;言 &nbsp;者：<%=MyTools.toChinese(messageBean.getAuthor()) %></li>
		<!-- 获取留言标题后进行转码操作 -->
		<li>留言标题：<%=MyTools.toChinese(messageBean.getTitle()) %></li>
		<!-- 获取留言内容后进行转码操作 -->
		<li>留言内容：<textarea rows="6" cols="30" readonly><%=MyTools.toChinese(messageBean.getContent()) %></textarea></li>
		<li><a href="index.jsp">继续留言</a></li>
	</ul>
</body>
</html>