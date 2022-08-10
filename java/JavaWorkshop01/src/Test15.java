import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		
		// 한번의 3항연산자 사용
		Scanner scan = new Scanner(System.in); // scan 명령문 시작
		System.out.println("1.정수 입력하세요");	
		int n1 = scan.nextInt(); // 첫번째 숫자(문자열)
		System.out.println("2.정수 입력하세요");
		int n2 = scan.nextInt(); // 두번째 숫자(문자열)
		System.out.println("3.정수 입력하세요");
		int n3 = scan.nextInt(); // 세번째 숫자(문자열)
		
		int max = (n1>n2)? ((n1>n3)? n1:n3) : ((n2>n3)? n2:n3) ;
		
		System.out.println("정수 "+n1+" 과 정수 "+n2+", 정수 "+n3+" 중에서 최대값 : "+max);
		System.out.printf("정수 %d 과 정수 %d, 정수 %d 중에서 최대값 : %d", n1, n2, n3, max );
	}

}
