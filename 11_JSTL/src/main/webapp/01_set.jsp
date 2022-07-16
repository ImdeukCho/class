<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 0. JSTL 사용시 LIB폴더에 .JAR 두가지 포함되어 있어야 함 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:out value="${'홍길동'}"></c:out><!-- out.print 와 같은 기능 -->
<c:if test="<%=false %>">aaa1</c:if>
<c:if test="${10>4}">aaa2</c:if>
<hr>

<h1>jstl core태그의 사용</h1>
xxx: ${xxx}<br>
<c:if test="${not empty xxx}">xxx가 있음</c:if>	<!-- % if % -->

<c:set var="aaa" value="${xxx}" scope="application"></c:set>
<!-- xxx=홍길동 application.serAttribute("aaa","홍길동") -->
<!-- EL태그사용 xxx를 bind하여 application에 aaa이름으로 set함 -->
바인딩 된 이름 : ${aaa}<br>	<!-- application.getAttribute("aaa"); -->
request의 이름 : <c:out value="${xxx}"></c:out><br>	<!-- ${xxx} -->
application의 이름 : <c:out value="${aaa}"></c:out>
<% int x=100; %>
jsp 태그 변수값 출력 : <c:out value="<%= x %>"></c:out>
</body>
</html>