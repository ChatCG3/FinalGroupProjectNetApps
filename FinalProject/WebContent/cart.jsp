<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
String welcome = (String) request.getAttribute("welcome");
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
<table>
    <tr>
        <th>Description</th>
        <th class="right">Price</th>
        <th>&nbsp;</th>
    </tr>
	<tr>
        <td>86 (the band) - True Life Songs and Pictures</td>
        <td class="right">$14.95</td>
        <td><form action="cart" method="post">
                <input type="hidden" name="productCode" value="8601">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
</table>








<%-- <%= welcome %> --%>
<!-- <br /> -->

<%-- <%= table %> --%>
<!-- <br /> -->
<!-- <a href="add">Add a product</a> -->

<a href="index.jsp">Return to Home</a>



</body>
</html>