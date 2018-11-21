<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Password Recovered!!</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="LoginStyle.css" type="text/css" rel="stylesheet">
</head>
<body>
	<h3>
		Welcome to <i>Canadian Rookie's</i> web
	</h3>

	<fieldset>
		<p>If you are a member, please give user Name.
		
			<table>
				<tr>
		
					<td>Your User Name</td>
					<td>${sessionScope.userName}</td>
				</tr>
				<tr>
		
					<td>Your Password</td>
					<td>${sessionScope.password}</td>
				</tr>
				
			</table>
			
			<p>
				<a href="${pageContext.request.contextPath}/login/login.jsp">Login Page</a>
			</p>

	</fieldset>
	
</body>
</html>