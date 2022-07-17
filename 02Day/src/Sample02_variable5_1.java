
public class Sample02_variable5_1 {

	public static void main(String[] args) { // main블럭의 시작
	
		int num = 10; // 메인블럭에서 선언 => main에 속한 로컬변수, main전체에서 사용이 가능함
		// 자바는 블럭 scope( 자바스크립트는 함수 scope)
		{ // a 블럭
			num = 20;
			int num2 = 10; // a 블럭안의 로컬변수
			System.out.println(num);
		} // end a
		// System.out.println(num2); // a블럭의 로컬변수라 a블럭 밖에서는 사용불가
		System.out.println(num);   // 주의 : a 블럭 안에서 값 변경해도 a블럭 밖에서도 값이 변경됨.
		
		{ // b 블럭
				num = 30;
				int t = 100;
				int num2 = 1;
				System.out.println(num);
				System.out.println(t);
				System.out.println(num2);
				// System.out.println(num2);  // 에러 : a블럭의 로컬함수라 사용불가
		} // end b
		// System.out.println(t);   // b블럭의 로컬변수라 b블럭 밖에서는 사용불가
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	} // end main

} // end class
