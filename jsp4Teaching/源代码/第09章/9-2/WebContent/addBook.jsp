<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="book" class="com.mingrisoft.BookBean"></jsp:useBean>
<jsp:setProperty property="*" name="book"/>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>保存图书信息</title>
</head>
<body>
<%
	try {
		Class.forName("com.mysql.jdbc.Driver");		// 加载数据库驱动，注册到驱动管理器
		String url = "jdbc:mysql://localhost:3306/db_database09";// 数据库连接字符串
		String username = "root";								// 数据库用户名
		String password = "root";								// 数据库密码
		Connection conn = DriverManager.getConnection(url,username,password); 		// 创建Connection连接
		String sql = "insert into tb_book(name,price,bookCount,author) values(?,?,?,?)";	// 添加图书信息的SQL语句
		PreparedStatement ps = conn.prepareStatement(sql); // 获取PreparedStatement
		ps.setString(1, book.getName());			// 对SQL语句中的第1个参数赋值
		ps.setDouble(2, book.getPrice());			// 对SQL语句中的第2个参数赋值
		ps.setInt(3,book.getBookCount());			// 对SQL语句中的第3个参数赋值
		ps.setString(4, book.getAuthor());			// 对SQL语句中的第4个参数赋值
		int row = ps.executeUpdate();				// 执行更新操作，返回所影响的行数
		if(row > 0){ 											// 判断是否更新成功
			out.print("成功添加了 " + row + "条数据！");			// 更新成输出信息
		}
		ps.close();							// 关闭PreparedStatement，释放资源
		conn.close();							// 关闭Connection，释放资源
	} catch (Exception e) {
		out.print("图书信息添加失败！");
		e.printStackTrace();
	}
%>
<br>
<a href="index.jsp">返回</a>

</body>
</html>