<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
String table = (String) request.getAttribute("table");

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Customers</title>
</head>
<body>

<h1>Customers</h1>

<%= table %>
<br />
<a href="registration.jsp">Register a customer</a>

<a href="index.jsp">Return to Home</a>



</body>
</html>