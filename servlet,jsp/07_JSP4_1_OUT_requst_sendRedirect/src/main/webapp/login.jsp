<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 위에부터 출력되고 sendRedirect로 넘어갈것인가?  NO!! login.jsp페이지 연결되지않고 바로 sendRedirect 시킨다 -->
<% 
	request.setCharacterEncoding("utf-8"); 		// post 한글 처리
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	out.print(userid+"<br>");
	out.print(passwd+"<br>");
%>
	사용자id: <%= userid %> <br>
	패스워드: <%= passwd  %>
	
<% response.sendRedirect("reponseRedirect.jsp"); %>
</body>
</html>