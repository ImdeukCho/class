
public class Student{
	String name;
	int age;
	String addr;
	
	public Student(String naem, int age, String addr) {
		this.name=name;
		this.age=age;
		this.addr=addr;
	};
	
	public Student() {};
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
	
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.addr;
	}
	
	public String getData() {
//		return this.name+"\t"+this.age+"\t"+this.addr;
		return getName()+"\t"+getAge()+"\t"+this.getAddr(); // 같은 클래스안에서 호출 가능, this.붙여도 가능
	}
	
} // end class
