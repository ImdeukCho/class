// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {
		
		// t1 기본생성자 이용 객체 생성 후 출력 - 이순신, 10, 서울
		Student t1 = new Student(); 
		t1.name = "이순신";
		t1.age = 10;
		t1.address = "서울";
		System.out.println(t1.name+"\t"+t1.age+"\t"+t1.address);
		
		// t2 매개변수 3개 생성자 이용 생성 후 출력 - 강감찬, 20, 경기
		Student t2 = new Student("강감찬",20,"경기"); 
		System.out.println(t2.name+"\t"+t2.age+"\t"+t2.address);

	}

}
