package com.test;

import java.util.StringTokenizer;

public class Ex08_16 {

	public static void main(String[] args) {
		
		String mesg = "홍길동,이순신,유관순";
		StringTokenizer st = new StringTokenizer(mesg, ",");
		// hasMoreTokens() 함수 : ﻿남아있는 토큰이 있는지 여부를 boolean 값으로 반환
		while (st.hasMoreTokens()) { // 남아있는 토큰이 있으면 실행 -- 이게 더 편함.
			String token = st.nextToken();
			System.out.println(token);
		}
		// countTokens() 함수 : ﻿사용하지 않고 남아있는 토큰의 개수 반환 ﻿
		while (st.countTokens() !=0) { // 남아있는 토큰의 개수가 0개가 아니면 실행
			String token = st.nextToken();
			System.out.println(token);
		}
	} // end main

}
