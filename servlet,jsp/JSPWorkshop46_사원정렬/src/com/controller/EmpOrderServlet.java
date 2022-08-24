package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpOrderServlet")
public class EmpOrderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 데이터 파싱
		request.setCharacterEncoding("UTF-8");
		String order = request.getParameter("order");
		System.out.println(order);
		
		EmpService service = new EmpService();
		List<EmpDTO> list = service.order(order);
		System.out.println(list);
		
		
		// 리스트 받아온걸 request에 저장하 forward 시킨다
		request.setAttribute("order", order);
		request.setAttribute("list", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
