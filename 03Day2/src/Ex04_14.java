
public class Ex04_14 {

	public static void main(String[] args) {
		
		// n값이 8이될때 break되며 종료
		int n=1;
		while (n<=10) {
			System.out.println(n + " Hello world");
			n++;
			if (n==8) break;	
		}
		System.out.println("n값이 8이며 while문 빠져나옴");
		

	}

}
