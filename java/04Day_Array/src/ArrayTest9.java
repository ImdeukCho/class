
public class ArrayTest9 {

	public static void main(String[] args) {
		
		// 2차원 배열
		// 1. 정방형(모든행의 열크기동일)
		
		// 가. 배열선언
		int [][] num;

		// 나. 배열생성
		num = new int [2][3]; // 2행 3열
		num[0][0] =10;
		num[0][1] =20;
		num[0][2] =30;
		num[1][0] =40;
		num[1][1] =50;
		num[1][2] =60;
		
		System.out.println(num); // 주소
		System.out.println(num[0]); // A배열의 주소
		System.out.println(num[1]); // B배열의 주소
		System.out.println(num[0][0]); // A배열의 0번 값
		System.out.println(num[1][2]); // A배열의 0번 값
		
		System.out.println("==============================");
		
		// 2차원배열 for문 방법1
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.println(num[i][j]);
			}
		}
		
		System.out.println("==============================");
		
		// 2차원배열 for문 방법2
		for (int i=0; i<num.length; i++) {    // num.length
			for (int j=0; j<num[i].length; j++) {  // num[i].length
				System.out.println(num[i][j]);
			}
		}
		
		System.out.println("==============================");
		
		// 2차원배열 총합구하기
		int total=0;
		for (int i=0; i<num.length; i++) {    // num.length
			for (int j=0; j<num[i].length; j++) {  // num[i].length
				System.out.println(num[i][j]);
				total+=num[i][j];
			}
		}
		System.out.println("총합 : "+total);
		
		System.out.println("==============================");
		
		// 2차원배열 for~each문
		for (int[] is : num) {   // 각 배열 주소 : 2차원 배열 
			for(int data : is) { // 방의 데이터값 : 각 배열 주소
				System.out.println(is);
				System.out.println(data);
			}
		}
		System.out.println(num); // 2차원배열 주소
		
		System.out.println("==============================");
		
		
		// 2차원배열 for~each문 총합구하기
		int total2 = 0;
		for (int[] is : num) { 
			for (int data : is) {
				System.out.println(data);
				total2 += data;
			}
		}
		System.out.println("총합 : "+total2);
		
		// num.length : 2
		// num[0].length : 3
		// num.length * num[0].length : 6 전체 방의 갯수
		
		
	} // end main

}
