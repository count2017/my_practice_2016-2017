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
<s:if test="fieldErrors['uploadMany'].size()>0">
	<s:property value="fieldErrors['uploadMany'][0]"/>
</s:if>
<s:else>
	<s:property value="message"/>
	<s:property value=""/>
</s:else>
<form action="fileUpload_ManyFileUpload" method="post" enctype="multipart/form-data">
上传者：<input type="text" name="author"><br>
上传文件:<input type="file" name="uploadMany"><br>
上传文件:<input type="file" name="uploadMany"><br>
上传文件:<input type="file" name="uploadMany"><br>
<input type="submit" value="上传">

</form>
<s:debug></s:debug>
</body>
</html>