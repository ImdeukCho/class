
public class ExceptionTest5 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");	
		try {
		// 작업1
			int num = 10;
			int result = num / 1;  // 나누기 0으로 변경시 : ArithmeticException 발생
			System.out.println(result);
		// 작업2
			String name = "a";
			System.out.println(name.length()); // name=null 변경시 : NullPointerException 발생
		// 작업3 ==> 무슨오류인지 모른다고 가정
			int[] num2 = {10,20};
			System.out.println(num2[3]);   // ﻿[3] 변경시 : ArrayIndexOutOfBoundsException 발생
		// 다중 catch문 사용	
		}catch (NullPointerException e) {
			System.out.println("에외발생1" + e.getMessage());
		}catch (ArithmeticException e) {           
			System.out.println("에외발생2" + e.getMessage());
		}catch (Exception e) {				// 부모타입의 Exception을 제일 마지막으로 비교 , 자식 => 부모 타입 순서대로.
			System.out.println("에외발생3" + e.getMessage());
		}

		System.out.println("프로그램 종료");
	} // end main

}
