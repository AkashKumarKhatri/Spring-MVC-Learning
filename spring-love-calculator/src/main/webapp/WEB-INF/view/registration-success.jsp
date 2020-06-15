<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your Registration is successful</h1>
	<h2>The details entered by you are: </h2>
	User: ${userRegistrationDTO.name} <br />
	User Name: ${userRegistrationDTO.userName} <br />
	Password: ${userRegistrationDTO.password} <br />
	Country: ${userRegistrationDTO.countryName} <br />
	Hobbies: 
	<c:forEach var="temp" items="${userRegistrationDTO.hobbies}">
		${temp}
	</c:forEach>  
	<br />
	Gender: ${userRegistrationDTO.gender} <br />
	Age: ${userRegistrationDTO.age} <br />
	Email: ${userRegistrationDTO.communicationDTO.email} <br />
	Phone: ${userRegistrationDTO.communicationDTO.phone} <br />
</body>
</html>