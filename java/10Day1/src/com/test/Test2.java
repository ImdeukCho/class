package com.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	while (true) {
		System.out.println("이름을 입력하시오");
		String name = scan.nextLine();
		if(name.equals("q")) break;
		System.out.println(name);
	}
	System.out.println("프로그램 종료");
	scan.close();
	}
	
} // end class