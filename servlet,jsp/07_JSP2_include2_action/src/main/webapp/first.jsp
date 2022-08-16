<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first.jsp</title>

<!-- first에서 지정한 h1태그 스타일이 top까지 적용된다. -->
<style type="text/css">		
	h1{color: red;}
</style>

</head>
<body>

<%
	request.setAttribute("xxx", "홍길동");	// 내장객체 : request, session, application, out
	// response	5개 외우기.
%>
	first.jsp<br>
	아래화면은 top.jsp를 jsp:include 시킨 내용입니다. <br>
	<jsp:include page="include/top.jsp" flush="true"></jsp:include>	<!-- end tag 주의 -->
									<!-- flush="false" : top.jsp의 변경 내용을 바로 반영하지않는다.-->
	<br>
	다시 first.jsp 내용입니다.
	<h1>first.jsp h1태그입니다.</h1>
	
</body>
</html>