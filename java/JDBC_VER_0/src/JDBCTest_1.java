import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest_1 {

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
		// 2. db접속
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("Connection 연결 성공");
		// 3. sql문 작성
			String sql = "select * from dept where dname='SALES' ";  // sql문에 ; 없어야함  , 검색할때 문자열은 ''(작은따옴표) 표시
			String sql2 = "select deptno, dname, loc x from dept where dname='SALES' "; // 오류 : quoted string not properly terminated : ''(작은따옴표 오류)
			String search_dname = "SALES";
			String sql3 = "select deptno, dname, loc x from dept where dname='"+search_dname+"'"; // 오류 : invalid character : ;(세미클론 오류)
			System.out.println(sql3);  // sql문 출력 가능 - Statement의 장점.
		// 4. Statement 생성 및 명령 실행
			stmt = con.createStatement();
			rs=stmt.executeQuery(sql3); // sql문 실행한걸 rs로 받아줌
		// 5. 결과 출력
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				String loc = rs.getString("x");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패 !!!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		//6. 자원반납
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
