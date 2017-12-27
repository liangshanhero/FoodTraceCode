<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	String mainPage=(String)request.getAttribute("mainPage");
	if(mainPage==null||mainPage.equals(""))
		mainPage="default.jsp";
%>
<html>
	<head>
		<title>博客</title>
		<base href="<%=basePath%>">
		<link type="text/css" rel="stylesheet" href="css/style.css">
	</head>
	<body>
    	<center>
	        <table width="1000"  background="images/allBack.jpg"  border="0" cellpadding="0" cellspacing="0" bordercolor="#4E6900" bordercolordark="white" bordercolorlight="#4E6900">
    	        <tr height="150"><td colspan="2"><%@ include file="top.jsp" %></td></tr>
        	    <tr>
            	    <td width="30%" valign="top" align="left"><jsp:include page="left.jsp"/></td>
                	<td width="70%" align="left" valign="top"><jsp:include page="<%=mainPage%>"/></td>
	            </tr>
    	        <tr height="100"><td colspan="2"><%@ include file="end.jsp" %></td></tr>
        	</table>        
	    </center>
	</body>
</html>