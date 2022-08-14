import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest_0 {

	public static void main(String[] args) {
		// 1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//접속정보
		String userid = "scott";//접속계정
		String passwd = "tiger";//패스워드
		//2. 드라이버로딩, 한번만 
		Connection con=null;
		Statement stmt= null;
		ResultSet rs= null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			
			//3. Connetion 연결 하기 , 접속완료 후 sql 실행 준비 

			 con= DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공: "+ con);
		
		//db와 접속 후 연결된 Connection리턴 
			//4. sql 문을 작성, 실행  - Statement , PreparedStatment 선택 이용 - Statement객체 이용
			String sql="select * from dept"; // sql 에 ; 이 빠짐 
			
			//5. Statement객체 얻고 sql 문 실행하기 
			stmt =con.createStatement();
			//sql문을 실행   - select : exectuQuery(), insert/update/delete: executeUpdate()
			rs= stmt.executeQuery(sql);//sql 실행 , select 결과를 ResultSet에 저장 
			//6. 데이터 출력
			while (rs.next()) {
			int deptno=	rs.getInt("deptno");
			String dname= rs.getString("dname");
		//	String loc = rs.getString("loc");
			String loc = rs.getString(3);
			System.out.println(deptno+"\t"+ dname+"\t"+ loc);				
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패 !!!!!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//7. 자원반납 
				if(rs != null)rs.close();
				if(stmt!= null)	 stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
