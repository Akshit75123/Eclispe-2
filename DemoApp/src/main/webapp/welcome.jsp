<!-- login example -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<!-- check if login or not -->
	
	<%
		
		/* back button in secured page */
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		if (session.getAttribute("username") == null)
			response.sendRedirect("login.jsp");
	%>
	Welcome ${username} <br>
	<a href="videos.jsp">Videos here</a>
	
</body>
</html>