package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. request에서 getAttribute
		// request객체에 필요한 데이터 저장(Object) key/value 현태로 저장
		 request.setAttribute("request", "홍길동");	// 사용하는 곳에서는 request.getAttribute("key"); : set,get끼리만 한쌍이다 , 폼데이터랑 전혀 상관없다
//		 request.setAttribute("userid", "홍길동2");	 
//													// getparameter : 폼에서의 데이터를 파싱할때 사용
		 String name = (String) request.getAttribute("request");	// set에서 저장한것만 get할수있다.
		 System.out.println(name);
//		 String name2 = (String) request.getAttribute("userid");	// getParameter와 연결 안됨(form데이터 못불러짐) , set설정시 호출됨
//		 System.out.println(name2);
		// request객체에 데이터를 담아 다른 servlet으로 데이터 전송은 안됨 ==> forward방법을 이용하여 해결함(mvc패턴에서 사용)
		// Session Scope에 저장

		
		// 2. Session Scope 객체에 저장 : 브라우저 라이프 사이클과 동일, 기본 30분 생존
		HttpSession session = request.getSession();	// 브라우저의 Session id를 가져와 세션객체 생성(사용자마다 다름-회원인증사용)
		session.setAttribute("session", "이순신");
		
		
		// 3. ServletContext에 저장 = application scope에 저장, 모든 서블릿, 모든 사용자 사용가능
		ServletContext ctx = getServletContext();
		ctx.setAttribute("application", "유관순");
//		System.out.println("application : 유관순");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
