
public class ExceptionTest4 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");	
		try {
		// 작업1
			int num = 10;
			int result = num / 0;  // ArithmeticException 발생
			System.out.println(result);
		}catch (ArithmeticException e) {           
			System.out.println("에외발생1" + e.getMessage());
		}
		
		try {
		// 작업2
			String name = null;
			System.out.println(name.length()); //NullPointerException 발생
		}catch (NullPointerException e) {
			System.out.println("에외발생2" + e.getMessage());
		}

		System.out.println("프로그램 종료");
	} // end main

}
