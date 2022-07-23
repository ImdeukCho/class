// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {
		// 프로그램의 시작지점
		// 학생한명의 정보 저장
		// 클래스명 변수명 = new 클래스명();
		Student stu1= new Student();   // () : student 클래스의 생성자 호출 객체 생성
		System.out.println(stu1); // 클래스타입@주소 출력
		System.out.println(stu1.name);  // null 출력, 초기값저장
		System.out.println(stu1.age);  // 0 출력
		stu1.name="홍길동";
		stu1.age=10;
		System.out.println(stu1.name); // 홍길동 출력
		System.out.println(stu1.age);  // 10 출력
		
		// 학생2 정보 저장
		Student stu2= new Student();
		System.out.println(stu2); // stu1과 다른 객체이다. 다른 주소 출력
		stu2.name="이순신";
		stu2.age=20;
		System.out.println(stu2.name); // 이순신 출력
		System.out.println(stu2.age);  // 20 출력
		
		// 학생3 정보 저장
		Student stu3= new Student();
		stu3.name="aa";
		stu3.age=1;
		System.out.println(stu3.name); // aa 출력
		System.out.println(stu3.age);  // 1 출력
		
		
		
		
		
		
	}

}
