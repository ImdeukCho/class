package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dao.OracleMyBatisDAO2;
import com.dto.Dept;

public class OracleMyBatisService2 {
	
	OracleMyBatisDAO2 dao2;

	public OracleMyBatisService2() {
		super();
		// TODO Auto-generated constructor stub
		dao2 = new OracleMyBatisDAO2();
	}

	public List<Dept> selectAll2() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao2.selectAll2(session);
		} finally {
			session.close();
		}
		return list;
	}



	


	
} // end class
