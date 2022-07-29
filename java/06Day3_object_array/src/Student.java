
public class Student {

	private String name;
	private int age;
	private String address;
	
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {  // 매개변수 2개 생성자로 3개짜리 호출 방법
		this(name,age,null);  
	}

	public Student(String name, String address) {
//		int a=10;
		this(name,20,address);           // 반드시 첫라인에서 사용 - 매개변수 3개짜리 호출
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
}
