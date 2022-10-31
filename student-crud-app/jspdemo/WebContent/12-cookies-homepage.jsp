<%@page import="java.net.URLDecoder"%>
<html>

<head>
<title>Your Favorite Programming Language</title>
</head>

<body>
	<!-- read the favorite language cookie -->

	<%
	//the default .. if there is no cookies
	String favLang = "Java";

	//get the cookie from browser request 
	Cookie[] theCookies = request.getCookies();

	//fid our favorite language cookie
	if (theCookies != null) {
		for (Cookie tempCookie : theCookies) {

			if ("myApp.favoriteLanguage".equals(tempCookie.getName())) {
		/* 	favLang = tempCookie.getValue(); */
		// decode cookie data ... handle case of languages with spaces in them
		favLang = URLDecoder.decode(tempCookie.getValue(), "UTF-8");

		break;

			}
		}
	}
	%>
	<!-- now show a personalized page .... use the "favLang" variable -->


	<!--  shoe new bookds for this lang -->
	<h4>
		New Books for
		<%=favLang%></h4>
	<ul>
		<li>blah blah blah</li>
		<li>blah blah blah</li>
		<li>blah blah blah</li>
	</ul>

	<h4>
		Latest News Reports for
		<%=favLang%></h4>
	<ul>
		<li>blah blah blah</li>
		<li>blah blah blah</li>
		<li>blah blah blah</li>
	</ul>

	<h4>
		Hot Jobs for
		<%=favLang%></h4>
	<ul>
		<li>blah blah blah</li>
		<li>blah blah blah</li>
		<li>blah blah blah</li>
	</ul>

	<hr>
	<a href="12-cookies-personalized-form.html">Personalize this page</a>

</body>
</html>