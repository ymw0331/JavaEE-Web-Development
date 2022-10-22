<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi, this is page 1</h1>
	<jsp:include page="page2.jsp">
		<jsp:param name="param1" value="value1" />
	</jsp:include>
</body>
</html>