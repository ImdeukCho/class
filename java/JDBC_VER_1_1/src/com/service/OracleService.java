package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;
import com.exeception.RecordNotFoundException;

public class OracleService {
	OracleDAO dao;

	public OracleService() {
		dao = new OracleDAO();
	}

	public ArrayList<Dept> select() throws SQLException {
		ArrayList<Dept> list = null;
		list = dao.select();
		return list;
	}

	public int insert(Dept xx) {        // insert 갯수 리턴
		int num = dao.insert(xx);        
		return num;
	}

	public void update(Dept xx) throws RecordNotFoundException {
		dao.update(xx);
	}

	public void delete(int i) {
		dao.delete(i);	
	}

}
