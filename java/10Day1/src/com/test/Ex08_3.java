package com.test;

public class Ex08_3 {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Hello");
		
		s.append(" world");
		System.out.println(s); // Hello world
		s.insert(5, "!!! ");
		System.out.println(s); // Hello!!!  world
		s.delete(0, 5);
		System.out.println(s); // !!!  world
		
		String data = s.toString(); // String로 변경
	}

}
