package com.dao;

import java.util.Iterator;
import java.util.Set;

public class OracleMain {

	public static void main(String[] args) {
		
		OracleService service = new OracleService();
		Set<String> set = service.select();
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("====================");
		
		//2. iterator를 이용한 출력
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		
		
		
	}

}
