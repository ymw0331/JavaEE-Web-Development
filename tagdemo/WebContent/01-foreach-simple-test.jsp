<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//just create some sample data... normally provided by MVC

String[] cities = { "Mumbai", "Singapore", "Kuala Lumpur" };

pageContext.setAttribute("myCities", cities);
%>
<html>

<body>
	<c:forEach var="tempCity" items="${myCities}">
	${tempCity }<br />
	</c:forEach>

</body>

</html>