
public class ArrayTest10 {

	public static void main(String[] args) {
		
		// 2차원배열의 리터럴을 이용한 직접 생성 및 초기화
		// 1. new
		// 2. 리터럴값, 한줄 완성.
		int [][] num = {{10,20,30},{40},{50,60}};
		
		// for 문
		for (int i=0; i<num.length; i++) {    // num.length
			for (int j=0; j<num[i].length; j++) {  // num[i].length
				System.out.println(num[i][j]);
			}
		}
		
		// for~ each 문
		for (int[] is : num) {
			for (int data : is) {
				System.out.println(data);
			}
		}
		
	} // end main

}
