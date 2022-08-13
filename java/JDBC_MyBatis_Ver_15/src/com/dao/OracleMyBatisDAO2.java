package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO2 {

	public OracleMyBatisDAO2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Dept> selectAll2(SqlSession session) {
		List<Dept> list = session.selectList("selectAll2");
		return list;
	}

	

} // end class
