<%@page import="com.dto.PageDTO"%>
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
	<b>[ 사원 목록 ]</b>
	<hr></hr>
	<%
	PageDTO pDTO = (PageDTO) request.getAttribute("pDTO");//pDTO꺼내고
	List<EmpDTO> list = pDTO.getList();// pDTO안에있는 list를 꺼낸다
	String order = (String)request.getAttribute("order");
	String searchName = (String)request.getAttribute("searchName"); // searchName을 꺼낸다
	String searchValue = (String)request.getAttribute("searchValue"); // searchValue를 꺼낸다
	%>
	<table border="1">

		<!-- 검색기능 -->
		<tr>
			<td colspan="5">
				<form action="EmpListServlet">
					<select name="searchName">
						<option value="hiredate">입사일(년도만)</option>
						<option value="ename">이름</option>
					</select> <input type="text" name="searchValue"> <input
						type="submit" value="검색">
				</form>
			</td>
		</tr>
		<!-- 검색기능  -->
		<!-- 정렬기준 -->
		<tr>
			<th>정렬기준</th>
			<td colspan="4">
			  <form action="EmpOrderServlet">
			      월급 높은 순 : <input type="radio" name="order" value="desc"  <% if("desc".equals(order) || order == null){ %> checked="checked" <%} %> />
				 월급낮은 순 : <input type="radio" name="order" value="asc" <% if("asc".equals(order)){ %> checked="checked" <%} %>/>
				  <input type="submit" value="정렬">
               </form>
			</td>
		</tr>

		<!-- 정렬기준 -->
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직업</th>
			<th>입사일</th>
			<th>월급</th>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
				EmpDTO dto = list.get(i);
				int empno = dto.getEmpno();
				String ename = dto.getEname();
				String job = dto.getJob();
				String hiredate = dto.getHiredate();
				int sal = dto.getSal();
		%>
		<tr>
			<td><a href="EmpRetrieveServlet?empno=<%=empno%>"><%=empno%></a></td>
			<td><%=ename%></td>
			<td><%=job%></td>
			<td><%=hiredate%></td>
			<td><%=sal%></td>
		</tr>
		<%
			} //end for
		%>
		<tr>
		 <td colspan="5"> 
		   <%
		        int curPage = pDTO.getCurPage();	//현재 볼 페이지 번호
		        int perPage = pDTO.getPerPage();	//한페이지에 보여질 목록 수 
				int totalCount = pDTO.getTotalCount(); //전체 레코드 갯수 
				int totalPage = totalCount/perPage;	// 전체 페이지 수
				if(totalCount%perPage!=0) totalPage++;	// ex) 전체레코드 9개/보여질목록수 2개 = 나머지1  전체페이지 증가++
		        for(int i=1; i<= totalPage; i++){		// 1부터 전체피이즈수까지 증가
		          	if(i== curPage){					// 만약 i가 현재볼 페이지라면
		          		out.print(i+"&nbsp;");			// i를 보여준다
		          	}else{								// RowBound(offset, limit) // 시작 idx, 몇개
		          		                                //   offset = (원하는 페이지, -1)* perpage
		          		                                //   limit = purpage
		          		out.print("<a href='EmpListServlet?curPage="+i+"&searchName="+searchName+"&searchValue="+searchValue+"'>"+i+"</a>&nbsp;");
		          	}
		        }//end for
		   %>
		
		  </td>
		</tr>
	</table>
	<a href="EmpWriteFormServlet">사원등록</a>
</body>
</html>