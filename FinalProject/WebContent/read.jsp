<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
	String table = (String) request.getAttribute("table");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Shop Products</title>
</head>
<body><center>

	<table cellspacing="0" cellpadding="0" id="main">
		<tr>
		    <td colspan="3">
		        <table cellspacing="0" cellpadding="0" id="header">
			        <tr>
			            <td><img src="images/cropped-cropped-d2d-logo.jpg" align="left" height="150"></td>
			            
			            <td> <p align="right">  <br><font face="Times New Roman" size="6">&nbsp;&nbsp;&nbsp;&nbsp;
			               D2Decoys</font><br><font face="Times New Roman" size="4">Home</font> </p>
		 				</td>
		   
						<td width="20"> 
						</td>
		      		</tr>
		        </table>
		    </td>
		</tr>
		
		<tr >
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
		<tr>
	    	<td id="left">
			</td>
			
			<td id="content">
				<table cellspacing="1" cellpadding="1" width="100%" border="0">
				    <tbody>
				        <tr>
				            <td bgcolor="#c0cdd2">
				            	<p>
				            		<h1>Shop Products</h1>

									<%= table %>
									
									<form class="form" action="CartController" method="get" name="viewCart">
										<p>
											<input class="submit" type="submit" name="cart" value="View Cart" />
										</p>
									</form>
			
									<a href="index.jsp">Return to Home</a>
				            	<p></p>
				            </td>
				        </tr>
				     </tbody>
				</table>
		 </tr>
	</table>
</body>
</html>