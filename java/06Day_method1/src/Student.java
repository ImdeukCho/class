
public class Student{
	// 1. 은닉화(인캡슐레이션)
	// 1-1 멤버변수 접근금지 : private
		private String name; // 접근지정자 default, private 로 지정 - 같은 클래스에서만 사용가능
		private int age;
		private String address; // 다른 클래스에서 참조변수, 변수명 사용 안됨
	
	// 1-2 setXXX() 함수 구현 : 멤버변수에 객체 데이터 저장(데이터 검사 후)목적
		public void setName(String name) {
			if(name!=null) {
			this.name = name;
			}else {
				System.out.println("이름 확인하세요.");
			}
		}
	
		public void setAge(int age) {
			if(age<150) {
				this.age = age;
			}else {
				System.out.println("나이를 확인하세요.");
			}
		}
	
		public void setAddress(String address) {
			this.address=address;
		}
		
	// 1-3 getXXX() 구현 : 멤버변수를 접근해서 리턴시키는 함수
		public String getName() {
			return this.name;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public String getAddress() {
			return this.address;
		}
		
	// 데이터확인 용 함수
		public void printData() {
			System.out.println("printData() : "+this.name+"\t"+this.age+"\t"+this.address);
		}
	
	// 기본생성자 자동생성 되있음
	
	
} // end class
