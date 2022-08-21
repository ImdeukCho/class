package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {
	
	// HashMap 사용
	private HashMap<String, Product> Products = new HashMap<String, Product>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>상품입력결과</title></head><body>");
		out.print("<b>상품입력결과</b>");
		try {
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			int amount = Integer.parseInt(request.getParameter("amount"));
			
			/////////////////
			Product temp = Products.get(id);				// map의 id를 상품객체로 지정
			if (temp == null) {								// 상품객체가 없을시, map에 id가 없을시
				temp = new Product(name, id, amount);		// 새로운 정보를 상품객체에 저장
				Products.put(id, temp);						// map에 key:id, value:상품객체 저장
			}else {											// 상품객체가 있을시, map에 똑같은 id가 있을시
				temp.setAmount(temp.getAmount() + amount);	// 상품객체의 amount를 입력한수량에 더한다.
			}	
			
		out.print("<table border=1>");
		out.print("<tr><th>상품명</th><th>상품아이디</th><th>수량</th></tr>");
		for (Product p : Products.values()) {	// map에서 value만 꺼내옴
			 out.print("<tr>");
			 out.print("<td>"+p.getName()+"</td><td>"+p.getId()+"</td><td>"+p.getAmount()+"</td>");
			 out.print("</tr>");
		}
		out.print("</table>");
		} catch (Exception e) {
			out.print("입력항목확인 요망<br>");
		} 
		out.print("<a href='productForm.html'>상품입력하기</a>");
		out.print("</body></html>");
	}	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
