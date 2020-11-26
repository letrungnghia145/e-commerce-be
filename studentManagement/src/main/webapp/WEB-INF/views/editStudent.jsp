<%@page import="studentManagement.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit student</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3>Edit Student</h3>
		<form method="post"
			action="${pageContext.request.contextPath}/${student.studentId}/edit">
			<table>
				<tr>
					<td>Id:</td>
					<td>${student.studentId }</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" value="${student.name }" /></td>
				</tr>
				<tr>
					<td>Male:</td>
					<td><input type="checkbox" name="male"
						<c:if test="${student.male eq true }">checked</c:if>></td>
				</tr>
				<tr>
					<td>Birthday:</td>
					<td><input type="text" name="birthday"
						value="${student.birthday }" /></td>
				</tr>
				<tr>
					<td>Place of birth:</td>
					<td><input type="text" name="placeOfBirth"
						value="${student.placeOfBirth }" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" name="address"
						value="${student.address }" /></td>
				</tr>
				<tr>
					<td>Department:</td>
					<td><select>
							<option>depName1</option>
							<option>depName2</option>
							<option>depName3</option>
							<option>depName4</option>
					</select></td>
				</tr>

				<tr>
					<td colspan="2"><button class="btn btn-light" type="submit">Update</button>
						<a class="btn btn-light" href="/config-spring-mvc/student"
						type="button">Cancel</a></td>
				</tr>
			</table>
		</form>
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