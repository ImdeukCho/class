package com.simpeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO {
	// 1. 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
	String userid = "scott";// 접속계정
	String passwd = "tiger";// 패스워드

	
	public DeptDAO() {
		super();
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}


	public void selecetAllDept() {     // select sql 실행
		Connection con = null;
		PreparedStatement pstmt = null;         
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println(con);
			String sql ="select deptno x,dname,loc from dept";
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();   
			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		
	}
	
	public ArrayList<DeptDTO> selecetAllDept2() {     // select sql 실행 - 출력은 메인에서 하는 방법
		// 전체 dept select
		// 레코드 하나를 deptDTO에 저장 후 ArrayList에 add
		// 마지막 list 리턴
		// main 호출 list받아서 main에서 데이터 출력	
		Connection con = null;
		PreparedStatement pstmt = null;         
		ResultSet rs = null;
		ArrayList<DeptDTO> list = new ArrayList();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println(con);
			String sql ="select deptno x,dname,loc from dept";
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();   
			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				list.add(new DeptDTO(deptno,dname,loc));   // 방법1
				DeptDTO dto = new DeptDTO(deptno,dname,loc);      // 방법2
				list.add(dto);                                    
//				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}


	public void insertDept(DeptDTO dto) {
		// 커넥션 연결
		// insert sql 생성 ???
		Connection con = null;
		PreparedStatement pstmt = null;         

		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql ="insert into dept (deptno,dname,loc) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			// 6. 실행해서 결과받기
			int num = pstmt.executeUpdate(); 
			System.out.println("실행된 레코드 갯수 : "+num);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
		
	public int insertDept2(DeptDTO dto) {    // insert 레코드 갯수 리턴
		// 커넥션 연결
		// insert sql 생성, 후 insert
		// insert 후 레코드 갯수 리턴 => main에서 insert 레코드 갯수 출력
		// main에서 selectDeptAll() 호출해서 전체 레코드 데이터 출력
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int num = 0;////////////////////////////////////////////////////////////////////
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept (deptno,dname,loc) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.deptno);
			pstmt.setString(2, dto.dname);
			pstmt.setString(3, dto.loc);
			num = pstmt.executeUpdate();////////////////////////////////////////////////
			System.out.println("실행된 레코드 갯수 : "+num);

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
		return num;///////////////////////////////////////////////////////////////////////
	}
		
	
		
		
		
}
	


