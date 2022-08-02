
public class StudentUtil {
	
	Student stu; // 하나의 클래스에 다른 클래스가 멤버변수 포함 : has a 관계 // 메인에서 생성한 stu를 가지가 됨
	
	public StudentUtil(Student stu) { // 1. 생성자를 통한 Student 객체 저장
		this.stu = stu;
	}
	
	public StudentUtil(){} // 기본 생성자
	
	public void setStu(Student stu) { // 2. set함수를 이용한 Student 객체 저장
		this.stu=stu;
	}
	public Student getStu(Student stu) {
		return this.stu;
	}

	


	public char firstName() {
		String name = stu.getName();
		char first = name.charAt(0);
//		System.out.println("성은 ========"+first);
		return first;
	}
	

	public int nameLength() {
		String name = stu.getName(); // 이름 얻기
		int length = name.length(); // 길이 얻기
//		System.out.println("길이는 ========"+length);
		return length;
	}
	
	
} // end class
