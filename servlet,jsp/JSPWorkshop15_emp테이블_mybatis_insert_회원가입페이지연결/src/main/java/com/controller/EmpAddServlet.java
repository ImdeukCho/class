package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;


@WebServlet("/EmpAddServlet")
public class EmpAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("utf-8");		
		
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String mgr = request.getParameter("mgr");
		String sal = request.getParameter("sal");
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		dto.setEname(ename);
		dto.setJob(job);
		dto.setMgr(Integer.parseInt(mgr));
		dto.setSal(Integer.parseInt(sal));
		
		EmpService service = new EmpService();
		int n = service.memberAdd(dto);
		System.out.println(n);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		if(n==1) {
			out.print("회원가입성공");
		}else {
			out.print("회원가입실패");
		}
		
		   out.print("<a href='EmpListServlet'>목록보기</a>");
		   out.print("</body>");
		   out.print("</html>");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
