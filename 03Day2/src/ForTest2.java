import java.util.Iterator;

public class ForTest2 {

	public static void main(String[] args) {
		
		// 1. 
//		for (int i=0; i<5; i++) {
//			System.out.println("hello "+i);
//			if (i==3) {break;}     // break 위치가 출력문 다음이므로 3까지 출력됨
//		} // end for
//		System.out.println("main 종료 ");
		
		
//		// 중복 반복문시 안쪽에서 break걸면 안쪽반복문에서만 빠져나가고 바깥반복문은 계속 실행
//		for (int i=1; i<5; i++) {
//			for (int j=1; j<5; j++) {
//				System.out.println(i+"\t"+j);
//				if(j==3) break;
//			}
//			System.out.println("===============================================");
//		}
	
		// i값이 3일때만 hello2까지만 출력하기.
		for(int i=0; i<5; i++) {
			System.out.println("hello1 "+i);
			System.out.println("hello2 "+i);
			if (i==3) continue;
			System.out.println("hello3 "+i);
			System.out.println("hello4 "+i);
		}
		System.out.println("===============================================");
	
		
		
		
	} // end main

}
