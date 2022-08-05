
public interface A {
	
	int NUM=10; //맴버변수 아님 , public static final 자동으로 지정된다.(대문자로)
	public static final int NUM2=20;
	public abstract void a(); // 추상함수   -- 주로 쓰이는 방식
	void b(); // 추상함수 , public abstract 자동으로 지정된다.
	
	public default void c() { // default 함수 -- 오버라이딩 사용
		System.out.println("c");
	}
	
	public static void d() {
		System.out.println("d");
	}
	
//	public void e() {} // {}붙으면 일반함수가됨.
//	public void f();  // 추상함수 가능
}
