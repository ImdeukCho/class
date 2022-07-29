
public class Student{
		
	String name;
	int age;
	String addr;
	public Student(String name, int age, String addr) {
		// super();   // 지워도 생성자의 첫라인에 super() 묵시적 추가 됨
		this.name = name;
		this.age = age;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
	
} // end class
