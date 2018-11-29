<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "model.*" %>

<% Product product = (Product) request.getAttribute("product"); %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css">
<title>D2 Decoys - Add Product to Cart</title>
</head>
<body>

<h1>D2 Decoys - Add Product to Cart</h1>

	<form class="form" action=updateProduct method=get name=updateForm >
		
		<ul>
			<li>
				<h2>Product Info</h2> 
				<span class="required_notification">* Denotes Required Field</span>
			</li>
			
			<li>
				<label>
					Product ID:
				</label>
				<input type=text name=productID value="<%= product.getProductID() %>"/>
				<br />
			</li>
			
			<li>
				<label>
					Description:
				</label>
				<input type=text name=description value="<%= product.getDescription() %>" />
				<br />
			</li>
			
			<li>
				<label>
					Image ID:
				</label>
				<input type=text name=imageID value="<%= product.getImageID() %>" />
				<br />
			</li>
			
			<li>
				<label>
					Price:
				</label>
				<input type=text name=price value="<%= product.getPrice() %>" />
				<br />
			</li>
			
			<li>
				<label>
					Code:
				</label>
				<input type=text name=code value="<%= product.getCode() %>" />
				<br />
			</li>
			
			<li>
				<label>
					Quantity:
				</label>
				<input type=text name=quantity value="" />
				<br />
			</li>
			
			<li>
				<input class="submit" type=submit name= submit value="Update the Product" />
			</li>
		</ul>
	</form>
	
	<a href="read.jsp">Return to Products</a>
	<br />
	
	<a href="index.jsp">Return to Home</a>
	<br />

</body>
</html>