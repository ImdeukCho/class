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
	out.print(request.getParameter("id")+"<br>");
	out.print(request.getAttribute("CCC")+"<br>");
	out.print(session.getAttribute("AAA")+"<br>");  //ok
	out.print(application.getAttribute("BBB")+"<br>");//ok
	out.print(application.getInitParameter("xxx")+"<br>");//web.xml context-param
	out.print("홍길동<br>");
	
%>
</body>
</html>