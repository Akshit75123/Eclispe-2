<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL JSTL</title>
</head>
<body>
	<sql:setDataSource var = "db" 
		driver = "com.mysql.cj.jdbc.Driver" url = "jdbc:mysql://localhost:3307/mario" user = "root" password = "akshit"  />
	<sql:query var="rs" dataSource="${db}">select * from form</sql:query>
	
	<c:forEach items="${rs.rows}" var = "row">
		<br> ${row} <br>
	</c:forEach>
	
</body>
</html>