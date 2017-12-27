<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>显示九九乘法表</title>
<style type="text/css">
div {
	width: 470px; /*设置宽度*/
	height: 205px; /*设置高度*/
	border: 1px #000 solid; /*设置边框*/
	padding: 5px; /*设置内边距*/
}

ul {
	list-style: none; /*设置不显示列表项的符号*/
	padding: 0px; /*设置内边距*/
}
#title{
	padding-left: 190px;
	border-bottom: 1px #000 solid;
}
</style>
</head>
<body>
	<%
		String str = ""; //声明保存九九乘法表的字符串变量
		//连接生成九九乘法表的字符串
		for (int i = 1; i <= 9; i++) { // 外循环
			for (int j = 1; j <= i; j++) { // 内循环
				str += j + "×" + i + "=" + j * i;
				str += "&nbsp;"; //加入空格符
			}
			str += "<br>"; // 加入换行符
		}
	%>
	<div>
		<ul>
			<li id="title">九九乘法表</li>
			<li><%=str%> <!-- 输出九九乘法表 --></li>
		</ul>
	</div>
</body>
</html>