
public class TestStudent {

	public Student changeAge(Student n) { // 멤버함수 : 객체 생성 후 사용하는 함수
		n.setAge(40);
		System.out.println("change함수 :"+n);
		return n;
	} // end changeAge
		
	public static void main(String[] args) { // static 키워드 : 객체생성없이 그냥 사용가능한 함수가됨
		                                     // new 필요없이 사용이 준비됨
		
		// call by values, call by reference
		
		Student stu = new Student("홍길동",20,"서울");
		System.out.println("변경전 나이:"+stu.getAge());
		// main에서 자신의 클래스에 속한 static함수가 아닌 멤버함수는 객체 생성 후 사용
		TestStudent test = new TestStudent();
		Student s = test.changeAge(stu);
//		changeAge(stu);
		System.out.println("변경후 나이:"+s.getAge()); // 40(call by reference)
		System.out.println(s);
		System.out.println(stu);
		
		int num=10;
		test.changeNum(num);
		System.out.println(num); // 10(call by values)
		
	} // end main

	private void changeNum(int num) {
		num=100;
	}


} // end class
