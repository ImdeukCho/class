
public class WhileTest2 {

	public static void main(String[] args) {
		
//		// 1. while문 이용, 1부터 100까지의 총합 출력
//		int n=1;
//		int total=0;
//		while (n<=100) {
//			System.out.println("n="+n+"\t"+"total : "+total);
//			total=total+n;
//			n++;
//		}
//		System.out.println("총합 : " + total);

		
		// 2. 중첩 while문을 이용한 구구단 만들기
		int i=2;
		while (i<=9) {
			int j=1;   // j기초값 입력 자리 기억하기!! 
			while (j<=9) {
				System.out.println( i + " * " + j + " = "+(i*j));
				j++;
			}
			System.out.println("=====================================");
			i++;
		}
	}

}
