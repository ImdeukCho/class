
public class TestMain {

	public static void main(String[] args) {
		
		ConcreteClass y = new ConcreteClass(100); 
		System.out.println(y.getNum());
		y.a();
		ConcreteClass2 y2 = new ConcreteClass2();
		System.out.println(y2.getNum());
		y2.a();
	}

}
