
public class ExceptionTest8_3 {
	
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

			a();

		System.out.println("프로그램 종료");
	} // end main

}
