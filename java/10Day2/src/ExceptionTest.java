
public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");

		
//			try {
//				Class.forName("aaaa");
//			} catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} // complile checked Exception은 코드상 try ~ catch 필수
		
			
		try {
			int num = 10;
			int num2 = 0;
			int result = num / num2;  // ArithmeticException 발생
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("에러 발생됨");
			e.printStackTrace(); // 에러 발생 순서출력(디테일한 오류 확인)
			System.out.println(e.getMessage()); // 에러 메세지 (by zero)
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
