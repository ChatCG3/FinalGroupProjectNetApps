<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
String table = (String) request.getAttribute("table");

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css">
<title>Cart</title>
</head>
<body>

<h1>Cart</h1>

<%= table %>
<br />
<p>
	<a href="read">Return to products</a>
</p>

<p>
	<a href="index.jsp">Return home</a>
</p>

<a href="index.jsp">Return to Home</a>



</body>
</html>