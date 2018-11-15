<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" media="screen" href="styles.css" >
<title>Registration</title>
</head>
<body>


<h1></h1>

	<form class="form" action="validate" method="get" name="registrationForm">

		<ul>
			<li>
				<h2>Registration</h2> 
				<span class="required_notification">* Denotes Required Field</span>
			</li>

			<li>
				<label for="username">Username:</label> 
				<input type="text" name="username" placeholder="Enter Username" required />
			</li>

			<li>
				<label for="password">Password:</label> 
				<input type="password" name="password" placeholder="Enter Password" required /> 
				<span class="form_hint">Must be greater than 8 characters long</span>
			</li>

			<li>
				<input class="submit" type="submit" name="register" value="Register" />
			</li>
		</ul>
		
	</form>

<a href="index.jsp">Return to Home</a>


</body>
</html>