package com.controller;

import java.io.IOException;

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
		request.setAttribute("request", "홍길동");
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");
		ServletContext ctx = getServletContext();
		ctx.setAttribute("application", "유관순");
		
		
		
	// 1. redirect방법
		// 리다이렉트 (redirect) : 화면처리만 위임, request는 위임 안됨 
		// request 데이터 전달 없이 화면만 전환시킬 경우 사용 , request 새롭게 재요청 , 모든 응답처리를 다른페이지에서 함
			// ex) 로그인 실패화면 출력되고 밑의 링크(로그인화면돌아가기) 타고 로그인화면 가는게 아니라
			// 실패시 바로 로그인화면으로 이동 ﻿
		// 1) 응답 처리(코드)가 없음
		// 2) response.sendRedirect(﻿"이동할페이지");   	

		response.sendRedirect("hello.jsp");			//request의 전달은 이루어 지지 않음
		// response.sendRedirect("TestController2");		//request의 전달은 이루어 지지 않음
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
