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


@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
 		
		// 세션 불러오기
		HttpSession session = request.getSession();	
   		MemberDTO dto = (MemberDTO) session.getAttribute("user");		// dto 객체 불러오기
 		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	
 		out.print("<html>");
 		out.print("<body>");
 		if (dto == null) {	// dto객체가 null 이면
 			out.print("잘못 접근, 회원등록 후 조회가능");
		}else {
			out.print("세션에 등록된 정보: "+dto.getUsername()+" "+dto.getAge()+" "+dto.getAddress()+"<br>");
		}
 		out.print("<a href ='member.html'>회원등록화면</a>");
 		out.print("</body>");
 		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
