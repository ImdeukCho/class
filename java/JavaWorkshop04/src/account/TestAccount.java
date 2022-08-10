package account;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account(" 441-0290-1203",500000,0.073);
		System.out.println("계좌정보 : "+a.getAccount()+" 현재잔액 : "+a.getBalance());
		a.withdraw(600000); // 출금
		a.deposit(20000); // 입금
		System.out.println("계좌정보 : "+a.getAccount()+" 현재잔액 : "+a.getBalance());
		System.out.println("이자 : "+ a.calculateInterest());
		
		
	}
	
}
