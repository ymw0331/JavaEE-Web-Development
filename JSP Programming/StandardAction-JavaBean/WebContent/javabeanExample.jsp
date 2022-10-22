<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="student" class="com.javabeans.beans.Student">
		<jsp:setProperty name="student" property="firstName" value="Wayne" />
		<jsp:setProperty name="student" property="lastName" value="Yong" />
		<jsp:setProperty name="student" property="email"
			value="ymw0331@gmail.com" />
	</jsp:useBean>

	<p>
		Student First Name is :
		<jsp:getProperty name="student" property="firstName" />
	</p>
	<p>
		Student Last Name is :
		<jsp:getProperty name="student" property="lastName" />
	</p>
	<p>
		Student Email is :
		<jsp:getProperty name="student" property="email" />
	</p>
</body>
</html>