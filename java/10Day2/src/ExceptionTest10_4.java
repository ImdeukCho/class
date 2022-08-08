
public class ExceptionTest10_4 {
	
	public static void a() throws ArithmeticException {
		int num=10;
		
			if (num>0) {
				// 강제로 명시적 Exception 발생
				throw new ArithmeticException("num은 0보다 큼");
			}
		
		System.out.println("a함수 종료 =============");
	}
		
	public static void main(String[] args) throws ArithmeticException {
		System.out.println("프로그램 시작");
		
		
			a();
		
		
		
		System.out.println("프로그램 종료");
	} // end main

}
