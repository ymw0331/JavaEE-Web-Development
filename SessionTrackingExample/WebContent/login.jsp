<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginServlet" method="POST">

		<label>User Name: </label> <input type="text" name="userName">
		<label>Password: </label> <input type="password" name="password">


		<input type="submit" name="Login" value="login" />

	</form>

</body>
</html>