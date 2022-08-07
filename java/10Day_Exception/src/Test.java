
public class Test {

	public static void main(String[] args) {
		// 오류,에러 
		// 1. 컴파일 오류 (문법오류) - 분홍색 표시, 실행안됨 ==> .class생성안됨, 실행안됨
		int a = 10;
		System.out.println(a);
		
		// 2. 논리오류,실행오류 (logical 에러) - 컴파일 시점에 오류를 알 수 없음. => .class파일 생성, 실행, 실행시점에 발생
		int[] arr = {1,2,3};
		System.out.println(arr[5]); 
		int result = 10 / 0;
		// 1.실행시점에 발생, 2.Exception(오류) 발생, 3.발생한 오류를 객체로 생성, 4.객체에서 오류메세지 출력, 5.더 진행중단
		System.out.println("계속실행됨");
	}

}
