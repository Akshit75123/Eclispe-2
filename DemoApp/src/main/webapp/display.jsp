<!-- JSTL -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- standard.jar and jstl.jar file in WEB-INF.lib folder -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>
	<h1>Hello AKshit</h1>
	 <%-- <%
		String name = request.getAttribute("label").toString();
		out.println(name);
	%>  --%>
	
	<%-- ${label}<br> --%>
	<!-- Hello <br> -->
	<%-- <c:out value="Akshit" /> --%>
	<%-- <c:out value="${label}" /> --%>
	<!-- Panwar -->
	<%-- <c:import url="www.google.com"></c:import> --%>
	
	
	<c:forEach items="${students}" var="s">
		${s.name} <br/>
		
	</c:forEach>
</body>
</html>