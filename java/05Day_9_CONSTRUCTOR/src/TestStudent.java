// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {

		// 홍길동, 10, 서울, 01011111111 출력
		Person t1 = new Person("홍길동",10,"서울","01011111111"); 
		System.out.println(t1.name+"\t"+t1.age+"\t"+t1.address+"\t"+t1.phone);
		// 2번째 사람 입력하기 편함
		Person t2 = new Person("홍길동",10,"서울","01011111111"); 
	}

}
