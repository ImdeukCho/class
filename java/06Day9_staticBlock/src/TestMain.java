
public class TestMain {
	
	// static 초기화 블럭 : 특정 작업의 초기화
	static {
		//static 변수 초기값 지정
		System.out.println("static 초기화블럭");
	}

	public TestMain() {
		System.out.println("TestMain 생성자");
	}
	
	//인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭");
	}

	public static void main(String[] args) {
		TestMain m = new TestMain();
		TestMain m2 = new TestMain();

	} // end main
} // end class
