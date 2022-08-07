package com.test;

public class EnumTest4 {
	
	// public enum 타입 {상수값,상수값2,상수값3}
	public enum DML {SELECT,INSERT,DELETE} // static final 과 비슷.
	
	public static void check(DML num) { // 타입 주의
		// switch 제약조건 : byte,short,int,char,String,enum
		switch(num) {
		case SELECT : System.out.println("SELECT"); break;
		case INSERT : System.out.println("INSERT"); break;
		case DELETE : System.out.println("DELETE"); break;
		default : System.out.println("default"); break;
		}
	}
	
	public static void main(String[] args) {
		// enum는 상수 대체 가능
		check(DML.SELECT); // 1. SELECT 2:INSERT 3;DELETE
		check(DML.INSERT);
		check(DML.DELETE);
//		check(99); // 의미없는 숫자지정가능
	} // end main
	

}
