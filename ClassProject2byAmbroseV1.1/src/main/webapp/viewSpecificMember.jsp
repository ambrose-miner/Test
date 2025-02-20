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
	<form action = "memberController" method = "get"> 
			<input type=submit value= "View Member">
			<label>Enter Member ID</label>
			<input type="number" name="MID"/><br/>
			<input type="hidden" name=userAction value=viewSpecificMember>
	</form>
<h2>Selected Member Details</h2>

<table border="1">
	<tr>
		<th>Member ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<core:forEach items="${sessionScope.Member}" var="Member">
		<tr>
			<td><core:out value="${member.getMID()}"></core:out> </td>
			<td><core:out value="${member.getF_name()}"></core:out> </td>
			<td><core:out value="${member.getL_name()}"></core:out> </td>			
			<td><core:out value="${member.getEmail()}"></core:out> </td>
		</tr>
	</core:forEach>
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
	<core:forEach items="${sessionScope.Event}" var="Event">
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