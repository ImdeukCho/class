import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Insert_1 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
		String userid = "scott";// 접속계정
		String passwd = "tiger";// 패스워드
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공");
			
			int deptno=90;
			String deptname="개발";
			String loc="서울";
			
			String sql = "INSERT INTO DEPT (DEPTNO,DNAME,LOC) VALUES ("+deptno+",'"+deptname+"','"+loc+"')";
			
			System.out.println(sql);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);   // insert 후 레코드 갯수 리턴
			
			String sql2 = "SELECT deptno, dname, loc FROM DEPT";
			rs = stmt.executeQuery(sql2);
			System.out.println("실행된 레코드 갯수 : "+result);
			System.out.println("======================");
			
			// dml 사용한 경우 autoCommit : 자동 commit 실행
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
