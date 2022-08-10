package com.biz;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {
	
	EmpDAO dao;
	JdbcTemplate template;
	public EmpBiz() {
		dao = new EmpDAO(); // dao 생성
		template = new JdbcTemplate(); // template 생성 -> 드라이버 로딩
	
	}
	public ArrayList<EmpDTO> selectAllEmp() {
		Connection con = JdbcTemplate.getConnection();  // 연결된 con을 받아옴
		ArrayList<EmpDTO> list = dao.selectAllEmp(con); 
		JdbcTemplate.close(con); // 연결된 con을 보내서 close함.
		return list;
	}
	public EmpDTO selectDetailEmp(String s) throws DataNotFoundException {
		Connection con = JdbcTemplate.getConnection();
		EmpDTO dto = dao.selectDetailEmp(con,s);
		JdbcTemplate.close(con);
		return dto;
	}
	public void empInsert(EmpDTO xx) throws DataNotFoundException {
		Connection con = JdbcTemplate.getConnection();
		dao.empInsert(con,xx);
		JdbcTemplate.commit(con);  // commit 중지된 상태로 오니까 commit 해줘야한다!!
		JdbcTemplate.close(con);
	}
	public ArrayList<EmpDTO> selectDetailEmp2(HashMap<String, String> map) {
		Connection con = JdbcTemplate.getConnection();  // 연결된 con을 받아옴
		ArrayList<EmpDTO> list = dao.selectDetailEmp2(con,map); 
		JdbcTemplate.close(con); // 연결된 con을 보내서 close함.
		return list;
	}
	public void empUpdate(EmpDTO xx) throws DataNotFoundException {
		Connection con = JdbcTemplate.getConnection();
		dao.empUpdate(con,xx);
		JdbcTemplate.commit(con);  // commit 중지된 상태로 오니까 commit 해줘야한다!!
		JdbcTemplate.close(con);
	}
	public void empDelete(String s) throws DataNotFoundException {
		Connection con = JdbcTemplate.getConnection();
		dao.empDelete(con,s);
		JdbcTemplate.commit(con);  // commit 중지된 상태로 오니까 commit 해줘야한다!!
		JdbcTemplate.close(con);
	}
	
}
