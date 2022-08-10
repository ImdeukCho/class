
public class MyTest03 {

	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 20;
		
		// 값 변경 코드 구현
		int temp = n; // temp = 10
		n=n2; // n= 20
		n2 = temp; // n2 = 10
		
		System.out.println("n값은 " + n);
		System.out.println("n2값은 " + n2);
		

	}

}
