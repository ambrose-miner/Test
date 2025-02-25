<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<form action = "eventController" method = "post"> 
			<input type=submit value= "Cancel Event "/>
			<label>Enter Event ID</label>
			<input type="number" name="EID"/><br/>
			<input type="hidden" name="userAction" value="deleteEvent"/>
	</form>
</body>
</html>