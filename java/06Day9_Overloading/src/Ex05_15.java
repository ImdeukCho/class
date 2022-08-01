import java.lang.reflect.Method;

public class Ex05_15 {

	// 오버로딩 메소드들
	public void sum() {}
	public void sum( int a ) {}
	public void sum( String n ) {}
	public void sum( int a , String n) {}
	public void sum( String n , int a ) {}
//	public int sum(){}    // 오류 : 6행의 메소드와 동일하기 떄문에, 리턴타입은 무관하다
	
	public static void main(String[] args) {}

}
