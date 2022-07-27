
public class TestMethod {

	public static void main(String[] args) {
	

		System.out.println("main 1==================");
//		Test t1 = new Test();
		
		
		// 1. 리턴값, 매개변수 없음
//		t1.methodA();
		
		// 2. 리턴 없음, 매개변수 1개
//		t1.methodA(10);

		
		// 3. 리턴 없음, 매개변수 여러개
//		t1.methodA(10, 20);


		// 4. 리턴 있음 - return 값의 타입을 선언함, 매개변수 없음
			// 1) 리턴값 사용 안함
//				t1.methodA(); 
			// 2) 리턴값을 사용
//				int result = t1.methodA(); 
	
		
		
		// 5. 리턴 있음 - return 값하고 타입을 맞춤 , 매개변수 있음
//		int result = t1.methodA(10, 20);
//		System.out.println("main에서 받은 값 : "+ result);
		
		// 6.
		Test stu= new Test();
		int[] arr=stu.tt2();
		for (int i : arr) {
			System.out.println("main : "+ i);
		}
		
		
		
		System.out.println("main 종료================");	
	}
}
