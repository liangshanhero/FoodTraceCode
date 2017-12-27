package com.mingrisoft;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FindBook {
	/**
	 * 获取数据库连接
	 * @return Connection对象
	 */
	public Connection getConnection(){
		Connection conn = null; 								// 数据库连接
		try {
			Class.forName("com.mysql.jdbc.Driver");	// 加载数据库驱动，注册到驱动管理器
			// 数据库连接字符串
			String url = "jdbc:mysql://localhost:3306/db_database09";
			String username = "root";							// 数据库用户名
			String password = "root";							// 数据库密码
			// 创建Connection连接
			conn = DriverManager.getConnection(url,username,password); 	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;											// 返回数据库连接
	}
	/**
	 * 通过存储过程查询数据
	 * @return  List<Book> 
	 */
	public List<BookBean> findAll(){
		List<BookBean> list = new ArrayList<>();				// 实例化List对象
		Connection conn = getConnection();						// 创建数据库连接
		try {
			//调用存储过程	
			CallableStatement cs = conn.prepareCall("{call findAllBook()}");
			ResultSet rs = cs.executeQuery();			// 执行查询操作，并获取结果集
			while(rs.next()){						// 判断光标向后移动，并判断是否有效
				BookBean book = new BookBean();						// 实例化Book对象
				book.setId(rs.getInt("id"));					// 对id属性赋值
				book.setName(rs.getString("name"));			// 对name属性赋值
				book.setPrice(rs.getDouble("price"));			// 对price属性赋值
				book.setBookCount(rs.getInt("bookCount"));	// 对bookCount属性赋值
				book.setAuthor(rs.getString("author"));		// 对author属性赋值
				list.add(book); 							// 将图书对象添加到集合中
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list; 											// 返回list
	}

}
