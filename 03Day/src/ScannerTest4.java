import java.util.Scanner;

public class ScannerTest4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자");
		String s_num = scan.next();  // string형으로 받음
		int result = Integer.parseInt(s_num)%2;  // Integer.parseInt 함수 : 문자형을 정수형으로 형변환
		System.out.println( (result==0)? "짝" : "홀");
		
		System.out.println("두번째 숫자");
		int num = scan.nextInt();   // int형으로 받음
		String message = (num%2==0)? "짝수" : "홀수";  
		System.out.println(message);
		scan.close();
	}
}
