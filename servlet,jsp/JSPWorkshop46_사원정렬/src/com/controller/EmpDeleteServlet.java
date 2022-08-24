package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpDeleteServlet")
public class EmpDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 데이터 파싱
		request.setCharacterEncoding("UTF-8");
		String empno = request.getParameter("empno");	
		System.out.println(empno);
		
		// 2. dto 1가지 데이터 저장
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		
		// 3. service.update(dto) => dao.update =>mapper com.dto.update
		EmpService service = new EmpService();
	    service.delete(dto);
	    // service.delete(Integer.parseInt(empno));   : 데이터가 1가지라 dto에 저장하지않고 바로 보내는 경우
	    
		// 4.update된 경우 사원목록 다시 뿌리기
	    response.sendRedirect("EmpListServlet");
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
