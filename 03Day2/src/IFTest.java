
public class IFTest {

	public static void main(String[] args) {
		
		// 1. 단일 if문
		System.out.println("문장1");
		int num = 0;
		// if (3==3) {조건이 true인 경우 블럭 안의 코드 실행
		 if (num==0) {
//			num = 10;
			  int num2 = 100;
		 	System.out.println("문장2");
		 	System.out.println("문장2-1");
		 } // 조건이 false인 경우 블럭 밖에서부터 실행
		 System.out.println(num);
	     // System.out.println(num2);  // num2사용 안됨
		 System.out.println("문장3");
		 	
		 
		 System.out.println("=============================================");
		 
		 // 2. 단일 if문
		 int num3 = 100;
		 int result = num3 % 2;
		 String mesg = "홀수";
		 if (result == 0) 
		 		{mesg = "짝수";}  // 한줄의 명령인 경우 {} 생략가능
		 System.out.println(mesg);
		 
		 
		 System.out.println("=============================================");
		 
		 
		 // 3. 단일 if문(대소문자 판단)
		 char c = 'C';
		 String mesg2 = "대문자";
		 if ((c >= 'a') && (c <= 'z')) {mesg2 = "소문자";}
			System.out.println(mesg2);
		
			
		
	}

}
