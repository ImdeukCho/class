
public class ExceptionTest8_5 {
	
	public static void a()   { // 호출한 곳으로 위임
	
			try {
				b();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		System.out.println("a()함수 종료됨");
	}
	
	public static void b() throws ClassNotFoundException  { // 2. throws 이용 호출한 곳으로 처리를 위임

				Class.forName(null);

	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");	
//		try {
			a();
//		} catch (ClassNotFoundException e) { // 필요없는 try-catch문
//			// TODO: handle exception
//		}
			

		System.out.println("프로그램 종료");
	} // end main

}
