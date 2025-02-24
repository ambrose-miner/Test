<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Member</title>
</head>
<body>
	<form action = "memberController" method = "post"> 
			<input type=submit value= "View Member"/>
			<label>Enter Member ID</label>
			<input type="number" name="MID"/><br/>
			<input type="hidden" name="userAction" value="viewSpecificMember"/>
	</form>
<h2>Selected Member Details</h2>

<table border="1">
	<tr>
		<th>Member ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
		<tr>
			<td><core:out value="${sessionScope.specificMember.getMID()}"></core:out> </td>
			<td><core:out value="${sessionScope.specificMember.getF_name()}"></core:out> </td>
			<td><core:out value="${sessionScope.specificMember.getL_name()}"></core:out> </td>			
			<td><core:out value="${sessionScope.specificMember.getEmail()}"></core:out> </td>
		</tr>
</table>
<br/>
<h2>Member's Events</h2>

<table border = "1">
	<tr>
		<th>Event ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<core:forEach items="${sessionScope.listOfEvent}" var="event">
		<tr>
			<td><core:out value="${event.getEID()}"></core:out> </td>
			<td><core:out value="${event.getDay()}"></core:out> </td>
			<td><core:out value="${event.getTime()}"></core:out> </td>
			<td><core:out value="${event.getLocation()}"></core:out> </td>
		</tr>
	</core:forEach>

</table>
<a href="index.jsp">Back</a>
</body>
</html>