
public class TestStudent {

	public static void main(String[] args) {
		
		// 1. 홍길동 / 20 / 서울 => 생성자 이용 setting, getData함수 이용 출력
		Student t1 = new Student("홍길동",20,"서울");
//		System.out.println(t1.getData());
		
// 이름 수정
		// 2. 이순신 / 10/ 경기 => setXXX함수 이용, getXXX함수 이용 출력
		Student t2 = new Student();
		t2.setName("이순신");
		t2.setAge(10);
		t2.setAddress("경기");
		// 출력 방법1.
		System.out.println(t2.getName()+"\t"+t2.getAge()+"\t"+t2.getAddress());
		// 출력 방법2.
		String mesg=t2.getName()+ "\t";
		mesg+= t2.getAge()+ "\t";
		mesg+= t2.getAddress();
		System.out.println(mesg);
		
		// 참조변수 출력 jdk 묵시적으로 .toString()호출함
		System.out.println(t1); // 묵시적으로 .toString() 입력되있음
		System.out.println(t2.toString());
		
	}
}
