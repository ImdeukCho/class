import java.lang.reflect.Method;

public class Ex05_14 {

	int num = 5; // 인스턴스 변수
	
	public void methodA() {
		int num = 4; // 로컬변수
		System.out.println("methodA : " + num); // 4
		System.out.println("methodA : " + this.num);  // 5
	}
	
	public static void main(String[] args) {
		int num = 3; // 로컬변수
		System.out.println("main : " + num); // 3
		
		
	}

}
