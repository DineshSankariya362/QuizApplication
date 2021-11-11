<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="savequiz" modelAttribute="quiz">
		
		<form:hidden path="id" />
		<form:label path="name"> Quiz Name :</form:label>
		<form:input path="name"/>
		
		<input type="submit" value="Add Quiz">
		
	</form:form>
</body>
</html>