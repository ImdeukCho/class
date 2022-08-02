
public class TestStudent {

	public static void main(String[] args) {
		
		StudentUtil util = new StudentUtil(new Student("홍길동",20,"서울")); // stu를 넘겨서 설정
		// 리턴 값 변수에 저장, sysout 으로 출력
		char first_name = util.firstName();
		int length_name = util.nameLength();
		System.out.println("성은 : " +first_name+"\t 길이는 : "+length_name);
		
		// 이순신, 10, 경기
//		Student stu = new Student("이순신",10,"경기");
		StudentUtil util2 = new StudentUtil(new Student("이순신",10,"경기"));
		System.out.println("성은 : " +util2.firstName());
		System.out.println("길이는 : "+util2.nameLength());
		
	}

}
