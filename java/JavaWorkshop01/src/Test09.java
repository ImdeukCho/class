import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // scan 명령문 시작
		System.out.println("1.정수 입력하세요");	
		String s_num1 = scan.next(); // 첫번째 숫자(문자열)
		System.out.println("2.정수 입력하세요");
		String s_num2 = scan.next(); // 두번째 숫자(문자열)﻿
		int n1 = Integer.parseInt(s_num1);
		int n2 = Integer.parseInt(s_num2);
		int max = (n1>n2)? n1 : n2;
		
		System.out.println("정수 "+n1+" 과 정수 "+ n2 + " 중에서 최대값 : " + max);
		System.out.printf("정수 %d 과 정수 %d 중에서 최대값 : %d", n1, n2, max);
		scan.close(); // 입력 끊기
		
		
		
		
		
//		Scanner scan = new Scanner(System.in); // scan 명령문 시작
//		System.out.println("1.정수 입력하세요");	
//		int num1 = scan.nextInt(); // 첫번째 숫자(문자열)
//		System.out.println("2.정수 입력하세요");
//		int num2 = scan.nextInt(); // 두번째 숫자(문자열)
//		int max = (num1>num2)? num1 : num2;
//		
//		System.out.println("정수 "+num1+" 과 정수 "+ num2 + " 중에서 최대값 : " + max);
//		System.out.printf("정수 %d 과 정수 %d 중에서 최대값 : %d", num1, num2, max);
//		scan.close(); // 입력 끊기
		
	
	}

}
