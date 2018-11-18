<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<body>

	<table border="1">
		<tr>
			<th>index</th>
			<th>Business Category</th>
		</tr>
<c:choose>
<c:when test="${!empty categoryList}">
	<c:forEach var="item" items="${categoryList}" >
		<tr>
			<td>${item.bcpk}</td>
			<td>${item.category}</td>
		</tr>
	</c:forEach>
</c:when>
<c:otherwise>
		<tr>
			<td colspan="5">No category data</td>
		</tr>
</c:otherwise>
</c:choose>
	</table>		

</body>
</html>