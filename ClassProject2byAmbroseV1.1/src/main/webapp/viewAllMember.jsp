<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>View Members Details</h2>

<table border="1">
	<tr>
		<th>Member ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<core:forEach items="${sessionScope.member}" var="event">
		<tr>
			<td><core:out value="${event.getMID()}"></core:out> </td>
			<td><core:out value="${event.getf_name()}"></core:out> </td>
			<td><core:out value="${event.getl_name()}"></core:out> </td>
			
			<td><core:out value="${event.getemail()}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="index.html">Back</a>
</body>
</html>