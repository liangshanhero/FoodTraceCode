<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	response.addHeader("Pragma","No-cache");
	response.addHeader("Cache-Control","no-cache");
	response.addDateHeader("Expires",1);
	request.setCharacterEncoding("UTF-8"); 
%>
<jsp:useBean id="regUser" class="com.valueBean.UserSingle" scope="request">
	<jsp:setProperty name="regUser" property="*"/>
</jsp:useBean>
<jsp:forward page="/userReg"/>