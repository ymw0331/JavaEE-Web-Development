<%@ page import="java.util.*"%>
<html>
<body>

	<!-- Step 1: Create HTML Form -->
	<form action="11-todo-demo.jsp">
		Add new item: 
		<input type="text" name="theItem" /> 
		<input type="submit" value="Submit" />
	</form>

	<br /> Item entered:
	<%=request.getParameter("theItem")%>

	<!-- Step 2: Add new item to "To Do" list -->
	<%
	//get the todo items from the session
	List<String> items = (List<String>) session.getAttribute("myToDoList");

	//if the todo istems doesn't exist, then create a new one
	if (items == null) {
		items = new ArrayList<String>();
		session.setAttribute("myToDoList", items);
	}

	//see if there is a form data to add
	String theItem = request.getParameter("theItem");

	//
	// UPDATED CODE BLOCK FOR booleans and if/then statement
	//
	boolean isItemNotEmpty = theItem != null && theItem.trim().length() > 0;
	boolean isItemNotDuplicate = theItem != null && !items.contains(theItem.trim());

	if (isItemNotEmpty && isItemNotDuplicate) {
		items.add(theItem.trim());
	}

	/* 	if ((theItem != null) && (!theItem.trim().equals(""))) {
	items.add(theItem);
		} */
	%>

	<!-- Step 3: Display all "To Do" item from session -->
	<hr>
	<b>Todo List Items:</b>
	<br />
	<ol>
		<%
		for (String temp : items) {
			out.println("<li>" + temp + "</li>");
		}
		%>
	</ol>
</body>
</html>