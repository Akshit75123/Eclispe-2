<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url/home</h1>
	<%
		//receiving data from controller
		String name = (String)request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("num");
		List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>
		Name is <%= name %>
		Id is <%= id %>
		
		<%
			for (String s : friends){
				%> <% 
				out.println(s);
			}
		%>
		
		<!-- video 8 -jstl  -->
		<c:forEach var="item" items="${list}"> 
			<h1>${item}</h1>
		</c:forEach>
		
	</h1>
</body>
</html>