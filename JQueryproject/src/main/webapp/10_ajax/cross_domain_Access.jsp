<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 교사용 이클립스에 작성한거 가져옴
	// CROS문제 해결 - cross-domain 허락
	// 다른 도메인에 응답을 전송할수 있도록함.
	response.setHeader("Access-Control-Allow-Origin", "*");
	
	String name = "홍길동";
	int age = 20;
	System.out.println("요청옴");
%>
[
	{"username":"<%= name %>","age":"<%= age %>"},
	{"username":"유관순","age":"40"},
	{"username":"강감찬","age":"55"}	
]