
public class ArrayTest4 {

	public static void main(String[] args) {
		
		// 리터럴 이용 생성  , 한줄에서 완성
		int [] num2 = { 10,20,30 }; // {} 안의 데이터 갯수에 맞도록 배열 방 자동생성 후 저장
		System.out.println(num2.length);
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		
		
		System.out.println("==================================");
		
		
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		
		System.out.println("==================================");
		
		
		
		for (int x : num2) {
			System.out.println(x);
		}
		
		
		System.out.println("==================================");
		
		// 문) 총합구하기
		int total = 0;
		for (int i = 0; i < num2.length; i++) {
			total += num2[i];
			System.out.println(num2[i]);
		}
		System.out.println("for 총합 : "+total);
		System.out.println("==================================");	
		
		// 문) for each문 사용 총합구하기
		int total2 = 0;
		for (int x : num2) {
			total2 += x;
			System.out.println(x);
		}
		System.out.println("for 총합 : "+total2);
		
		
		
		// num2 갱신
		int [] num3 = {10,20,30,40};
		num2 = num3;  // num2(방3개)=num3(방4개) : num2(방4개)로 갱신
		for (int i : num2) {
			System.out.println(">>" + i);
		}
		
		
		
		
	}

}
