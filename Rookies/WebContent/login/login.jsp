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
		<p>If you are a member, please use the form below to sign in.
		<form method="post" action="${pageContext.request.contextPath}/Login">
			<table border="0">
				<tr>
		
					<td>User name</td>
					<td><input type="text" placeholder="User name" name="userName" size="12"
						maxlength="12" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" size="12"
						maxlength="12" required></td>
				</tr>
			</table>
			<input type="submit" name="login" value="Login">
			<p>
				<a href="${pageContext.request.contextPath}/login/fogetPassword.jsp">Forget
					password</a>
			</p>
		</form>
	</fieldset>
	<fieldset>
		<p>
			If you not a member, please <a
				href="${pageContext.request.contextPath}/login/newUser.jsp">Register
				to join</a>.
		</p>
	</fieldset>
</body>
</html>