package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

@WebServlet("/ProductDeleteServlet")
public class ProductDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");		// id 파싱해오기
		HttpSession session = request.getSession();	// 세션 생성
		
		

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		Product p = (Product) session.getAttribute(id);	// 세션에 저장된 id값을 p객체에 저장
		System.out.println(id+"\t"+p.getId());			// 삭제할 특정id값과 p객체에 저장된 id값 확인
		
		if (p != null && id.trim().equals(p.getId())) {		// 삭제할 특정id가 존재하고 특정id값과 세션에 저장된 id값이 일치하면
			session.removeAttribute(id);					// session.removeAttribute(속성) : 세션 영역에 저장된 속성 1개를 지운다.
			out.print("<h2>"+id+" 상품 삭제 성공</h2>");
			out.println("<a href='productForm.html'>등록화면보기</a><br>");
			out.println("<a href='ProductListServlet'>상품목록보기</a><br>");
		} else {											// 삭제할 특정id가 존재하지않으면
			out.print("<h2>"+id+" 상품은 등록되지 않는 상품입니다.</h2>");		
			out.println("<a href='ProductListServlet'>상품목록보기</a><br>");
			out.println("<a href='productDelete.html'>특정상품삭제</a><br>");
		}
		out.println("</body></html>");
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
