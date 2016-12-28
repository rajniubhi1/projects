<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>APPLY Leave</title>
</head>
<body>
	Hey Welcome here you can apply ur leave
	<form:form method="POST" action="apply" modelAttribute="userLeaveModel">
		<table>
			<tr>
				<td><form:label path="user.userId">User</form:label></td> 
				<td><form:input path="user.userId" /></td>
			</tr>
				
			<form:select path="leave" items="${myList}"/>
			
			<%-- <tr>
				<td><form:label path="startDate">startDate</form:label></td>
				<td><form:input path="startDate" /></td>
			</tr>
			<tr>
				<td><form:label path="endDate">endDate</form:label></td>
				<td><form:input path="endDate" /></td>
			</tr> --%>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>