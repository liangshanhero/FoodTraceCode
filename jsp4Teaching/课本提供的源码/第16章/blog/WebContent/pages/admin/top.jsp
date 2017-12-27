<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<table border="0" width="1000" height="299" cellpadding="0" cellspacing="0" style="background:url(images/admin_top.jpg)">
	<tr>
		<td align="right" colspan="9" style="padding-right:20">
			<c:out value="${sessionScope.logoner.userMotto}"/>
			<br>---
			<b><c:out value="${sessionScope.logoner.userName}"/></b>【博客】
		</td>
	</tr>
    <!-- 导航菜单 -->
    <tr height="30" valign="bottom">
    	<td style="text-indent:15">
    		<a href="my/goBlog?master=${sessionScope.logoner.id}"><img src="images/adminIndexB.jpg"></a>
    		<a href="logoff"><img src="images/exitB.jpg"></a>
    	</td>
    </tr>
</table>