<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>연산기능</h1>
	${"홍길동"}<br> <!-- EL 태그, 출력 전용, 외부 라이브러리 필요 없음 -->
	<%="홍길동" %><br>
	<hr>
	
	<% int x=10; %>
	표준 jsp 태그 x : <%= x %><br>
	el태그 : ${x} <!-- bind 객체(request,session)에 접근만 가능하며 일반 변수 사용이 안됨 : 주의 !!! , 에러는 안나지면 출력이 안됨-->
	<%-- <%= ${"홍길동"} %> --%>	<!-- el태그 : html코드, javascript코드 사이에서만 사용가능 , jsp 태그 사이 사용 안됨 -->
	<hr>
	
	산술연산자
	${10+4}<br>
	${10-4}<br>
	${10/4}<br>
	${10*4}<br>
	${10%4}<br>
	<hr>
	
	논리연산자(true, false)
	${10>=4}<br>
	${10<=4}<br>
	${10>4}<br>
	${10!=4}<br>
	
	${(10!=4)&& 4==4}<br>
	<hr>
	
	${user}		<!-- 저장된 값이 없어서 출력안됨 -->
	${empty user}	<!-- true : user==null -->
	${not empty user}	<!-- false : user!=null -->
</body>
</html>