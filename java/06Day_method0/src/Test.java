
public class Test {
	// 멤버변수영역
	// 생성자영역
	// 함수 : 메소드
	// 접근제한자 처리후리턴타입 함수이름(매개변수){          return 리턴값;    }
	// 멤버함수, new 후 참조변수로 호출 사용
//	public void methodA() { // void : 함수 처리후 리넡값이 없을 경우 사용
//		// 프로그램 실행 코드
//		System.out.println("methodA() 1=========");
//		System.out.println("methodA() 2=========");
//		
//	} // end method

	
	//2. 리턴값 없음-void, 매개변수있음(하나만)
//	public void methodA(int num) {;
//		System.out.println("methodA() : "+num);
//	}

	// 3. 리턴 없음, 매개변수 여러개
//	public void methodA(int num1,int num2) { //10,20
//		System.out.println("methodA() : "+(num1+num2));
//	}
	
	// 4. 리턴 있음, 매개변수 없음
//	public int methodA() {
//		int num = 100;
//		System.out.println("methodA() 리턴 시킨값 : "+ num);
//		return num;   // 리턴 값과 함수의 리턴타입을 일치 , 값을 가지고 나를 호출한 곳으로 리턴 시킴
//		// System.out.println("aaaaaaa");  // 리턴 이후로 실행 불가
//	}
	
	// 5. 리턴 있음 - return 값하고 타입을 맞춤 , 매개변수 있음
	public int methodA(int num1, int num2) { //10, 20
		int result= num1 + num2;
		System.out.println("methodA() result : "+result);
		return result;
	}
	
	// 6. 에러 경우
	public int tt(int a, int b) {
		return a+b;
	}
	
	public int[] tt2() {
		int a=10;
		int b=20;
		int c=30;
		int[] arr= {a,b,c};
		for (int i : arr) {
			System.out.println("tt2() : ======="+ i);
		}
		// return a,b,c;  // 리턴값은 오직 하나.
		return arr;
	}
	
	
	
	
} // end class
