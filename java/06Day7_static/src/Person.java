
public class Person {
	// 인스턴스 변수, new 할때 생성~객체소멸,사용 : 생성후 참조변수명.name
	String name;
	// static 변수(클래스 변수), 프로그램 실행시 자동생성~프로그램 종료,사용 : 클래스명.age
	static int age;
	
	public void print() { // 멤버함수 new가 필요
		System.out.println(this.name);
		System.out.println(age);
	}
		
	public static void printB() {  // static 함수 : 클래스명.함수이름으로 호출가능, 객체생성 필요없음
//		System.out.println(name); // 오류 : static함수 안에서는 멤버변수 사용 안됨
//		print();  // 오류 : 멤버함수이기 때문에
		// static 변수와 로컬변수 사용 가능
		System.out.println("printB : "+age);
		int a=10;
	}
} // end class
