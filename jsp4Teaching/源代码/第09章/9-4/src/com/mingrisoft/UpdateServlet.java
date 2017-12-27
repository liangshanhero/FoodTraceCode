package com.mingrisoft;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet实现类UpdateServlet
 */
@WebServlet("/UpdateServlet")	//配置Servlet
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UpdateServlet() {
		super();
	}

	/**
	 * 处理POST请求
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		int bookCount = Integer.valueOf(request.getParameter("bookCount"));
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载数据库驱动，注册到驱动管理器
			String url = "jdbc:mysql://localhost:3306/db_database09";// 数据库连接字符串
			String username = "root"; // 数据库用户名
			String password = "root"; // 数据库密码
			// 创建Connection连接
			Connection conn = DriverManager.getConnection(url, username,
					password);
			String sql = "update tb_book set bookcount=? where id=?";// 更新SQL语句
			PreparedStatement ps = conn.prepareStatement(sql);// 获取PreparedStatement
			ps.setInt(1, bookCount); // 对SQL语句中的第一个参数赋值
			ps.setInt(2, id); // 对SQL语句中的第二个参数赋值
			ps.executeUpdate(); // 执行更新操作
			ps.close(); // 关闭PreparedStatement
			conn.close(); // 关闭Connection
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("FindServlet"); // 重定向到FindServlet
	}

}
