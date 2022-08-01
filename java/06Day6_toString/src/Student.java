
public class Student extends Object { // 부모클래스인 Object 상속 키워드 묵시적 추가
	
	String name;
	int age;
	
	
	// 부모 Object클래스 가 되고 Object class에 toString() : 객체의 주소 출력 함수가 있음.
		@Override // 부모함수를 자식함수에서 재정의
		public String toString() {
			System.out.println("toString 호출===================");
			return "Student [name=" + name + ", age=" + age + "]";
		}
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
