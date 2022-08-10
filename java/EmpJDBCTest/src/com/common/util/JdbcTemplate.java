package com.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String user = "scott";
	public static String pass = "tiger"; 
	
	public JdbcTemplate() {  // 기본생성자 안에서 드라이버 로딩
		try {
			Class.forName(driver);
			System.out.println("jdbcTemplate 드라이버 로딩 성공=========");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// Connection을 연결한 후 멤버 attribute 인 conn에 Connection 객체를 세팅한 후 리턴한다.
	public static Connection getConnection() { // Connection연결, static설정이므로 static변수만 사용가능. 일반변수사용 못함
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pass);
			conn.setAutoCommit(false); //////////////////////////////// 커넥션 생성할때 자동커밋중지
		} catch (Exception e) {
			System.out.println("[JdbcTemplate.getConnection] : " + e.getMessage());
			e.printStackTrace();
		}
		return conn;  // db연결, AutoCommit(false) - 반드시 commit, rollback 실행해야 함.
	}
	
	// DB와 연결 되었는지 여부를 리턴한다.
	public static boolean isConnection(Connection conn) {
		boolean validConnection = true; // db와 연결이 되어있다
		try {
			if(conn == null || conn.isClosed())
				validConnection = false;  // db와 연결이 끊겨있다
		} catch(SQLException e) {
			validConnection = false; ///////
			e.printStackTrace();
		}
		return validConnection;
		
	}
	
	// Connection 객체를 시스템에 반환한다.
	public static void close(Connection conn) { 
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Statement 객체를 시스템에 반환한다.
	public static void close(Statement stmt) {  // PreparedStatement(자식) Statement(부모) 상속관계이므로 대신 대체가능
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ResultSet 객체를 시스템에 반환한다.
	public static void close(ResultSet rset) { 
		try {
			if(rset != null) rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 지금까지의 트랜잭션을 Commit 처리한다.
	public static void commit(Connection conn) { 
		try {
			if(isConnection(conn)) {
				conn.commit();
				System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 지금까지의 트랜잭션을 Rollback 처리한다.
		public static void rollback(Connection conn) { 
			try {
				if(isConnection(conn)) {
					conn.rollback();;
					System.out.println("[JdbcTemplate.rollback] : DB Successfully Rollback!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
} // end class
