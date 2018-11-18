<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Login!!</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="LoginStyle.css" type="text/css" rel="stylesheet">
</head>
<body>
	<h3>
		Welcome to <i>Canadian Rookie's</i> web
	</h3>

	<fieldset>
		<p>Please use the form below to sign up.
		<form method="post" action="${pageContext.request.contextPath}/newUser">
			<table border="">
				<tr>
		
					<td>User name</td>
					<td><input type="text" placeholder="User name" name="userName" size="12"
						maxlength="12"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" size="12"
						maxlength="12"></td>
				</tr>
				<tr>
					<td>User Type</td>
					<td><input type="text" name="userType" size="12"
						maxlength="12"></td>
				</tr>
			</table>
			<input type="submit" name="regLogin" value="Save">
			</form>
	</fieldset>

</body>
</html>