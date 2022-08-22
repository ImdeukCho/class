package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		request.setCharacterEncoding("utf-8");
 		
 		
 		
 		String username = request.getParameter("username");
 		int age = Integer.parseInt(request.getParameter("age"));
 		String address = request.getParameter("address");
 		
 		MemberDTO dto = new MemberDTO(username, age, address);		// dto 객체에 저장
 		
 		// 세션 생성
 		HttpSession session = request.getSession();
 		
 		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
 		out.print("<body>");
 		
 		// 중복 검사 (세션에서 객체를 받아와 xxx에 저장 )
 		MemberDTO xxx = (MemberDTO) session.getAttribute("user");
 		if (xxx != null && username.trim().equals(xxx.getUsername())) {	// 문자열 비교할때 equals 함수 사용!!!
 			out.print("<h2>중복 데이터로 인한 이름 저장 실패</h2>");
 	 		out.print("<a href ='member.html'>이름 입력 화면</a>");

 		} else {
 			session.setAttribute("user", dto);
 			out.print("<h2>세션에 이름 저장 성공</h2>");
 	 		out.print("<a href ='MemberListServlet'>세션정보 보기</a>");	
 		}
 		
 		out.print("</body>");
	 	out.print("</html>");
 		
 		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
