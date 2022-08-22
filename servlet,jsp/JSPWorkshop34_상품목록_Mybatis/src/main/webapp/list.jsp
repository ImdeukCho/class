<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="com.dto.MyProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	MyProductService service = new MyProductService();
	List<MyProductDTO> list = service.select();
	System.out.print(list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ProductDeleteServlet" method="post">
		<table border='1'>
			  <tr>
				   <td>상품 아이디</td>
				   <td>상품명</td>
				   <td>상품가격</td>
				   <td>갯수</td>
				   <td>삭제</td>
			  </tr>
<% 
	request.setCharacterEncoding("UTF-8");
	
	for(int i=0; i<list.size(); i++){
%>			
	<tr>
		<td><%= list.get(i).getProdId() %></td>
		<td><%= list.get(i).getProdName() %></td>
		<td><%= list.get(i).getPrice() %></td>
		<td><%= list.get(i).getQuantity() %></td>
		<td><button onclick="delete()">삭제</button></td>
	</tr>	
	<%  } %>
<%-- <% 
	for(MyProductDTO dto : list){
%>
	<tr>
	<td><%= dto.getProdId() %></td>
		<td><%= dto.getProdName() %></td>
		<td><%= dto.getPrice() %></td>
		<td><%= dto.getQuantity() %></td>
		<td><button onclick="delete()">삭제</button></td>
	</tr>
	<% }%> --%>
		</table>
	</form>
</body>
</html>