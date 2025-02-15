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

	<h2>Fill in Member Details</h2>
	<form action = "MemberController" method = "post"> 
		<label>Member First Name</label>
		<input type="text" name="f_name"/><br/>
		<label>Member Last Name</label>
		<input type="text" name="l_name"/><br/>
		<label>Member email</label>
		<input type="text" name="email"/><br/>
	</form>
	<a href="index.html">Back</a>
</body>
</html>