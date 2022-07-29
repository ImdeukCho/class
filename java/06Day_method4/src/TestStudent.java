
public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(20);
		s1.setAddr("서울");
		System.out.println(s1);  // 클래스에 참조변수만 출력 -> 자동으로 s1.toString()으로 변경 호출
		System.out.println(s1.toString());
		
	}
}
