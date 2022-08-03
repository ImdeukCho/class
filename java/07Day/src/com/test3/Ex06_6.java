package com.test3;

class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name + " " + salary;
	}
	public Employee() {}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}	
	
	public void test() {} // 부모	테이블 함수
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
class Manager extends Employee{
	String depart;

	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee() + " " + depart;
	}
	
	public void print() { // 자식의 유일함수
		System.out.println("manager print() ==============");
	}
	
	public Manager() {
		super();
	}
	public Manager(String name, int salary, String depart) {
		super(name, salary);   
		this.depart = depart;
		System.out.println("Manager 생성자 호출됨 =================");
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [depart=" + depart + "]";
	}
	
}

public class Ex06_6 {
	public static void main(String[] args) {
		// 1. 기존 사용 방식
		Manager e1 = new Manager("aa",100,"bb");
		// 2. 다형성 : 상속관계시 부모타입 변수로 자식객체를 참조함
		Employee e2 = new Manager("홍길동",10,"영업부"); // 오류안남 다형성때문에
		System.out.println(e2.getEmployee());  // 2-1 다형성 생성시 오버라이딩 된 함수 호출
//		e2.print(); // 타입이 부모타입이므로 자식의 유일함수 사용 못함
//		e2.depart;  // 타입이 부모타입이므로 자식의 유일 매개변수 사용 못함
		// 2-2 다형성 참조변수는 자식의 유일한 변수, 함수 사용시 형변환(실제 객체 타입으로) 후 사용
		System.out.println(((Manager)e2).salary);
		((Manager)e2).print();
//		System.out.println(e2.toString());
	}
}
