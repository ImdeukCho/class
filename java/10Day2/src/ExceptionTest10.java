
public class ExceptionTest10 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num=10;
		try {
			if (num>0) {
				// 강제로 명시적 Exception 발생
				throw new ArithmeticException("num은 0보다 큼");
			}
		} catch (Exception e) {
			System.out.println("catch부분에서 실행함 : " + e.getMessage());
		}
		
		
		System.out.println("프로그램 종료");
	} // end main

}
