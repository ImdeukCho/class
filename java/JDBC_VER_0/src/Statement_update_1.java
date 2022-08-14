import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_update_1 {

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
			
			String dname="영업";
			String loc="제주";
			int deptno=90;                // 80번 없는 부서를 업데이트할때 이셉션이 터지진 않고 실행된 레코드가 0개로 출력된다.
			
			// 90번 부서 업데이트 sql 작성
			String sql = "UPDATE dept set dname='"+dname+"', loc='"+loc+"' where deptno="+deptno;
			System.out.println(sql);
			
			stmt = con.createStatement();
			int num = stmt.executeUpdate(sql);   // 업데이트한 레코드 갯수 리턴
			System.out.println("실행된 레코드 갯수 : "+num);
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
