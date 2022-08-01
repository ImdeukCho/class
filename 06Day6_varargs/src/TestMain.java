
public class TestMain {
	
	// 인스턴스 메서드(멤버메서드)=> main에서 사용시 객체를 생성해야한다
	// 가변인자
	public void a(int ...n) { // 데이터를 int[]로 받음
		for (int x : n) {
			System.out.println(x);
		}
		System.out.println("===================");
	}
	
	public void b(String ... n) { // 데이터를 int[]로 받음
		for (String x : n) {
			System.out.println(x);
		}
		System.out.println("===================");
	}
	
	public static void c() { // static 함수 : 객체 생성이 필요없는 함수로 정의
		System.out.println("static c함수 호출");
	}
	
	public static void main(String[] args) {
		
		TestMain m = new TestMain();
		m.a(10);
		m.a(10,20);  // ...n
		m.a(10,9,8);
		
		m.b("홍길동","이순신");
		
		c(); // static 메소드
	} // end main
} // end class
