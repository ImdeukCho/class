package com.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {
	
	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();
	}

	public List<Dept> selectAll() { // Connection 대신 SqlSession사용, 리스트 여러개 뽑을 경우
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}
	
	public Dept selectAll2() { // 리스트 하나만 뽑을경우 dept로 뽑아도 된다.
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		Dept d = null;
		try {
			d = dao.selectAll2(session);
		}finally {
			session.close();
		}
		return d;
	}

	public void insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, dept);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void update(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.update(session, dept);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void delete(int i) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete(session, i);
			session.commit();
		} finally {
			session.close();
		}	
	}

	public Dept selectByDeptno(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		Dept dept = null;
		try {
			dept = dao.selectByDeptno(session, deptno);
		}finally {
			session.close();
		}
		return dept;
	}

	public int deptRecourdCount() {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		int num = 0;
		try {
			num = dao.deptRecourdCount(session);
		}finally {
			session.close();
		}
		return num;
	}

	public HashMap selectByDeptnoHashmap(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		HashMap map = null;
		try {
			map = dao.selectByDeptnoHashmap(session, deptno);
		}finally {
			session.close();
		}
		return map;
	}

	public List<Dept> selectByHashmap(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.selectByHashmap(session,map);
		}finally {
			session.close();
		}
		return list;
	}

	public List<Dept> selectDynamicDeptno(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session,map);
		}finally {
			session.close();
		}
		return list;
	}

	public List<Dept> selectDynamicChoose(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.selectDynamicChoose(session,map);
		}finally {
			session.close();
		}
		return list;
	}

	public List<Dept> multiSelect(List<Integer> deptnoes) {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.multiSelect(session,deptnoes);
		}finally {
			session.close();
		}
		return list;
	}

	public void multiUpdate(List<Integer> deptnoes2) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiUpdate(session, deptnoes2);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void multiDelete(List<Dept> depts) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiDelete(session, depts);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void multiInsert(List<Dept> depts) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiInsert(session, depts);
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void multiInsert2(List<Dept> depts) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			for (Dept dept : depts) {
				dao.insert(session, dept);   // for문 이용 다중 insert , depts객체에서 dept를 꺼내 여러번돌린다.
			}
			session.commit();
		} finally {
			session.close();
		}
	}

	public List<Dept> selectTopN(int i, int j) {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.selectTopN(session,i,j);
		}finally {
			session.close();
		}
		return list;
	}
	
	// 오버로딩
	public List<Dept> selectTopN(String loc, int i, int j) {  // loc 오버로딩
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.selectTopN(session,loc,i,j);  // loc 오버로딩
		}finally {
			session.close();
		}
		return list;
	}
	
	public String getDate() {
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		String date = null;
		try {
			date = dao.getDate(session);
		}finally {
			session.close();
		}
		return date;
	}




	


	
} // end class
