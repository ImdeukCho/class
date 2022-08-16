<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>		<!-- jsp 태그 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp 기본실습</title>
</head>
<body>
	
	<!-- jsp 태그 -->
	<%
	// doget, dopost 부분 함수 구현
	String name = "홍길동";
	System.out.print(name);
	%>
	
	<!-- html 태그 -->
	<h1>Jsp 기본실습</h1>
	hello !!        asdasdasdas        <br>
	안녕하세요	<%= name %>		<!-- %=ㅂ태그에서는 ;(세미클론) 미사용 ,  -->
							<!-- %= 변수, 리턴값이 있는 메서드 일때 사용 -->
	<!-- jsp 태그가 먼저 실행 되고 실행 결과가 html에 추가되어 사용자는 html만 보게 됨 -->
	
	<hr>
	<% int num = 10; %>	<!-- %태그에서는 ;세미클론 사용 -->
	if문의 시작 <br>
	<% if(num == 10){ %>
		같다......<%= num %>
	<% } else { %>
		다르다.....<%= num %>
	<% } %>
	
	<hr>
	<!-- for 반복문 -->
	<% for(int i=0; i<=num; i++) { %>
		for 반복 <%= i %> &nbsp;&nbsp;&nbsp; <% out.print("홍길동"); 	// out내장객체사용하여 출력%><br>
	<% } %>
</body>
</html>