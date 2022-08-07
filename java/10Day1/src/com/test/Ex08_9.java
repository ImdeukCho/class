package com.test;

public class Ex08_9 {

	public static void main(String[] args) {

	// 1. 예전 방식
		int num1 = 10;
		Integer obj_num = new Integer(num1); // 기본형 -> 객체 변환
		Object o = obj_num; // 다형성
	  // 객체 -> 정수
		int int_num = obj_num.intValue(); // 객체 -> 기본형 변환
	  // 이후 연산
		System.out.println(int_num+10);
		
		
		// 오토박싱, 오토 언박싱
		Integer obj_num2 = 10; // 오토박싱
		System.out.println(obj_num2 == 10); // 언박싱
		System.out.println(obj_num2 > 0);   // 언박싱
		System.out.println(obj_num2 + 10);  // 언박싱
		Object[] arr = {10, 'a', "홍길동"}; // 오토박싱
	}

}
