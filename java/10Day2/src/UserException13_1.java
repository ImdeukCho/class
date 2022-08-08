import java.util.Random;

public class UserException13_1 {

	public static void myRandom() {
		Random r = new Random();
		int num = r.nextInt(3); // 0, 1, 2
		//가정? 0이면 예외이다.
		if (num==0) {
			try {
				throw new UserException("랜덤값 0이 나와 예외발생");
			} catch (UserException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
			myRandom();
		
		System.out.println("프로그램 종료");

	}

}
