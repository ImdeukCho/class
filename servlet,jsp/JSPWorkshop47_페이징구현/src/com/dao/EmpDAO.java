package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import com.dto.EmpDTO;
import com.dto.PageDTO;

public class EmpDAO {
	
	public int totalCount(SqlSession session,HashMap<String, String> map) {
		return session.selectOne("com.dto.totalCount",map);
	}

	public PageDTO select(SqlSession session , HashMap<String, String> map, int curPage) {
	
		PageDTO pDTO = new PageDTO();		// perPage = 2
		int perPage = pDTO.getPerPage();   //한페이지 2개씩 
		int offset = (curPage - 1) * perPage; // 최초curPage=1, offset= 1페이지=0, 2페이지면 =2, 3페이지면 =4
		
		List<EmpDTO> list =  session.selectList("com.dto.selectAll" , map , new RowBounds(offset, perPage));
		//레코드 시작 번호, 읽어올 갯수 
		
		pDTO.setCurPage(curPage);//현재 페이지번호 1
		pDTO.setList(list);//페이지 에 해당 데이터 (0, 1)
		pDTO.setTotalCount(totalCount(session,map));//전체 레코드 갯수 저장 
		
		return pDTO;
	}
	
	public int insert(SqlSession session, EmpDTO dto) {
		int n =  session.insert("com.dto.insert" , dto );
		return n;
	}
	
	public EmpDTO retrieve(SqlSession session, int empno) {
		EmpDTO dto =  session.selectOne("com.dto.selectByEmpno" , empno);
		return dto;
	}
	
	public int update(SqlSession session, EmpDTO dto) {
		int n =  session.update("com.dto.update" , dto );
		return n;
	}
	
	public int delete(SqlSession session, int empno) {
		int n =  session.delete("com.dto.delete" , empno );
		return n;
	}
	
	public List<EmpDTO> order(SqlSession session , HashMap<String, String> map) {
		List<EmpDTO> list =  session.selectList("com.dto.order" , map);
		return list;
	}
	

	
	
}
