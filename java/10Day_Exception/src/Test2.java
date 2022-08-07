
class A{}
class B extends A{}
class C extends A{}
public class Test2 {

	public static void main(String[] args) {
		// 1. ArithmeticException (산술 오류)
		int num1=0;
	try {	// 예외가 발생할만한 코드
		
		String name = null;
		System.out.println(name.length());
		
		
		num1=10;  // 주의 : try 블럭안 변수라서 밖에서는 사용못한다.
		int num2=10;
		int result=num1/num2;  // 산술오류 발생시 catch 함수로 이동
		System.out.println("try 마지막 ======"); // 건너띄어서 실행안됨
	}catch (ArithmeticException e) {
		System.out.println("catch 블럭 실행됨"+num1);
	} // end catch
	
		// 2. NullPointerException (null값 오류)
		String name = null;
		System.out.println(name.length());
		
		// 3. ArrayIndexOutOfBoundsException (배열 오류)
		int [] a= {1};
		System.out.println(a[10]);
		
		
		// 4. ClassCastException (상속관계 형변환 오류)
		A t = new B();
		C c = (C)t;
		
		
		System.out.println("계속 실행됨"+num1);
	}

}
