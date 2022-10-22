<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!//declaration elememt (definition of method)
	public String sayHello() {
		return "Hello from JSP";
	}%>
	<br />
	<!-- Servlet Class -->
	<%=//java expression
		//printWriter.print(sayHello());
		sayHello()%>
	<br />

	<!-- Service Method -->
	<%
	//scriptlet element to type same output
	out.print(sayHello()); //out is the explicit object for printWriter

	out.print("<br/>");
	response.getWriter().print(sayHello());
	%>

	<!-- Replace Scripting Elements by using JSP Actions -->





</body>