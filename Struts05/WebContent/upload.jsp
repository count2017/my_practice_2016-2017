<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
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
<s:else>
<s:property value="message"/>
<s:property value="uploadFileName"/>
</s:else>

<form action="fileUpload_fileUpload" method="post" enctype="multipart/form-data">
上传者：<input type="text" name="author"><br>
上传文件:<input type="file" name="upload"><br>

<input type="submit" value="上传文件">

</form>
<s:debug></s:debug>
</body>
</html>