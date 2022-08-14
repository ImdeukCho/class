package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dto.Dept;
import com.exeception.RecordNotFoundException;

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
			System.out.println("드라이버 접속 성공 ============");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}

	public ArrayList<Dept> select() throws SQLException {
		ArrayList<Dept> list = new ArrayList(); /////////////////////////////////////
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = DriverManager.getConnection(url, userid, passwd);
		String sql = "select deptno x, dname, loc from dept";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
//			list.add(new Dept(deptno,dname,loc));
			Dept dept = new Dept(deptno,dname,loc);
			list.add(dept);
		}
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
		return list;
	}

	public int insert(Dept xx) {
		// 1. 커넥션 연결
		// 2. insert 실행
		// 2-2. .close()
		// 3. 추카된 레코드 갯수 리턴
		

		Connection con = null;
		PreparedStatement pstmt = null;
		int num = 0;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept (deptno,dname,loc) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, xx.getDeptno());
			pstmt.setString(2, xx.getDname());
			pstmt.setString(3, xx.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
		
	}

	public void update(Dept xx) throws RecordNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "UPDATE dept set dname=?,loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			int num = pstmt.executeUpdate();
			System.out.println("실행 결과 : " + num);
			if (num == 0) {                            // update할 deptno가 없을때 에러 강제발생
				throw new RecordNotFoundException(xx.getDeptno()+"레코드가 없음");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(int i) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "DELETE FROM dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			int num = pstmt.executeUpdate();
			System.out.println("실행 결과 : " + num);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
	
}
