<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript" src="./resources/js/login.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form:form id="loginForm" modelAttribute="login">
		<table align="center">
			<tr>
				<td><form:label path="userName">Username: </form:label></td>
				<td><form:input path="userName" name="username" id="username" />
				</td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">Login</form:button>
				</td>
			</tr>
		</table>
	</form:form>
	<table align="center">
		<tr>
			<td id="info" style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>
</body>
</html>