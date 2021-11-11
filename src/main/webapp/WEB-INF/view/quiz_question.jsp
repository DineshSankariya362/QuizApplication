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
	<table border="true">

		<thead>
			<tr>
				<th>Sr.No</th>
				<th>Question</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="q" items="${question}">
				<c:url var="updateques" value="/home/uques">
					<c:param name="quesid" value="${q.id}"></c:param>
				</c:url>

				<c:url var="deleteques" value="/home/delques">
					<c:param name="quesid" value="${q.id}"></c:param>
				</c:url>

				<c:url var="addanswer" value="/answer/addans">
					<c:param name="quesid" value="${q.id}"></c:param>
				</c:url>

				<c:url var="viewanswer" value="/answer/viewans">
					<c:param name="quesid" value="${q.id}"></c:param>
				</c:url>

				<tr>
					<td>${q.id}</td>
					<td>${q.question}</td>
					<td><a href="${updateques}">Update</a> <a href="${deleteques}">Delete</a>
						<a href="${addanswer}">Add Answer</a> <a href="${viewanswer}">View
							Answers</a>
					</td>
				</tr>


			</c:forEach>
		</tbody>

	</table>
	
	<a href="quiz">Go Back</a>
</body>
</html>