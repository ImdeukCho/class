
public class Student{
	
	private String name;
	private int age;
	private String address;
	
	// 1. 생성자 : 매개변수 3개, 기본생성자 생성
	public Student(String name, int age,  String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Student(){}
	
	// set 함수
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {
		if(age<200) {
			this.age = age;
		}else { 
			System.out.println("나이를 확인하세요.");
		}
	}
	public void setAddress(String address) {this.address = address;}
	
	// get 함수
	public String getName(){
		return this.name;
	}


	public int getAge(){
		return this.age;
	}

	public String getAddress(){
		return this.address;
	}
	
	// 데이터확인 용 함수
//	public String getData() {
//		return this.name+"\t"+this.age+"\t"+this.address;
//	}
	
	// toString 함수
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.address;
	}
} // end class
