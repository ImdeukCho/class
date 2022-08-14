package workshop08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCTest1 {

	public static void main(String[] args) {
		// 1. 4가지 변수
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
		String userid = "tester";// 접속계정
		String passwd = "tester";// 패스워드
		
		Connection con = null;
		PreparedStatement pstmt = null;                     
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			String sql ="select pdname 제품카테고리, pdsubname 제품명, facname 공장명, STONAME 판매점명,nvl(STAMOUNT,0) 판매점재고수량"
					+ " from factory f JOIN product p USING(factno) JOIN store s USING(PDNO)"
					+ " where f.facloc='SEOUL' and (s.stamount='0' or s.stamount is null)";		
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
//			System.out.println("제품카테고리\t제품명\t공장명\t판매점명\t판매점제고수량");
			ResultSetMetaData mrs = rs.getMetaData();                       // getMetaData() : 컬럼 헤더부분 추출
			int count = mrs.getColumnCount();                               // getColumnCount() ; 컬럼의 갯수 추출
			for (int i = 1; i <= count; i++) {
				System.out.printf(mrs.getColumnName(i)+"\t");
			}
			System.out.println();
			System.out.println("--------------------------------------------------");
			while (rs.next()) {
				String pdname = rs.getString(1);
				String pdsubname = rs.getString(2);
				String facname = rs.getString(3);
				String STONAME = rs.getString(4);
				int STAMOUNT = rs.getInt(5);
				System.out.println(pdname + "\t" + pdsubname + "\t" + facname+ "\t" + STONAME+ "\t" + STAMOUNT);
			}
		} catch (Exception e) {    // Exception으로 모든 오류 잡아준다.
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
