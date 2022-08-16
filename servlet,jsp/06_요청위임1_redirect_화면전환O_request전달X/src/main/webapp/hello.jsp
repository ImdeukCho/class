<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HellpJsp</title>
</head>
<body>
﻿
<!-- 서블릿 :
1. 데이터파싱
2. 데이터처리
3. html코드작성

jsp :
html코드 중간에 jsp태그 입력
- 출력되는 중간중간에 jsp코드가 들어간다. -->

﻿
	hello.jsp 파일입니다.<br>
	<!-- 1. 자바에서 데이터 가져오기 -->
	<%	// 자바 코드작업 태그 , ;(세미클론 사용)
	String mesg = (String) request.getAttribute("request");		// request 객체
	String mesg2 = (String) session.getAttribute("session");	// Session 객체 , 
					// 주의) 자바 : request.getSession(); 
					// 		jsp : session.getAttribute("session") : session소문자로 작성
	String mesg3 = (String) application.getAttribute("application");	// ServletContext 객체
	// System.out.println(mesg+"\t"+mesg2+"\t"+mesg3);			// 버전 문제. %태그에서는 sysout 사용하지말자.
	%>
	
	<!-- 1. 출력방법1 : 자바코드에서 저장한 변수로 출력 -->
	<!-- jsp에서는 ;(세미클론 미사용!!!)  -->
	request: <%= mesg%><br>	<!-- %=(퍼센트는) 코드 : 변수의 데이터를 출력해준다 -->
	session: <%= mesg2%><br>
	application: <%= mesg3%><br>
	<hr>
	
	<!-- 2. 출력방법2 : 자바코드없이 바로 데이터 가져와서 출력 -->
	request: <%= request.getAttribute("request") %><br>
	session: <%= session.getAttribute("session") %><br>
	application: <%= application.getAttribute("application") %><br>
	<hr border="2">
	
	<!-- 3. 출력방법3 -->
	1>> <%= mesg %>
	2>> <%= mesg2 %>
	3>> <%= mesg %>
	
</body>
</html>