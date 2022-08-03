package com.test5;

class Employee{                                  // 부모클래스
	String name;                                 // 부모의 유일변수
	public void print() {                        // 부모의 유일함수
		System.out.println("Employee.print()");
	}
}
class Engineer extends Employee{                 // 자식클래스1
	int age;                                     // 자식의 유일변수

	@Override
	public void print() {                        // 오버라이딩한 자식1함수
		System.out.println("Engineer.print()");
	}
}
class Manager extends Employee{                   // 자식클래스2
	String address;
	@Override
	public void print() {                         // 오버라이딩한 자식2함수
		System.out.println("Manager.print()");
	}
}
class Test extends Object {                       // 묵시적으로 extends Object 추가
//	public void taxRate(Employee e) {             // 매개변수가 부모타입이면 => 자식객체도 저장가능 (Employee,Engineer,Manager 객체 모두 저장가능)
	public void taxRate(Object e) {             // 매개변수가 부모타입이면 => 자식객체도 저장가능 (Employee,Engineer,Manager 객체 모두 저장가능)

		//Employee e = man;
		// e.print();                                // 오버라이딩 함수
		
		// instanceof : 연산자 사용 실제 저장된 객체 타입 검사
		// instanceof 사용시 자식 => 부모 순서로 비교
		if (e instanceof Manager) {  // 실제 객체의 타입 비교
			Manager m = (Manager)e;
			m.address="aaa";  // m의 유일변수 사용 가능한지 확인
			System.out.println("manager 세금 구하기");
		} else if(e instanceof Engineer){
			Engineer en = (Engineer)e;
			en.age=10; // en의 유일변수 사용가능한지 확인
			System.out.println("Engineer 세금 구하기");

		} else if(e instanceof Employee) {
			System.out.println("Employee 세금 구하기");
		}
	}
	public Object test() { // 타입이 Employee이면 다형성 매개변수 사용
//		return new Employee();
//		return new Manager();
		return new Engineer();
	}
	public Employee test(int a) { // 오버로딩 하려면 매개변수가 달라야함, 리턴타입은 연관없다
//		return new Employee();
//		return new Manager();
		return new Engineer();
	}
}


public class Ex06_8 {
	public static void main(String[] args) {
		Test t = new Test();                       // taxRate 사용을 위해 객체생성
//		Employee e = new Employee();
//		t.taxRate(e);                              // Employee.print() 호출됨 / Employee 세금 구하기 호출됨
//		Manager man = new Manager();
//		t.taxRate(man);							   // Manager.print() 호출됨 / Engineer 세금 구하기 호출됨
//		Engineer eng = new Engineer();
//		t.taxRate(eng);							   // Engineer.print() 호출됨
//		Employee emp = new Engineer();             // 다형성으로 하면?
//		t.taxRate(emp);							   // Engineer.print() 호출됨 - 실제 객체타입(자식)의 자료 출력 / Employee 세금 구하기 호출됨
//		Engineer m = (Engineer)t.test();
//		m.print();
	}

} // end calss
