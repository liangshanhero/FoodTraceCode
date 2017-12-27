<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
if(request.getParameter("Submit")!=null){
	response.setContentType("application/msword;charset=UTF-8");	//设置响应的内容类型
}
%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>将网页保存为Word文档</title>
</head>
<body>
<form name="form1" method="post" action="">
用户名： <input	name="name" type="text" id="name" style="width: 120px"><br>
密&nbsp;&nbsp;码： <input name="pwd" type="password" id="pwd" style="width: 120px"> <br>
<br>
<input type="submit" name="Submit" value="保存为word">
</form>
</body>
</html>