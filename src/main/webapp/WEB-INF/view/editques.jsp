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

	<form:form action="editsaveques" method="POST" modelAttribute="question">
	
		<form:hidden path="id"/>
		<form:label path="question">Question</form:label>
		<form:input path="question"/>
		<form:hidden path="qid"/>
		
		
		<input type="submit" value="Add Question">
	</form:form>
</body>
</html>