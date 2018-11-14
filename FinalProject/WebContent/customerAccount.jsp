<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Home</title>
</head>
<body>

<h1>Welcome, ${customer.username}!</h1>
<p>You have successfully logged in, congratulations.<br>
Click <a href="Login?logout=true">here</a> to log back out.
</p>

<p>To return to the Home Page<br>
Click <a href="index.jsp">here</a> to go back to Home.
</p>


</body>
</html>