<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>This is help page</h1>
	
	<!-- video - 7 -->
	<%-- <%
	String name = (String) request.getAttribute("name");
	Integer rollno = (Integer) request.getAttribute("rollno");
	%>

	<h1>
		Name is
		<%=name%>
	</h1>
	<h1>
		Id is
		<%=rollno%>
	</h1> --%>
	
	<!-- video - 8 -->
	<h1>
		Name is
		${ name } <!-- JSP Expression Language -->
	</h1>
	<h1>
		Id is
		${ rollno }
	</h1>
	<hr>
	<h2>Marks is ${ marks }</h2>
</body>
</html>