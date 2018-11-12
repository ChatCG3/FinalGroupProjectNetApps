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
<title>Products</title>
</head>
<body>

<h1>Products</h1>

<%= table %>
<br />
<a href="add">Add a product</a>


</body>
</html>