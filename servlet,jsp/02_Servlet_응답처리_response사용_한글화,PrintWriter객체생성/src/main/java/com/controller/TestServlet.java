package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. response의 헤더 정보 셋팅
				response.setContentType("text/html;charset=UTF-8");  // html형식, 한글지원
				
		// 2. 사용자에게 응답할 PrintWriter객체 생성
				PrintWriter out = response.getWriter();	
		
		// 3. out.print("html코드 작성")
		out.print("<html><body>");	
		out.print("<h1>서블릿 응답처리 실습</h1>");	
		out.print("<p>Hello World</p>");	
		out.print("</body></html>");	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
