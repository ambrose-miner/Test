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
			<td><core:out value="${member.getf_name()}"></core:out> </td>
			<td><core:out value="${member.getl_name()}"></core:out> </td>			
			<td><core:out value="${member.getemail()}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="index.html">Back</a>
</body>
</html>