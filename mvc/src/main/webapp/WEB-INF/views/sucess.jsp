<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<!-- ModelAttribute -->
	<h2>${Header }</h2>
	<h2>${d }</h2>
	<h2>Welcome ${user.email }</h2>
	<h2>Your email is ${user.uname }</h2>
	<h3>Your password is ${user.pass }</h3>
</body>
</html>