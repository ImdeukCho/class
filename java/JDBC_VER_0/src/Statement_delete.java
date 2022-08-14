import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_delete {

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
			

			int deptno=90;                

			// 90번 부서 delete sql 작성
			String sql = "DELETE FROM dept where deptno="+deptno;
			System.out.println(sql);
//			
			stmt = con.createStatement();
			int num = stmt.executeUpdate(sql);   // 업데이트(삭제)한 레코드 갯수 리턴
			System.out.println("실행된 레코드 갯수 : "+num);
//	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
