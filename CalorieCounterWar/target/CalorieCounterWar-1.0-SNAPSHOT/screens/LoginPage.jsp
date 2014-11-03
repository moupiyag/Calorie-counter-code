<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table id="mainTable" style="width: 733px; height: 180px">
		<tr>
			<td><form:form method="POST" action="login.do" commandName="user">
					<table>
						<tr>
							<td><form:label path="firstName">User Id :</form:label></td>
							<td><form:input path="firstName" /></td>
						</tr>
						<tr>
							<td><form:label path="lastName">Password :</form:label></td>
							<td><form:password path="lastName" /></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="Login" /></td>
						</tr>
					</table>
				</form:form></td>
			<td>
				<table>
					<tr>
						<td><a href="">Login with Google</a></td>
					</tr>
					<tr>
						<td><a href="">Login with Facebook</a></td>
					</tr>
					<tr>
						<td><a href="">Register with Calorie counter</a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>

</body>
</html>