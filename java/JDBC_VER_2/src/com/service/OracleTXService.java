package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exeception.RecordNotFoundException;

public class OracleTXService{
	
	// 1. 4가지 변수
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
	String userid = "scott";// 접속계정
	String passwd = "tiger";// 패스워드
	OracleTxDAO dao;
	
	// 2. Driver 로딩 - 로딩성공 메세지 출력
	public OracleTXService() {
		super();
		dao = new OracleTxDAO();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ===================");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 3. 커넷션연결, 종료
	public ArrayList<Dept> select() throws SQLException{
		Connection con = null;
		ArrayList<Dept> list = null;	
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.select(con);
		} finally {
			if (con != null) con.close();
		}
		return list;
	}

	public int insert(Dept xx){
		Connection con = null;	
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.insert(con, xx);                     // dao 클래스에 con과 xx를 넘김
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}

	public void update(Dept xx) throws RecordNotFoundException {
		Connection con = null;	
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.update(con, xx);       // con도 같이 넘김
		} catch (SQLException e) {
			e.printStackTrace();	
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		
	}

	public void delete(int i) {
		Connection con = null;	
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, i);       // con도 같이 넘김
		} catch (SQLException e) {
			e.printStackTrace();	
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	


	
}
