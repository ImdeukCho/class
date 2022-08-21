package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService{
	
	// 1. 4가지 변수
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
	private String userid = "scott";// 접속계정
	private String passwd = "tiger";// 패스워드
	private EmpDAO dao;
	
	// 2. Driver 로딩 - 로딩성공 메세지 출력
	public EmpService() {
		dao = new EmpDAO();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3. 커넷션연결, 종료
	public ArrayList<EmpDTO> selectAllEmp(){
		ArrayList<EmpDTO> list = null;	
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.selectAllEmp(con);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(con != null) 
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	
}
