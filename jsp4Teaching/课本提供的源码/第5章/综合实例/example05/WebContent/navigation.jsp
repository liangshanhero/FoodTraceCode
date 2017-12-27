<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<ul>
		<li style="float: left; padding: 0px 0px 0px 0px"><a href="#"
			class="navigation">首页</a> |</li>
		<%
			if (request.getParameter("type") != null) {
				String[] type = request.getParameter("type").split(",");	//将获取到的字符串分割为数组
				//遍历数组并显示数组中的各元素
				for (int i = 0; i < type.length; i++) {
		%>
		<li style="float: left; padding: 0px 5px 0px 5px"><a
			class="navigation" href="#"><%=type[i]%></a> |</li>
		<%
				}
			} else {
		%>
		<li style="float: left; padding: 0px 5px 0px 5px"><a
			class="navigation" href="#">暂无分类</a></li>
		<%
			}
		%>
		<li style="float: left; padding: 5px 15px 0px 15px">
		<img src="images/navigateion_oa.gif" /></li>
	</ul>