package default_1;

import com.bank.Bank;
import com.bank.FinalTest;

public class Test {

	public static void main(String[] args) {
//		Bank b = new Bank();
//		Bank.bank;
		
		// 4. bank를 생성이 아닌 받아서 사용하기
		Bank b1 = Bank.getBank();
		System.out.println(b1);
		Bank b2 = Bank.getBank();
		System.out.println(b2); // b1과 b2는 같은 객체이다.
		b1.setBankName("국민은행");
		System.out.println(b2.getBankName());
//		Integer.parseInt(null); // static함수이다.
//		Math.random();  // static함수이다.
		System.out.println(FinalTest.NUM);
//		FinalTest.NUM=10; // 상수 변경불가
	}

}
