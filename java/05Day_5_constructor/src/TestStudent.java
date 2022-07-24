// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {
		
		Student t1 = new Student();  // 기본(default)생성자 호출
		t1.name="홍길동";
		t1.age=10;
		System.out.println(t1.name + "\t"+t1.age);
		
		
		
		Student t2= new Student("홍길동",10);  // 생성과 동시에 값을 저장
		t2.address="서울";
		System.out.println(t2.name + "\t"+t2.age+"\t"+t2.address);
		
		
		
		Student t3= new Student("이순신", 100, "강남");
		System.out.println(t3.name + "\t"+t3.age+"\t"+t3.address);
		
		
		Student t4= new Student("aa", 10, "양재");
		System.out.println(t4.name + "\t"+t4.age+"\t"+t4.address);
		
	
	}

}
