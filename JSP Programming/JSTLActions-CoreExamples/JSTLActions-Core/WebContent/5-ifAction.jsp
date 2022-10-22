<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Core Tag Example</title>
</head>
<body>
	<c:set var="income" scope="session" value="${1000*4}" />
	<c:if test="${income > 8000}">
		<p>
			My income is:
			<c:out value="${income}" />
		<p>
	</c:if>
</body>
</html>
