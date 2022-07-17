
public class ForTest {

	public static void main(String[] args) {
		
//		for(int i2=10; i2>0; i2--) {
//			System.out.println("world "+i2);
//		} // end for
//		
//		
//		for(int i3=0; i3<5; i3++) {
//			System.out.println("hello "+i3);
//		} // end for
//		
//		for(int k=0; k<5; k+=2) {  // k=K+2
//		System.out.println("hello "+k);  // 0,2,4
//		} // end for
//		
//		// 변수2개 for문
//		int i=0, j=0;
//		for ( i=0, j=0; i<5 && j<3; i++, j++) {
//			System.out.println("happy "+i+":"+j);
//		} // end for
//		System.out.println("for문 밖 " + i +  ":" + j);
//		
//		// 이중 for문               !!! 매우 중요 !!!
//		for (int i=0; i<3; i++) {  // 바깥 for문
//			for (int j=0; j<4; j++) {  // 안쪽 for문
//				System.out.println("i="+i+"\t"+"j="+j);
//			} // end 안쪽 for문
//		System.out.println("========================================");
//		}  // end 바깥 for문
//	System.out.println("main 종료 ");
	
		// 문) 누적 합계(1~100)의 총합
		int sum=0;
		for (int i=1; i<=100; i++) {
			System.out.println("누적되는 합계 : "+ i +"\t"+sum );
			sum=sum+i;
		}
		System.out.println("총합은 : " + sum);
	
	} //end main

}
