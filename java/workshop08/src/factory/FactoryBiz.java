package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class FactoryBiz {
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	
	public FactoryBiz() {
		super();
	}
	public FactoryBiz(String driver, String url, String user, String pass) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ===================");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<FactoryDTO> getFactoryAll() {
		FactoryDAO dao = new FactoryDAO(); //////////////////////////////////////
		Connection con = null;
		ArrayList<FactoryDTO> list = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			list = dao.getFactoryAll(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
