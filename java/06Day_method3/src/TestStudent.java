
public class TestStudent {

	public static void main(String[] args) {
		
		Student t1 = new Student("홍길동",20, "aa@naver.com");
		Student t2 = new Student("이순신",10, "bb@google.com");
		System.out.println(t1);  //.toString
//		System.out.println(t2.getData());  // 리턴없어서 main파일 오류
		t2.getData(); // 그냥 함수 호출.
		
		t1.setAge(40); // 20 ->40
		t2.setEmail("bb@google.com"); //이순신 메일 주소
		
		// 나이비교 " 나이 같음", "나이 다름" 출력
		
		t2.setAge(40);
		int age1 = t1.getAge();
		int age2 = t2.getAge();
		if(age1==age2) {
			System.out.println("나이 같음");
		}else {
			System.out.println("나이 다름");
		}
		
		// 이름 비교
		t2.setName("홍길동");
		String name1 = t1.getName();
		String name2 = t2.getName();
		String mesg = "이름 다름";
		if(name1.equals(name2)) {        // 문자열 비교는 equals함수 사용
			mesg="이름 같음";
		}
		System.out.println(mesg);
		
	}
}
