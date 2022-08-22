<%@page import="com.dto.EmpDTO"%>  
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 
  // body에 작성 안해도됨, html출력문이 아니므로
 // jsp에서 service 함수 호출
 	EmpService service = new EmpService();	// service 객체 생성
 // service 함수를 ArrayList에 저장
 	ArrayList<EmpDTO> list = service.selectAllEmp();	
 	System.out.print(list);		// list 출력
 %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>사원번호</td>
			<td>사원이름</td>
			<td>월급</td>
			<td>입사일</td>
			<td>부서번호</td>
		</tr>
		
		<!-- for ~ each문 이용 list에서 dto.value값 뽑기 -->
		<%-- <% for (EmpDTO dto : list) { %>
		<tr>
			<td><%= dto.getEmpno()%></td>
			<td><%= dto.getEname()%></td>
			<td><%= dto.getSal()%></td>
			<td><%= dto.getHiredate()%></td>
			<td><%= dto.getDeptno()%></td>
		</tr>
		<% } %> --%>
		
		<!-- 변수로 저장해서 출력하는 방법 -->
		<%  
		for (EmpDTO dto : list) {
			int empno = dto.getEmpno();
			String ename = dto.getEname();
			int sal = (int) dto.getSal();	
			String hiredate = dto.getHiredate();
			int deptno = dto.getDeptno();
		%>
			<tr>
				<td><%= empno%></td>
				<td><%= ename%></td>
				<td><%= sal%></td>
				<td><%= hiredate%></td>
				<td><%= deptno%></td>
			</tr>
		<% } %>
	</table>	
</body>
</html>