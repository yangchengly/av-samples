<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	if (request.getSession(true).getAttribute("user_id") != null) {
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>联系人导入</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="../css/main.css" rel="stylesheet" type="text/css">
<script src="../js/main.js" type="text/javascript"></script>
<script src="../js/common.js" type="text/javascript"></script>
<script src="../js/pomservice.js" type="text/javascript"></script>

<script type="text/javascript">
	function imports() {
		if ($("contactListFile").value == "") {
			alert("请选择要导入的文件!");
			return false;
		}
		upform.submit();
	}
</script>
<style type="text/css">
body {
	background-color: #ffffff;
	margin-top: 0px;
	margin-bottom: 0px;
}
</style>
</head>

<body>
	<form name="upform"
		action="../servlet/com.gov.callcenter.service.DataServiceServlet?action=importContact"
		method="POST" enctype="multipart/form-data">
		<%
			String result = request.getParameter("result");
				String count = request.getParameter("count");
				if (result == null) {
		%>
		<table border="0" cellpadding=0 cellspacing=0 class="innerTableBorder"
			id="innerTable_0">
			<tr>
				<td width="40%" class="innerTitle3">请选择要导入的文件</td>
				<td width="60%" class="innerTitle3"></td>
			</tr>
			<tr>
				<td height="20" colspan="2">
					<table width="100%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td style="HEIGHT: 5px"></td>
						</tr>
						<tr>
							<td width="15%" class="innerText3">导入文件：</td>
							<td width="50%" class="innerText3" colspan="3"><input
								name="contactListFile" type="file" size="40"
								id="contactListFile" class="innerInput2"></td>
						</tr>

						<tr>
							<td height="30" align="center" colspan="4"
								style="padding-left: 10; font-size: 12px"><input
								type="button" name="button" class="innerButton3" value="提交"
								onclick="imports()"> <input type="reset" name="button"
								class="innerButton3" value="重置">
								</button></td>
						</tr>
						</td>
						</tr>
					</table> <%
 	} else {
 %> <script type="text/javascript">
		parent.contactList.location.reload();
	</script>
					<table border="0" cellpadding=0 cellspacing=0
						class="innerTableBorder" id="innerTable_0">
						<tr>
							<td width="40%" class="innerTitle3"></td>
							<td width="60%" class="innerTitle3"></td>
						</tr>
						<tr>
							<td height="20" colspan="2">
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td style="HEIGHT: 80px"></td>
									</tr>
									<tr>
										<td width="15%" class="innerText1" style="text-align: center;">Import
											<%=count%> Records <%=result%></td>
									</tr>
									<tr>
										<td style="HEIGHT: 40px"></td>
									</tr>
									<tr>
										<td height="30" align="center" colspan="4"
											style="padding-left: 10; font-size: 12px"><input
											type="button" name="button" class="innerButton3" value="返回"
											onclick="window.location.href='contactImport.jsp'"></td>
									</tr>
									<tr>
										<td style="HEIGHT: 80px"></td>
									</tr>
									</td>
									</tr>
								</table> <%
 	}
 %>
								</form> <%
 	} else {
 		request.getSession(true).setAttribute("message", "登录超时，请您重新登录！");
 		request.getSession(true).setAttribute("returnurl", "login.jsp");
 %>
								<body
									onload="window.parent.frames['frames'].location.href='../message.jsp'">
									<%
										}
									%>
								</body>