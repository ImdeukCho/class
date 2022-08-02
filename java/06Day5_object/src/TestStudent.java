
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동",20,"서울");
		StudentUtil util = new StudentUtil();
		String name = stu.getName();
		System.out.println(util.firstName(name) +"\t" +util.nameLength(name));
		
		// 박혁거세/10/경기 객체의 성, 이름의 길이 출력
		Student stu2 = new Student("박혁거세",10,"경기");
		String name2 = stu2.getName();
		System.out.println(util.firstName(name2) +"\t" +util.nameLength(name2));
		
		
		
		
	} // end main

} // end class
