
public class Sample06_circle_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;  // 참조형, 주소가 null로 저장
//		String name2 = "홍길동";
//		System.out.println(name);
//		System.out.println(name2.length()); // 문자열의 길이
//		System.out.println(name.length()); // 참조가 주소없이 null인 경우 null.함수() ===>  NullPointerException 발생
		
		System.out.println( (4<2) && (name.length()==4));  // 처음 조건결과가 false이므로 뒤조건은 실행할 필요가 없는 데드코드가 됨.
		System.out.println( (4>2) && (name.length()==4));  // 뒤에 조건도 실행되어 NullPointerException 발생  // Exception 발생하면서 프로그램 강제 종료 됨.

	}

}
