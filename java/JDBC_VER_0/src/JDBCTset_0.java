import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTset_0 {

	public static void main(String[] args) {
	// 1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속정보 , SID는 xe임
		String userid = "scott"; // 접속계정
		String passwd = "tiger"; // 패스워드
		
	// 2. 드라이버 로딩, 한번만 하면 됨.
		Connection con = null; // db 접속할때 필요
		Statement stmt = null; // 
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			
	// 3. Connection 연결 하기 , 접속완료 후 sql 실행 준비
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공 : " +con);
		// db와 접속 후 연결된 Connection 리턴
			
	// 4. SQL문 작성 ( 주의할 점은 sql문에 ;(세미콜론)은 사용안함 )
	// sql문을 작성 , 실행 - Statement , PreparedStatement 선택 사용 - Statement객체 이용
			String sql = "select * from dept"; // sql 에 ; 이 빠져야함.
			
	// 5. Statement객체 얻고 sql문 실행하기
			stmt = con.createStatement();
			
			// sql문을 실행 - select               : exctuQuer()
			//           - insert/update/delete : executeUpdate()
			rs = stmt.executeQuery(sql); // sql 실행 , select 결과를 ResultSet에 저장
			
	// 6. 데이터 출력
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				String loc = rs.getString(3);     //  idx번호로도 실행 가능.
				System.out.println(deptno +"\t"+dname +"\t"+ loc);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패 !!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
	// 7. 명령어 닫기.	
		} finally {
			try {
				if(rs != null) rs.close();             // 입력할때 순서 con -> stmt -> rs
				if(stmt != null) stmt.close();         // 닫을때는 순서 반대로 rs -> stmt -> con
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
