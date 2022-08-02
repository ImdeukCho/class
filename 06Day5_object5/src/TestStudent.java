
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 20, "서울");
		StudentUtil util = new StudentUtil(); // util stu = null;
		
		util.setStu(stu1); // 저장 후 호출
		
		System.out.println(util.firstName());
		System.out.println(util.nameLength());
		
		// 이순신, 20, 경기 // 첫글자, 길이 출력
		util.setStu(new Student("이순신", 20, "경기"));
		System.out.println(util.firstName());
		System.out.println(util.nameLength());
		
		
	}

}
