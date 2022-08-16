<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp 나혼자 연습</title>
</head>
<body>
	홍길동
	<% 
	String name = "이순신"; 
	System.out.print(name);
	int num = 5;
	%>
	<%= name %><br>
	<%= num %>
	<hr>
	반복문 연습
	<br>
	<% for(int i=0; i<=num; i++) {%>
		반복 <%= i %>&nbsp;&nbsp;번 <br>
	<% } %>
	<% out.print("출력문 연습"); %>
	
	
	
</body>
</html>