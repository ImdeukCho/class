package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;


@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 데이터 3가지 파싱
		request.setCharacterEncoding("UTF-8");
		String empno = request.getParameter("empno");
		String job = request.getParameter("job");
		String sal = request.getParameter("sal");
		System.out.println(empno+job+sal);
		
		// 2. dto 3가지 데이터 저장
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		dto.setJob(job);
		dto.setSal(Integer.parseInt(sal));
		
		// 3. service.update(dto) => dao.update =>mapper com.dto.update
		EmpService service = new EmpService();
	    service.update(dto);
		// 4.update된 경우 사원목록 다시 뿌리기
	    response.sendRedirect("EmpListServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
