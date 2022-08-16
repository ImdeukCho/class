<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 위에부터 출력되고 sendRedirect로 넘어갈것인가?  NO!! login.jsp페이지 연결되지않고 바로 sendRedirect 시킨다 -->
<% 
	request.setCharacterEncoding("utf-8"); 		// post 한글 처리
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	
	if(userid.equals("abcd")){
		out.print("회원인증됨");
	} else {
		request.setAttribute("test", "회원인증이 필요합니다. ");
		// 인증이 안됬을 경우만 reponseRedirect 페이지로 바로이동, userid,passwd,test 모두 넘어감 
		RequestDispatcher dis = request.getRequestDispatcher("reponseRedirect.jsp");
		dis.forward(request, response); 
	}
%>
	<hr>
	사용자id: <%= userid %> <br>
	패스워드: <%= passwd  %>
	
<%-- <% // 인증되던, 안되던 포워딩되어서 reponseRedirect 페이지로 바로이동 - request의 정보가 그대로 넘어감
	RequestDispatcher dis = request.getRequestDispatcher("reponseRedirect.jsp");
	dis.forward(request, response); 
%> --%>
</body>
</html>