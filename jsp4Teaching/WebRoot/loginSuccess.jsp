<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

  </head>
  
  <body>
    <%=request.getMethod() %>   
    用户名是：<%=request.getParameter("name") %>
    密码是：    <%=request.getParameter("password") %>
   协议是是：    <%=request.getProtocol() %>
    密码是：    <%=request.getRequestURI() %>
    密码是：    <%=request.getRequestURL() %>
    <% response.sendRedirect("forward.jsp"); %>
  </body>
  
</html>
