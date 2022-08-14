package workshop08;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest4 {

	public static void main(String[] args) {
		// 1. 4가지 변수
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
		String userid = "tester";// 접속계정
		String passwd = "tester";// 패스워드
		
		Connection con = null;
		PreparedStatement pstmt = null;                     
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
	con.setAutoCommit(false);
			String sql ="DELETE FROM product "
					+ "WHERE FACTNO = (select FACTNO from factory where facloc='CHANGWON')";
			System.out.println(sql);
			pstmt = con.prepareStatement(sql);
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 데이터가 정상적으로 DELETE 되었습니다.");
	con.commit();
		} catch (Exception e) {    // Exception으로 모든 오류 잡아준다.
			e.printStackTrace();
			
			try {
				System.out.println("롤백====================");
		con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
	}
	
		} finally {
			try {
	con.setAutoCommit(true);
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
