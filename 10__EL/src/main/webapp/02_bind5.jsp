<%@page import="java.util.List"%>
<%@page import="com.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>2. bind5</h1>
	<%
	List<Person> list = (List)request.getAttribute("xxx"); 
	for(Person p : list){
	%>
		일반 : <%=p.getAge() %>
		일반 : <%=p.getUsername() %>
		<br>
	<% } %>
	<hr>
	<% int x = 0; %>
	EL:::::::::::::::::::${xxx[0].username }<br>	<!-- 문제발생 jsp 변수를 el태그에서 사용못한다. , i대신 0입력시 출력됨-->
	<% for(int i=0; i<=list.size(); i++){ %>	<!-- 출력안됨 jsp태그 변수i를 el태그에서 사용못함 -->
	<!-- 단 여러 데이터를 표현 할 경우 문제가 발생됨 jstl태그 길이사용 문제해결 -->
		EL : person.name = ${xxx[i].username }<br>
		EL : person.age = ${xxx[i].age }<br>
	<% } %>


</body>
</html>