<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>function 태그</h1>
	<c:set var="s1" value="   Ncs교육과정"/> <!-- s1를 키로 Ncs육과정 바인딩 , end tag주의 -->
	<!-- 자체실행 taglib funtion추가됨 -->
		문자열길이 : ${fn: length(s1) }<br>
		대문자 : ${fn: toUpperCase(s1) }<br>
		소문자 : ${fn: toLowerCase(s1) }<br>
		부분열 : ${fn: substring(s1, 0, 2) }<br> <!-- Nc 출력 , end-1 -->
		공백제거 : ${fn: trim(s1) }<br>	<!-- 글안의 공백은 제거안됨 -->
		replace : ${fn: replace(s1, "N", "XXXx") }<br>
		contains : ${fn: contains(s1, "NcS") }<br>	<!-- contains : 대소문자 완벽히 일치해야됨 -->
		contains2 : ${fn: contains(s1, "ncs") }<br>
		contains3 : ${fn: containsIgnoreCase(s1, "ncs") }<br> <!-- containsIgnoreCase : 대소문자 자동변환해서 일치여부판정 -->
	
	<hr>
	<c:set var="s2" value="AAA/BBB/CCC"></c:set> <!-- end tag주의 -->
		${fn:split(s2,"/")[0] }<br>
		${fn:split(s2,"/")[1] }<br>
		${fn:split(s2,"/")[2] }<br>
</body>
</html>