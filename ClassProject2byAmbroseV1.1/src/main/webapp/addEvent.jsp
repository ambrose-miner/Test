<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Fill in Event Details</h2>
	<form action = "EventController" method ="post">
		<label>Day</label>
		<input type="text" name="day"/><br/>
		<label>Time</label>
		<input type="text" name="time"/><br/>
		<label>Location</label>
		<input type="text" name="location"/><br/>
		<label></label>
		<select name="EID">
			<core:forEach items="${sessionScope.event}" var="event">
				<option value="${event.getEID()}"> <core:out value="${event.getday()}-${event.gettime()}-${event.getamorpm()}-${event.getlocation()}"></core:out> </option>
			</core:forEach>
		</select>
	</form>
	<a href="index.html">Back</a>
</body>
</html>