<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:if test="fieldErrors['upload'].size()>0">
<s:property value="fieldErrors['upload'][0]"/>
</s:if>

用户名：<input type="text" name="u.name" /><br>
密码：<input type="text" name="u.pass" /><br>
<input type="submit" value="登录" />
</body>
</html>