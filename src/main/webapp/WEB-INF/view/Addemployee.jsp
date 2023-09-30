<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>ADD EMPLOYEE</h1>
	
	<form:form modelAttribute="employeeBean">
		<form:select path="dId">
		<c:forEach var="dlist" items="${departmentList}">
			<option value="${dlist.dId }">${dlist.dName }</option>
		</c:forEach>
		</form:select>
	</form:form>
	
</body>
</html>