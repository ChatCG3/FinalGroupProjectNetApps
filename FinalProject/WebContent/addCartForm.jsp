<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css">
<title>Add to Cart</title>
</head>
<body>

<h1>Add to Cart</h1>

	<form class="form" action="addCart" method="post" name="addToCartForm">

		<ul>
			<li>
				<h2>Quantity</h2> 
				<span class="required_notification">* Denotes Required Field</span>
			</li>

			<li>
				<label for="quantity">Quantity:</label> 
				<input type="number" name="quantity" placeholder="Enter Quantity" required />
			</li>

			<li>
				<input class="submit" type="submit" name="addToCar" value="Add to Cart" />
			</li>
		</ul>
		
	</form>

<a href="index.jsp">Return to Home</a>

</body>
</html>