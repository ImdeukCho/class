package workshop06.string;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		String str = "I am second to none";
		StringTokenizer st = new StringTokenizer(str, " ");	
		
		
		// 단어 갯수 구하기
		int wordCount = 0;
		while (st.hasMoreElements()) {
			wordCount++;
			System.out.printf(st.nextToken() + " ");
		}
		System.out.println("단어개수 : " + wordCount);
		
		// 문자 갯수 구하기
		char chararr []  = str.toCharArray();
		int charCount = 0;
		for (int i = 0; i < chararr.length; i++) {
			if (chararr[i] == ' ') {
				continue; // 이후로 코드 실행없이 다시 반복문 계속 실행
			}
			System.out.printf(chararr[i] + " ");
			charCount ++;
		}
		System.out.println("문자개수 : " + charCount);
	}

}
