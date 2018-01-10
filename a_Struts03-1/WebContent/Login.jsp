<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
${login_failed }
<form action="main" method="post">
<table>
<tr>
<td>用户名：</td>
<td><input type="text" name="u.uname"></td>
</tr>
<tr>
<td>密码：</td>
<td><input type="password" name="u.upass"></td>
</tr>
<tr>
<td>用户权限：</td>
<td><input type="radio" name="u.role" value="系统管理员" checked="checked">系统管理员</td>
<td><input type="radio" name="u.role" value="系统维护员">系统维护员</td>
<td><input type="radio" name="u.role" value="普通用户">普通用户</td>
</tr>
</table>
<input type="submit" value="登录">
</form>
</body>
</html>