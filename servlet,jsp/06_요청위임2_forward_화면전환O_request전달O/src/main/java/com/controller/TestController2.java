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

@WebServlet("/TestController2")
public class TestController2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestController2.doGet");
		String v1 = (String) request.getAttribute("request");	// request 전달 됨!!!!!!
		HttpSession session = request.getSession();
		String v2 = (String) session.getAttribute("session");
		session.setAttribute("session", "이순신");
		ServletContext ctx = getServletContext();
		String v3 = (String) ctx.getAttribute("application");
		System.out.println(v1+"\t"+v2+"\t"+v3);
		

		response.setContentType("text/html;charset=utf-8");	// html형식, 한글지원
		// 2. 사용자에게 응답할 PrintWriter객체 생성
		PrintWriter out = response.getWriter();
		// 3. out.print("html코드 작성")
		out.print("<html><body>");
		out.print("<h1>서블릿 응답처리 실습</h1>");
		out.print("</body></html>");
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
