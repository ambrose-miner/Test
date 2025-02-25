<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<h2>Delete Member Profile</h2>
<form action = "memberController" method = "post"> 
			<input type=submit value= "Delete Member"/>
			<label>Enter Member ID</label>
			<input type="number" name="MID"/><br/>
			<input type="hidden" name="userAction" value="deleteMember"/>
	</form>
</body>
</html>