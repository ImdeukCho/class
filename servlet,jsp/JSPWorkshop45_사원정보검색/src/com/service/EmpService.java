package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	
	public EmpDTO retrieve(int empno) {
		 EmpDAO dao = new   EmpDAO();
		 SqlSession session = MySqlSessionFactory.getSession();
		 EmpDTO dto = null;
		 try {
			 dto = dao.retrieve(session,empno);
	    	  
//	      }catch(Exception e) {
//	    	  e.printStackTrace();
	      }finally {
			session.close();
	      }
	      return dto;
		}//end select
	

	public List<EmpDTO> select(String searchName, String searchValue) {////
		
		HashMap<String, String> map = new HashMap<>();
		map.put("searchName", searchName);////
		map.put("searchValue", searchValue);////
		
		 EmpDAO dao = new   EmpDAO();
		 SqlSession session = MySqlSessionFactory.getSession();
		 List<EmpDTO> list = null;
		 try {
	      list = dao.select(session, map);///
	    	  
//	      }catch(Exception e) {
//	    	  e.printStackTrace();
	      }finally {
			session.close();
	      }
	      return list;
	}
	public int insert(EmpDTO dto) {
		 EmpDAO dao = new   EmpDAO();
		 SqlSession session = MySqlSessionFactory.getSession();
		 int n = 0; 
		 try {
	      n = dao.insert(session, dto);
	       session.commit();	  
//	      }catch(Exception e) {
//	    	  e.printStackTrace();
	      }finally {
			session.close();
	      }
	      return n;
		}//end select
	


	public int update(EmpDTO dto) {
		EmpDAO dao = new   EmpDAO();
		 SqlSession session = MySqlSessionFactory.getSession();
		 int n = 0; 
		 try {
	      n = dao.update(session, dto);
	       session.commit();	  
//	      }catch(Exception e) {
//	    	  e.printStackTrace();
	      }finally {
			session.close();
	      }
	      return n;
	}//end select

	public int delete(EmpDTO dto) {
		EmpDAO dao = new   EmpDAO();
		 SqlSession session = MySqlSessionFactory.getSession();
		 int n = 0; 
		 try {
	      n = dao.delete(session, dto);
	       session.commit();	  
//	      }catch(Exception e) {
//	    	  e.printStackTrace();
	      }finally {
			session.close();
	      }
	      return n;
		
	}

	
	
}
