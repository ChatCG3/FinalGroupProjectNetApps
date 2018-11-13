<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Contact Us</title>
</head>
<body>

<h1>Contact Us</h1>

	<form name=contactForm action=contactUs method=get >
	
	<label>
		Name:
	</label>
	<input type=text name=name value="" />
	<br />
	
	<label>
		Email:
	</label>
	<input type=text name=email value="" />
	<br />
	
	<input type="checkbox" name="carryProduct" value="yesNo"/>
	Would you like to carry this product in your store?<br />
	
	<label>
		Message:
	</label>
	<input type=text name=message value="" />
	<br />
	
	<input type=submit name= submit value="Submit" />


</form>


</body>
</html>