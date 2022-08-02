
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동",20,"서울");
		StudentUtil util = new StudentUtil();
		System.out.println("성은 : " +util.firstName(stu1)+"\t 길이는 : "+util.nameLength(stu1));
		System.out.println("길이는 : \t"+util.nameLength2(stu1));
		// 박혁거세/10/경기 객체의 성, 이름의 길이 출력
		Student stu2 = new Student("박혁거세",10,"경기");
		System.out.println("성은 : " +util.firstName(stu2) +"\t 길이는 : "+util.nameLength(stu2));
		System.out.println("길이는 : \t"+util.nameLength2(stu2));
	}

}
