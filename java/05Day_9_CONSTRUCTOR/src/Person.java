

// 클래스 이름 Student == 파일명,첫문자 대문자
public class Person { // 모델클래스 학생한명 객체를 생성, 저장한 모델클래스
	
	String name; 
	int age; 
	String address; 
	String phone;
	
	public Person(String name, int age, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public Person() { // 기본생성자
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 코딩창에서 오른쪽클릭 - Source - Generate Constructor using Fields... - 사용할 변수들 선택하고 Generate
	// 코딩창에서 오른쪽클릭 - Source - Generate Constructor from Superclass... - Generate
	
	
	
} // end class
