<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<!DOCTYPE html >
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Student management</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Student List</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><a href="${pageContext.request.contextPath }/new-student" type="button">New...</a>
						<button type="submit">Delete</button></td>
				</tr>
			</tbody>
		</table>

		<table class="table">
			<thead>
				<tr>
					<th scope="col">Edit</th>
					<th scope="col">Selected</th>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Birthday</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td><a
							href="${pageContext.request.contextPath}/${student.studentId}/edit">Edit</a></td>
						<td><input type="checkbox" /></td>
						<td><a
							href="${pageContext.request.contextPath}/students?id=${student.studentId}">${student.studentId }</a></td>
						<td>${student.name }</td>
						<td>${student.birthday }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>



	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>
</body>
</html>