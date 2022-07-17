
public class HelloTest2 {   // 클래스의 이름은 .java의 파일 이름과 반드시 동일 해야 함

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");  // println 함수 - 개행(줄바꿈) 출력
		System.out.print("hello2");   // print 함수 - 개행없이 출력 hello2hello3 붙어서 출력된다
		System.out.println("hello3"); // 개행 출력
		System.out.println("hello4");
		
		
		// 1 2
		// 3 4 출력
		
		// 1. println만 사용
		System.out.println("1 2");
		System.out.println("3 4");
		
		// 2. print, plintln 같이 사용
		System.out.print("1 ");
		System.out.println("2");
		System.out.print("3 ");
		System.out.println("4");
		
		// 3. 개행할때만 println 사용
		System.out.print("1 ");
		System.out.print("2");
		System.out.println();   // 줄바꿈만
		System.out.print("3 ");
		System.out.print("4");
		
	} // end main

} // end class
