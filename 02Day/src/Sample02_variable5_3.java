
public class Sample02_variable5_3 { // class 시작
	String name;
	char gender;
	int age;
	boolean married;
	double height;
	// 멤버변수, 인스턴스변수, 전역변수 : 클래스 블럭에 선언
	// 1. new 키를 이용하여 객체 생성할 때 멤버(인스턴스)변수가 생성 후 참조변수에 주소 저정 후 참조하여 사용,
		// 더 이상 참조하지 않을 경우, 프로그램 종료시 삭제
	// 2. 전역변수 : 클래스 전체에서 사용 가능, 객체생성시 참조변수를 이용하여 사용
	// 3. 선언만 해도 객체 생성(new)시 자동으로 초기화 됨
		// (정수:0, 실수:0.0, char:공백, String:null, boolean:false)로 자동초기화 됨
		// 자동초기화 된으로 객체생성 후 초기화 없이 바로 사용가능
	

	public static void main(String[] args) {  // main 시작
		
		// 로컬변수(지역변수) : 메서드(함수) 안에서 선언
		int n = 0;
		// 메인에 속한 로컬변수 : 함수안에 선언
		// 1. 함수가 실행되어 코드가 실행될때 변수 생성, 함수 종료 시 삭제
		// 2. 사용범위는 속한 블럭안에서 사용
		// 3. 선언, 초기화를 명시적 한 후 사용가능 ( 아닐시 에러 )
		System.out.println(n);
		
		// 객체 생성후 객체의 맴버변수 접근사용
		// 1. 클래스 객체 생성 후 test변수 참조
		// println이용 이름, 나이, 성별, 결혼여부, 키를 한줄로 출력
		Sample02_variable5_3 test = new Sample02_variable5_3();  // 해당 클래스의 객체 생성 후 생성된 객체의 주소를 test
		// 객체 생성시 멤버변수가 만들어지며 타입에 맞도록 자동초기화됨
		System.out.println(test);  // 주소가 저정되있음
		System.out.println("이름:"+test.name+", 나이:"+test.age+", 성별:"+test.gender+","
				+ "결혼여부:"+test.married+", 키는:"+test.height);
		// 각 타입의 기본값이 자동으로 설정된 것을 확인함
		test.name="홍길동";
		System.out.println("=========================================");
		System.out.println("이름:"+test.name+", 나이:"+test.age+", 성별:"+test.gender+","
				+ "결혼여부:"+test.married+", 키는:"+test.height);
		
		
	} // end main

} //end class
