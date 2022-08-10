package com.employee.biz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.CommonUtil;
import com.employee.dao.EmployeeDAO;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;

public class EmployeeBiz implements IEmployeeBiz {//tester.Employee테이블 만 사용할 
	//biz클래스 임

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "tester";
	private String pass = "tester";

	private EmployeeDAO dao;

	public EmployeeBiz() {
		dao = new EmployeeDAO();

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 사원 목록 보기
	@Override
	public ArrayList<Employee> selectAllEmployee() {
		ArrayList<Employee> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			list = dao.selectAllEmployee(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}

	// 사원정보 검색하기
	@Override
	public ArrayList<Employee> searchList(String inputSubMenu, String searchWord) throws DataNotFoundException {
		ArrayList<Employee> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			list = dao.searchList(con, inputSubMenu, searchWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}// end printSearchList

	@Override
	public int createEmployeeNum() {//사원번호 생성 

		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			n = dao.createEmployeeNum(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return n;
	}

	// 새로운 사원 생성
	@Override
	public void employeeInsert(Employee emp) {

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			dao.employeeInsert(con, emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	// 사원 수정
	@Override
	public void employeeUpdate(Employee emp) throws DataNotFoundException {

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			dao.employeeUpdate(con, emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}// end employeeUpdate

	// 사원 삭제
	@Override
	public void employeeDelete(int empno) throws DataNotFoundException {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			dao.employeeDelete(con, empno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}// end employeeDelete

	// 근태관리( 외출/출장/휴가/근무) 수정 
	@Override
	public void employeeService(int empno, String inputColumn) throws DataNotFoundException {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			dao.employeeService(con, empno, inputColumn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

}// end class
