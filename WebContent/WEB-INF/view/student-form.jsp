<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<h2>Student Form</h2>

<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	<br><br>
	Last Name: <form:input path="lastName" />
	<br><br>
	Country: <form:select path="country">
		<form:option value="Brazil" label="Brazil"/>
		<form:option value="India" label="India"/>
		<form:option value="USA" label="USA"/>
		<form:option value="UK" label="UK"/>
	</form:select>
	<br><br>	
	<input type="submit" value="submit" />
	
</form:form>

</body>
</html>