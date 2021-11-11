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
	<h3>${question.question}</h3>
	<c:forEach var="ans" items="${ans}">
		<input type="radio" name="${question.id}_ans" value="${ans.content}">
		<label for="${question.id}_ans">${ans.content}</label>
		<br>
	</c:forEach>
</body>
</html>