package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {
	
	public EmpDTO retrieve(SqlSession session, int empno) {
		EmpDTO dto =  session.selectOne("com.dto.selectByEmpno" , empno);
		return dto;
	}
	
	public List<EmpDTO> select(SqlSession session, HashMap<String,String> map) {
		System.out.println(map);
		List<EmpDTO> list =  session.selectList("com.dto.selectAll",map);
		return list;
	}
	
	public int insert(SqlSession session, EmpDTO dto) {
		int n =  session.insert("com.dto.insert" , dto );
		return n;
	}
	
	public int update(SqlSession session, EmpDTO dto) {
		int n =  session.insert("com.dto.update" , dto );
		return n;
	}

	public int delete(SqlSession session, EmpDTO dto) {
		int n =  session.delete("com.dto.delete" , dto );
		return n;
	}

	public List<EmpDTO> order(SqlSession session, HashMap<String,String> map) {
		List<EmpDTO> list =  session.selectList("com.dto.selectOrder", map);////
		return list;
	}
}
