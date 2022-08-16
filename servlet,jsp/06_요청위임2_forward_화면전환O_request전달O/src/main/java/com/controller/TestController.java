package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestController")
public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestController.doGet");
		
		// hellp.jsp 선택(요청)
		request.setAttribute("request", "홍길동");
		
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("application", "유관순");
		
		// 2. forward 방법
		// 화면전환O, request전달O
		RequestDispatcher dis = request.getRequestDispatcher("hello.jsp");
		// RequestDispatcher dis = request.getRequestDispatcher("TestController2");
		dis.forward(request, response);		// 포워딩
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
