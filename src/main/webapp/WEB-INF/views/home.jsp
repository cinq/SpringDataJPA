<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="com.cinq.test.domain.Event" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
	<title>Spring Data JPA Example</title>
</head>
<body>

List of Events:

<ol>
<%
ArrayList<Event> listEvents = (ArrayList<Event>) pageContext.getAttribute("events");
if ( listEvents != null ) {
	for ( Event oneEvent: listEvents) {
		out.println("<li>" + oneEvent.getTitle() + " - " + oneEvent.getDate() + "</li>");
	}
} else {
	out.println("<li>No events</li>");
}
%>
</ol>

To Add an Event:

<form action="addEvent" method="post">
<table>
<tr><td>Title:</td><td><input type="text" size="20" name="title" /></td></tr>
<tr><td>Description:</td><td><input type="text" name="description" /></td></tr>
<tr><td>Date:</td><td><input type="date" name="date" /></td></tr>
<tr><td></td><td><input type="submit" value="Add >" /></td></tr>
</table>
</form>

</body>
</html>
