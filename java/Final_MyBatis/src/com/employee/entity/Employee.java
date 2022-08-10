package com.employee.entity;

import java.util.Date;

public class Employee {
	
	private int empno;// 사번
	private String ename;// 이름
	private String hiredate;// 입사일
	private String loc;// 근무지
	private int sal;// 연봉
	private String state; // 외출,출장,휴가,근무
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Employee(int empno, String ename, String hiredate, String loc, int sal, String state) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.loc = loc;
		this.sal = sal;
		this.state = state;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", loc=" + loc + ", sal="
				+ sal + ", state=" + state + "]";
	}
	


}
