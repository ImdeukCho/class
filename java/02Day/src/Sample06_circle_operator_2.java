
public class Sample06_circle_operator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;  // 참조형, 주소가 null로 저장

		System.out.println( (4>2) || (name.length()==4));  // 처음 조건결과가 true이므로 뒤조건은 실행할 필요가 없는 데드코드가 됨.
		System.out.println( (4<2) || (name.length()==4));  // 뒤에 조건도 실행되어 NullPointerException 발생  // Exception 발생하면서 프로그램 강제 종료 됨.

		
		
		
		
	}

}
