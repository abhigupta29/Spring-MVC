<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
</head>
<body>
	<p>The customer is confirmed: ${customer.firstName} ${customer.lastName}</p>
	<p>Free Passes: ${customer.freePasses}</p>
	<p>Postal Code: ${customer.postalCode}</p>
</body>
</html>