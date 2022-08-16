<%@page import="java.util.ArrayList"%>
<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>		<!-- %@태그 : date기능 import -->
<%@ page import="java.util.ArrayList" %>
    <!-- 주석 단축키 : ctrl + shift + /  -->
    <!-- 주석풀기 단축키 : ctrl + shift + \(역슬래쉬) -->
    <!-- html 주석 -->
    <%-- jsp 주석 --%>
    <%-- <% int i=0; %> --%>
    <% // int num = 10; %>		<!-- 자바주석 사용가능, %태그 변수는 doGet함수의 로컬변수임 -->
    <%!
    	// declaration tag : 멤버변수/멤버메소드 작성시 사용
    	int num=10;
    	public String a(int tt) {	// 함수선언
    		System.out.println("a() 함수 실행 ========" + tt);
    		return "test";
    	}
    %>
    <%
    	// script 에서 사용하는 코드는
    	// servlet의 doGet, doPost 안으로 적용됨
   		System.out.println(num);
    	a(10);						// 함수 호출 사용
	    System.out.println(a(10));	// retun값 출력
	    
	    Date d = new Date();
	    System.out.println(d);
	    
	    ArrayList x = new ArrayList();
	    x.add(10);
	    System.out.println(x.get(0));
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>%! 태그</title>
</head>
<body>
	<!-- %! : 멤버 변수선언; , 메서드 선언; 할때 사용-->
	<%
		String str="홍길동";
		System.out.println("body 사이의 %태그에서 출력 :"+ str);//콘솔에 출력 
	%>
	브라우저에 출력 : <%= str %>  <br>
	num : <%= num %><br>
	<%= a(100) %>
</body>
</html>