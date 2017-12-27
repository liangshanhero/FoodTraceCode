package com.mingrisoft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet实现类MessageServlet
 */
@WebServlet("/MessageServlet")		//配置Servlet
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 构造方法
     */
    public MessageServlet() {
        super();
    }

	/**
	 * 处理HTTP POST请求
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//设置请求的编码，防止中文乱码
		String person=request.getParameter("person");	//留言人
		String content=request.getParameter("content");	//留言内容
		response.setContentType("text/html;charset=UTF-8");	//设置内容类型
		PrintWriter out=response.getWriter();	//创建输出流对象
		out.println("<html><head><title>获取留言信息</title></head><body>");
		out.println("留言人："+person+"<br>");
		out.println("留言内容："+content+"<br>");
		out.println("<a href='index.jsp'>返回</a>");
		out.println("</body></html>");
		out.close();		//关闭输出流对象
	}

}
