package com.main;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exeception.RecordNotFoundException;
import com.service.OracleTXService;

public class OralceTXMain2 {

	public static void main(String[] args) {

		OracleTXService service = new OracleTXService();
		
		
//		// 2.insert
//		int deptno = 99;
//		String dname = "개발";
//		String loc = "제주";
//		Dept xx = new Dept(deptno,dname,loc);
//		int num = service.insert(xx);
//		System.out.println("추가된 갯수 : " + num);
		
//		// 3.update
//		Dept xx2 = new Dept(99, "경제", "서울");
//		try {
//			service.update(xx2);  
//		} catch (RecordNotFoundException e1) {
//			System.out.println(e1.getMessage());     // update 레코드 갯수가 0인 경우 강제에러메세지 출력
//		}
		
//		// 4.delete
//		service.delete(99);
		
		
		// 5.insertDeltet
//		service.insert(new Dept(99, "개발", "제주"));
		service.insertDeltet(new Dept(99, "개발", "제주"), 88);
		
		
		// 1.select
		try {
			ArrayList<Dept> list = service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		
		
	}
}
