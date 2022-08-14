import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_PreparedStetemnet_Test {

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
			
//			String sql = "select deptno x,dname,loc from dept where deptno =?";       // 1. sql작성
			String sql = "select deptno x,dname,loc from dept where dname =?";          // 문) dname = 'SALES' 부서 select preparedStatement 작성

			pstmt = con.prepareStatement(sql);         // 2. sql문 이용 PreparedStatement 생성
//			pstmt.setInt(1, 10);                       // 3. ? 설정
			pstmt.setString(1, "SALES");                 // 문자열형이므로 setString로 변경.
//			pstmt.setString(2, "SALES");                   // 오류 : SQLException: 부적합한 열 인덱스 : 없는 ? 인덱스 설정 오류
//			pstmt.setInt(1, "SALES");                      // 오류 : 컴파일오류 : setInt인데 문자엻형으로 조건지정
			rs= pstmt.executeQuery();                  // 4. sql 실행 
//			rs= pstmt.executeQuery(sql);               // 오류 : SQLException : unsupported network datatype or representation : 29행에서 sql문 이용 pstmt를 선언했으므로 쿼리안에 또 sql문 가져올 필요가없다.
			
			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
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
