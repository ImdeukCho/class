package com.main;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.service.OracleService;

public class OralceMain {

	public static void main(String[] args) {
		OracleService service = new OracleService();
		
		ArrayList<Dept> list=null;
			try {
				list = service.select();
				for (Dept dept : list) {
					System.out.println(dept);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}

}
