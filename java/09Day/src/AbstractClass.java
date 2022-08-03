
public abstract class AbstractClass { // 추상클래스 : 추상함수 포한하는 클래스는 추상클래스로 선언 해야한다.
	                                  // 구현안된 추상함수 때문에 이 클래스는 객체생성 할 수 없음.
	private int num;					

// 추상함수 추가
	public abstract void a(); // 추상함수 : 자식에서 무조건 오버라이딩 필수
	public abstract void b();						  
	
	public AbstractClass(int num) {
		super();
		this.num = num;
	}

	public AbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
