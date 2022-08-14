import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {
		// 1. 4가지 정보
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
				String userid = "scott";// 접속계정
				String passwd = "tiger";// 패스워드

				Connection con = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				String name="RESEARCH";
				
				try {
					Class.forName(driver);
					System.out.println("드라이버 로딩 성공");
					con = DriverManager.getConnection(url, userid, passwd);
					System.out.println("db 접속 성공");
					// sql문에 변수 붙여서 조건 설정
					String sql = "select deptno x,dname,loc from dept where dname = '"+name+"'";        
					System.out.println(sql);
					stmt = con.createStatement();
					rs = stmt.executeQuery(sql);

					// 출력부분에서 컬럼 이름 부분 출력
					ResultSetMetaData mrs = rs.getMetaData();
					int count = mrs.getColumnCount();
					for (int i = 1; i <= count; i++) {
						System.out.print(mrs.getColumnName(i)+"\t");
					}
					System.out.println();
					System.out.println("==========================================");
					
					while (rs.next()) {
						int deptno = rs.getInt(1);
						String dname = rs.getString(2);
						String loc = rs.getString(3);
						System.out.println(deptno + "\t" + dname + "\t" + loc);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (rs != null)
							rs.close();
						if (stmt != null)
							stmt.close();
						if (con != null)
							con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}

				}

	}

}
