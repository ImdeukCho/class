
public class Sample02_variable3_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A'; //65
		System.out.println(c+1); // 묵시적 형변환 : 자동 char -> int 형변환 +1 계산 후 출력
		
		int num = (int)c; // 명시적 형변환
		System.out.println(num); // 'A' ==> 65
		System.out.println((char)(c+1)); // 명시적 형변환 66 값을 char로 명시적 변경하여 문자로 출력
		
		
	
	
	
	
	
	}

}
