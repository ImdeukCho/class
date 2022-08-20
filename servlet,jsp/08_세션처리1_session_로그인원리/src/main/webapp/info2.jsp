<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = (String)session.getAttribute("username");
	String passwd = (String) session.getAttribute("passwd");
	System.out.println(username+"\t"+passwd);
	%>
</body>
<h1>세션정보</h1>
이름 : <%= username %><br>
비번 : <%= passwd %><br>
로그인 되었습니다.
</html>