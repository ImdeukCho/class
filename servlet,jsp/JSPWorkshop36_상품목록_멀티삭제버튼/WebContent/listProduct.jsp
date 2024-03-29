<%@page import="javax.swing.text.Document"%>
<%@page import="java.io.Console"%>
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
     MyProductService service = new MyProductService();
     List<MyProductDTO> list = service.select();

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="jquery-3.1.0.js"></script>
<script type="text/javascript"> -->


   <!--  $(document).ready(function(){
    	 $(".deleteProduct").on("click",function(event){
    		 event.preventDefault();
    		 console.log($(this).attr("id"));
    	      location.href="deleteProduct.jsp?prodId="+$(this).attr("id");
    	 }); 
 
    	 $("#delCheckAll").on("click",function(event){
   	         console.log(event.target.checked);
    	    $(".delCheck").each(function(idx,ele){
    		      $(this).prop("checked", event.target.checked);
    	    });	 
    		 
   	     }); 
    	 
    	 $("form").on("submit",function(event){
    		 this.action="deleteAllProduct.jsp";
    		 this.method="GET";
   	     });
    });  

</script>-->
<script type="text/javascript">
	function chk(n) {
		var lang= document.querySelectorAll(".delCheck");
		for(var i=0; i< lang.length; i++){
			lang[i].checked= n.checked;
		}
	}
	function delAll() {
		document.querySelector("#delForm").action='deleteAllProduct.jsp';
	//	document.querySelector("#delForm").submit; 
	}
	function delProduct(n) {
		event.preventDefault(); /*location.href전에 event.preventDefault()사용  */
		location.href="deleteProduct.jsp?prodId="+n;		
	}
	function update(n) {
		event.preventDefault();  //location.href전에 event.preventDefault()사용
		// 아이디 출력
		console.log(n);	
		
		// 수량 출력
		var m = document.querySelector("#quantity"+n);		// quantityP1 키를 가져옴
		var quantity = m.value;
		console.log(quantity);	
		// location.href="updateProduct.jsp?prodId="+n+"quantity="+quantity;
		console.log("============================");
	}
</script>
</head>
<body>
<form id="delForm">
<table border="1">
  <tr>
    <td><input type="checkbox" name="delCheckAll" id="delCheckAll" onclick="chk(this)">전체선택</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               </td>
    <td>상품아이디</td>
    <td>상품명</td>
    <td>가격</td>
    <td>갯수</td>
    <td>삭제</td>
    <td>수정</td>
    <td>합계</td>
    
  </tr>
  
 <%
   for(MyProductDTO dto: list){
 %> 
	   <tr>
	    <td><input type="checkbox" name="delCheck"  class="delCheck" value="<%= dto.getProdId()%>"></td>
	    <td><%= dto.getProdId()%></td>
	    <td><%= dto.getProdName()%></td>
	    <td><%= dto.getPrice()%></td>
	    <td><input type="text" name="quantity" value="<%= dto.getQuantity()%>" id="quantity<%= dto.getProdId()%>"  > </td>
	  <!--   <td><buttton id="<%= dto.getProdId()%>" class="deleteProduct">삭제</button></td> -->
	    <td><button onclick="delProduct('<%=dto.getProdId() %>')" >삭제</button></td>
	    <td><button onclick="update('<%= dto.getProdId()%>')">수정</button></td>
	    <td><input type="text" value=" <%= dto.getPrice() %> * <%= dto.getQuantity()%>"></td>
	  </tr>
 <%
   } 
 %> 
</table>
<button id="deleteAllProduct" onclick="delAll()">선택된 항목 삭제</button>
</form>

</body>
</html>