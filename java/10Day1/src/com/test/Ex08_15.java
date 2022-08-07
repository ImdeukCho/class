package com.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.print.attribute.standard.PagesPerMinute;

public class Ex08_15 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String name = scan.nextLine();
		System.out.println("나이를 입력하시오");
		int age = scan.nextInt();
		System.out.println("체중을 입력하시오");
		double weight = scan.nextDouble();
		System.out.println("결혼여부를 입력하시오");
		boolean isMarried = scan.nextBoolean();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("체중 : " + weight);
		System.out.println("결혼여부 : " + isMarried);
		scan.close();
	}

}
