<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>
<style type="text/css">
body{font-size: 12px;}
</style>
<script type="text/javascript">
	function mycheck() {
		if (form1.UserName.value == "") {//判断用户名是不为空
			alert("请输入用户名！");
			form1.UserName.focus();
			return;
		}
		if (form1.PWD.value == "") {//判断密码是否为空
			alert("请输入密码！");
			form1.PWD.focus();
			return;
		}
		if (form1.yanzheng.value == "") {//判断验证码是否为空
			alert("请输入验证码!");
			form1.yanzheng.focus();
			return;
		}
		if (form1.yanzheng.value != form1.verifycode2.value) {//判断验证码是否正确
			alert("请输入正确的验证码!!");
			form1.yanzheng.focus();
			return;
		}
		form1.submit();
	}
</script>
</head>
<body>
	<form name="form1" method="POST" action="check.jsp">
		用户名： <input name="UserName" type="text"><br><br>		<!-- 设置用户名文本框-->

		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input name="PWD" type="password"><br>	<br>	<!-- 设置密码文本框 -->
		验证码：<input name="yanzheng" type="text" 
			onKeyDown="if(event.keyCode==13){form1.Submit.focus();}" size="8">		<!-- 设置验证码文本框 -->
		<%
			int intmethod = (int) ((((Math.random()) * 11)) - 1);
			int intmethod2 = (int) ((((Math.random()) * 11)) - 1);
			int intmethod3 = (int) ((((Math.random()) * 11)) - 1);
			int intmethod4 = (int) ((((Math.random()) * 11)) - 1);
			String intsum = intmethod + "" + intmethod2 + intmethod3 + intmethod4;
			//将得到的随机数进行连接
		%>
		<input type="hidden" name="verifycode2" value="<%=intsum%>">	<!-- 设置隐藏域,用来做验证比较-->
		<!-- 将图片名称与得到的随机数相同的图片显示在页面上  --> 
		<img src="num/<%=intmethod%>.gif"> <img src="num/<%=intmethod2%>.gif"> 
		<img src="num/<%=intmethod3%>.gif"> <img src="num/<%=intmethod4%>.gif">
		<br><br>		
		<!-- 设置提交与重置按钮-->
		<input name="Submit"
			type="button" class="submit1" value="登录" onClick="mycheck()">
		&nbsp; <input name="Submit2" type="reset" class="submit1" value="重置">
	</form>
</body>
</html>