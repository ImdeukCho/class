<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	///////////// for test /////////////////
	<hr>
	<%	// list에 저장 Arrays.asList 사용
		List<String> list = Arrays.asList("홍길동","이순신","유관순");
		for(String s : list) {
	%>
	이름 : <%= s %> <br>		<!-- document.write와 비슷함 -->
	<% } %>
	//////////////////////////////
	<hr>
	
	<% 
	int a=10; 
	if(a>=10) {
	%>
		크다
	<% } else { %>
		작다
	<% } %>
	<%
	int sum = 0;
	for(int i=0; i<=10; i++){
		sum += i;
		out.print(sum+"<br>");
	}
	out.print("<br>"+sum);	// 브라우저에 출력
	%>
</body>
</html>