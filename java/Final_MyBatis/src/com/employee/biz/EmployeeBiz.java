package com.employee.biz;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;

public class EmployeeBiz implements IEmployeeBiz {

	// 사원 목록 보기
	@Override
	public List<Employee> selectAllEmployee() {
		List<Employee> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			List<HashMap<String, Object>> list2 = session.selectList("employee.selectAllEmployee");
			System.out.println(">>>>" + list2.size());
			for (HashMap<String, Object> m : list2) {
				int empno = ((BigDecimal) m.get("EMPNO")).intValue();
				String ename = (String) m.get("ENAME");
				String hiredate = (String) m.get("HIREDATE");
				String loc = (String) m.get("LOC");
				int sal = ((BigDecimal) m.get("SAL")).intValue();
				String state = (String) m.get("STATE");
				// System.out.println(empno+"\t"+ename+"\t"+hiredate+"\t"+loc+"\t"+sal+"\t"+state);
				if (m.get("DNAME").equals("영업")) {
					Sales s = new Sales(empno, ename, hiredate, loc, sal, state, sal * Sales.COMMISSION_RATE);
					list.add(s);
				} else {
					Engineer eng = new Engineer(empno, ename, hiredate, loc, sal, state);
					list.add(eng);
				}

			}
		} finally {
			session.close();
		}
		return list;
	}

	// 사원정보 검색하기
	@Override
	public List<Employee> searchList(String inputSubMenu, String searchWord) throws DataNotFoundException {
		/*
		 * 1.사번 검색 2.이름 검색 3.부서 검색 4.근무지 검색 5.연봉 검색
		 */
		List<Employee> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			HashMap<String, String> xxx = new HashMap<>();
			xxx.put("inputSubMenu", inputSubMenu.trim());
			xxx.put("searchWord", searchWord.trim());
			System.out.println(inputSubMenu + "\t" + searchWord);
			List<HashMap<String, Object>> map = session.selectList("employee.searchList", xxx);  // value값은 Object로 설정
			System.out.println(">>>>" + map.size());
			for (HashMap<String, Object> m : map) {
				int empno = ((BigDecimal) m.get("EMPNO")).intValue();    //BigDecimal사용 int형변환
				String ename = (String) m.get("ENAME");
				String hiredate = (String) m.get("HIREDATE");
				String loc = (String) m.get("LOC");
				int sal = ((BigDecimal) m.get("SAL")).intValue();
				String state = (String) m.get("STATE");
				// System.out.println(empno+"\t"+ename+"\t"+hiredate+"\t"+loc+"\t"+sal+"\t"+state);
				if (m.get("DNAME").equals("영업")) {
					Sales s = new Sales(empno, ename, hiredate, loc, sal, state, sal * Sales.COMMISSION_RATE);
					list.add(s);
				} else {
					Engineer eng = new Engineer(empno, ename, hiredate, loc, sal, state);
					list.add(eng);
				}

			}
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
		return list;
	}// end printSearchList

	@Override
	public int createEmployeeNum() {
		int num = 0;

		SqlSession session = MySqlSessionFactory.getSession();
		try {
			num = session.selectOne("employee.createEmployeeNum");

		} finally {
			session.close();
		}
		return num;
	}

	// 새로운 사원 생성
	@Override
	public void employeeInsert(Employee emp) {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			HashMap<String, Object> m = new HashMap<>();
			m.put("empno", emp.getEmpno());
			m.put("ename", emp.getEname());
			m.put("hiredate", emp.getHiredate());
			m.put("loc", emp.getLoc());
			m.put("sal", emp.getSal());
			m.put("state", emp.getState());
			if (emp instanceof Sales) {
				m.put("dname", "영업");
			} else {
				m.put("dname", "개발");
			}
			int n = session.insert("employee.employeeInsert", m);
			
			session.commit();
		} finally {
			session.close();
		}
	}

	// 사원 수정
	@Override
	public void employeeUpdate(Employee emp) throws DataNotFoundException {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			HashMap<String, Object> m = new HashMap<>();
			m.put("empno", emp.getEmpno());
			m.put("ename", emp.getEname());
			m.put("hiredate", emp.getHiredate());
			m.put("loc", emp.getLoc());
			m.put("sal", emp.getSal());
			m.put("state", emp.getState());
			if (emp instanceof Sales) {
				m.put("dname", "영업");
			} else {
				m.put("dname", "개발");
			}
			int n = session.update("employee.employeeUpdate", m);
			
			session.commit();
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
	}// end employeeUpdate

	// 사원 삭제
	@Override
	public void employeeDelete(int empno) throws DataNotFoundException {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			int n = session.delete("employee.employeeDelete", empno );
			session.commit();
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
	}// end employeeDelete

	// 근태관리( 외출/출장/휴가/근무)
	@Override
	public void employeeService(int empno, String inputColumn) throws DataNotFoundException {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			HashMap<String, Object> map = new  HashMap<>();
			map.put("empno", empno);
			map.put("inputColumn", inputColumn);
		  int n = session.update("employeeService", map);
		  session.commit();
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
	}

}// end class
