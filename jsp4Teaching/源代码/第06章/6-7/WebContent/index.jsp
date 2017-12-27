<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>应用application对象实现网页计数器</title>
</head>
<body>
<% 
int number=0;								//定义一个保存访问次数的变量
if(application.getAttribute("number")==null){	//当用户第一次访问时
	number=1;
}else{
	//获取application范围内的变量，并转换为int型
	number=Integer.parseInt(application.getAttribute("number").toString());
	number=number+1;							//让访问次数加1
}
out.print("您是第"+number+"位访问者！");			//输出当前访问次数
//将新的访问次数保存到application范围内的属性中
application.setAttribute("number",number);
%>

</body>
</html>