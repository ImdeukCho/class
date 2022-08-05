package com.dao;

public class MySQLDAO implements DBDAO {  // MySQL db 연동 클래스

	@Override
	public void connet() { 
		System.out.println("MySQLDAO.connect");
	} 

}
