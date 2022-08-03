package com.test7;

import java.util.Date;
import java.util.Objects;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	// 객체의 값을 비교 ( equals함수 자동완성해서 사용 )
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}

public class Ex06_9 {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 40);
		Person p2 = new Person("홍길동", 40);
		System.out.println(p); // p의 주소
		System.out.println(p2); // p2의 주소
		System.out.println(p == p2); // 주소 비교 false
		
		if (p.equals(p2)) { // Object equals 호출
			System.out.println("p와 p2가 같다.");
		} else {
			System.out.println("p와 p2가 같지 않다.");
		}
		
		
		Date d = new Date(); // 오버라이딩된 Date함수 호출
		System.out.println(d); // d.toString() 호출
		System.out.println(d.toString());
	}
}
