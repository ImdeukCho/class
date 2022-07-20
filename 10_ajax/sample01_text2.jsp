<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// html 다 삭제 , data로 넘어간다.
	// 데이터 파싱
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	System.out.println(id+"\t"+pw);
%>
<%= id + pw + "전송완료" %>