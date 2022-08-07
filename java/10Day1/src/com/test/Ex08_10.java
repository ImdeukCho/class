package com.test;

import java.util.Random;

public class Ex08_10 {

	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(100) +1 ;
		System.out.println("1부터 100 사이의 임의의 값 : " + num);
		
		float f = random.nextFloat();
		System.out.println("0.0부터 1.0 사이의 임의의 값 : " + f);
		
		boolean b = random.nextBoolean();
		System.out.println("임의의 논리값 : " + b);
	}

}
