

// 클래스 이름 Student == 파일명,첫문자 대문자
public class Student { // 모델클래스 학생한명 객체를 생성, 저장한 모델클래스
	
	String name; 
	int age; 
	String address; 
	String ssn;
	
	// 기본생성자
	public Student() {}
	
	// 이름만 가진 생성자
	public Student(String name) {
		// this키를 이용하여 값은 클래스의 다른 생성자호출
		this(name, 0); // 홍길동, 0
		System.out.println("1개 짜리 생성자 호출");
	}
	
	// 이름, 나이만 가진 생성자
	public Student(String name, int age) {
		this(name, age, "주소미상", "주민번호미상");
		System.out.println("2개 짜리 생성자 호출");
	}
	
	// 4개의 매개변수를 가진 생성자
	public Student(String name,int age, String address, String ssn) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.ssn = ssn;
		System.out.println("4개 짜리 생성자 호출");
	}
	
	// 코딩창에서 오른쪽클릭 - Source - Generate Constructor using Fields... - 사용할 변수들 선택하고 Generate
	// 코딩창에서 오른쪽클릭 - Source - Generate Constructor from Superclass... - Generate
	
	
	
} // end class
