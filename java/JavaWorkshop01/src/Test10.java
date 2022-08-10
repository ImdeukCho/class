import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		// 문10.Scanner 클래스를 사용하여 키보드로 주소값을 입력 받아서 도/시/구 이름을 출력하는 코드
	
			Scanner scan = new Scanner(System.in); //  입력
			System.out.println("주소를 입력하시오");
			String mesg = scan.nextLine();   // nextLine 함수 : 한 줄 입력(띄어쓰기도 인식가능)
			String[] data = mesg.split(" ");
			
			System.out.println("도명 : "+data[0]);
			System.out.println("시명 : "+data[1]);
			System.out.println("구명 : "+data[2]);

	}

}
