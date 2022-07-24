

// 클래스 이름 Student == 파일명,첫문자 대문자
public class Student { // 모델클래스 학생한명 객체를 생성, 저장한 모델클래스
	
	// 멤머변수영역, 인스턴스변수
	// 객체생성 - 객체가 모두 가지는 공통 변수 선언 : 접근지정자 타입 변수명;
	// 멤버변수 : 객체생성 후 사용 (new로 객체생성), 객체생성시에 자동 초기값으로 설정
	// 멤버변수 : 클래스 블럭 안에 선언, 클래스안의 함수, 클래스안의 생성자에게 모두 사용가능
	// 멤버변수에 초기값 지정시 생성되는 객체는 모든 객체는 값은 값을 가지고 객체 생성됨
	String name; // 이름 초기값 지정
	int age; // 나이
	String address; // 주소
	
	// 생성자(constructor)영역 : 클래스파일에서 생성
	// 1. 기본생성자 명시적 작성 : 매개변수-파라미터 없는 생성자
	// 2. 기본생성자는 개발자가 작성안한 경우 묵시적으로 jdk가 코드에 작성 추가 시킴  --- !!!매우매우 중요!!!
	// 3. 단 명시적 작성시 작성된 기본생성자를 사용함
	// 4. 기본생성자 문법 : public 클래스이름(){}
	// 예시 ) public student(){}
//	public Student() { // 멤버변수의 초기값 저장시 사용
////		name="홍길동";
//		System.out.println("기본생성자 호출 됨 =======");
//	} // end 기본생성자
	public Student(){} // 기본생성자 반드시 명시적 기재
	
	// 함수
	// 생성자 오버로딩 : 원래 이름같으면 충돌, 단 매개변수를 다르게 하여 두 생성자를 구분 지음.
	// 생성자 오버로딩 후 기본생성자는 묵시적으로 추가 되지 않음 !!!! 주의 !!!!!
	// 중요.. 생성자 오버로딩시 ===> 기본생성자를 명시적으로 하나 만들것 .. 반드시 ...
	public Student(String name, int age) {
		System.out.println("2번생성자 호출 : "+ name + "\t"+age);
		this.name=name; // 로컬변수를 멤버변수에 저장
		this.age=age;
	}// 함수영역, 메소드영역
	
	public Student(String name, int age, String address){
		System.out.println("3번생성자 호출");
		this.name=name; 
		this.age=age;
		this.address=address;
	} 
	
	
} // end class
