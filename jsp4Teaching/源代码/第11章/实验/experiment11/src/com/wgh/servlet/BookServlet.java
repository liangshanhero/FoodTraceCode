package com.wgh.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wgh.model.BookForm;
import com.wgh.tools.ConnDB;
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 处理GET请求的方法
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");		//获取action参数值
		if ("query".equals(action)) {			//判断action参数值是否为query
			this.query(request, response);		//调用query()方法
		}
	}

	/**
	 * 查询全部图书信息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void query(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ConnDB conn=new ConnDB();	//创建数据库连接对象
		String sql="SELECT * FROM tb_book";
		ResultSet rs=conn.executeQuery(sql);	//查询全部图书信息
		List<BookForm> list=new ArrayList<>();
		try {
			while(rs.next()){
				BookForm f=new BookForm();
				f.setId(rs.getInt(1));
				f.setName(rs.getString(2));
				f.setPrice(rs.getDouble(3));
				f.setBookCount(rs.getInt(4));
				f.setAuthor(rs.getString(5));
				list.add(f);		//将图书信息保存到List集合中
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("bookList", list);		//将图书信息保存到HttpServletRequest中
		request.getRequestDispatcher("bookList.jsp").forward(request, response);		//重定向页面
	}
}
