
public class TestMain {

	public static void main(String[] args) {
//		A a = new A(); // 부모클래스는 자체적으로 객체생성 불가능
		System.out.println(A.NUM);
//		A.NUM=1; // NUM은 상수값이므로 변경불가능
		ConcreteClass c = new ConcreteClass();
		c.a(); // 추상
		c.b(); // 추상
		c.c(); // default
		A.d(); // static 함수 - 부모클래스에서만 사용
		
		A t = new ConcreteClass(); // 다형성 가능
		t.a();
		t.b();
		t.c();
		A.d();
	}

}

