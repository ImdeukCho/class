
public class UserException12 {
	public static void a() throws UserException  { 
		b();
		System.out.println("a()함수 종료됨");
	}
	
	public static void b() throws UserException { 		
		try {
			int num=10;
			int result=num/0;
			System.out.println(result);
		} catch (ArithmeticException e) {  // 시스템 Exception => 사용자정의 Exception 변환
			throw new UserException("0으로 나누어 예외발생");  
		}
	}// end ex	
			
	// end method
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");	
		try {
			a();
		}catch(UserException e) {
			System.out.println("main에서 처리함 : "+e.getMessage());
		}

		System.out.println("프로그램 종료");
	} // end main

}



