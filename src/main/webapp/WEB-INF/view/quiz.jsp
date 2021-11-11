<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to quiz dashboard!!</h1>
	<a href="quizform">Add Quiz</a>
	<br>
	<br>
	<table border="true">

		<thead>
			<tr>
				<th>Sr.No</th>
				<th>Quiz</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="q" items="${quiz}">
				<c:url var="updatequiz" value="uquiz">
					<c:param name="quizid" value="${q.id}"></c:param>
				</c:url>

				<c:url var="deletequiz" value="delquiz">
					<c:param name="quizid" value="${q.id}"></c:param>
				</c:url>

				<c:url var="addques" value="addques">
					<c:param name="quizid" value="${q.id}"></c:param>
				</c:url>

				<c:url var="ques" value="question">
					<c:param name="quizid" value="${q.id}"></c:param>
				</c:url>

				<tr>
					<td>${q.id}</td>
					<td>${q.name}</td>
					<td><a href="${updatequiz}">Update</a> <a href="${deletequiz}">Delete</a>
						<a href="${addques}">Add Question</a> <a href="${ques}">Go</a></td>
				</tr>


			</c:forEach>
		</tbody>

	</table>
	<a href="/QuizApp">Go Home</a>
</body>
</html>