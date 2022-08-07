package com.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		// "aa/bb/cc" ==> 구분자로 값을 반환
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
		
		StringTokenizer st = new StringTokenizer(data, "/,"); // 구분자 여러개 설정 가능 / 주의 : 공백 포함시키려면 "/, "
		while (st.hasMoreElements()) { // hasMoreTokens 함수랑 별로 차이 없음
			System.out.println(st.nextToken());
			
		}
		
		
		// 1. String의 split()
		String [] d = data.split("/");  // split() 함수는 구분자 1개만 설정 가능
		for (String s : d) {
			System.out.println(s);
		}
	}

}
