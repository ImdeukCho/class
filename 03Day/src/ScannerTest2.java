import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String str = scan.next();
		
		Boolean result = str.equals("홍길동");
//		Boolean result = str =="홍길동";  // equals 함수 미사용하면 잘못된 결과 출력
		String message = (result)? "이름이 같음" : "이름이 다름";
		System.out.println(message);
		scan.close();

	}

}
