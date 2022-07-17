import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		
		// 종료 입력할때까지 무한반복, while문 사용
		Scanner scan = new Scanner(System.in);
		System.out.println("끝내려면 종료 입력");
	while(true) { // 강제 무한 반복
		System.out.println("입력하세요 : ");
		String data = scan.next();
		if(data.equals("종료"))  break; // 반복문을 빠져나감
		System.out.println("입력한 값은 : " +data);
	}
		System.out.println("종료됨");
	}

}
