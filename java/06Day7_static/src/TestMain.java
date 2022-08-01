
public class TestMain {

	public static void main(String[] args) {
		
		Person.printB(); // 클래스이름.함수이름 으로 static함수 호출 객체생성 필요없음.

		System.out.println(Person.age); // static 변수, 사용시 클래스이름.변수이름 사용가능
		//static은 new 시마다 생성되는 변수가 아닌 클래스 로딩 시점에 한번만 생성되는 변수
		// 주의! -> static 변수는 주로 객체들간의 공유 변수로 사용함.
		Person p = new Person();
		p.print(); // null, 0
		p.age=20;
		
		
		Person p2 = new Person();
		p2.print(); // nuell, 20
		p2.age=100;
		System.out.println(p.age); // 100
		System.out.println(Person.age);  // 100
	
	}

}
