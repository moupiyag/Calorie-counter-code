<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty param.login_error }">
		<font color="#ff0000">Login unsuccessful.<br /> <c:out
				value="${SPRING_SECURITY_LAST_EXCEPTION.message }" />
		</font>
	</c:if>
	
	<c:if test="${not empty param.logout }">
	<font color="#ff0000">Logout successful</font>
	</c:if>
	
	<table id="mainTable" style="width: 733px; height: 180px">
		<tr>
			<td><form:form method="POST" action="j_spring_security_check" commandName="user" >
					<table>
						<tr>
							<td><form:label path="username">User Id :</form:label></td>
							<td><form:input path="username" /></td>
						</tr>
						<tr>
							<td><form:label path="password">Password :</form:label></td>
							<td><form:password path="password" /></td>
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