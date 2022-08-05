package com.service;

import com.dao.DBDAO;
import com.dao.MySQLDAO;
import com.dao.OracleDAO;

public class DBService { // Main에서 사용할 클래스
	DBDAO dao; // 다형성 가능
	
	public void setDAO(DBDAO dao) { // 다형성 가능
		this.dao = dao;
		this.dao.connet();; // 오버라이딩 함수
	}
}
