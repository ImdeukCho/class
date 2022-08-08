
public class ExceptionTest8_1 {
	
	public static void a() throws ClassNotFoundException  { // 호출한 곳으로 위임
		b();
		System.out.println("a()함수 종료됨");
	}
	
	public static void b() throws ClassNotFoundException { // 2. throws 이용 호출한 곳으로 처리를 위임
		// try - catch가 빠짐
			Class.forName(null); // 1. try-catch Ex 처리 코드 직접 에러 코드에 작성
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");	
		try {
			a();

		}catch(ClassNotFoundException e) {
			System.out.println("main에서 처리함 : "+e.getMessage());
		}


		System.out.println("프로그램 종료");
	} // end main

}
