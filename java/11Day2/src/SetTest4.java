import java.lang.ref.Reference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest4 {
	private static void change(int num) {
		num = 100;
	}	
	private static void change2(int[] num) {
		num[0] = 10;
	}	
	private static void change3(HashSet<String> set) {
		set.remove("홍길동");
	}
	private static void change4(int i) {
		i=100;
	}

	public static void main(String[] args) {		
		int m = 9;
		System.out.println("변경전 : " + m); 
		change(m);
		System.out.println("변경후 : " + m); // 9, 기본형이므로 call by Values. 수정값 반영X
		
		int[] m2 = {1,2,3};
		System.out.println("변경전 : " + m2[0]);  
		change2(m2);
		System.out.println("변경후 : " + m2[0]);  // 10, 참조형이므로 call by Reference. 수정값 반영O
		
		HashSet<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		System.out.println("변경전 : " + set);
		change3(set);
		System.out.println("변경후 : " + set); // 홍길동 삭제, set은 참조형이므로 call by Reference. 수정값 반영O
		
		change4(m2[2]);
		System.out.println(m2[2]); // 3, 배열의 데이터값을 넘겨주므로 call by Values. 수정값 반영X
	}




}
