package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {
	OracleDAO dao;

	public OracleService() {
		dao = new OracleDAO();
	}

	public ArrayList<Dept> select() throws SQLException{
		ArrayList<Dept> list=null;
//		try {
			list = dao.select();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return list;
	}
	
	
}
