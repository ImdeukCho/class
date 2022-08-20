<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 자체실행 target.jsp 만들 것 -->
	<h1>url : 상대경로</h1> <!-- http://localhost:8081/11_JSTL/target.jsp -->
	<a href="target.jsp">A</a><br>
	<h1>url : 절대경로</h1> <!-- http://localhost:8081/target.jsp -->
	<a href="/target.jsp">C</a><br>	<!-- / 절대경로 찾지못함 -->
	<hr>
	<a href="<c:url value='target.jsp'/>">v1</a><br>  <!-- http://localhost:8081/11_JSTL/target.jsp -->
	<a href="<c:url value='/target.jsp'/>">v2</a><br> <!-- http://localhost:8081/11_JSTL/target.jsp --> <!-- context이름 포함됨 --> 
</body>
</html>