package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("selectAll");
		return list;
	}

	public void insert(SqlSession session, Dept dept) {
		int num = session.insert("insert",dept);
		System.out.println("insert한 레코드 갯수 : "+num);
	}

	public void update(SqlSession session, Dept dept) {
		int num = session.update("update",dept);
		System.out.println("update한 레코드 갯수 : "+num);
	}

	public void delete(SqlSession session, int i) {
		int num = session.update("delete",i);
		System.out.println("delete한 레코드 갯수 : "+num);
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept d = session.selectOne("selectByDeptno",deptno);
		return d;
	}

	public HashMap selectByDeptnoHashMap(SqlSession session, int deptno) {
		HashMap map = session.selectOne("selectByDeptnoHashMap",deptno);
		return map;
	}


} // end class
