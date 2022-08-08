
public class ExceptionTest2 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
			
		try {
			int num = 10;
			int result = num / 0;  // ArithmeticException 발생
			System.out.println(result);
		}catch (ArithmeticException e) { // 다형성(권장안함), 딱 알맞는 클래스 사용하자(이론상)
			System.out.println("에외발생" + e.getMessage());
			e.printStackTrace(); // 개발자가 디버깅시 주로 사용
		}
//		}catch (Exception e) {						// 부모타입의 Exception을 제일 마지막으로 비교 , 자식 => 부모 타입 순서대로.
//			System.out.println("에외처리함 33333333333333");
//			System.out.println(e.getMessage());
//		}
			
	
		
		
		
		System.out.println("프로그램 종료");
	} // end main

}
