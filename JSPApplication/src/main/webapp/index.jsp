<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>"Welcome to JSP"</h2>
<%!
int x,y,sum,a,b;
String name;
%>
<%

System.out.println("Welcome to JSP on Console");
out.println("Welcome to JSP on browser");
out.println("New add text");
%>
<br/>
<%
int a = 15;
int b = 25;
int sum = a + b;
if (sum > 30){
	out.println("sum is greater than 30");
}else{
	out.println("sum is less than 30");
}
%>
<p><font color='green'>Sum of two number is <%=100+200 %></font></p>
<p><font color="blue">Sum of <%=a %> and <%=b %> is <%=sum %></font></p>
</body>
</html>