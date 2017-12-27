<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
   <%
    request.setCharacterEncoding("UTF-8");	//设置请求的编码，用于解决中文乱码问题
   	String name = request.getParameter("UserName");	//获取用户名参数
   	String password = request.getParameter("PWD");	//获取用户输入的密码参数
   	String message ;
   	if(request.getParameter("verifycode2").equals(request.getParameter("yanzheng"))){
   		message ="您输入的验证码不正确！";
   	}else if(name.equals("mr")&&(password.equals("mrsoft"))){	//判断用户名与密码是否合法
   		message ="可以登录系统！";
   	}else{
   		message ="用户名或密码错误！";
   	}    	
    %>
    <script type="text/javascript">
    alert("<%=message%>")			
    window.location.href='index.jsp';
   </script>