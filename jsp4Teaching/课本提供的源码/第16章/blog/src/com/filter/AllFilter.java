package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter(
		urlPatterns = { "/my/*" }, 
		initParams = { 
				@WebInitParam(name = "encoding", value = "UTF-8")
		})														//配置过滤器

public class AllFilter implements Filter {
	private FilterConfig fc;
	String encoding = null;									// 字符编码
	public void destroy() {
		this.fc=null;
		encoding = null;
	}

	public void doFilter(ServletRequest sRequest, ServletResponse sResponse,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)sRequest;
		HttpServletResponse response=(HttpServletResponse)sResponse;
		if(encoding != null){ 							// 判断字符编码是否为空
			request.setCharacterEncoding(encoding);			// 设置请求的编码格式
			// 设置response字符编码
			sResponse.setContentType("text/html; charset="+encoding);
		}
		
		HttpSession session=request.getSession();
		Boolean mark=(Boolean)session.getAttribute("activation");
		
		request.setCharacterEncoding("UTF-8");
		
		if(mark!=null&&mark)
			chain.doFilter(request, response); 				// 传递给下一个过滤器
		else{
			String message="<li>对不起，您已经与服务器断开！请<a href='goIndex'>【重新访问】</a></li>";
			request.setAttribute("message",message);
			
			String forward=fc.getServletContext().getInitParameter("messagePage");
			RequestDispatcher rd=request.getRequestDispatcher(forward);
			rd.forward(sRequest,sResponse);
		}
	}

	public void init(FilterConfig fc) throws ServletException {
		this.fc=fc;
		encoding = fc.getInitParameter("encoding");	// 获取初始化参数
	}
}
