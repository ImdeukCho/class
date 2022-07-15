package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//request.setAttribute("xxx", "홍길동");//바인딩
		HttpSession session = request.getSession();	// request, session 동시사용시 request값을 가져옴(호기심에 해봄, 중복되게 값저장 하지말자.ㅋㅋ)
		session.setAttribute("xxx", "이순신");
		// forward
		RequestDispatcher dis = request.getRequestDispatcher("02_bind.jsp");
		dis.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
