<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>应用JSTL显示数据库中的商品信息</title>
<style>
body{font-size:12px;}
</style>
</head>
<body>
  <table width="550" height="47" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#333333">
    <tr>
      <td height="30" colspan="5" bgcolor="#EFEFEF">·图书信息列表</td>
    </tr>
    <tr>
      <td width="36" height="27" align="center" bgcolor="#FFFFFF">编号</td>
      <td width="137" align="center" bgcolor="#FFFFFF">图书名称</td>
      <td width="85" align="center" bgcolor="#FFFFFF">单价</td>
      <td width="38" align="center" bgcolor="#FFFFFF">数量</td>
      <td width="148" align="center" bgcolor="#FFFFFF">作者</td>
    </tr>
	<c:forEach var="book" items="${requestScope.bookList}">	
    <tr>
      <td height="27" bgcolor="#FFFFFF">&nbsp;
      <c:out value="${book.id}"/></td>
      <td bgcolor="#FFFFFF">&nbsp;
      <c:out value="${book.name}"/></td>
      <td bgcolor="#FFFFFF">&nbsp;
      <c:out value="${book.price}"/>（元）</td>
      <td bgcolor="#FFFFFF">&nbsp;
      <c:out value="${book.bookCount}"/></td>
      <td bgcolor="#FFFFFF">&nbsp;
      <c:out value="${book.author}"/></td>
    </tr>
	</c:forEach>	
  </table>
</body>
</html>
