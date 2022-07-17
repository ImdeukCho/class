
public class IFTest2 {

	public static void main(String[] args) {
		
		// 2-1. if~else 문 (참거짓 판단)
		System.out.println("문장1");
		int num = 0;  // 변수선언
		if (num == 100) {
			// num=3; // 초기화
			int num2=10;
			System.out.println("참");
			System.out.println(num);
		} else {
			System.out.println("거짓");

		}
		System.out.println(num);
		System.out.println("문장3");
		
		
		System.out.println("=================================");
		
		// 2-2.  if~else (홀수짝수 판단)
		int n1 = 100;
		int result = n1 % 2;
		String mesg="";
		
			if (result == 0) {
				mesg = "짝수";
			} else {
				mesg = "홀수";
			}
		System.out.println(mesg);
		
		
		System.out.println("=================================");
		
		// 2-3.  if~else (대소문자 판단)
		
		 char c = 'C';
		 String mesg2 = "";
		 	if ((c >= 'a') && (c <= 'z')) {
		 		mesg2 = "소문자";
		 	} else { 
		 		mesg2 = "대문자";
		 	}
		System.out.println(mesg2);
		
	}

}
