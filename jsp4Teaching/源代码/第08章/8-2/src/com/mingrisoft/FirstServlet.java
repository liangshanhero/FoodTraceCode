package com.mingrisoft;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet 实现类FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 构造方法
     */
    public FirstServlet() {
        super();
     // 业务处理代码
    }

	/**
	 * 初始化方法
	 */
	public void init(ServletConfig config) throws ServletException {
		// 业务处理代码
		System.out.println("Servlet已经运行");
	}

	/**
	 * 销毁方法
	 */
	public void destroy() {
		// 业务处理代码
	}

	/**
	 * 处理Http GET请求
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 业务处理代码
	}

	/**
	 * 处理HTTP POST请求
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 业务处理代码
	}

	/**
	 * 处理HTTP PUT请求
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 业务处理代码
	}

	/**
	 * 处理HTTP DELETE请求
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 业务处理
	}

	/**
	 * 处理HTTP HEAD请求
	 */
	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 业务处理代码
	}

	/**
	 * 处理HTTP OPTIONS请求
	 */
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 业务处理代码
	}

	/**
	 *  处理HTTP TRACE请求
	 */
	protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 业务处理代码
	}

}
