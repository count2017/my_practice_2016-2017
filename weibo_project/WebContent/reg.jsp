<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form action="User_reg_login.action" method="post">
<table border="0" align="center">
<tr>
<td colspan="2">请填写信息</td>
</tr>
<tr>
<td>用户名</td><td><input type="text" name="user.username"></td>
</tr>

<tr>
<td>密码</td><td><input type="password" name="user.password"></td>
</tr>
<tr>
<td>确认密码</td><td><input type="password" name="repassword"></td>
</tr>
<tr>
<td>昵称</td><td><input type="text" name="user.nickname"></td>
</tr>
<tr>
<td>性别</td><td><input type="radio" name="user.sex" value="1">男
<input type="radio" name="user.sex" value="2">女</td>
</tr>
<tr>
<td><input type="submit" value="注册"></td>
<td><input type="reset" value="重置"></td>
</tr>
</table>
</form>
</body>
</html>