<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>使用&lt;jsp:include&gt;动作标识包含文件</title>
<style>
section{
	background-image: url(images/center.JPG);	/*设置背景图片*/
	height:279px;	/*设置高度*/
	width:781px;	/*设置宽度*/
}
footer{
	background-image: url(images/copyright.JPG);	/*设置背景图片*/
	height:41px;	/*设置高度*/
	width:761px;	/*设置宽度*/
	padding: 20px 0px 0px 20px;		/*设置内边距*/
}
</style>
</head>
<body style="margin:0px;">
<jsp:include page="top.jsp"/>
<section></section>
<jsp:include page="copyright.jsp"/>
</body>
</html>
