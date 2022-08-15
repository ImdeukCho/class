package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/InitParamServlet")
public class OtherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// web.xml에서 context주소 설정함 = initParam설정됨
		System.out.println("OtherServlet.doGet");
		// 초기 파라미터 얻기
		String userid = getInitParameter("userid");
		String email = getInitParameter("email");
		System.out.println(userid + "\t" + email);
		// 초기 파라미터 얻기2
		Enumeration<String> enu = getInitParameterNames();
		while (enu.hasMoreElements()) {
			String key = enu.nextElement();
			String value = getInitParameter(key);
			System.out.println(">>>"+userid+"\t"+email);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
