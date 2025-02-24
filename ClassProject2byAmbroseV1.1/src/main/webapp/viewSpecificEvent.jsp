<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Event</title>
</head>
<body>
	<form action = "eventController" method = "post"> 
			<input type=submit value= "View Event"/>
			<label>Enter Event ID</label>
			<input type="number" name="EID"/><br/>
			<input type="hidden" name="userAction" value="viewSpecificEvent"/>
	</form>
	<h2>Selected Event Details</h2>

	<table border = "1">
	<tr>
		<th>Event ID</th>
		<th>Day</th>
		<th>Location</th>
		<th>Time</th>
	</tr>
		<tr>
			<td><core:out value="${sessionScope.specificEvent.getEID()}"></core:out> </td>
			<td><core:out value="${sessionScope.specificEvent.getDay()}"></core:out> </td>
			<td><core:out value="${sessionScope.specificEvent.getLocation()}"></core:out> </td>			
			<td><core:out value="${sessionScope.specificEvent.getTime()}"></core:out> </td>
		</tr>
</table>
<br/>
<h2>Members In Selected Event</h2>

<table border = "1">
	<tr>
		<th>Member ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<core:forEach items="${sessionScope.listOfMember}" var="member">
		<tr>
			<td><core:out value="${member.getMID()}"></core:out> </td>
			<td><core:out value="${member.getF_name()}"></core:out> </td>
			<td><core:out value="${member.getL_name()}"></core:out> </td>			
			<td><core:out value="${member.getEmail()}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<a href="index.jsp">Back</a>
</body>
</html>