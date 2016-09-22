<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My JSP 'fileupload.jsp' starting page</title>
</head>
<body>
	<form action="FileUpLoad" enctype="multipart/form-data" method="post">

		用户名：<input type="text" name="usename"> <br /> 上传文件：<input
			type="file" name="file1"><br /> 上传文件： <input type="file"
			name="file2"><br /> <input type="submit" value="提交" />

	</form>
</body>
</html>