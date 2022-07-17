import java.util.Scanner;

public class IFTest3 {

	public static void main(String[] args) {
		// 3. 다중 if~else문
		System.out.println("점수 입력하시오");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.next());  // Integer.parseInt 함수 사용 
		
//		if (num >= 90) {
//			System.out.println("A");
//		} else if (num >= 80) {
//			System.out.println("B");
//		} else if (num >= 70) {
//			System.out.println("C");
//		} else {
//			System.out.println("F");
//		}
//		System.out.println("문장3");
		
		// 낮은점수기준 비교
		if (num < 70) {
			System.out.println("F");
		} else if (num < 80) {
			System.out.println("C");
		} else if (num < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		System.out.println("문장3");
	}

}
