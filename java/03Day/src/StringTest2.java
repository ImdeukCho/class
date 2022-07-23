
public class StringTest2 {

	public static void main(String[] args) {
		
		// trim 함수
		// A.trim() : A문자열의 공백제거후 문자열 출력
		// length 함수
		// A.length() : A문자열의 길이
		String t ="  hEllo  ";
		System.out.println(t.length());    // 9 출력 : 문자 길이
		System.out.println(t.trim());      // hEllo 출력 : 공백 제거
		System.out.println(t.trim().length());  // 5 출력 : 공백 제거 후 문자 길이
		
		// String 클래스의 메서드 사용법
		// substring 함수
		// A.substring(B,C) : A문자열에서 B번째부터 C-1번째 문자열을 뽑는 함수(0부터 시작)
		String xyz = "helloworld";
		String q = xyz.substring(3);  // 3번째 뒤부터 가져옴
		System.out.println(q);   // loworld 출력
		String q2 = xyz.substring(0,3);  // (start, end-1)0번부터 3번째 까지
		System.out.println(q2);  // hel 출력
		String q3 = xyz.substring(0,5);  
		System.out.println(q3);  // hello 출력
		String q4 = xyz.substring(5,10);
		System.out.println(q4);  // world 출력
		
		// charAT 함수
		// A.charAT(B) : A문자열의 B번째 하나의 문자를 뽑는 함수(0부터 시작)
		String s = "hello";
		char x = s.charAt(0);  // 0번쨰 하나의 문자 뽑아옴
		System.out.println(x);
		System.out.println(s.charAt(1));  // 1번째 하나의 문자 뽑아옴
		
		// concat 함수
		// A.concat(B) : A문자열에 B문자열을 이어붙이는 함수
		String x2 = s.concat("world");
		System.out.println(x2); // helloworld 출력
		System.out.println(s); // hello 출력 : 원본글자 그대로.
		
		int x3 = s.length();
		System.out.println(x3);  // 5 출력
		
		// 비교 함수
		// equals 함수 
		// A.equals(B) : A문자열과 B문자열을 대소문자 구분하여 비교
		// equalsIgnoreCase 함수
		// A.equalsIgnoreCase(B) : A문자열과 B문자열을 대소문자 구분없이 비교
		String aaa = "Hello";
		String aaa2 = "hello";
		boolean result = aaa.equals(aaa2);  
		System.out.println(result);    // false 출력 : 대소문자 구분하여 비교
		boolean result2 = aaa.equalsIgnoreCase(aaa2);
		System.out.println(result2);   // true 출력 : 대소문자 구분없이 비교
		
		// contains 함수
		// A.contains(B) : A문자열 안에 B문자열과 일치하는가 비교
		boolean kkk = s.contains("h");
		System.out.println(kkk);    // true
		boolean kkk2 = s.contains("hx");
		System.out.println(kkk2);   // false
		boolean kkk3 = s.contains("o");
		System.out.println(kkk3);   // true
		
		// endsWith 함수
		// A.endsWith(B) : A문자열이 B문자열로 끝나는가 비교
		// startsWith 함수
		// A.startsWith(B) : A문자열이 B문자열로 시작하는가 비교
		
		boolean kkk4 = "world".endsWith("o");
		System.out.println(kkk4);   // false
		boolean kkk5 = "world".startsWith("w");
		System.out.println(kkk5);   // true
		
		// indexOf 함수
		// A.indexOf(B) : A문자열 안에 B문자열의 순서를 찾는다
		int index = "hello".indexOf("a");
		System.out.println(index); // -1 출력 : 없는 경우 -1
		int index1 = "hello".indexOf("h");
		System.out.println(index1);  // 0 출력 : 있는경우 문자순서 출력(0부터 시작)
		int index2 = "hello".indexOf("e");
		System.out.println(index2);  // 1 출력 
		
		// isEmpty 함수
		// A.isEmpty() : 빈 문자열인지 여부 확인
		System.out.println("hello".isEmpty());  // false 출력
		System.out.println("".isEmpty()); // true 출력
		System.out.println("".length());  // 0 출력
		
		// replace 함수
		// A.replace(B,C) : A문자열에서 B의 문자열을 C로 교체
		System.out.println("abc".replace('a', 'A'));  //a가 A로 교체
		System.out.println("abc".replace("ab", "xxx"));  // ab가 xxx로 교체
		
		// toUpperCase 함수
		// A.toUpperCase() : A의 모든 문자열을 대문자로 변환
		// toLowerCase 함수
		// A.toLowerCase() : A의 모든 문자열을 소문자로 변환
		System.out.println("abc".toUpperCase());  // 모든 문자열을 대문자로 변환
		System.out.println("abc".toLowerCase());  // 모든 문자열을 소문자로 변환
	
		
		
		
		
	}
}
