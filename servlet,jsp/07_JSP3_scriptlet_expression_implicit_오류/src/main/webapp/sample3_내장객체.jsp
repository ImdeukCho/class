<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	// 내장객체 request, session, application 은 import와 new 없이 사용이 간으함
	String data = (String) request.getParameter("aa");		// 폼데이터 파싱시 사용
	request.setAttribute("AAA", "aaa");// 따로 내용 저장 전달시 사용	
	session.setAttribute("BBB", "bbb");
	application.setAttribute("CCC", "ccc");
	out.print("홍길동");	// out을 사용하여 바로 출력 가능 // document.write	
	out.print(data);
%>
</body>
</html>