
public class ArrayTest {

	public static void main(String[] args) {
		
		//1. 배열 선언
		// 데이터타입 [] 변수명;
		int [] num;
		
		//2. 배열생성
		// 변수명 = new 데이터타입[크기];
		num = new int[3];
		//3개의 int를 담을 배열 생성완료
		System.out.println(num);  // num에는 주소가 저장되있음
		System.out.println(num[0]); // index 번호 이용 사용  // 안의 데이터는 모두 0이 들어가있음
		System.out.println(num[1]); // index 번호 이용 사용  // 안의 데이터는 모두 0이 들어가있음
		System.out.println(num[2]); // index 번호 이용 사용  // 안의 데이터는 모두 0이 들어가있음
		// System.out.println(num[3]); // 오류 : java.lang.ArrayIndexOutOfBoundsException : 배열에 없는 방이다.
		
		
		//3. 배열초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		// num[3] = 10;  // 런타입 오류 : 문법 오류는 안나지만 실행시 오류발생
		
		System.out.println(num[0]); // 0번 방에 데이터 10값이 들어있음
		System.out.println(num[1]); // 1번 방에 데이터 20값이 들어있음
		System.out.println(num[2]); // 2번 방에 데이터 30값이 들어있음
		
		
		
		System.out.println("배열의크기(길이) : "+num.length);  // 전체 방의 갯수
		
		System.out.println("==============================");
		 
		
		
		// 0 ~ 3보다 작을때까지
		for (int i = 0; i < 3; i++) { // idx 0~2까지 총 3개 방  주의! : 0부터 시작이므로 3개는 0,1,2 이다.
			System.out.println("for문 : "+num[i]);   // for문으로 배열값 출력
		}
		
		
		System.out.println("==============================");
		
		// 0 ~ num.length보다 작을때까지 
		for (int i = 0; i < num.length; i++) {  // 0~ num.length-1까지
			System.out.println("for문2 : "+num[i]);
		}
		
		System.out.println("==============================");
		
		// 0 ~ num.length-1까지 
		for (int i = 0; i <= num.length-1; i++) {  
			System.out.println("for문3 : "+num[i]);
		}
		
		
		
		
		
		
	}

}
