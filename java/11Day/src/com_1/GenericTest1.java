package com_1;

import java.util.Date;

class Box<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
} // end Box
public class GenericTest1 {

	public static void main(String[] args) {
		//제네릭스 타입(generics type)
		Box<String> b = new Box<String>();   // 1. 변수, 생성자 부분에 제너릭<>을 서술, 제너릭 지정
//		b.setValue(100);                     // String형만 입력된다. 확인.
//		b.setValue(new Date());              // String형만 입력된다. 확인.
		b.setValue("hello");
		String x = b.getValue();              // 제너릭을 사용하면 형변환 필요 없음
		System.out.println(x.length());
		
		Box<Date> b2 = new Box<>();         // 2. 변수만 제너릭 선언
		b2.setValue(new Date());
//		b2.setValue("aaa");
		Date d = b2.getValue(); // 형변환 필요 없음.
		System.out.println(d);
		
		Box<Integer> b3 = new Box<>();
		b3.setValue(100);
//		b3.setValue("100");
		int xxx = b3.getValue();
		System.out.println(xxx);
		
	}

}
