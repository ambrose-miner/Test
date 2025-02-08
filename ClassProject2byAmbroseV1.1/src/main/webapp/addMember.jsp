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
<form>
<label>Member Id</label>
<input type="number" name="MID"/><br/>
<label>Member First Name</label>
<input type="text" name="f_name"/><br/>
<label>Member Last Name</label>
<input type="text" name="l_name"/><br/>
<label>Member email</label>
<input type="text" name="email"/><br/>
<label>Batch</label>
<select name="bid">
	<core:forEach items="${sessionScope.member}" var="member">
		<option value="${member.getMID()}"> <core:out value="${member.getf_name()}-${member.getl_name()}-${member.getemail()}"></core:out> </option>
	</core:forEach>
</select>
</form>
<a href="index.html">Back</a>
</body>
</html>