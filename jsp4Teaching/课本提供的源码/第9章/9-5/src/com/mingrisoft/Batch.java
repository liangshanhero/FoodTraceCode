package com.mingrisoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class Batch {
	/**
	 * 获取数据库连接
	 * @return Connection对象
	 */
		public Connection getConnection(){
			Connection conn = null; 									// 数据库连接
			try {
				Class.forName("com.mysql.jdbc.Driver");	// 加载数据库驱动，注册到驱动管理器
				// 数据库连接字符串
				String url = "jdbc:mysql://localhost:3306/db_database09";		
				String username = "root";								// 数据库用户名
				String password = "root";								// 数据库密码
				// 创建Connection连接
				conn = DriverManager.getConnection(url,username,password); 	
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn; 											// 返回数据库连接
		}
		/**
		 * 批量添加数据
		 * @return 所影响的行数
		 */
		public int saveBatch(){
			int row = 0 ; 									// 行数
			Connection conn = getConnection();				// 获取数据库连接
			try {
					// 插入数据的SQL语句
				String sql = "insert into tb_student(name,sex,age)	values(?,?,?)";
				// 创建PreparedStatement
				PreparedStatement ps = conn.prepareStatement(sql); 
				Random random = new Random();			// 实例化Random
				for (int i = 0; i < 10; i++) {			// 循环添加数据
					ps.setString(1, "学生" + i); 			// 对SQL语句中的第1个参数赋值
					// 对SQL语句中的第2个参数赋值
					ps.setBoolean(2, i % 2 == 0 ? true : false); 	
					ps.setInt(3, random.nextInt(5) + 10); 	// 对SQL语句中的第3个参数赋值
					ps.addBatch();						// 添加批处理命令
				}
				int[] rows = ps.executeBatch();	// 执行批处理操作并返回计数组成的数组
				row = rows.length; 						// 对行数赋值
				ps.close();								// 关闭PreparedStatement
				conn.close();								// 关闭Connection
			} catch (Exception e) {
				e.printStackTrace();
			}
			return row; 									// 返回添加的行数
		}

}
