package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	
	static EmpDAO dao = new EmpDAO();

	public List<EmpDTO> select() {
	 SqlSession session = MySqlSessionFactory.getSession();
			 
	 List<EmpDTO> list = null; 
	 try {
      list = dao.select(session);
    	  
//      }catch(Exception e) {
//    	  e.printStackTrace();
      }finally {
		session.close();
      }
      return list;
	}//end select

	public int memberAdd(EmpDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num=0;
		try {
			num = dao.memberAdd(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}
	
	
	
}
