<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML>
<html>
<head>
<title>��ӹ���Ա</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="CSS/style.css" rel="stylesheet">
<style type="text/css">
ul{
	list-style: none;
	padding-top:10px;
}
li{
	padding:5px;
}
</style>
</head>
<script language="javascript">
function check(form){
	if(form.name.value==""){
		alert("���������Ա����!");form.name.focus();return;
	}
	if(form.pwd.value==""){
		alert("���������Ա����!");form.pwd.focus();return;
	}
	if(form.pwd1.value==""){
		alert("��ȷ�Ϲ���Ա����!");form.pwd1.focus();return;
	}		
	if(form.pwd.value!=form.pwd.value){
		alert("����������Ĺ���Ա���벻һ�£�����������!");form.pwd.focus();return;
	}
	form.submit();
}
</script>
<body>
<section style="background-image: url(Images/subBG.jpg);width:292px;height:175px;">
	<form name="form1" method="post" action="manager?action=managerAdd">
	<ul>
		<li>����Ա���ƣ�<input name="name" type="text"></li>
		<li>����Ա���룺<input name="pwd" type="password" id="pwd"></li>
		<li>ȷ�ϡ����룺<input name="pwd1" type="password" id="pwd1"></li>
		<li style="text-align: center"><input name="Button" type="button" value="����" onClick="check(form1)">
&nbsp;
<input name="Submit2" type="button" value="�ر�" onClick="window.close();"></li>
	</ul>
</form>
</section>
</body>
</html>
