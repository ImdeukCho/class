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
 	request.setCharacterEncoding("utf-8");


	out.print(request.getAttribute("id")+"<br>");
	out.print(request.getAttribute("AAA")+"<br>");
	out.print(session.getAttribute("BBB")+"<br>");	// ok
	out.print(application.getAttribute("CCC")+"<br>");	// ok
	out.print(application.getInitParameter("xxx")+"<br>");	
			// application.getInitParameter("Key값") : web.xml context-parm 설정한 value값을 가져옴
	out.print("홍길동<br>");
%>
	
</body>
</html>