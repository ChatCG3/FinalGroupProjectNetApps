<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Login Form</title>
</head>
<body><center>
	<table cellspacing="0" cellpadding="0" id="main">
	<tr>
	    <td colspan="3">
	        <table cellspacing="0" cellpadding="0" id="header">
	        <tr>
	            <td><a href="index.jsp" class="custom-logo-link" rel="home" itemprop="url">
	            <img src="images/cropped-cropped-d2d-logo.jpg" align="left" height="150"></td></a>
	               <td> <p align="right">  <br><font face="Times New Roman" size="6">&nbsp;&nbsp;&nbsp;&nbsp;
	               D2Decoys</font><br><font face="Times New Roman" size="4">Login</font> </p>
 </td>
	   
	<td width="20"> </td>
	                    </tr>
	        </table>
	    </td>
	</tr>
	<tr>
	    <td colspan="3" id="mainmenu"><ul class="mainmenu">
	    <li><a href="read">Products</a></li>
	    <li><a href="register">Registration</a></li>
	   	<li><a href="contact.jsp">Contact US</a></li>
	    <li><a href="storeLocator.jsp">Find a Store</a></li>
	    <ul></ul>
	        </div>
	    </ul></td>
	</tr>
	<tr class="loginform">
	    <td id="left">
	</td>
<td>
<form id="loginForm" action="Login" method="post">
	<h1>Log In</h1>
	<input type="text" name="username" placeholder="Username" required><br>
	<input type="password" name="password" placeholder ="Password" required><br>
	<input type="submit" value="Login"><br>
	${errorMessage}
</form>
</td>
</body>
</html>