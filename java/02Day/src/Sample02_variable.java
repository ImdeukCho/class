
public class Sample02_variable {

	public static void main(String[] args) {  // main 시작
		// 1. 변수 선언 : 타입, 변수명
		int num;  // main 함수 블럭 안에 선언 - 함수 안에 선언된 변수를 로컬(지역)변수 라고 부름
		// System.out.println(num); // 초기값 없이 사용 에러
		
		// 2. 변수의 초기값 지정
		num=100;
		
		// 3. 변수의 사용 - 반드시 초기값 지정 후 사용
		System.out.println(num); 
		
		
		int a=10; // 변수 선언과 동시에 초기값 지정
		int b=20;
		int result= a+b;
		System.out.println(result);
		System.out.println("==================================================");
		
		
		// 함수안에 선언된 변수 : 로컬, 지역 변수
		// 선언된 함수 안에서만 사용가능, 함수 호출시 생성, 함수 종료시에 소멸됨
		// 로컬변수는 반드시 선언, 초기화 한 후 사용해야함
		
		// 홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63) 체중(78.25)
		// 1. 변수선언(메모리에 특정크기의 영역생성)
		String name="홍길동"; // 변수, name변수, 문자열변수, String타입의 변수, 참조형 변수
		int age=20; // 변수, age변수, 정수형변수, int 타입의 변수, 기본형변수
		String address="서울"; // 참조형변수
		char gender='남'; //변수, gender변수, 문자형변수, char타입변수, 기본형변수
		boolean isMarried=false; // 기본형변수
		float height=185.63f;  // 기본형변수
		double weight=78.25d;  // 기본형변수
		
		System.out.println(name);  // 한줄 복사 단축키 : ctrl + alt + 방향키아래 
		System.out.println(weight);
		System.out.println(height);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(address);
		System.out.println(isMarried);

		
		int age2; // 변수는 지정값이 상황에 따라 바뀜
		age2=10;
		age2=20; // 초기값 갱신됨
		System.out.println(age2+100); // 120 출력
		age2=age2+100; // 갱신
		System.out.println(age2); // 120 출력
		
		
		
		
		
	} // end main

}
