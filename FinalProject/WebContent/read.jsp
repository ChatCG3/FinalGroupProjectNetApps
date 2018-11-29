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
<title>Shop Products</title>
</head>
<body>

<h1>Shop Products</h1>

<%= table %>
<br />


	<form class="form" action="CartController" method="get" name="viewCart">
		<p>
			<input class="submit" type="submit" name="cart" value="View Cart" />
		</p>
	</form>

<p>
	<a href="index.jsp">Return home</a>
</p>








<%-- <%= welcome %> --%>
<!-- <br /> -->

<%-- <%= table %> --%>
<!-- <br /> -->
<!-- <a href="add">Add a product</a> -->

<a href="index.jsp">Return to Home</a>



</body>
</html>