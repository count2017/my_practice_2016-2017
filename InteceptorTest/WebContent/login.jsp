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
<form  action="login">
     <p><s:property value="#request['errorMsg']"/></p>     <p>用户名:<input type="text" name="account" class="ipt"> 	         
     <p>密码:<input type="password" name="password"  class="ipt"></p> 
     <p class="dl"><input type="image" src="images/dl.jpg"></p>
</form>
</body>
</html>