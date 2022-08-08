package com;

class Box{
	Object obj;

	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return obj;
	}
} // end Box


public class GenericTest {
	public static void main(String[] args) {
		// 일반적인 타입 (raw type)
		Box b = new Box();
		b.setValue("hello");
//		System.out.println(b.getValue().length()); // obj타입이라 length(String형)가 실행안됨
		String x = (String)b.getValue();
		System.out.println(x.length());

		Box b3 = new Box();
		b3.setValue(100);
		b3.setValue(100);
		b3.setValue(100);
		b3.setValue("aaa");
		System.out.println(b3.getValue());
		

	}

}
