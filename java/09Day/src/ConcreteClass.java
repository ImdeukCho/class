
public class ConcreteClass extends AbstractClass{ // 추상크래스 상속
	
	@Override
	public void a() {
		System.out.println("a() =========================");
		
	}

	@Override
	public void b() {}   // {} 만 있어도 재정의로 인식함
	
	// 기본생성자
	public ConcreteClass () {
		// super();
	}

	public ConcreteClass(int i) {
		super(i);
	}


	
}
