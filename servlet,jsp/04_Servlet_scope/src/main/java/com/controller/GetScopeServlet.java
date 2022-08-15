package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {

   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		
   	// 1. request에서 getAttribute
   		 String name = (String) request.getAttribute("request");
   		 System.out.println("getScope>>>"+name);
//   		 String name2 = (String) request.getAttribute("userid");	
//   		 System.out.println("getScope>>>"+name2);
   		// null 값 출력 , 다른 servlet에서 get사용하면 새로운 request가 불러와지므로 set데이터가 없다.

   	// SetScopeServlet부터 실행
   	// 2. Session Scope 얻기
   		HttpSession session = request.getSession();	
   		String name2 = (String) session.getAttribute("session");
   		System.out.println("session get : "+name2);
   		// 다른 servlet에서 저장된 데이터를 get으로 가져올수있다.
   		// 단, 브라우저가 살아있어야된다. 브라우저 종료시 null출력
   		// 간단하게, 사용자의 브라우저 1개당 session1개다.
   		
   		
   	// 3. application 얻기
   		ServletContext ctx = getServletContext();
   		String x3 = (String) ctx.getAttribute("application");
   		System.out.println("GetScopeServlet application==="+x3);
   		// Context : 서버에서 데이터 넘어온다.
   		// 브라우저 종료해도 서버가 살아있으면값 넘어옴.
   		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
