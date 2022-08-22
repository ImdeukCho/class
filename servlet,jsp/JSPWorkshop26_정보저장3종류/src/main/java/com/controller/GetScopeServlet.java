package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
   		
   		
   	// 1. request 방법
   		String req = (String) request.getAttribute("request");
   		System.out.println("getScope>>>"+req);		// null값 출력
   		 
   	// 2. Session 방법
   		HttpSession session = request.getSession();	
   		String sess = (String) session.getAttribute("session");
   		System.out.println("session get : "+sess);	
   		
   	// 3. ServletContext 방법
	   		// ServletContext ctx = getServletContext();
	   		// String app = (String) ctx.getAttribute("application");
   		String app = (String) getServletContext().getAttribute("application");	// 위에 2개의 명령어를 줄임
   		System.out.println("GetScopeServlet application==="+app);
   		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("홍길동 출력:" + req+"<br>");
		out.print("이순신 출력:" + sess+"<br>");
		out.print("유관순 출력:" + app+"<br>");
		out.print("</body>");
		out.print("</html>");
   		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
