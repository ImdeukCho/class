// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {


		
		Student t4 = new Student("유관순");
		System.out.println(t4.name+"\t"+t4.age+"\t"+t4.address+"\t"+t4.ssn);
		// 4개 짜리 생성자 호출
		// 2개 짜리 생성자 호출
		// 1개 짜리 생성자 호출
		// 유관순 0 주소미상 주민번호미상 순으로 출력됨
		
		
		
		
	}

}
