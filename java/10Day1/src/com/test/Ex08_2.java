package com.test;

public class Ex08_2 {

	public static void main(String[] args) {
		String s = "abcde";
		String s2 = "He llo    ";
		String s3 = "홍길동/이순신/유관순";
		System.out.println("문자열 길이 : " + s.length());
		System.out.println("문자열 비교 : " + s2.equals("Hello"));
		System.out.println("문자열 비교 : " + s2.equalsIgnoreCase("HELLO"));
		System.out.println("부분열 출력 : " + s.substring(2, 4)); // start idx, end idx-1
		System.out.println("문자 바꿈 : " + s.replace('a', 'c')); // a를 c로 치환
		System.out.println(s); // 원래 문자열은 변경안됨
		System.out.println("소문자로 바꿈 : " + s.toLowerCase());
		System.out.println("대문자로 바꿈 : " + s.toUpperCase());
		System.out.println("인덱스값의 문자출력 : " + s.charAt(3)); // d
		System.out.println("공백제거 : " + s2.trim()); // 앞뒤 공백만 제거, 문자열 중간의 공백은 제거 못함
		System.out.println("문자열 연결 : " + s.concat("test"));
		System.out.println("a에 맞는 인덱스값 출력 : " + s.indexOf("a"));
		System.out.println("x에 맞는 인덱스값 출력 : " + s.indexOf("x")); // -1 : ﻿일치하지 않으면 –1 리턴
		System.out.println("시작하는 문자열 비교 : " + s.startsWith("abc"));
		System.out.println("끝나는 문자열 비교 : " + s.endsWith("cde"));
		String[] names = s3.split("/");
		for (int x = 0; x < names.length; x++) {
			System.out.println(names[x]);
		}
		System.out.println("123 문자열로 변환 : " + String.valueOf(123));
		System.out.println("123 문자열로 변환 : " + 123+"");      // 위에보다 간단한 방법
		System.out.println("true 문자열로 변환 : " + String.valueOf(true));
		String formatString = String.format("이름은 %s, 나이는 %d, 키는 %.2f", "홍길동", 20, 180.2);
		System.out.println(formatString);
		

	}

}
