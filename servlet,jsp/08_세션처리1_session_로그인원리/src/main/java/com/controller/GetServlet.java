package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 세션얻기
		HttpSession session = request.getSession();
		// 2. 공유 데이터 파싱
		String username = (String)session.getAttribute("username");
		String passwd = (String) session.getAttribute("passwd");
		// System.out.println(username+"\t"+passwd);

		if(username == null){
			response.sendRedirect("error.jsp");
		} else {
			response.sendRedirect("info2.jsp");
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
