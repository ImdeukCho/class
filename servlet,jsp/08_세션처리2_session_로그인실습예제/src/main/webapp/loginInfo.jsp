<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
<%
	String userid = (String)session.getAttribute("userid");
%>
안녕하세요 <%= userid %> 님<br>
<a href="myPage.jsp">회원정보보기</a>
</body>
</html>