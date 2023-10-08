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
	<form:form action="loginEmployee" modelAttribute="employeeBean" method="post">
		<div>
			<form:input path="eEmail" />
		</div>
		<div>
			<input type="submit" value="LOGIN">
		</div>
	</form:form>
</body>
</html>