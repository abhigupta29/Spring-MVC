<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>	

<p>The student is confirmed: ${student.firstName} ${student.lastName}</p>

<p>Country: ${student.country}</p>

<p>Programming Language: ${student.programmingLanguage}</p>

<p>Opertaing System:</p>
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
		<li>${temp}</li>
	</c:forEach>
</ul>
	
</body>
</html>