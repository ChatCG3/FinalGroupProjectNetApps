<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Registration</title>
</head>
<body>

<h1>Registration</h1>

	<form name=registrationForm action=register method=post >
	
	<label>
		Email Address:
	</label>
	<input type=text name=email placeholder="Email Address" required/>
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