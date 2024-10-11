<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Functions</title>
</head>
<body>
	<!-- lenght method -->
	<c:set value= "akshit panwar will become a java developer in amazon" var = "str" />
	String : ${str} <br/>
	Lenght : ${fn:length(str)} <br>
	
	<!-- split method -->
	<%-- <c:forEach items = "${fn:split(str,' ')}" var="s">
		<br>
		${s}
	</c:forEach> --%>
	
	<!-- indexOf -->
	index = ${fn:indexOf(str,"is}
	
</body>
</html>