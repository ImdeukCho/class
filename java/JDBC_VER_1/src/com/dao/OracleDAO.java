package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {
	// 1. 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
	String userid = "scott";// 접속계정
	String passwd = "tiger";// 패스워드

	// 2. 드라이버 로딩을 기본생성자 안에다가 작성 : main에서 service객체생성 -> service기본생성자에서 DAO기본생성자 호출 -> DAO기본생성자에서 드라이버로딩
	public OracleDAO() {
		super();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ===================");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Dept> select() throws SQLException {
		// 1. 커넥션 연결 -> throws 처리 할 것
		// 2. select sql 실행
		// 3. 실행 결과를 dto생성 -> list . add 완료
		// 4. return list
		
		ArrayList<Dept> list = new ArrayList();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = DriverManager.getConnection(url, userid, passwd);
		String sql = "select deptno x,dname,loc from dept";
		pstmt = con.prepareStatement(sql);
		rs= pstmt.executeQuery();
		while(rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
//			list.add(new Dept(deptno,dname,loc));
			Dept dept = new Dept(deptno,dname,loc);
			list.add(dept);
		}
		if (rs != null) rs.close();
		if (pstmt != null) pstmt.close();
		if (con != null) con.close();
		return list;
	}
	
}
