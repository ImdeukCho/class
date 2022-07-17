
public class Sample04_final {

	public static void main(String[] args) {

		// 상수 : 값 변경불가, 전부 대문자로
		// Byte.MIN_VALUE, Byte.MAX.VALUE
		final int SIZE = 100;
		// SIZE = 200;   // 에러 : 값 변경불가
		System.out.println(SIZE);
		
		int num = 10;
		System.out.println(num);
		num = 20;       // 상수가 아닌 변수이므로 값 변경가능
		System.out.println(num);
		
		
	}

}
