// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {
		// Student 클래스 이용 학생 한명의 자료를 가진 객체 생성
		Student str1 = new Student(); // 모델클래스 이용 객체 생성완료
		// 모델클래스의 멤버변수가 생성되면서 자동으로 타입의 초기값으로 설정됨
		System.out.println(str1);
		System.out.println(str1.name);
		System.out.println(str1.age);
		System.out.println(str1.address);
		// 실제 항생 한명의 자료를 생성된 객체에 저장 "홍길동",20,"서울"
		System.out.println("==========================");
		str1.name="홍길동";
		str1.age=20;
		str1.address="서울"; // 1명의 객체 정보 저정완료
		System.out.println(str1.name);
		System.out.println(str1.age);
		System.out.println(str1.address);
	}

}
