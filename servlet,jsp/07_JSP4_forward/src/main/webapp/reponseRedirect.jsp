<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

redirect 되어서 옴 ===========================
<% 
	request.setCharacterEncoding("utf-8"); 		
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String test = (String) request.getAttribute("test");
%>
	<hr>
	사용자id: <%= userid %> <br>
	패스워드: <%= passwd  %> <br>
	test: <%= test %> <br>
<!-- login.jsp 페이지 열결안되고 바로 sendRedirect 시킴. -->
<!-- request 새롭게 요청되어서 null 출력됨 -->
</body>
</html>