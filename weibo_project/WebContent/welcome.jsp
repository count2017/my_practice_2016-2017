<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${user.nickname }欢迎！<br>
<a href="addWeibo.jsp">发微博</a>
<table>
<tr>
<td>标题</td>
<td>点击量</td>
<td>发布时间</td>
<td>发布人</td>
<td>操作</td>
</tr>
<c:forEach items="${list }" var="weibo">
<tr>
<td><a href="ReWeibo_findByWeibo_queryWeibo?wb.weiboid=${weibo.weiboid}">${weibo.weiboname }</a></td>
<td>${weibo.clickNum }</td>
<td>${weibo.addtime }</td>
<td>${weibo.user.nickname }</td>
<c:if test="${user.nickname==weibo.user.nickname }">
<td><a href="Weibo_updateWeibo_welcome?wb.weiboid=${weibo.weiboid}">修改</a>
<a href="Weibo_deleteWeibo_welcome?wb.weiboid=${weibo.weiboid}">删除</a></td>
</c:if>
</tr>
</c:forEach>


</table>
</body>
</html>