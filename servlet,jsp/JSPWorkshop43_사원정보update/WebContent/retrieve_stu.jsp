<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원관리</title>
</head>
<body>
<%
  
%>
<b>[ 사원 정보 보기 ]</b>
<div style="color:red"> 직업(job)과 월급(sal) 만 수정 가능하도록 구현한다.</div>
	<form action="" method="post">
	<!-- //////////////////////////////////////////////////////////  -->
	 
 		<table border="1">
			<tr>
				<th>사원번호</th>
				<td>&nbsp;</input>
				</td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td>&nbsp;
				</td>
			</tr>
			<tr>
				<th>직업</th>
				<td>
				<select name="job">
				  <option value="CLERK" >CLERK</option>
				  <option value="MANAGER" >MANAGER</option>
				  <option value="ANALYST" >ANALYST</option>
				  <option value="SALESMAN" >SALESMAN</option>
				</select>
				</td>
			</tr>
			<tr>
				<th>관리자</th>
				<td>&nbsp;
				</td>
			</tr>
			<tr>
				<th>입사일</th>
				<td>&nbsp;
				</td>
			</tr>
			<tr>
				<th>월급</th>
				<td><input type="text" name="sal" value="" ></input>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="사원수정"></input>
				</th>				
			</tr>

		</table>
	</form>
	<a href="EmpListServlet">목록보기</a>&nbsp;
	<a href="">삭제</a>
</body>
</html>