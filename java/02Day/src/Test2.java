
public class Test2 {

	public static void main(String[] args) {
//		String name1="홍길동";
//		String name2="홍길동";
//		System.out.println(name1==name2);  // 내용비교가 아닌 주소비교가 되서 TRUE 
//		// 다른 프로그램에서의 데이터 비교시 주소가 다르므로 결과가 부정확해진다.
//		
//		// 문자열의 내용비교는 문자열1.equals(문자열2)
//		boolean result = name1.equals(name2); // 문자열의 주소가 아닌 내용비교
//		System.out.println("equals함수 사용 : " + result);
//		
//		// 문자열 제외 문자,정수,실수 비교는 == 사용가능
//		char a = 'a';
//		char b = 'b';
//		System.out.println(a==b);  // false
		
		// 2. 대입연산자
		int a = 10;
		a+=1;  // a=a+1
		System.out.println(a);   // 11 출력
		a= a+1;
		System.out.println(a);   // 12 출력
		
		int x = 10;
		int x2 = x;
		x2 += x;  // x2=20
		x2 -= x;  // x2=10
		x2 *= x;  // x2=100
		x2 /= x;  // x2=10
		x2 %= x;  // x2=0
		System.out.println(x2);
		System.err.println("dadawd");  // 빨간색으로 출력
	}

}
