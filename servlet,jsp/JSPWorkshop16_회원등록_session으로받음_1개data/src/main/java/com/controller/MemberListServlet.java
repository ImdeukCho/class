package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MemberListServlet")
public class MemberListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
 		
		// 세션 불러오기
		HttpSession session = request.getSession();	
   		String username = (String) session.getAttribute("user");
 		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	
 		out.print("<html>");
 		out.print("<body>");
 		if (username.length() == 0) {	// null로 설정할경우 이름미등록시 공백으로 잘못된정보 저장후출력.
 			out.print("잘못 접근, 회원등록 후 조회가능");
		}else {
			out.print("세션에 등록된 이름은: "+username+"<br>");
		}
 		out.print("<a href ='member.html'>회원등록화면</a>");
 		out.print("</body>");
 		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
