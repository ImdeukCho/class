package com.service;

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
		dao = new OracleMyBatisDAO();
	}

	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
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
		Dept d = null;
		try {
			d = dao.selectByDeptno(session,deptno);
		} finally {
			session.close();
		}
		return d;
	}

	public HashMap selectByDeptnoHashMap(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		HashMap map = null;
		try {
			map = dao.selectByDeptnoHashMap(session,deptno);
		} finally {
			session.close();
		}
		return map;
	}
	
	
	
	

	
	
} // end class
