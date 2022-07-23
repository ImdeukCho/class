// 같은 패키지에서 student import 없음

public class TestStudent2 {

	public static void main(String[] args) {
		Student stu1 = new Student(); 

		stu1.name="홍길동";
		stu1.age=20;
		stu1.address="서울";
		
		Student stu2 = new Student(); 
		stu2.name="강감찬";
		stu2.age=30;
		stu2.address="경기";
		
		System.out.println(stu1+"\t"+stu2);		
		System.out.println("이름:"+stu1.name+"\t"+stu2.name);
		System.out.println("나이:"+stu1.age+"\t"+stu2.age);
		System.out.println("주소:"+stu1.address+"\t"+stu2.address);
	}

}
