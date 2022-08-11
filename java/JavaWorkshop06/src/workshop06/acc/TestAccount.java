package workshop06.acc;

import javax.security.auth.login.AccountException;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account(" 441-0290-1203",500000,0.073);
		System.out.println("계좌정보 : "+a.getAccount()+" 현재잔액 : "+a.getBalance());
		
		try {
			a.deposit(-10);  // 입금
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			a.withdraw(600000);  // 출금
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		} 
		
//		System.out.println("계좌정보 : "+a.getAccount()+" 현재잔액 : "+a.getBalance());
		System.out.println("이자 : "+ a.calculateInterest());
		
		
	}
	
}
