
public class TestStudent {

	public static void main(String[] args) {
		
		Student t1 = new Student();
//		t1.name="홍길동";
//		t1.age=200;   // 부정확한 데이터
//		t1.address="서울";
//		System.out.println(t1.name+"\t"+t1.age+"\t"+t1.address);
		
		// private함수 사용했을 경우
		t1.setName("홍길동");
		t1.setAge(10);
		t1.setAddress("서울");
//		System.out.println(t1.getName()+"\t"+t1.getAge()+"\t"+t1.getAddress()); // 저장된 데이터 확인
		t1.printData();
		System.out.println("main 종료 ==================");
	}
}
