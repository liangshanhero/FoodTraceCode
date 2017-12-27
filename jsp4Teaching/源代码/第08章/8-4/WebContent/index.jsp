<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>填写留言信息</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="MessageServlet">
	  留&nbsp;言&nbsp;人：
	  <input name="person" type="text" id="person" />
	  <br />
	  <br />
	留言内容：
	<textarea name="content" cols="30" rows="5" id="content"></textarea>
	<br />
	<br />
	<input type="submit" name="Submit" value="提交" />
	&nbsp;
	<input type="reset" name="Submit2" value="重置" />
</form>
</body>
</html>