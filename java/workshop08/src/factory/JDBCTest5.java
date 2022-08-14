package factory;

import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCTest5 {

	public static void main(String[] args) throws SQLException {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "tester";
		String pass = "tester";
		FactoryBiz biz = new FactoryBiz(driver,url,user,pass);
		
		ArrayList<FactoryDTO> list = biz.getFactoryAll();	
		System.out.println("공장번호 \t\t 공장명 \t\t 공장위치");
		System.out.println("---------------------------------------------");

		for (FactoryDTO dto : list) {
			System.out.printf("%s\t%s\t\t%s\n",dto.getFactNo(),dto.getFacName(),dto.getFacLoc());   // printf 방법
//			System.out.println(dto);                                                                // println 방법1
//			System.out.println(dto.getFactNo()+"\t"+dto.getFacName()+"\t"+dto.getFacLoc());         // println 방법2
		}
	}
}
