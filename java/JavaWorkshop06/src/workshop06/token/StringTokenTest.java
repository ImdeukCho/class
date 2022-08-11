package workshop06.token;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
//		문제3. 다음 String에 있는 정수들의 합을 구하시오.
//		단, StringTokenizer class를 이용한다.
		
		String str = "4,2,3,6,7";
		StringTokenizer st = new StringTokenizer(str, ",");
		int total = 0;
		while (st.hasMoreElements()) {
			total += Integer.parseInt(st.nextToken());
		}
		System.out.println("총합 : "+total);



	} // end main

}
