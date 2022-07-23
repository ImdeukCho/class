import java.util.Date;
// import java.lang*; // 자동추가됨
// 하나의 클래스 작성시 묵시적으로 import java.lang* 코드가 자동 삽입됨, java.lang에 속한 api를 그냥 사용가능 
// 나머지는 명시적 import 코드 작성해아함

public class Sample01_dataType {// 식별자 - 클래스이름 : .java파일이름과 반드시 동일

	public static void main(String[] args) { // 식별자 - 함수이름 : 한클래스 안에서 중복 불가
		// 변수 사용시 : 변수 타입 변수명(식별자) = 초기값 을 사용
		//   1. 정수입력시 int 사용
		int num=0;
		int num1=100; // 식별자명은 달라야 한다.
		int num_2=100; // _이용 연결, 공백허용 안됨
		int num3=1; // 첫문자는 영문자로 사용
		int _sys_num=100; // 첫문자로_, $ 사용가능
		boolean b_num=false;  // 불린 : 소문자 true, false만 가능 - 기본형 : 실제값이 저장
		char c_num='a';  // 문자 char, '' 사용 // 아스키 코드로 숫자로 저장(97)
		int c2_num=c_num+1;  // 문자를 이용한 연산이 가능
		String s_num="100";  // 문자열 String, "" 사용, 기본형이 아닌 참조형
		System.out.println(s_num);  // 문자열 100 출력
		System.out.println(s_num+1);  // 1001 출력, 주의 : 무자열의 경우 + 시 문자열을 이어 붙임
		
		byte byte_num=127; // 초과시 error
		int int_num=1000;  // 정수형의 기본형 : 사칙연산 푸 결과는 기본형(int)으로 묵시적 변형이 일어남
		long long_num=100000000000000L; // 대문자 L 사용, long형 표기
		// long횽 표현 대문자L 또는 소문자l을 정수갑 뒤에 붙여야 한다. 안붙으면 기본형인 int로 인식
		float f_num=3.14F; // 실수형 F, f를 끝에 표기 / 안쓰면  기본형인 double로 인식
		double d_num=10; // 정수 -> 실수로 묵시적 변형 
		System.out.println(d_num); // 10.0 출력
		
		float f_num2=3.14F + 1.0f;  // f안붙일시 float형 + double형 연산 후 double 로 묵시적 변형
		// java 소수점 연산의 문제 +. - 사용가능 => 결과 정확도가 떨어짐, 다른 방법 사용 연산
		System.out.println(f_num2);
		
		
		System.out.println('홍'); // 문자
		System.out.println('\uD64D'); // 홍 출력 : 유니코드 문자 
		System.out.println(100); // 정수
		System.out.println(3.14); // 실수, 3.14D와 동일
		System.out.println(3.14F);//실수, f와 동일
		System.out.println(3.14d);// 실수, d와 동일
		System.out.println(true); // 논리값(true, false)
 		System.out.println(false); // 논리값(true, false)
 		// System.out.println(null); // null값, 가리키지않는것(참조하지않는것)
 		Date d= new Date(); // 참조변수, 실제 객체의 주소저장
 		System.out.println(d); // 날짜 출력, date객체는 주소가 아니라 날짜가 출력되도록 구현되어 있음
		// 날짜 api 객체 생성, 사용
 		
 		Sample01_dataType r_rum = new Sample01_dataType(); // 객체 생성 r_rum변수에 주소저장
 		System.out.println(r_rum); // 클래스타입@주소 출력 
 		
 	
	} // end main

} // end class
