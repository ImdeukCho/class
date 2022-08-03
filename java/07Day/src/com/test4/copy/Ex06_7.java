package com.test4.copy;

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
	public void test() {} // 부모의 유일한 함수
}
class Manager extends Employee{
	String depart;
	
	public void a() { // 자식의 유일한 함수
		System.out.println("manager a() ===================");
	}
	@Override
	public String getEmployee() {
		return super.getEmployee() + " " + depart;
	}
	public Manager() {
		super();
	}
	public Manager(String name, int salary, String depart) {
		super(name, salary);   
		this.depart = depart;
		System.out.println("Manager 생성자 호출됨 =================");
	}
}

public class Ex06_7 {
	public static void main(String[] args) {
		Employee emp = new Employee("홍길동",2000);
		System.out.println(emp.getEmployee()); 
		
		emp = new Manager("이순신",4000,"개발");
		System.out.println(emp.getEmployee()); 
		
		// 1. 형변환1 : 형변환해서 사용 - 유일한변수나 함수 사용시 반드시 형변환 후 사용
		((Manager)emp).a();
		// 2. 형변환2 : 형변환해서 따로 변수저장후 사용
		Manager mgr = (Manager)emp;
		mgr.a();
		System.out.println(((Manager)emp).depart);
	}
}
