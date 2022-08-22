package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	// 1. request에서 getAttribute
		request.setAttribute("request", "홍길동");

	// 2. Session Scope 객체에 저장 : 브라우저 라이프 사이클과 동일, 기본 30분 생존
		HttpSession session = request.getSession();	// 브라우저의 Session id를 가져와 세션객체 생성(사용자마다 다름-회원인증사용)
		session.setAttribute("session", "이순신");
		
	// 3. ServletContext에 저장 
			// ServletContext ctx = getServletContext();
			// ctx.setAttribute("application", "유관순");
		getServletContext().setAttribute("application", "유관순"); 	// 위에 2개의 명령어를 줄임
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("scope에 데이터 저장 성공");
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);	
	}

}
