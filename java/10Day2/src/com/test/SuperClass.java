package com.test;

public class SuperClass {
	public void a() throws NullPointerException{}
	public void b() throws Exception{}
	public void c() throws ArithmeticException{}
	
class SubClass extends SuperClass{

	@Override
	public void a() {} // throws 예외처리 하지 않음 - 가능

	@Override
	public void b() throws RuntimeException {} // 부모클래스보다 작은 타입을 사용 - 가능

//	@Override
//	public void c() throws Exception {} // 부모클래스보다 큰 타입을 사용 - 확대 불가능
	
	
}	

}
