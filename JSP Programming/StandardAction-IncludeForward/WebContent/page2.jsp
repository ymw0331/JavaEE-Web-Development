<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi, this is page 2</h1>
	<%=request.getParameter("param1")%>
	<%-- <jsp:forward page="page3.jsp"></jsp:forward> --%>
</body>
</html>