<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zumba Class Schedule</title>
</head>
<body>
<h2>View All Event Details</h2>

<table border="1">
	<tr>
		<th>event ID</th>
		<th>Day</th>
		<th>Time</th>

		<th>Location</th>
	</tr>
	<core:forEach items="${sessionScope.event}" var="event">
		<tr>
			<td><core:out value="${event.getEID()}"></core:out> </td>
			<td><core:out value="${event.getDay()}"></core:out> </td>
			<td><core:out value="${event.getTime()}"></core:out> </td>
			
			<td><core:out value="${event.getLocation()}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="index.html">Back</a>
</body>
</html>