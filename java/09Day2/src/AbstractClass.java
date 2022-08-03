
public abstract class AbstractClass { 
	
	private int num;
	
	// 추상 함수
	public abstract void a();
	public abstract int b();
	public abstract void c(int x);
	
	
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
