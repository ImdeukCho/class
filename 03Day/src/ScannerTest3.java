import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 값 입력 : ");
		String n1 = scan.next();
		System.out.println("두번째 값 입력 : ");
		String n2 = scan.next();
		Boolean result = n1.equals(n2);
		String message = (result)? "같음" : "다름";
		System.out.println(message);
		scan.close();
		
	}

}
