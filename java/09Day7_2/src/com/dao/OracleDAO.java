package com.dao;

public class OracleDAO implements DBDAO{  // 오라클 db 연동 클래스

	@Override
	public void connet() {
		System.out.println("OracleDAO.connect");
		
	} 


}
