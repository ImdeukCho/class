
public class StringTest {

	public static void main(String[] args) {
		
		// 1. 문자열을 사용하는 방법
		// 1.1 String s = new String("문자열");    // new : 객체생성
		String s = new String("hello");
		String s2 = new String("hello");          // new 사용시 새로운 주소로 저장
		System.out.println(s==s2);                // false(주소 비교)
		
		// equals 함수 사용 비교
		boolean result = s.equals(s2);
		System.out.println(result);         // true(문자열 내용 비교)
		
		
		// 2. 리터럴을 이용하여 문자열 생성
		String n = "hello";
		String n2 = "hello";
		System.out.println(n==n2);   // true, 주소가 같음, 하지만 n==s 비교시 주소비교되어 잘못된 결과 도출
		
		
	}

}
