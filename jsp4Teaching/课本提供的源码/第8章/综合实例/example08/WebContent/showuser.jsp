<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.mingrisoft.*"%>
<%
	UserInfoList list = UserInfoList.getInstance();//获得UserInfoList类的对象
	UserInfoTrace ut = new UserInfoTrace();//创建UserInfoTrace类的对象
	request.setCharacterEncoding("UTF-8");//设置编码为UTF-8，解决中文乱码
	String name = request.getParameter("user");	//获取输入的用户名
	ut.setUser(name);	//设置用户名
	session.setAttribute("list", ut);
	list.addUserInfo(ut.getUser());	//添加用户到UserInfo类的对象中
	session.setMaxInactiveInterval(30);//设置Session的过期时间为30秒
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>在线用户列表</title>

<style type="text/css">
section {
	margin:0 auto auto auto;			/*设置外边距*/
	width:311px;						/*设置页面宽度*/
	clear:both;						/*设置两侧均不可以有浮动内容*/
	background-image:url(images/listbg.png);			/*设置背景图片*/
	height:254px;						/*设置高度*/
}
textarea{
	border: none;	/*设置不显示边框*/
	background-color: #FDF7E9;	/*设置背景颜色*/
	margin-left: 20px;
	margin-top: 100px;
	padding: 0px;	/*设置内边距*/
}
body{
	margin: 0px;	/*设置外边距*/
}
</style>
</head>
<body>
<section>
<div>
	<textarea rows="10" cols="34"><%
		Vector vector = list.getList();
		if (vector != null && vector.size() > 0) {
			for (int i = 0; i < vector.size(); i++) {
				out.println(vector.elementAt(i));
			}
		}
	%>
	</textarea>
</div>
</section>
</body>
</html>