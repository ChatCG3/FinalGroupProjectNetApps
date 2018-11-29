<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" media="screen" href="styles.css">
<title>Login Form</title>
</head>
<body>
	<table cellspacing="0" cellpadding="0" id="main">
		<tr>
		    <td colspan="3">
		        <table cellspacing="0" cellpadding="0" id="header">
			        <tr>
			            <td>
			            	<img src="images/cropped-cropped-d2d-logo.jpg" align="left" height="150">
			            </td>
			            
			            <td> <p align="right">  <br><font face="Times New Roman" size="6">&nbsp;&nbsp;&nbsp;&nbsp;
			               D2Decoys</font><br><font face="Times New Roman" size="4">Login</font> </p>
		 				</td>
			   
						<td width="20"> 
						</td>
			        </tr>
		        </table>
		    </td>
		</tr>
		<tr>
		    <td colspan="3" id="mainmenu">
		    	<ul class="mainmenu">
				    <li><a href="read">Products</a></li>
				    <li><a href="register">Registration</a></li>
				    <li><a href="login.jsp">Login</a></li>
				   	<li><a href="contact.jsp">Contact US</a></li>
				    <li><a href="storeLocator.jsp">Find a Store</a></li>
		   		</ul>    
		    </td>
		</tr>
	</table>
	
	<h1></h1>

	<form class="form" action="Login" method="post" name="loginForm">
	
		<ul>
			<li>
				<h2>Login</h2>
				<span class="required_notification">* Denotes Required Field</span>
			</li>
			
			<li>
				<label for="username">Username:</label>
				<input type="text" name="username" placeholder="Enter Username" required />
			</li>
			
			<li>
				<label for="password">Password:</label>
				<input type="password" name="password" placeholder ="Enter Password" required />
			</li>
			
			<li>
				<input class="submit" type="submit" name="Login" value="Login" />
				${errorMessage}
			</li>

		</ul>
					
					
	</form>

<a href="index.jsp">Return to Home</a>

</body>
</html>