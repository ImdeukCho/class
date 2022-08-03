
public class ConcreteClass extends AbstractClass{

	@Override
	public void a() {
		System.out.println("a");
		
	}

	@Override
	public int b() {
		System.out.println("b");
		return 0;
	}

	@Override
	public void c(int x) {
		System.out.println("c");
		
	} // 추상크래스 상속

	public ConcreteClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteClass(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
	
}
