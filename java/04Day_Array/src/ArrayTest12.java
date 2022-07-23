


public class ArrayTest12 {

	public static void main(String[] args) {    // 함수이름(매개변수)
		
		System.out.println(args.length);
		// 매개변수로 받은 데이터타입 총합 계산
		int total=0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			total+=Integer.parseInt(args[i]);
		}
		System.out.println("총합 : "+total);
		
		
		// for ~ each문 사용
		int total2=0;
		for (String str : args) {
			System.out.println(str);
			total2+=Integer.parseInt(str);
		}
		System.out.println("총합 : "+total2);
		
		
	} // end main

}
