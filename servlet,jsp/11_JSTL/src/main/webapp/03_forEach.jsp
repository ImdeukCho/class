<%@page import="com.dto.Person"%>
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
<!--
	TestServlet3에서 실행
-->
	<h1>jstl core태그의 사용 -- forEach</h1>
	<h1>forEach3: c: forTokens</h1>
	<c:forTokens var="x" items="${yyy}" delims="/"><!-- c:forTokens : 구분자 섞여있는 데이터를 나눠서 for문 돌려 각 값을 출력  -->
		${x}<br>  <!-- ﻿ var="변수명" items="출력할값" delims="구분자" -->
	</c:forTokens>
	
	<%
		// jsp로 작성시 3단계 ==> jstl1단계로 완성
		//1. req.get ==> 형변환 String
		//2. StringToken String[] 구하기
		//3. for문 작성
	%>
	<hr>
	
	${xxx}	<!-- [Person [username=이순신, age=10], Person [username=홍길동, age=20]] -->
	<!-- 값을 꺼내기위해 forEach문 사용 -->
	<h1>forEach3 : range</h1>
	<c:forEach var="x" begin="0" end="5">	<!-- ﻿var="변수명" begin="시작idx" end="끝idx" step="증가할idx" -->
		>>>>${x}&nbsp;&nbsp;	<!-- >>>>0   >>>>1   >>>>2   >>>>3   >>>>4   >>>>5 -->
	</c:forEach>		
	<hr>
	
	<c:forEach var="x" begin="0" end="5" step="2">
		>>>>${x}&nbsp;&nbsp;	<!-- step 2개씩 증가(짝수만) : >>>>0   >>>>2   >>>>4 -->
	</c:forEach>
	<hr>
	
	<c:forEach var="x" begin="1" end="5">
		hello${x}	<!-- hello1 hello2 hello3 hello4 hello5 -->
	</c:forEach>
	<hr>
	
	
	<h1> forEach2 : Status</h1>
	<!-- [Person [username=이순신, age=10], Person [username=홍길동, age=20]] -->
	
	<c:forEach var="p" items="${xxx}" varStatus="status">
		index : ${status.index}<br>	<!-- 현제idx -->
		count : ${status.count}<br> <!-- for문 돌아가는 횟수 -->
		current : ${status.current}<br> <!-- 현재idx의 값 -->
		first : ${status.first}<br> <!-- 처음이 맞으면 true -->
		last : ${status.last}<br> <!-- 마지막이 맞으면 false -->
		
		${p.username} : ${p.age}<br> <!-- 현재idx의 username, age -->
		current : ${status.current.username}<br> <!-- 현재idx의 username -->
		<hr>
	</c:forEach>
	
	<!-- 3명의 이름,나이출력 forEach사용 -->
	<c:forEach var="p" items="${xxx}">
		${p.username} : ${p.age}<br>
	</c:forEach>
	
</body>
</html>