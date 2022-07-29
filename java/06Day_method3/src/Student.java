
public class Student{
		
	private String name;
	private int age;
	private String email;

	// 1. 생성자 생성
	public Student(String name, int age, String email) {
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	public Student() {}
	
	// 2. setXXX함수
	public void setName(String name){
		this.name=name;
	};
	public void setAge(int age){
		this.age=age;
	};public void setEmail(String email){
		this.email=email;
	};
	
	// 3. getXXX함수
	public String getName() {
		return this.name=name;
	}
	public int getAge() {
		return	this.age=age;
	}public String getEmail(){
		return this.email=email;
	};
	
	// 4. toString 함수
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.email;
	};
	
	// 5. getData 함수
	public void getData() {    // 리턴없이 syso으로 출력
		System.out.println(this.name+"\t"+this.age+"\t"+this.email);
		};   
} // end class
