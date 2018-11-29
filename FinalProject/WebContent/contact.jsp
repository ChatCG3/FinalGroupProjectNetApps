<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css">
<title>Login Form</title>
</head>
<body><center>
	<table cellspacing="0" cellpadding="0" id="main">
	<tr>
	    <td colspan="3">
	        <table cellspacing="0" cellpadding="0" id="header">
	        <tr>
	            <td><img src="images/cropped-cropped-d2d-logo.jpg" align="left" height="150"></td>
	               <td> <p align="right">  <br><font face="Times New Roman" size="6">&nbsp;&nbsp;&nbsp;&nbsp;
	               D2Decoys</font><br><font face="Times New Roman" size="4">Contact Us</font> </p>
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
	   	<li><a href="login.jsp">Login</a></li>
	    <li><a href="storeLocator.jsp">Find a Store</a></li>
	    <ul></ul>
	        </div>
	    </ul></td>
	</tr>
	<tr class="loginform">
	    <td id="left">
	</td>
<td>

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

<a href="index.jsp">Return to Home</a>


</body>
</html>