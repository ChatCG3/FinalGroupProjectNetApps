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
				<h2>Product Info</h2> 
				<span class="required_notification">* Denotes Required Field</span>
			</li>
			
			<li>
				<label for="productID">Product ID:</label> 
				<input type="number" name="productID" placeholder="Enter Product ID" required />
			</li>
			
			<li>
				<label for="description">Description:</label> 
				<input type="text" name="description" placeholder="Enter Description" required />
			</li>
			
			<li>
				<label for="imageID">Image ID:</label> 
				<input type="text" name="imageID" placeholder="Enter Image ID" required />
			</li>
			
			<li>
				<label for="price">Price:</label> 
				<input type="number" name="price" placeholder="Enter Price" required />
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