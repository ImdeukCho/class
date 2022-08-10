package com.employee.entity;


public class Sales extends Employee {

	public static final double COMMISSION_RATE = 0.2;
	private double commission;

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sales(int empno, String ename, String hiredate, String loc, int sal, String state, double commission) {
		super(empno, ename, hiredate, loc, sal, state);
		this.commission = commission;
	}

	

}
