<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String userName = request.getParameter("userName");

	if (userName == null || userName.equals("")) {
		throw new Exception();
	} else {
		out.print("Welcome " + userName);
	}
	%>

</body>
</html>