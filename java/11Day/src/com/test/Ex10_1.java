package com.test;

public class Ex10_1 {

	public static void main(String[] args) {
		Object [] arr = {"홍길동","이순신","유관순",100}; // String외 다른 데이터 저장(int형)
		for (Object obj : arr) {
			if (obj instanceof String) {
				String s = (String)obj; // 형변환 필요
				System.out.println(s+"\t"+s.length());
			}
		}
	}
}
