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
	<h1>jstl core태그의 사용 -- if</h1>
	<c:if test="${xxx=='홍길동'}">같음1</c:if><br>	<!-- 다중 if문과 같음 -->
	<c:choose>	
		<c:when test="${xxx == '홍길동'}">홍길동임</c:when>
		<c:when test="${xxx == '이순신'}">이순신임</c:when>
		<c:when test="${xxx == '유관순'}">유관순임</c:when>
		<c:otherwise>자료가 없음</c:otherwise>
	</c:choose>

</body>
</html>