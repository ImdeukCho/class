package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.LoginService;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("utf-8");
		String userid = request.getParameter("userid");		// 데이터 파싱
		String passwd = request.getParameter("passwd");
		
		MemberDTO xxx = new MemberDTO();					// 파싱한 데이터를 dto객체에 저장 
		xxx.setUserid(userid);
		xxx.setPasswd(passwd);
		
		LoginService service = new LoginService();
		MemberDTO dto = service.loginCheck(xxx);			// 파싱한 데이터와 db정보 일치 확인 , 로그인 인증 확인
		
				
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		if(dto == null) {
			out.print("아이디와 비밀번호를 확인하세요.<br>");
			out.print("<a href='loginForm.html'>로그인 화면</a>");	
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("login", dto);					// db에 꺼내온 정보 세션에 정보 저장
			
			out.print("환영합니다."+dto.getUsername()+"<br>");		// id,pass 확인 완료 후 데이터 session에 저장, 인증정보로 활용
			out.print("<a href='LogoutServlet'>로그아웃</a><br>");		
			out.print("<a href='MemberInfoServlet'>회원정보보기</a>");				
		}  
		   out.print("</body>");
		   out.print("</html>");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
