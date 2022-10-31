<%@page import="java.net.URLEncoder"%>
<html>

<head>Confirmation
</head>
<%
//read form data
String favLang = request.getParameter("favoriteLanguage");

// encode cookie data ... handle case of languages with spaces in them
favLang = URLEncoder.encode(favLang, "UTF-8");

//create the cookie
Cookie theCookie = new Cookie("myApp.favoriteLanguage", favLang);

//set the lifespan .... total number of seconds
theCookie.setMaxAge(60 * 60 * 24 * 365);

//send cookie to browser
response.addCookie(theCookie);
%>

<body>
	Thanks! We set your favorite language to: ${param.favoriteLanguage}

	<br />
	<br />

	<a href="12-cookies-homepage.jsp">Home Page</a>

</body>

</html>