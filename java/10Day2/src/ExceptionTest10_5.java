
public class ExceptionTest10_5 {
	
	public static void a() throws Exception {
		int num=10;
		
			if (num>0) {
				// 강제로 명시적 Exception 발생
				throw new ArithmeticException("num은 0보다 큼"); // 다형성, 부모타입보다 작은타입이다.
			}
		
		System.out.println("a함수 종료 =============");
	}
		
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		
			try {
				a();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
		
		
		System.out.println("프로그램 종료");
	} // end main

}
