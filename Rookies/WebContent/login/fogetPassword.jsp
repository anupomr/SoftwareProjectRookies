<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Forget Password!!</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="LoginStyle.css" type="text/css" rel="stylesheet">
</head>
<body id="grad1">
<div id="allPage">
	<h3>
		Welcome to <i>Canadian Rookie's</i> web
	</h3>

	<fieldset>
		<p>If you are a member, please give user Name.
		<form method="post" action="${pageContext.request.contextPath}/forget">
			<table>
				<tr>
		
					<td>User name</td>
					<td><input type="text" placeholder="User name" name="userName" size="12"
						maxlength="12" required></td>
				</tr>
				
			</table>
			<input type="submit" name="recover" value="Recover">
			<p>
				<a href="${pageContext.request.contextPath}/login/login.jsp">Login Page</a>
			</p>
		</form>
	</fieldset>
	</div>
</body>
</html>