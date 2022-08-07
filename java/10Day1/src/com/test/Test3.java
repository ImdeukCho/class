package com.test;

import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		
		String tt = "hello world!!";
		char[] data = tt.toCharArray();
		System.out.println(data.length);
		for (char c : data) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		String s = "홍길동 이순신 유관순";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // while 문 안에서 nextToken은 딱 1번만 작성해야함
//			System.out.println(st.nextToken()); // 없는방에 포인트 이동되서 오류발생함.
		}
		
		
	}
} // end class