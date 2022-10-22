<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  1- HTML Form + 2- HTML URL (<a href="">) -->
	<form action="testRequest" method="POST">
		<input type="text" name="userName" id="userName" />
		<!-- name==>reach parameter id==>reach select HTML control using JS  -->

		<select name="country">
			<option>USA</option>
			<option>UK</option>
			<option>Turkey</option>
		</select> <br /> <input type="submit" name="submit" value="Submit" />

	</form>

</body>
</html>