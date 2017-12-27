<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>添加图书信息</title>
<script type="text/javascript">
	function check(form) {
		if (form.name.value == "") {
			alert("图书名称不能为空");
			return false;
		}
		if (form.price.value == "") {
			alert("定价不能为空");
			return false;
		}
		if (form.author.value == "") {
			alert("作者不能为空");
			return false;
		}
		return true;
	}
</script>
<style type="text/css">
ul {
	list-style: none; /*设置不显示项目符号*/
	margin: 0px; /*设置外边距*/
	padding: 5px; /*设置内边距*/
}

li {
	padding: 5px; /*设置内边距*/
}
</style>
</head>
<body>
	<form action="addBook.jsp" method="post" onsubmit=" return check(this)">
		<ul>
			<li>图书名称：<input type="text" name="name" /></li>
			<li>价　　格：<input type="text" name="price" /></li>
			<li>数　　量：<input type="text" name="bookCount" /></li>
			<li>作　　者：<input type="text" name="author" /></li>
			<li><input type="submit" value="添　加"></li>
		</ul>
	</form>
</body>
</html>