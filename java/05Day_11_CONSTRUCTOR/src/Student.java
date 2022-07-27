

// 클래스 이름 Student == 파일명,첫문자 대문자
public class Student { // 모델클래스 학생한명 객체를 생성, 저장한 모델클래스
	
	String name; 
	private int age;  //  private 함수 : 멤버변수는 같은 class에서만 접근 허용 public, protected, default, private
	String address; 
	String ssn;
	
	// 기본생성자
	public Student() {}
	
	
	// 4개의 매개변수를 가진 생성자
	public Student(String name,int age, String address, String ssn) {
		
		this.name = name;
		if(age<150) {
		this.age = age;
		}
		this.address = address;
		this.ssn = ssn;
		System.out.println("4개 짜리 생성자 호출");
	}
	
	// 코딩창에서 오른쪽클릭 - Source - Generate Constructor using Fields... - 사용할 변수들 선택하고 Generate
	// 코딩창에서 오른쪽클릭 - Source - Generate Constructor from Superclass... - Generate
	
	
	
} // end class
