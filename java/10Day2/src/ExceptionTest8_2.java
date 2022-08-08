
public class ExceptionTest8_2 {
	
	public static void a()   { // 호출한 곳으로 위임
		b();
		System.out.println("a()함수 종료됨");
	}
	
	public static void b()  { // 2. throws 이용 호출한 곳으로 처리를 위임
		// try - catch가 빠짐
			try {
				Class.forName(null);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1. try-catch Ex 처리 코드 직접 에러 코드에 작성
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");	

			a();

		System.out.println("프로그램 종료");
	} // end main

}
