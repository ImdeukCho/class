import java.util.Arrays;

public class ArrayTest_Utill {

	public static void main(String[] args) {
		
		// 배열 관련 유틸리티 클래스
		String [] kkk = {"xMan","Alex","XMan", "Bob","Curl"};
		Arrays.sort(kkk); // sort 함수 : 오름차순 정렬
		// 5. 검색
		int idx = Arrays.binarySearch(kkk, "Bob"); // binarySearch 함수 : 정렬 된 상태에서 자료를 찾음
		System.out.println("idx==="+idx);   
		// 배열 관련 유틸리티 클래스
		System.out.println(Arrays.asList(kkk).indexOf("Bob")); // asList 함수 : 정렬 안된 상태에서 자료를 찾음
		
		int [ ]xyz = {3,2,1,4,5};
		Arrays.sort(xyz);  // sort 함수 : 오름차순 정렬
		for (int i : xyz) {
			System.out.println("***"+i);
		}
		
		// 3. 값 비교
		int [] a = {10,20};
		int [] b = {10,20};
		System.out.println(a==b);  // 주소 비교 false
		System.out.println(Arrays.equals(a, b)); // equals 함수 : 문자열 값 비교 
		

		int [] num2 = {10,20,30,40,50};
		// 2. 채워넣기
		Arrays.fill(num2, 100); // fill 함수 : 채워넣기
		for (int i : num2) {
			System.out.println("###"+i); // 배열 5개 모두 100으로 바뀜
		}
		
		Arrays.fill(num2,1,3, 200); //start idx, end idx-1
		for (int i : num2) {
			System.out.println("###"+i); 
		}
		
		
	} // end main

}
