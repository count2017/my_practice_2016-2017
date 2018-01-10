<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Weibo_addWeibo_welcome" method="post">
  <table border="1" align="center">
    <tr><td colspan="2">发布微博</td></tr>
    <tr>
    <td>标题</td><td><input type="text" name="wb.weiboname"/></td>
    </tr>
    <tr>
    <td>内容</td><td><textarea rows="30" cols="30" name="wb.message"></textarea></td>
    </tr>
    <tr>
    <td><input type="submit" value="发布"></td>
    <td><input type="reset"/></td>
    </tr>
  </table>
</form>

</body>
</html>