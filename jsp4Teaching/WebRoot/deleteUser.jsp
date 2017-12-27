<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 列出所有的用户 -->
<%
	String driver="com.mysql.jdbc.Driver";
	String databaseUrl="jdbc:mysql://localhost:3306/java";
	String databaseUser="root";
	String databasePassword="root";
	Class.forName(driver);
	Connection databaseConnection=DriverManager.getConnection(databaseUrl, databaseUser, databasePassword);
	
	Statement statment=databaseConnection.createStatement();
	
	String sqlStatement="delete from user where id="+request.getParameter("id");
	System.out.println(sqlStatement);
	
	int rs=statment.executeUpdate(sqlStatement);
	response.sendRedirect("listUsers.jsp");
%>
<!-- 删除用户后返回到list.jsp页面 -->
<table>
	<thead>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
			<td>查看明细</td>
			<td>删除</td>
		</tr>
		<%
			
		
		%>
	</thead>

</table>
</body>
</html>