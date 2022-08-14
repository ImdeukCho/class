import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Insert_2 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
		String userid = "scott";// 접속계정
		String passwd = "tiger";// 패스워드
		
		Connection con = null;
		Statement stmt = null;

		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공");
			
			String sql = "INSERT INTO DEPT (DEPTNO,DNAME,LOC) VALUES (13, '개발', '서울')";
			stmt = con.createStatement();
			int num = stmt.executeUpdate(sql);   // insert 후 레코드 갯수 리턴
			
			String sql2 = "INSERT INTO DEPT (DEPTNO,DNAME,LOC) VALUES ("+14+", '개발2', '서울2')";
			int num2 = stmt.executeUpdate(sql2);
			System.out.println("실행된 레코드 갯수 : "+(num+num2));
			
			// dml 사용한 경우 autoCommit : 자동 commit 실행
//			while (rs.next()) {
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				System.out.println(deptno + "\t" + dname + "\t" + loc);
//			}
			
//			while (rs.next()) {
//				int detpno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				System.out.println(deptno + "\t" + dname + "\t" + loc);
//				
//			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
