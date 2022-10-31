<html>
<head>
<title>Student Confirmation Title</title>
</head>
<body>
	The student is confirmed: ${param.firstName} ${param.lastName}
	<br />
	<br />
	<ul>
		<%
		String[] langs = request.getParameterValues("favoriteLanguage");

		if (langs != null) {
			for (String tempLang : langs) {
				out.println("<li>" + tempLang + "</li>");
			}
		}
		%>
	</ul>

	<!-- Display list of "favLan -->
<%-- 	<ul>
		<%
		String[] langs = request.getParameterValues("favLang");
		for (String tempLang : langs) {
			out.println("<li" + tempLang + "</li>");
		}
		%>
	</ul> --%>

</body>
</html>