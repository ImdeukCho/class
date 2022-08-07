package com.test;

public class Ex08_8 {

	public static void main(String[] args) {

		// 1. 기본형을 Wrapper로 변경
		int num = 10;
		@SuppressWarnings("removal") // 경고메세지 삭제
		Integer x = new Integer(num); // Deprecated : 사용하지 않는 것을 권장, 옛날 방식
		Integer x1 = 10; // Integer 객체로 자동변환 저장(오토박싱)
		
		// 2. Wrapper을 기본형으로 변경
		int x2 = x1.intValue();
		System.out.println(x2+10);
		System.out.println(x1+10); // 객체-> int 형변환이 자동으로 이루어짐 (오토언박식)
	}

}
