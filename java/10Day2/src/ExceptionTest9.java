
public class ExceptionTest9 {
	
	public static void a() throws ArithmeticException,NullPointerException { 
		b();
	}
	
	public static void b() throws ArithmeticException,NullPointerException { 
		// 작업1
		int num = 10;
		int result = num / 0; 
		System.out.println(result); 
		
		// 작업2
		String name = null;
		System.out.println(name.length());
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");	
		
		try {
			a();

		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료");
	} // end main

}
