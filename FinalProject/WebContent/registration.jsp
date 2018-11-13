<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Registration</title>
</head>
<body>


<h1>Registration</h1>

	<form name=registrationForm action=registerCustomer method=get >
	
	<label>
		ID:
	</label>
	<input type=text name=id value=""/>
	<br />
	
	<label>
		Username:
	</label>
	<input type=text name=username placeholder="Username" required/>
	<br />
	
	<label>
		Password:
	</label>
	<input type=password name=password placeholder="Password" required/>
	<br />
	
	<input type=submit name=register value="Register" />


</form>


</body>
</html>