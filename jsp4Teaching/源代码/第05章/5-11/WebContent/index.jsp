<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
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
<title>使用文件包含include指令</title>
</head>
<body style="margin:0px;">
<%@ include file="top.jsp"%>
<section></section>
<%@ include file="copyright.jsp"%>
</body>
</html>
