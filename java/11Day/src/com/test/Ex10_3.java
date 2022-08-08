package com.test;

class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

class Box2<T extends Pet>{
	T obj;

	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}

public class Ex10_3 {
	public static void main(String[] args) {
		
		Box2<Pet> b = new Box2<Pet>();
		Box2<Cat> b2 = new Box2<Cat>();
		Box2<Dog> b3 = new Box2<>();
		
//		Box2<Object> b4 = new Box2<>();  // 생성 불가
//		Box2<String> b5 = new Box2<>();  // 생성 불가

	}

}
