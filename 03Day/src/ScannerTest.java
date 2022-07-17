import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);  // scan 명령문 시작
		String name = scan.next();  // 이름 입력 대기
		System.out.println("입력한 이름은 :" + name);
		System.out.println("나이 입력하세요");
		int age = scan.nextInt();  // 나이 입력 대기
		System.out.println("입력한 나이는 :" + age);
		scan.close(); // 입력 끊기
	
	}

}
