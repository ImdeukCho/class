<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second.jsp</title>
</head>
<body>
	<%
		request.setAttribute("xxx", "second에서 전송된 홍길동");
	%>
	
	second.jsp
	아래화면은 top.jsp를 jsp:include 시킨 내용입니다.
	<jsp:include page="include/top.jsp" flush="true"></jsp:include>
	다시 second.jsp 내용입니다.
</body>
</html>