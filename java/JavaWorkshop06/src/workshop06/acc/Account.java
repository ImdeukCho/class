package workshop06.acc;

import javax.security.auth.login.AccountException;

public class Account extends Exception{
	
	String account;
	double balance;
	double interestRate;
	
	public double calculateInterest() { 
		return balance * interestRate; // 이자율 0.073
	}
	
	public void deposit(int money) throws AccountException{ // 입금
		if (money<0) {
			throw new AccountException ("입금 금액이 0보다 적습니다.");
		} else {
			balance += money;
		}
	}
	
	public void withdraw(int money) throws AccountException { // 출금
		if (balance<money || money<0) {
			throw new AccountException ("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		} else {
			balance -= money;
		}
	}
	
	
	
	
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
} // end class
