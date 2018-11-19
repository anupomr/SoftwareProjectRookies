<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="LoginStyle.css" type="text/css" rel="stylesheet">
</head>
<body>
	<h3>
		Welcome to <i>Canadian Rookie's</i> web
	</h3>
	<fieldset>
		<p>Please use the form below for Registration.
		<form method="post" action="${pageContext.request.contextPath}/newUser">
			<table border="">
				<tr>		
					<td>First Name</td>
					<td><input type="text" placeholder="First Name" name="firstName" size="12"
						maxlength="12" required></td>
				</tr>
				<tr>		
					<td>Last Name</td>
					<td><input type="text" placeholder="Last Name" name="lastName" size="12"
						maxlength="12"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" size="12"	></td>
				</tr>
				<tr>
					<td>Postal Code</td>
					<td><input type="text" name="postalCode" size="6"
						maxlength="6"></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" size="12"	></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" size="12"	></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><input type="number" name="phNumber" size="12"	></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" size="12"	></td>
				</tr>
			</table>
			<input type="submit" name="regLogin" value="Save">
			</form>
	</fieldset>

</body>
</html>