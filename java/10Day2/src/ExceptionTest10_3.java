
public class ExceptionTest10_3 {
	
	public static void a() throws ArithmeticException {
		int num=10;
		
			if (num>0) {
				// 강제로 명시적 Exception 발생
				throw new ArithmeticException("num은 0보다 큼");
			}
		
		System.out.println("a함수 종료 =============");
	}
		
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
			a();
		} catch (Exception e) {
			System.out.println("main에서 찍음 : " + e.getMessage());
		}
		
		
		System.out.println("프로그램 종료");
	} // end main

}
