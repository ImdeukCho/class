

// 클래스 이름 Student == 파일명,첫문자 대문자
public class Student { // 모델클래스 학생한명 객체를 생성, 저장한 모델클래스
	

	String name; 
	int age; 
	String address; 
	
	
	public Student(){
		System.out.println("기본생성자 호출 됨 =================");
		name="홍길동";
		age=10;
		address="서울";
		System.out.println("기본생성자 호출 완료 ================");
	}
	// 기본생성자 자동추가
	// 
} // end class
