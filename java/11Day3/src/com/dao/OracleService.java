package com.dao;

import java.util.HashSet;

public class OracleService {
	
	OracleDAO dao;
	
	public OracleService() {
		dao = new OracleDAO();
	}
	
	public HashSet<String> select(){
		HashSet<String> xxx = dao.select();
		return xxx;
	}
}
