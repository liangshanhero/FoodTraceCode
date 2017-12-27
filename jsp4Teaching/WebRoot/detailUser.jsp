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
	ResultSet rs=statment.executeQuery("select *from user where id="+request.getParameter("id"));
%>
<!-- 菜单 -->
<a href="listUser.jsp">返回</a>
<!-- 利用表格列表所有的用户 -->
<table>
	<thead>
		<tr>
			<td>编号</td><td>姓名</td><td>密码</td><td>修改</td>
			<td>删除</td>
		</tr>
		<%
			/* 利用JDBC获取所有的用户 */
			while(rs.next()){
				
				String updateUrl="<a href=updateUser.jsp?id="+rs.getString(1)+">修改</a>";
				String deleteUrl="<a href=deleteUser.jsp?id="+rs.getString(1)+">删除</a>";
				
				out.print("<tr>");
				out.print("<td>");
				out.print(rs.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(3));
				out.print("</td>");
				out.print("<td>");
				
				out.print(updateUrl);
				out.print("</td>");
				out.print("<td>");
				out.print(deleteUrl);
				out.print("</td>");
				
				out.print("</tr>");
			}
		%>
	</thead>
</table>
</body>
</html>