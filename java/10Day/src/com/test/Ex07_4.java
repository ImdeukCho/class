package com.test;
class Outer{
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner{ // member Inner 클래스 사용하기
		int d = 40;
//		static int e = 50;    // Inner 클래스에서는 static 변수 사용 불가
		public void print() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
	}// end Inner class
	public void info() { // Outer클래스 에서는 Inner 클래스 객채생성 가능
		Inner inner = new Inner();
		inner.print();
	}
} // end Outer class

public class Ex07_4 {
	public static void main(String[] args) { // inner클래스의 프린터 호출하기
		Outer outer = new Outer(); // 방법1. Outer클래스 객체생성후 Outer함수호출
		outer.info();
		
		Outer.Inner inner = outer.new Inner(); // 방법2. 다른 클래스에서 Inner클래스 객체생성 방법
		inner.print();
	}

}
