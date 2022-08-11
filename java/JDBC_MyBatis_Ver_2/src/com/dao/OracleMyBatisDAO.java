package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Dept> selectAll(SqlSession session) {
		// Mapper에 매칭되는 id를 찾아서 sql 문 수행
		// <select id="selectAll" resultType="com.dto.Dept">
		// selectOne() : 결과가 한개인 경우 , selectList() : 결과 여러개 , insert(), update(), delete()
		 List<Dept> list = session.selectList("selectAll"); // Mapper의 sql문의 id가 들어감
		return list;
	}
	
} // end class
