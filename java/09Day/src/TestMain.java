
public class TestMain {

	public static void main(String[] args) {
		
//		AbstractClass x = new AbstractClass(); // 추상클래스 자체는 new가 안됨 - 추상함수 때문
		ConcreteClass y = new ConcreteClass(100); // 자식클래스로 객체생성 해야함.
		y.a();
		y.b();
		System.out.println(y.getNum());
		
		AbstractClass t = new ConcreteClass(); // 다형성 적용 가능
		t.a();
	}

}
