package workshop08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductManagerMain {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 접속정보
		String userid = "tester";// 접속계정
		String passwd = "tester";// 패스워드
		
		Connection con = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("매출 조회 메뉴 - [ 매출 일자순 : 1, 상품별 매출순 : 2 ]: ");
			int menu = scan.nextInt();

			if (menu==1) {
				sql = "SELECT TO_CHAR(odate, 'YYYY-MM-DD') 영업일, sum(o.quantity*p.price) 매출"
						+ " FROM D7_ORDER o JOIN D7_PRODUCT p using(PID) GROUP BY odate order by 1";
			} else if(menu==2) {
				sql = "SELECT pname 상품명, sum(o.quantity*p.price) 매출"
						+ " FROM D7_ORDER o JOIN D7_PRODUCT p using(PID) GROUP BY pname order by 2 desc";
			}
			
			
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("------------------------------------------");
			System.out.println(((menu==1)?"영업일":"상품명")+"\t\t\t매출");
			System.out.println("------------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
			}
			System.out.println("------------------------------------------");			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
	}

}

