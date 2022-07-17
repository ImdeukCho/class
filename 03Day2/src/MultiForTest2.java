
public class MultiForTest2 {

	public static void main(String[] args) {
		
//		// 문) ***** 출력
//		for (int i=1; i<=5; i++) {
//			System.out.print("*");
//		}
		
		
		
		
//		// 문) 이중 for문 ***** 3줄로 출력
//		for (int i=1; i<=3; i++) {
//			for (int j=1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 문) 이중 for문 * \t ** \t *** 3줄로 출력
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		

	} // end main

}
