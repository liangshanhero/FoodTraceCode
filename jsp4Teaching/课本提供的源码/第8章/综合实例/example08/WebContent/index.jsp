<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<script language="javascript">
	function checkEmpty(form) {
		for (i = 0; i < form.length; i++) {
			if (form.elements[i].value == "") {
				alert("表单信息不能为空");
				return false;
			}
		}
	}
</script>
<style type="text/css">
section {
	margin:0 auto auto auto;			/*设置外边距*/
	width:363px;						/*设置页面宽度*/
	clear:both;						/*设置两侧均不可以有浮动内容*/
	background-image:url(images/login.png);			/*设置背景图片*/
	height:224px;						/*设置高度*/
}
form{
	padding-left: 80px;		/*设置左内边距*/
	padding-top: 120px;		/*设置上内边距*/
}
body{
	margin: 0px;
}
</style>
</head>
<body>
<section>

 
  <form name="form" method="post" action="showuser.jsp" onSubmit="return checkEmpty(form)">
    <input type="text" name="user">
    <input type="submit" name="Submit" value="登录">
  </form>

</section>
</body>
</html>