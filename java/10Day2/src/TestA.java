class AA{
	public void methodAA() throws ClassNotFoundException, ArithmeticException {
		System.out.println("AA함수 호출됨");
		BB test = new BB();
		// 1. 직접 try-catch 처리
//		try {
		test.methodB(); // throws된 exception을 try-catch처리 , 또는 throws 이용 위임처리
//		} catch (ClassNotFoundException e) {
//		e.printStackTrace();
//	}
	  // 2.throws 이용 : 나를 호출한 곳으로 처리를 위임시킴
		System.out.println("AA함수 종료");
	}
}
class BB{
	public void methodB() throws ClassNotFoundException, ArithmeticException {
		// 1. 직접 try-catch 처리
//		try {
			Class.forName("aaa");
			int result=0/0;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		  // 2.throws 이용 : 나를 호출한 곳으로 처리를 위임시킴
		System.out.println("MethodB함수 호출됨");
	}
}
public class TestA {

	public static void main(String[] args) {
		System.out.println("main 시작");
		AA test = new AA();
		try {
			test.methodAA(); // 1. try-catch처리, 또는 throws 처리
		} catch (Exception e) {
			System.out.println("main 에서 catch");
			e.printStackTrace();
		}
		System.out.println("main 종료 됨");
	}

}
