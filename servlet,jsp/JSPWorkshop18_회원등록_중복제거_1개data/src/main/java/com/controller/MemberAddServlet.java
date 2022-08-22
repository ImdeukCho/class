package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		request.setCharacterEncoding("utf-8");
 		String username = request.getParameter("username");
 	
 		
 		// 세션 생성
 		HttpSession session = request.getSession();
 		
 		
 		
 		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
	 	out.print("<body>");
	 	
	 	// 중복 검사
 		String name = (String) session.getAttribute("user");
 		if (username != null && username.trim().equals(name)) {	// 문자열 비교할때 equals 함수 사용!!!
 			out.print("<h2>중복 데이터로 인한 이름 저장 실패</h2>");
 	 		out.print("<a href ='member.html'>이름 입력 화면</a>");

 		} else {
 			session.setAttribute("user", username);
 			out.print("<h2>세션에 이름 저장 성공</h2>");
 	 		out.print("<a href ='MemberListServlet'>세션정보 보기</a>");	
 		}
 		
 		out.print("</body>");
	 	out.print("</html>");
 		
	 	// 홍길동 저장후 이순신 저장후 다시 홍길동 저장시 저장될까?
	 	// 저장됨! 이순신 저장할때 그전의 username은 덮어씌어져서 전의 홍길동은 사라짐
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
