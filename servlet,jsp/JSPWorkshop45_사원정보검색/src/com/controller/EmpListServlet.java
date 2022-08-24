package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 데이터 파싱 serch name,value
		String searchName = request.getParameter("searchName");	////
		String searchValue = request.getParameter("searchValue");	////
		System.out.println(searchName);
		System.out.println(searchValue);
		
		  EmpService service = new EmpService(); 
		  List<EmpDTO> list = service.select(searchName,searchValue);////
		  
		  request.setAttribute("list", list); 
		  //forward
		  RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		  dis.forward(request, response);
	}

}
