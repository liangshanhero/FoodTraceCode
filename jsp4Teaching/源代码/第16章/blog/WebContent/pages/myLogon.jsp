<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>博主登录</title>
		<base href="<%=basePath%>">
		<link type="text/css" rel="stylesheet" href="css/style.css">
		<style type="text/css">
		body{
			margin:0px auto auto auto;	/*设置居中显示*/
			clear: both;	/*两侧不显示任何内容*/
			width:1003px;	/*宽度*/
			height:620px;	/*高度*/
			
		}
		div{
			background-image:url(images/logonBack.jpg);	
			height:320px;
			padding-top:300px;
			padding-left:300px;
		}
		</style>
	</head>
	<body>
	<div>
	
		<form action="my/logon" method="post">
		<input type="hidden" name="goWhere" value="${param['goWhere']}">
    	<table border="0" width="400" height="160" cellspacing="0" cellpadding="0">
			<tr height="50"><td colspan="2"><c:out value="${requestScope.message}" escapeXml="false"/></td></tr>
			<tr>
				<td width="30%" align="right"><font color="white"><b>用户名：</b></font></td>
				<td align="center"><input type="text" name="userName" size="30"></td>
			</tr>
			<tr>
				<td align="right"><font color="white"><b>密&nbsp;&nbsp;码：</b></font></td>
				<td align="center"><input type="password" name="userPswd" size="30"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input name="submit1" type="submit" value="" style="background:url(images/logonB.jpg);border:0px;width:51px;height:20px">
					<input name="reset1" type="reset" value="" style="background:url(images/resetB.jpg);border:0px;width:51px;height:20px">
				</td>
			</tr>
    	</table>
    	</form>
	</div>
	</body>
</html>