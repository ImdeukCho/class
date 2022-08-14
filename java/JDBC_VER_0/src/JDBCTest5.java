import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest5 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
		String userid = "scott";// 접속계정
		String passwd = "tiger";// 패스워드
		
		Connection con = null;
		PreparedStatement pstmt = null;                       // PreparedStatement 사용
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공");
			
			// 14번 부서 삭제 후 전체 select sql 실행 하여 확인
			String sql = "DELETE FROM dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 14);
			
			int num = pstmt.executeUpdate();
			System.out.println("삭제된 데이터 : " + num);
			
			// 전체 select sql 작성, 전체 출력
			String sql2 = "select * from dept";
			pstmt = con.prepareStatement(sql2);           // prepareStatement 다시 작성.
			rs=pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
