<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>	
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create User</title>
</head>
<body>
	<form:form action="user/get" method="POST" modelAttribute="userModel">
		<table>
			<tr>
				<td>
					<form:label path="userId">Enter ID</form:label> 
					<form:input	path="userId" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="SUBMIT"/>
				</td>
			</tr>
		</table>


		<form:button></form:button>
	</form:form>
</body>
</html>