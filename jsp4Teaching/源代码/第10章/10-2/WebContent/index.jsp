<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>通过EL输出List集合的全部元素</title>
</head>
<body>
<%
List<String> list = new ArrayList<String>();		//声明一个List集合的对象
list.add("相框");									//添加第1个元素
list.add("笔筒");									//添加第2个元素
list.add("鼠标垫");									//添加第3个元素
session.setAttribute("goodsList",list);				//将List集合保存到session对象中
%>
<%
//获取保存到session范围内的变量
List<String> list1=(List<String>)session.getAttribute("goodsList");	
//通过循环和EL输出List集合的内容
for(int i=0;i<list1.size();i++){
	request.setAttribute("requestI",i);			//将循环增量保存到request范围内
%>
	
	${requestI}：${goodsList[requestI]}<br>			<!-- 输出集合中的第i个元素 -->
<%} %>

</body>
</html>