import java.math.BigDecimal;

public class Sample05_operator {

	public static void main(String[] args) {
		// 1. 산술연산자 : +,-,*,/,%
		// int n = 10;
		// int n2 = 3;
		// System.out.println(n+n2);
		// System.out.println(n-n2);
		// System.out.println(n*n2);
		// System.out.println(n/n2);   // 3
		// System.out.println(n/3.0);  // 3.3333
		// System.out.println(n%n2);   // 1 나머지값

		
		// 자바는 실수연산이 부정확하다
		double n = 2.0;
		double n2 = 1.1;
		System.out.println(n-n2);    // 0.899999999
		
		// BigDecimal 사용하여 정확하게 계산 가능
		BigDecimal m = new BigDecimal("2.0");
		BigDecimal m2 = new BigDecimal("1.1");
		System.out.println(m.subtract(m2));    // 0.9
		
		
		// 4. 비교연산자 ===> 실행결과는 논리값
		int xyz = 5;
		int xyz2 = 3;
		boolean result = xyz == xyz2;
		System.out.println(result);           // false
		System.out.println(xyz == xyz2);      // false
		System.out.println(xyz != xyz2);      // true
		System.out.println(xyz > xyz2);       // true
		System.out.println(xyz >= xyz2);      // true
		System.out.println(xyz < xyz2);       // false
		System.out.println(xyz <= xyz2);      // false
		
		// 6. 3항연산자
		int xxx = ( 3==4 )? 100:200;  
		String xxx2 = ( 3==4 )? "A":"B";
		System.out.println(xxx);  // xxx=200
		System.out.println(xxx2);  // xxx2="B"
		
	}

}
