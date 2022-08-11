package com.service;

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


	

	public List<Dept> selectAll() { // Connection 대신 SqqlSession사용
		SqlSession session = MySqlSessionFactory.getSqlSession(); 
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}
	
	
	
} // end class
