
public class ArrayTest2 {

	public static void main(String[] args) {
		
		int [] num = new int [3];  // 배열 선언과 동시에 배열생성
		num[0] = 10; // 배열의 방에 값 저장
		num[1] = 20;
		num[2] = 30;
		num = new int[4];  // 4개의 방으로 num 갱신
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("fro 문 : " + num[i]);
		}
		
		System.out.println("=================================");
		
		// for ~ each 문
		for (int i : num) { // i는 하나의 방의 데이터 값
			System.out.println("for each : " + i);
		}
		
	} // end main

}
