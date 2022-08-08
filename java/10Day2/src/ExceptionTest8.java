
public class ExceptionTest8 {
	
	public static void a()  { // 호출한 곳으로 위임
		b();
		System.out.println("a()함수 종료됨");
	}
	
	public static void b()  { // 2. throws 이용 호출한 곳으로 처리를 위임
		// try - catch가 빠짐
		try {
			int num = 10;
			int result = num / 0; 
			System.out.println(result); // 1. try-catch Ex 처리 코드 직접 에러 코드에 작성
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("b()함수에서 예외처리");
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");	
//		try {
			a();

//		}catch(ArithmeticException e) {
//			System.out.println("main에서 처리함 : "+e.getMessage());
//		}


		System.out.println("프로그램 종료");
	} // end main

}
