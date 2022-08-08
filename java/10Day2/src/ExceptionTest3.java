
public class ExceptionTest3 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
			
		try {
			int num = 10;
			int result = num / 10;  // ArithmeticException 발생
			
				String name = null;
				System.out.println(name.length()); //NullPointerException 발생
			System.out.println(result);
			System.out.println(name);
		}catch (ArithmeticException e) {
			System.out.println("에외처리함");
			System.out.println(e.getMessage());
		}catch (NullPointerException e1) {           // 다중 catch문 사용
			System.out.println("에외처리함 22222222222222");
			System.out.println(e1.getMessage());
		}catch (Exception e2) {						// 부모타입의 Exception을 제일 마지막으로 비교 , 자식 => 부모 타입 순서대로.
			System.out.println("에외처리함 33333333333333");
			System.out.println(e2.getMessage());
		}
			
	
		
		
		
		System.out.println("프로그램 종료");
	} // end main

}
