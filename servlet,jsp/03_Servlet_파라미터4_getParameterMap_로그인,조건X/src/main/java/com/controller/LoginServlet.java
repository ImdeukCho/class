package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("doget()");
			
			// post 한글처리
			request.setCharacterEncoding("utf-8");
			
			// Map 형태로 받기
			Map<String, String[]> map =  request.getParameterMap();
			
			// 응답처리 
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			
			
			out.print("<html><body>");
			
			Set<String> keys = map.keySet();
			for (String key : keys) {
				String[] values = map.get(key);
				String mesg = "";
				for (String s : values) {
					mesg += s;
				}
				out.print(key + "===========" + mesg + "<br>");
			}
			
			out.print("</body></html>");
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
