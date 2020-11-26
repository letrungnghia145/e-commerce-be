<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student detail</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3>Student Detail</h3>
		<div>Id: ${student.studentId}</div>
		<div>Name: ${student.name}</div>
		<div>Gender: ${student.male}</div>
		<div>Date of birth: ${student.birthday}</div>
		<div>Place of birth: ${student.placeOfBirth}</div>
		<div>Address: ${student.address}</div>
		<div>Department: ${student.depName}</div>
		<div>
			<a class="btn btn-light"href="${pageContext.request.contextPath}/home" type="button">Student Listudent</a>
			<a class="btn btn-light"href="${pageContext.request.contextPath}/${student.studentId}/edit" type="button">Edit...</a>
		</div>
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