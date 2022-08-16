<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- top의 html태그를 삭제해야한다. : 들어갈 페이지에 html이 이미 존재하므로 -->
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html> -->	
<%
	String mesg = (String) request.getAttribute("xxx");
	System.out.print(mesg);
%>		

<h1>
	top.jsp h1태그입니다.<br>
	안녕하세요? mesg=== <%= mesg %>	
	<%-- num===<%=num %> --%>
</h1>		
