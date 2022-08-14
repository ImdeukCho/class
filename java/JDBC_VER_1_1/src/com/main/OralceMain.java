package com.main;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exeception.RecordNotFoundException;
import com.service.OracleService;

public class OralceMain {

	public static void main(String[] args) {

		OracleService service = new OracleService();
		
//		// insert , 추가한 레코드 갯수 main에서 출력
//		Dept xx = new Dept(99, "영업","서울");
//		int num = service.insert(xx);
//		System.out.println("추가 갯수 : " + num);
		
//		//update , 강제오류 메세지 설정 후 main에서 출력
//		Dept xx2 = new Dept(14, "제경", "부산");
//		try {
//			service.update(xx2);
//		} catch (RecordNotFoundException e1) {
//			System.out.println(e1.getMessage());   // dao에서 설정한 메세지로 출력
//		}
		
		// delete , 삭제 후 dao에서 삭제 갯수 출력
		service.delete(99);
		
		
		
//		// 전체 출력
//		ArrayList<Dept> list = null;/////////////////////////////////////////////////////
//		try {
//			list = service.select();/////////////////////////////////////////////////////
//			for (Dept dept : list) {
//				System.out.println(dept);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
}
