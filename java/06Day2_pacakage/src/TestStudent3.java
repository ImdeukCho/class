import com.xxx.Student;

public class TestStudent3 {
	
	public static void main(String[] args) {
		
		Student s = new Student(); // 패키지 지정안했으니 위에 임포트된 패키지적용
		System.out.println(s.name);
		com.yyy.Student s2 = new com.yyy.Student(); //yyy패키지 지정
		System.out.println(s2.name);
	}
}
