package com.dao;

import java.util.HashSet;
import java.util.Iterator;

public class OracleMain {

	public static void main(String[] args) {
		
		OracleService service = new OracleService();
		HashSet<String> xxx = service.select();
		for (String s : xxx) {
			System.out.println(s);
		}
		
		System.out.println("====================");
		
		//2. iterator를 이용한 출력
		Iterator<String> i = xxx.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		
		
		
	}

}
