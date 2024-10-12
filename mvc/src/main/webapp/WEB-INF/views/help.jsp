<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
		//receiving the data from controller by ModelAndView
		String name = (String)request.getAttribute("name");
	%>
	<%= name %>
	<!-- using el -->
	<br>
	${name } 
	<hr>
	${list }
</body>
</html>