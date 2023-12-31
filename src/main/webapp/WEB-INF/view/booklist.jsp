<%@page import="com.bean.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		EmployeeBean employeeBean = (EmployeeBean) session.getAttribute("logemp");
	%>
	<%=employeeBean.geteName()%>
	<div>

		<table>
			<thead>
				<tr>
					<td>BOOK ID</td>
					<td>BOOK NAME</td>
					<td>BOOK PRICE</td>
					<td>BOOK QTY</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="books" items="${books }">
					<c:url var="updateLink" value="/updateForm">
						<c:param name="bId" value="${books.bId}"></c:param>
					</c:url>

					<tr>
						<td>${books.bId }</td>
						<td>${books.bName }</td>
						<td>${books.bPrice }</td>
						<td>${books.bQty }</td>
						<td><a href="${updateLink }">UPDATE</a></td>
					</tr>
				</c:forEach>

			</tbody>

		</table>
	</div>

</body>
</html>