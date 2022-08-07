package com.test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex08_17 {

	public static void main(String[] args) {
		
		// 1. 배열 복사 : copyOf() 함수
		String [] str = {"홍길동", "이순신", "유관순"};
		String [] str2 = Arrays.copyOf(str, str.length);
		for (String name : str2) {
			System.out.println("이름 : " + name);
		}
		// 2. 특정갑으로 전체 채우기
		int [] nums = {10, 20, 30};
		Arrays.fill(nums, 100);
		for (int num : nums) {
			System.out.println("fill 값 : " + num);
		}
		// 3. 특정갑 일부분만 채우기
		String [] fruits = {"사과", "배", "수박", "바나나"};
		Arrays.fill(fruits, 0, 2, "딸기");
		for (String fruit : fruits) {
			System.out.println("fruit : " + fruit);
		}
		
		
		// 4. 배열 비교
		String [] p = {"홍길동", "이순신", "유관순"};
		String [] p2 = {"홍길동", "이순신", "유관순"};
		System.out.println(p==p2); // false 잘못된 주소 비교
		System.out.println(Arrays.equals(p, p2)); // true
	} // end main

}
