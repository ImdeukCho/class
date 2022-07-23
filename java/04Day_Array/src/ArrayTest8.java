
public class ArrayTest8 {

	public static void main(String[] args) {
		
		// 2차원 배열
		// 2. 비정방형(모든행의 열크기동일)
		
		int[][] num = new int[2][]; // 2행 ?열

		num[0] = new int[3];
		num[1] = new int[2];
		
		// 초기화
		num[0][0] =10;
		num[0][1] =20;
		num[0][2] =30;
		num[1][0] =40;
		num[1][1] =50;
		
		// 비정방형은 무조건 length함수 써야한다.
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		
		
		// for ~ each문                   // 정방형, 비정방형 차이없다.
		for (int[] is : num) {
			for (int data : is) {
				System.out.println(data);
			}
		}
		
		
		
	} // end main

}
