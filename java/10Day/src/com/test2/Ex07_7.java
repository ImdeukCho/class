package com.test2;
interface Flyer{
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
} // end Flyer class

public class Ex07_7 {
	public static void main(String[] args) {
		Flyer f = new Flyer() {

			@Override
			public void takeOff() {
				System.out.println("fly");
			}
			@Override
			public void fly() {
				System.out.println("takeOff");	
			}

			@Override
			public void land() {
				System.out.println("land");
			}
		}; // 익명 클래스
		f.fly();
		f.takeOff();
		f.land();
	}

}
