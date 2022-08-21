package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Product;

@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {
	
	// ArrayList 사용
	// private HashMap<String, Product> Products = new HashMap<String, Product>();
	private ArrayList<Product> Products = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>상품입력결과</title></head><body>");
		out.print("<b>상품입력결과</b>");
		try {
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			int amount = Integer.parseInt(request.getParameter("amount")) ;
			
			////////////////////////////
			if (Products.size() != 0) {								// 배열의 size가 0이 아닐시
				 boolean flag = true;								// add 할것인가 아닌가 판단 변수
				for (int i = 0; i < Products.size(); i++) {
					Product p = Products.get(i);
					if(p.getId().equals(id)) {						// 입력되어있는 상품의 id와 입력하는 id가 같으면 
						p.setAmount(p.getAmount()+amount);			// 입력되어있는 amount를 꺼내와 , 입력하는 amount와 더하여 set한다.
						flag = false;								// 밑의 if문을 false로 실행하지 않는다.
					}
				
				}//end for
			// if(flag)=>for문안에 else로 바꾸면 : flag 사용안하면 if문 else일 경우도 for문적용되 순회하여 저장이 여러번되서 잘못된 정보출력.	
			// if(flag)를 삭제하면 : size가 0이아닐때 새로운 상품정보를 저장못해서 잘못된 정보출력 
				if(flag) {											// 입력되어있는 상품의 id와 입력하는 id가 같지 않을시
					Products.add(new Product(name, id, amount));	// 배열에 정보를 저장한다.
				}
			}else {													// 배열의 size가 0인 경우 , 배열에 정보 저장.
				Products.add(new Product(name, id, amount));
			}	
			
			
				out.print("<table border=1>");
				out.print("<tr><th>상품명</th><th>상품아이디</th><th>수량</th></tr>");
				for (Product p : Products) {	///////////
					 out.print("<tr>");
					 out.print("<td>"+p.getName()+"</td><td>"+p.getId()+"</td><td>"+p.getAmount()+"</td>");
					 out.print("</tr>");
				}
				out.print("</table>");
				} catch (Exception e) {
					out.print("입력항목확인 요망<br>");
				} {
				out.print("<a href='productForm.html'>상품입력하기</a>");
				out.print("</body></html>");
	
		}
	}	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
