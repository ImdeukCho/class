package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/yyy")
public class OtherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// web.xml에서 context주소 설정함 = initParam설정됨
		System.out.println("OtherServlet.doGet");
		// 초기 파라미터 얻기
		ServletContext ctx =  getServletContext();		// ContextParam : 변수를 모든 서브렛에서 사용가능 , 이 줄만 추가함
		String userid = ctx.getInitParameter("userid");
		String email = ctx.getInitParameter("email");
		System.out.println(userid + "\t" + email);
		
		/*
		 * // 초기 파라미터 얻기2 Enumeration<String> enu = getInitParameterNames(); while
		 * (enu.hasMoreElements()) { String key = enu.nextElement(); String value =
		 * getInitParameter(key); System.out.println(">>>"+userid+"\t"+email);
		 * 
		 * }
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
