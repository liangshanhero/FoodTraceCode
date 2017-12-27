<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>连接MySQL数据库</title>

</head>
<body>
<%
	try {
		Class.forName("com.mysql.jdbc.Driver");		// 加载数据库驱动，注册到驱动管理器
		String url = "jdbc:mysql://localhost:3306/db_database09";	// 数据库连接字符串
		String username = "root";							// 数据库用户名
		String password = "root";							// 数据库密码
		// 创建Connection连接
		Connection conn = DriverManager.getConnection(url,username,password); 
		if(conn != null){ 	// 判断数据库连接是否为空
			out.println("数据库连接成功！");					// 输出连接信息
			conn.close();									// 关闭数据库连接
		}else{
			out.println("数据库连接失败！");					// 输出连接信息
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
%>

</body>
</html>