<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>BOOK FORM</h1>
	<form:form method="post" modelAttribute="book" action="updatebook">
		<form:hidden path="bId" />
		<div>
			<label>ENTER BOOK NAME</label>
			<form:input path="bName" />
		</div>
		<div>
			<label>ENTER Book price</label>
			<form:input path="bPrice" />
		</div>
		<div>
			<label>ENter book qty</label>
			<form:input path="bQty" />
		</div>
		<div>
			<input type="submit" value="submit">
		</div>
	</form:form>
</body>
</html>