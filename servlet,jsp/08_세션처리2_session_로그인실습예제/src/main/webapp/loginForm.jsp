<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 폼</h1>
	<form action="loginInfoServlet" method="post">
	ID : <input type="text" name="userid"><br />
	PW : <input type="test" name="passwd"><br />
	<input type="submit" value="Login">
	<!-- mvc 
	  ( model 
		view - jsp(화면구현만) 
		controller - servlet(데이터파싱, db접근, 데이터 저장, => 뷰페이지 전달) )
		
		사용자 -> servlet요청, jsp요청
			 -> mvc패턴 사용자의 모든 요청은 controller에 요청(servlet:db접근, 데이터저장)  :데이터저장방법(request or session)
			 => 보여질 페이지 결정(redirect, forward) => jsp 화면출력		

-->
</body>
</html>

