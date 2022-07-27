

// 클래스 이름 Student == 파일명,첫문자 대문자
public class Student { // 모델클래스 학생한명 객체를 생성, 저장한 모델클래스
	

	String name; 
	int age; 
	String address; 
	
	public Student() {
		System.out.println("기본생성자 호출 됨 =================");
	}
		
	public Student(String name, int age, String address){
		System.out.println("생성자 호출 됨 =================");
		this.name = name;
		this.age = age;
		this.address = address;
	}
} // end class
