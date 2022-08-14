package com.simpeDAO;

import java.util.ArrayList;

public class JDBCTest {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		dao.selecetAllDept();
		System.out.println("==========================");
		ArrayList<DeptDTO> list = dao.selecetAllDept2();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		
		// 1.
//		dao.insertDept(99, "서울", "부산");
	
		// 2.
//		dao.insertDept(new DeptDTO(99, "영업", "부산"));
		int num = dao.insertDept2(new DeptDTO(99, "영업", "부산"));
		System.out.println("insert 갯수 : "+num);
		dao.selecetAllDept();
	}

}
