<!-- login example -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>
	<%
	/* back button in secured page */
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if (session.getAttribute("username") == null)
		response.sendRedirect("login.jsp");
	%>
	This is video page
	<form action="logout">
		<input type="submit" value="logout">
	</form>
</body>
</html>