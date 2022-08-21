package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberSerlvet
 */
@WebServlet("/member")
public class MemberSerlvet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		String username= request.getParameter("username");
		String ssn= request.getParameter("ssn");	// 주민번호 801010-1234567 14자리 
		String[] hobby= request.getParameterValues("hobby");
		String marry= request.getParameter("marry");
		//801010-1234567
		String gender= (ssn.substring(7, 8)).equals("1")?"남자":"여자";	// substring(시작idx,끝idx-1) , 7번째 자리 숫자 1만 빼오기
		
		String mesg="";
		for (String x : hobby) {
			System.out.println(x);
			mesg+=x+" ";
		}
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		String my= "이름은 "+ username+ "<br>";
		my+= "성별은"+gender+"<br>";
		my+= "취미는 "+ mesg+"<br>";
		my+= "결혼 여부는 "+ marry ;
		out.print(my);		
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
