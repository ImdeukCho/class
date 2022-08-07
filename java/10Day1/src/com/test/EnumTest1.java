package com.test;

public class EnumTest1 {
	
	public static void check(int num) {
		// switch 제약조건 : byte,short,int,char,String,enum
		switch(num) {
		case 1 : System.out.println("1"); break;
		case 2 : System.out.println("2"); break;
		case 3 : System.out.println("3"); break;
		case 4 : System.out.println("default"); break;
		}
	}
	
	
	public static void main(String[] args) {
		// enum는 상수 대체 가능
		check(1); // 1. SELECT 2:INSERT 3;DELETE
		check(2);
		check(3);
		check(100); // 1,2,3 값만 사용하고 그외 값은 넘어가지 못하도록

	} // end main
	

}
