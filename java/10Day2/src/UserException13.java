import java.util.Random;

public class UserException13 {

	public static void myRandom() throws UserException{
		Random r = new Random();
		int num = r.nextInt(3); // 0, 1, 2
		//가정? 0이면 예외이다.
		if (num==0) {
			throw new UserException("랜덤값 0이 나와 예외발생");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
			myRandom();
		} catch (UserException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료");

	}

}
