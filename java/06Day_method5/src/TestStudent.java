
public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(20);
		s1.setAddr("서울");
		String data = s1.getData();
		System.out.println(data);
		System.out.println(s1.getData());
	}
}
