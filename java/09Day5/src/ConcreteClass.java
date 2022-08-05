
// 다중구현
public class ConcreteClass implements A, B{

	@Override
	public void b() {
		System.out.println("b()");
	}

	@Override
	public void a() {
		System.out.println("a()");
	}

	@Override
	public void bb() { // 실제 구현코드가 없더라도 {} 오버라이딩은 필수임.
		// TODO Auto-generated method stub
		
	}   

}
