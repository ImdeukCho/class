package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myLogin")
public class LoginServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		// 1. post 한글처리
		request.setCharacterEncoding("utf-8");
		
		// 파라미터의 키(name)만 얻기
		Enumeration<String> keys = request.getParameterNames();
		
		
		// 응답처리 
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = request.getParameter(key);
			out.print(key+"="+value+"<br>");
		}
		out.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
