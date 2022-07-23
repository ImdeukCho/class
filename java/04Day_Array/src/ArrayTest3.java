import javax.swing.text.ChangedCharSetException;

public class ArrayTest3 {
	
	private static void Change(int x) { // change함수의 로컬변수 xxx=int x
		System.out.println("in change 함수 x = "+x);
		x=20;
		System.out.println(x);  // change함수의 x=20으로 변경
	} // end change            // change함수 종료, 로컬변수x 종료, main의 change함수 다음 명령문 실행
	
	public static void main(String[] args) {
		
		// 기본형 데이터
		int xxx =10;  // main의 로컬변수
		System.out.println("호출전 : " + xxx);
		Change(xxx); // 함수에 변수를 넘김
		System.out.println("호출후 : " + xxx); // 10? 20? : 10 출력 , 기본형 데이터는 값을 넘겨주므로 수정값은 change함수 안에서 끝남
		// 기본형 데이터는 모두 call by value : 함수 호출시 값을 넘겨줌 - 함수내의 매개변수에 다시 저장됨
		// 참조형 데이터는 모두 call by reference : 함수 호출시 주소값을 넘겨줌 - 함수사용 객체와 넘겨준 객체 동일한 객체가 됨
		
		//참조형 데이터
		int [] num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println("호출전 : "+num[2]); // 30 출력
		Change2(num);
		System.out.println("호출후 : "+num[2]); // 30? 100? : 100 출력 , 참조형 데이터는 주소값을 넘겨주므로 수정값을 반영함.
		
		// 문) 값 변경되나?
		change3(num[0]);
		System.out.println(num[0]); // num[0]은 기본형데이터, 수정값 반영X
		
		
	} // end main

	private static void change3(int i) {    // 기본형
		i=1;
	}

	private static void Change2(int[] x) {    // [] 붙어있으면 참조형
		System.out.println("change2 함수 안 : "+x[2]);  // 30 출력
		x[2]=100;
	}


} // end class
