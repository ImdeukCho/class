package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
	String userid = "scott";// 접속계정
	String passwd = "tiger";// 패스워드
	
	public void init() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩성공");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;                       // PreparedStatement 사용
		ResultSet rs = null;
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공");
			
			String sql = "select empno, ename, sal, to_char(hiredate,'yyyy/mm/dd') hiredate, deptno "
					+ "from emp order by empno";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			
			out.print("<html>");
			out.print("<body>");
			String my = "<table border=1>";
				my += "<tr>";
				my += "<td>사원번호</td>";
				my += "<td>사원이름</td>";
				my += "<td>월급</td>";
				my += "<td>입사일</td>";
				my += "<td>부서번호</td>";
				my += "</tr>";
			
			
			// while문 이용	
			while (rs.next()) {
				my += "<tr>";
					my += "<td>"+rs.getInt("empno")+"</td>";
					my += "<td>"+rs.getString("ename")+"</td>";
					my += "<td>"+rs.getInt("sal")+"</td>";
					my += "<td>"+rs.getString("hiredate")+"</td>";
					my += "<td>"+rs.getInt("deptno")+"</td>";
					my += "</tr>";
			}
			
				my += "</table>";	
			out.print(my);
			
		} catch (SQLException e) {
			out.print("에러발생");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();             // 입력할때 순서 con -> stmt -> rs
				if(pstmt != null) pstmt.close();         // 닫을때는 순서 반대로 rs -> stmt -> con
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
