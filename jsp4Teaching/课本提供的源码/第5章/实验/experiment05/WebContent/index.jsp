<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String[] dept = { "策划部", "销售部", "研发部", "人事部", "测试部" }; //声明并初始化一维数组
%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>应用Java代码片段动态添加下拉列表的列表项</title>
<style type="text/css">
body{
	font-size: 12px;
}
</style>
</head>
<body>
<h3>员工信息查询</h3>
	员工姓名：
	<input type="text" name="name" size="10" /> 年龄：
	<input type="text" name="age" size="3"/> 所在部门：
	<select>
		<%
			//遍历数组并且数组元素作为下拉列表的列表项显示
			for (int i = 0; i < dept.length; i++) {
		%>
		<option value="<%=dept[i]%>"><%=dept[i]%></option>
		<%
			}
		%>
	</select>
	<input type="button" value="查 询" />
</body>
</html>
