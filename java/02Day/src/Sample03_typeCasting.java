
public class Sample03_typeCasting {

	public static void main(String[] args) {
		
		// 데디터 타입 변경(자동으로 변경된다) : 묵시적
		// 1. byte -> short -> int -> long -> float -> double ( 작은 --> 큰)
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;
		System.out.println(b6);
		
		// 2. char --> int
		char n = 'A';
		int n2 = n+1;
		System.out.println(n2);
		char c=(char)n2; // int --> char
		System.out.println(c);
		
		// 3-1. int보다 작은 타입의 연산 결과는 int로 묵시적 변함
		short x = 10;
		short x2 = 20;
		int x3 = x + x2;   // 연산 결과는 int형으로 변함
		
		// 3-2. 명시적 형변환
		short x4 = (short) (x + x2);    // 큰타입의 변수를 작은 타입으로 명시적 형변환  int --> short     !!!!!중요!!!!!
		
		byte a=1;
		byte a2=2;
		byte x5 = (byte)(a*a2); // 명시적 형변환
		int tt=(int)(10.0);
		System.out.println(tt);
	
	
		// 4. 문자열과 + 문자열이 아닌 데이터 => 연결된 문자열로 반환
		System.out.println("10"+ 1+2+3); // 10123 출력
		System.out.println(1+2+3+"10");  // 610 출력
		// System.out.println("10" - 1);  // 에러 : 문자열은 빼기 못한다.
		
		
		// "10" ----> 10  // 문자열 ===> 정수로 변형
		// 자바스크립트 : Number.parseInt("10") ==> 10
		// 자바 : Integer.parseInt("10") ==> 10
		String k = "10";
		System.out.println(k+20);  // 1020 출력       !!!!!!!!매우 중요!!!!!!!!
		// 문자열 ==> 정수로 변환 후 연산
		int k2 = Integer.parseInt(k); // 문자열을 정수로 변환    !!!함수 외우기!!!
		double k3 = Double.parseDouble(k);
		System.out.println(k3);  // 10.0 출력
		System.out.println(k2+20); // 30 출력
		
		// 10 ===> "10"  // 정수 ===> 문자열로 변형
		// 자바스크립트 : toString()
		// 자바 : String.valueOf(10) ==> "10"
		// 자바 : String.valueOf(3.14) ==> "3.14"
		// 자바 : String.valueOf(true) ==> "true"
		System.out.println(String.valueOf(10)+10);  //1010 출력
		int k4=10;
		System.out.println( String.valueOf(k4)); // "10"
		String k5 = k4+""; // "10"으로 저장
		
		// 5. 작은타입과 큰타입의 연산 ==> 큰타입 
		int p = 100;
		double p2 = 3.14;
		double p3 = p+p2;  // 정수 + 실수 = 실수(더 큰타입) 
	
	}

}
