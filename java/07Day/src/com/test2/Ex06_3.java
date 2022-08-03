package com.test2;

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
}
class Manager extends Employee{
	String depart;
	
	public String getManager() {
		return super.getEmployee() + "\t" + depart;
	}
	
	public Manager() {
		super();
	}
	public Manager(String name, int salary, String depart) {
		super(name, salary);   
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}

public class Ex06_3 {
	public static void main(String[] args) {
		Employee emp = new Employee("홍길동",2000);
		Manager man = new Manager("이순신",4000,"개발");
		System.out.println(emp.getEmployee());
		System.out.println(man.getManager());
	
	}

}
