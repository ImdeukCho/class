<%@page import="com.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>2. bind4</h1>
	<% 
		String xxx = (String)request.getAttribute("xxx");
		// person 객체에서 꺼내기 
		Person p = (Person)request.getAttribute("person");
	%>
	일반 : <%=xxx %> <br>
	일반 : <%=p.getUsername() %> <br>
	일반 : <%=p.getAge() %> <br>
	<hr>
	<hr>
	
	
	EL : ${person}<br> <!-- key값이용 -->
	EL : ${xxx}<br>
	EL : person.name = ${requestScope.person.username}<br> <!-- 내장객체의 key값과 같이 사용하면 편리함 -->
	<!-- person키값이용 꺼내오면 제일 편함 -->
	EL : person.name = ${person.username}<br>	<!-- key로 바로 접근 가능 -->
	EL : person.age = ${person.age}<br>
	
	
	<input type="text" value="<%= p.getUsername() %>"> <!-- 활용 -->
	<input type="text" value="${person.username}"> <!-- 활용 -->
	
</body>
</html>