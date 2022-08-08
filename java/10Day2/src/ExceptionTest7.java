
public class ExceptionTest7 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");	
		try {
		// 작업1
			int num = 10;
			int result = num / 0;  // 나누기 0으로 변경시 : ArithmeticException 발생

		}finally {
			System.out.println("반드시 수행되는 문장");
		}
		

		System.out.println("프로그램 종료");
	} // end main

}
