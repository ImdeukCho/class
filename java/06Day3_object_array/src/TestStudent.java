
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동1","서울1"); // 홍길동1, 20, 서울1
		Student stu2 = new Student("홍길동2","서울2");
		Student stu3 = new Student("홍길동3","서울3");
		Student stu4 = new Student("홍길동4","서울4");
		Student stu5 = new Student("홍길동5",19,"서울5"); // 홍길동5, 19, 서울5
		
		// 1. 객체 저장 배열생성
		Student[] arr= new Student[5];
		arr[0]=stu1;
		arr[1]=stu2;
		arr[2]=stu3;
		arr[3]=stu4;
		arr[4]=stu5;
		System.out.println(stu1);    
		System.out.println(arr[0]);  // arr[0].toString() 
		
		// 전체학생의 이름 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());} // name이 안되고 getName인 이유 : private로 잠궈뒀기 때문에
		
		System.out.println("===============================");
		for (Student s : arr) {                   // for ~ each 문 사용
			System.out.println(s.getName());
		}
		
		
		Student [] yy2 = {stu1,stu2,stu3,stu4,stu5};
		
		Student [] yy3 = {new Student("홍길동1","서울1"),
				new Student("홍길동2","서울2"),
				new Student("홍길동3","서울3"),
				new Student("홍길동4","서울4"),
				new Student("홍길동5",19,"서울5") };
		
		for (Student x : yy2) {
			System.out.println(x.getName());
		}		
		for (Student x : yy3) {
			System.out.println(x.getName());
		}	
		
		
		
	}

}
