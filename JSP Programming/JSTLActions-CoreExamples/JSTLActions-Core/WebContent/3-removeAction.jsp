<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Core Tag Example</title>
</head>
<body>
	<c:set var="income" scope="session" value="${4000*4}" />
	<p>
		Before Remove Value is:
		<c:out value="${income}" />
	</p>
	<c:remove var="income" /> <!--  Removing the vairable -->
	<p>
		After Remove Value is:
		<c:out value="${income}" />
	</p>
</body>
</html>