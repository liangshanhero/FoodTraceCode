<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="messageBean" class="com.wgh.MessageBean" scope="request">
	<jsp:setProperty name="messageBean" property="*"/>
</jsp:useBean>
<jsp:forward page="show.jsp"/>