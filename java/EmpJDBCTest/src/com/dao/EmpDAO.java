package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpDAO {

	public ArrayList<EmpDTO> selectAllEmp(Connection con) {
		ArrayList<EmpDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno,ename,job,mgr,to_char(hiredate,'YYYY-MM-DD') hiredate, sal,comm,deptno from emp "
					+ "order by empno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				EmpDTO notice = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(notice);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	public EmpDTO selectDetailEmp(Connection con, String s) throws DataNotFoundException {
		EmpDTO dto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno,ename,job,mgr,to_char(hiredate,'YYYY-MM-DD') hiredate, sal,comm,deptno from emp "
					+ " where empno = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(s)); //// 형변환
			rs = pstmt.executeQuery();
			if (rs.next()) {  // if 사용
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				dto = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			}else { // rs.next() false인 경우
				throw new DataNotFoundException(s+"에 해당하는 사원정보가 없습니다. 확인후 다시 조회하세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return dto;
	}

	public void empInsert(Connection con, EmpDTO xx) throws DataNotFoundException {
//		ArrayList<EmpDTO> list = new ArrayList<>();  // 필요없음
		PreparedStatement pstmt = null;
		int num=0;
		try {
			String sql = "insert into emp values (?,?,?,?,SYSDATE,?,?,?) ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, xx.getEmpno());
			pstmt.setString(2, xx.getEname());
			pstmt.setString(3, xx.getJob());
			pstmt.setInt(4, xx.getMgr());
			pstmt.setDouble(5, xx.getSal());
			pstmt.setDouble(6, xx.getCom());
			pstmt.setInt(7, xx.getDeptno());
			num=pstmt.executeUpdate();
			System.out.println("insert 실행결과 : "+num);	
			if(num==0) {
				throw new DataNotFoundException("추가 실패");          // 추가실패시 강제에러 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	}

	public ArrayList<EmpDTO> selectDetailEmp2(Connection con, HashMap<String, String> map) {
		String job = map.get("job");        //map에서 저장된값 꺼내오기1
		String no = map.get("deptno");      //map에서 저장된값 꺼내오기2
		int deptno = Integer.parseInt(no);  //형변환
		System.out.println("dap map : "+job+"\t"+deptno);//2개의 값 출력해보기
		ArrayList<EmpDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno,ename,job,mgr,to_char(hiredate,'YYYY-MM-DD') hiredate, sal,comm,deptno from emp "
					+ "where job = ? and deptno = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, job);          //조건 설정1
			pstmt.setInt(2, deptno);          //조건 설정2
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String ejob = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int edeptno = rs.getInt(8);
				EmpDTO notice = new EmpDTO(empno, ename, ejob, mgr, hiredate, sal, comm, edeptno);
				list.add(notice);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	public void empUpdate(Connection con, EmpDTO xx) throws DataNotFoundException{	
		PreparedStatement pstmt = null;
		int num=0;
		try {
			String sql = "update emp set ename=?, job =? where empno=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx.getEname());
			pstmt.setString(2, xx.getJob());
			pstmt.setInt(3, xx.getEmpno());
			num=pstmt.executeUpdate();
			System.out.println("update 실행결과 : "+num);	
			if(num==0) {
				throw new DataNotFoundException("업데이트 실패");          // 업데이트실패시 강제에러 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	}

	public void empDelete(Connection con, String s) throws DataNotFoundException {
		PreparedStatement pstmt = null;
		int num=0;
		try {
			String sql = "DELETE from emp where empno =? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(s));
			num=pstmt.executeUpdate();
			System.out.println("DELETE 실행결과 : "+num);	
			if(num==0) {
				throw new DataNotFoundException("삭제 실패");          // 업데이트실패시 강제에러 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		
	}

	
	
	
} // end class
