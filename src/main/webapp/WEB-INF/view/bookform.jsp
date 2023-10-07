<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h1>BOOK FORM</h1>
	<form:form method="post" modelAttribute="book" action="addbook">
		<div>
			<label>ENTER BOOK NAME</label>
			<form:input path="bName" />
			<form:errors path="bName" cssClass="error" ></form:errors>
		</div>
		<div>
			<label>ENTER Book price</label>
			<form:input path="bPrice" />
			<form:errors path="bPrice" cssClass="error"></form:errors>
		</div>
		<div>
			<label>ENter book qty</label>
			<form:input path="bQty" />
			<form:errors path="bQty" cssClass="error"></form:errors>
		</div>
		<div>
			<input type="submit" value="submit">
		</div>
	</form:form>
</body>
</html>