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
		<form:options items="${countryList}"/>
	</form:select>
	<br><br>	
	
	Favorite Programming Language:<br>
		<form:radiobuttons path="programmingLanguage" items="${student.programmingLanguageList}" />
	<br><br>
	
	Operating Systems:<br>
		Windows<form:checkbox path="operatingSystems" value="Windows"/>
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		Mac<form:checkbox path="operatingSystems" value="Mac"/>
	<br><br>
	
	<input type="submit" value="submit" />
	
</form:form>

</body>
</html>