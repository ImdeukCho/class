package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 1. post 한글처리
			request.setCharacterEncoding("utf-8");
			
			Enumeration<String> keys = request.getParameterNames();	// getParameterNames();
			/*
			 * // 요청작업 처리 String userid = request.getParameter("userid"); String passwd =
			 * request.getParameter("passwd");
			 */
			
			// 응답처리 
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = request.getParameter(key);
				out.print(key+": "+value+"<br>");
			}
			out.print("</body></html>");
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
