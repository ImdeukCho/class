package com.bank;

public class Bank {
	
	// 2. 단 하나의 객체생성
	private static Bank bank = new Bank();
	private String bankName;
	
	// 3. get함수의 구현
	public static Bank getBank() {
		return bank;
	}
	
	// 1. 객체 생성금지
	private Bank() {}
	
	

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

} // end class
