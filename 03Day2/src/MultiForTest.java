
public class MultiForTest {

	public static void main(String[] args) {
		// 이중 for문
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<4; j++) {
//				System.out.println("i="+i+"\t"+"j="+j);
//			}
//			System.out.println("=====================================");
//		}
//		System.out.println("main 종료 ");
		
		
		// 문) 구구단 만들기(2~9단)
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println( i + " * " + j + " = " + (i*j) );
			}
			System.out.println("=====================================");
		}
		System.out.println("main 종료 ");
		
		
		
	} // end main

}
