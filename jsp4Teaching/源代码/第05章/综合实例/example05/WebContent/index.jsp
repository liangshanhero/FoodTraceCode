<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String type = "流行金曲,经典老歌,热舞DJ,欧美金曲,少儿歌曲,轻音乐";//此处用于模拟从数据库中查询到的数据
%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<link href="CSS/style.css" rel="stylesheet" />
<title>主界面</title>

</head>
<body>
	<div id="box">
		<header>
			<jsp:include page="head.jsp" />
		</header>
		<nav>
			<!-- 动态包含导航条 -->
			<%
				request.setCharacterEncoding("UTF-8"); //不加这句代码乱产生中文乱码
			%>
			<jsp:include page="navigation.jsp" flush="true">
				<jsp:param name="type" value="<%=type%>" />
			</jsp:include>
		</nav>
		<section>
			<img src="images/main.png">
		</section>
		<jsp:include page="copyright.jsp" />
	</div>
</body>
</html>
