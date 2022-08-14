import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
		String userid = "scott";// 접속계정
		String passwd = "tiger";// 패스워드
		
		Connection con = null;
		PreparedStatement pstmt = null;                       // PreparedStatement 사용

		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공");
			
			String sql = "insert into dept (deptno,dname,loc)"
					+ " values(?,?,?)";
			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, 13);
			pstmt.setString(1, "13");  // 문자형으로 13설정하면 추가되나? 추가됨.
			pstmt.setString(2, "개발2");
			pstmt.setString(3, "서울2");
			
			int num = pstmt.executeUpdate();
			System.out.println("insert 갯수 : " + num);
			
			pstmt.setInt(1, 14);
			pstmt.setString(2, "개발2");
			pstmt.setString(3, "서울2");
			int num2 = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수 : " + (num+num2));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
