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
	안녕하세요. <%=session.getAttribute("id")%>님~<br>
	<a href="myPageServlet">회원정보</a>
</body>
</html>