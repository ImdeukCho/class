import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //  입력
		System.out.println("주소를 입력하시오");
		String mesg = scan.nextLine();   // nextLine 함수 : 한 줄 입력(띄어쓰기도 인식가능)
		

		System.out.println("문자 갯수(공백포함):" + mesg.length());
		System.out.println("단어 갯수:" + mesg.split(" ").length);  // 공백을 기준으로 문자열을 분리한 문자열의 갯수
		// A.split(B).length 함수 : A문자열에서 B를기준으로 문자열을 분리한 문자열의 갯수
	}

}
