<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1. jsp태그로 xx값 파싱, 출력 -->
	<%
		String xxx =(String) request.getAttribute("xxx");
	%>
	jsp 태그 : <%=xxx%><br>
<!-- 2. jstl 태그 xxx 값 파싱, c-out 출력 -->	
	jstl out태그 : <c:out value="${xxx}"></c:out><br>
<!-- 2-2. jstl 태그 c-if이용 xxx값이 홍길동과 같으면 이름같음 출력 -->
	jstl if태그 : <c:if test="${xxx=='홍길동'}">이름같음</c:if>
<!-- 3. scope=session에 xxx를 kkk란 키로 저장 c-set -->
	jstl set태그 :<c:set var="kkk" value="${xxx}" scope="session" ></c:set><br>
<!-- 4. jstl태그 kkk값 출력 c-out -->
			<c:out value="${kkk}"></c:out><br>

</body>
</html>