
public class ArrayTest5_2 {

	public static void main(String[] args) {

		String [] names = {"aa","bb","cc"};
//		System.out.println(names.length);  // 3
//		System.out.println(names[0]);  // 참조형 기본값 : null
//		System.out.println(names[1]);  // 참조형 기본값 : null
//		System.out.println(names[2]);  // 참조형 기본값 : null
//		System.out.println(names);  // 주소(String형)
		
		// 1. for문
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("==============================");
		
		// 2. for ~ each문
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("==============================");
		
		// 3.
		String mesg="";
		for (String s : names) {
			mesg += s+" ";  // 출력할 문자열 만들기
		}
		System.out.println(mesg);
		
		
		
		
	} // end main

}
