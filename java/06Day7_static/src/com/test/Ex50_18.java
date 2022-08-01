package com.test;


 class Counter {
	static int count;
	int num;
	public Counter() {
		count++;		 // count값은 단 한번만 생성되서 계속 증가한다.
//		num = count;
		num = num+count; // num값은 new할때마다 0으로 초기화되므로 위와 결과 같다.
	}
	public int getNum() {return num;}
}
 

public class Ex50_18 {
	public static void main(String[] args) {
		System.out.println("객체생성 횟수 : "+Counter.count);
		Counter c = new Counter();
		System.out.println("객체생성 횟수 : "+c.getNum());
		Counter c2 = new Counter();
		System.out.println("객체생성 횟수 : "+c2.getNum());
		System.out.println("객체생성 횟수 : "+Counter.count);
		
	}

}
