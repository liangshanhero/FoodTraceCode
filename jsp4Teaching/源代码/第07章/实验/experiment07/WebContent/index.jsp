<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>输入留言信息页面</title>
<style type="text/css">
ul {
	list-style: none; /*设置不显示项目符号*/
	margin:0px;		/*设置外边距*/
	padding:5px;		/*设置内边距*/
}

li {
	padding:5px; /*设置内边距*/
}
</style>
</head>
<body>
	<form action="deal.jsp" method="post">
		<ul>
			<li>留 &nbsp;言 &nbsp;者：<input type="text" name="author" size="20"></li>
			<li>留言标题：<input type="text" name="title" size="30"></li>
			<li>留言内容：<textarea name="content" rows="6" cols="30"></textarea></li>
			<li><input type="submit" value="提交"> <input type="reset"
				value="重置"></li>
		</ul>
	</form>
</body>
</html>