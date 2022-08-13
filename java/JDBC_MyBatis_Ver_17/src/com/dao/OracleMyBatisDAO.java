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

	public List<HashMap> selectAll2(SqlSession session) {
		List<HashMap> list = session.selectList("selectAll3"); // selectAll2 함수가 있어서 3으로 함.
		return list;
	}

	

} // end class
