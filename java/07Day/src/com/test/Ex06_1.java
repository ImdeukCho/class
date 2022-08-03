package com.test;

class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name + " " + salary;
	}
	public Employee() {            // 상속에선 기본생성자 필수!!
		super(); // 부모의 기본생성자 호출, 부모 먼저 생성 후 자신을 생성함
		System.out.println("emp 기본생성자 호출됨");
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}	
}

class Manager extends Employee{
	String depart;
	
	public String getManager() {
		return name + " " + salary + " " + depart;
	}
	
	public Manager() {
		super(); // 항상 첫라인에 기재
	}
	public Manager(String name, int salary, String depart) {
		super();    // 생성자의 첫라인에 묵시적 추가 - 부모의 기본생성자 호출
		this.name = name;
		this.salary = salary;
		this.depart = depart;
		System.out.println("Manager 생성자 호출됨 ====================");
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}

public class Ex06_1 {

	public static void main(String[] args) {
		System.out.println("==============================");
		Manager man = new Manager("이순신",4000,"개발");
		System.out.println(man.getManager());
	
	}

}
