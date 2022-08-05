package com.service;

import com.dao.MySQLDAO;
import com.dao.OracleDAO;

public class DBService { // Main에서 사용할 클래스
	OracleDAO dao;
	
//	public void setDAO(MySQLDAO dao) {
//		this.dao = dao;
//		this.dao.connectMySQL();
		
	public void setDAO(OracleDAO dao) {
		this.dao = dao;
		this.dao.connectOracle();
	}
}
