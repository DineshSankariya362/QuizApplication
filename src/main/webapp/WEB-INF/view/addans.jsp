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

	<form:form action="/QuizApp/answer/save" method="POST" modelAttribute="answer">
	
		<form:hidden path="id"/>
		<form:label path="content">Answer</form:label>
		<form:input path="content" />
		<form:hidden path="quesid" />
		<form:select path="isCorrect">
			<form:option value="true" label="Yes"></form:option>
			<form:option value="false" label="No"></form:option>
		</form:select>
	<input type="submit" value="Add Answer">
	</form:form>
</body>
</html>