// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {

		Student t1= new Student("홍길동", 200, "서울", "111");
//		System.out.println(t1.name+"\t"+t1.age+"\t"+t1.address+"\t"+t1.ssn);  
//		t1.age=1000;
//		System.out.println(t1.name+"\t"+t1.age+"\t"+t1.address+"\t"+t1.ssn);
		// private로 다른 클래스에서 접근 불가 걸어서 위에 오류남.
		
		// 정보의 은닉화(encapsulation) :
		// 1. 멤버변수를 private로 접근 제한을 걸어줌
		// 2. 멤버변수를 접근(저장)할 수 있는 public 함수를 작성 : setXXX 함수(저장전에 데이터 검증)
		//    필요한 곳에서 데이터 사용할수 있도록 getXXX 함수 작성 
		
		
	}

}
