<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test page</title>
</head>
<body background="green" bgcolor="red">
	<h1>Spring MVC Test</h1>
	<h2>${msg1}</h2>
	<h2>${msg2}</h2>
<%-- 	<c:forEach items=${userList} var="element"> --%>
<%-- 		<div>First name : <c:out value="${element.firstName }" /></div> --%>
<%-- 		<div>Last name : <c:out value="${element.lastName }" /></div> --%>
<%-- 	</c:forEach> --%>

	<c:out value="${msg1}" />
	<c:out value="${msg2}" />
</body>
</html>