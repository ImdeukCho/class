package com.dao;

import java.util.Set;

public class OracleService {
	
	OracleDAO dao;
	
	public OracleService() {
		dao = new OracleDAO();
	}
	
	public Set<String> select(){
		Set<String> set = dao.select();  // 방법1
		return set;
//		return dao.select();             // 방법2
	}
}
