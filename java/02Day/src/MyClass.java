
public class MyClass {

	public static void main(String[] args) {
		
		int num = 4;
		
		{
			int size = 10;
		} // 코드 블록

		{
			int size = 10;
		} // 코드 블록
		// System.out.println(size);  // 블록 밖에서 출력 안됨
		
		if(true) {
			int x = 3;
		} // if문 코드 블록
		
		while(true) {
			int y = 5;
		} // while문 코드 블록
	}// 메서드 코드 블록

} // 클래스 코드 블록
