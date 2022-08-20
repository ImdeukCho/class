package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		// System.out.println(userid+"\t"+passwd);
		String page="";
		// 기존 DB의 사용자 ID, PW
		String dbId = "abcd", dbPw = "1234";
		
		if (dbId.equals(userid) && dbPw.equals(passwd)) {	// 회원 인증시
			HttpSession session = request.getSession();
			session.setAttribute("userid", userid);
			session.setAttribute("passwd", passwd);
			page = "loginInfo.jsp";
			System.out.println("맞음");
			response.sendRedirect(page); 
		} else {
			page = "loginForm.jsp";
			System.out.println("틀림");
			response.sendRedirect(page); 
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
