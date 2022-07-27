// 같은 패키지에서 student import 없음

public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student(); 
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
		Student stu2 = new Student(); 
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		
//		stu2.name="이순신";
//		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
	}

}
