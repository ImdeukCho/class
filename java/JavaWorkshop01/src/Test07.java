import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // scan 명령문 시작
		System.out.println("1.이름을 입력하세요");	
		String name = scan.next(); // 이름 입력 대기
		System.out.println("2.나이 입력하세요");
		int age = scan.nextInt(); // 나이 입력 대기
		System.out.println("이름은 " + name + ", 나이는 " + age + " 입니다");
		System.out.printf("이름은 %s, 나이는 %d 입니다",name ,age);
		scan.close(); // 입력 끊기

}

}
