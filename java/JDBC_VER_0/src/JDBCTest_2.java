import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest_2 {

	public static void main(String[] args) {
		// 1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//접속정보
		String userid = "scott";//접속계정
		String passwd = "tiger";//패스워드
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		// 2. 드라이버 접속
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공");
		// 3. sql문 작성
			String sql = "select * from dept";			
		// 4. Statement 생성 및 명령 실행
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
//			rs = stmt.executeUpdate(sql);               // 오류 : 실행문은 executeQuery 사용
		// 5. 결과 출력
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String no = rs.getString("deptno");     // int형을 String형으로는 뽑는거 가능
				String dname = rs.getString("dname");
//				int name = rs.getInt("dname");          // dname을 int로 잘못 뽑음
				String loc = rs.getString("loc");
				System.out.println(deptno+"\t"+dname+"\t"+loc+"\t"+no);
			}
			
//			while (rs.next()) {
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				System.out.println(deptno+"\t"+dname+"\t"+loc);
//			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		// 6. 자원반납
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	} // end main

}
