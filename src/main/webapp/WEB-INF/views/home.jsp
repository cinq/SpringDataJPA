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
for ( Event oneEvent: listEvents) {
	out.println("<li>" + oneEvent.getTitle() + " - " + oneEvent.getDate() + "</li>");
}
%>
</ol>

To Add an Event:

</body>
</html>
