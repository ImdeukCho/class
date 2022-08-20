<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- web.xml 설정 후 자체실행 -->
<h1>03_contextParm</h1>
	<%
	// 서블릿, web.xml에 설정해야됨
	String userid2 = getServletContext().getInitParameter("userid");
	//jsp
	String userid = application.getInitParameter("userid");
	String email = application.getInitParameter("email");
	%>
	
	서블릿 : <%=userid2 %><br>
	jsp : <%=userid %><br>
	jsp : <%=email %><br>
	<hr>
	
	<!-- applicationScope : set,get설정했을때 사용한다. -->
	EL : ${ initParam.userid }<br>	<!-- initParm : 내장객체 web.xml설정된 key 읽기  -->
	EL : ${ initParam.email }<br>
</body>
</html>