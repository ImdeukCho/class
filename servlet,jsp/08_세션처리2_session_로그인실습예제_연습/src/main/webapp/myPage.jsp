<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보</h1>
	회원아이디:<%= session.getAttribute("id") %><br>
	회원비번:<%= session.getAttribute("pw") %><br>
	<a href="logoutServlet">로그아웃</a>
</body>
</html>