package com.test;

class Emp {
	public Emp() {            // 상속에선 기본생성자 필수!!
		super(); // 부모의 기본생성자 호출, 부모 먼저 생성 후 자신을 생성함
		System.out.println("Emp 생성자 1");
	}
	public Emp(String name, int salary) {
		super();
		System.out.println("Emp 생성자 2");
	}	
}

class Man extends Emp{
	public Man() {
		super(); // 항상 첫라인에 기재
		System.out.println("Man 생성자");
	}
}

public class Ex06_2 {
	public static void main(String[] args) {
		Man man = new Man();
		
	}
}
