import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
//		Set<String> s = new HashSet<String>();
		
		HashSet<String> set = new HashSet<>(); // generic 사용
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("6");
//		set.add(10);   // 잘못된 데이터 저장 감지를 컬파일때 인식 가능.
		
		// 1. toString()
		System.out.println(set); // [1, 2, 3, 4, 5, 6]
		
		// 2. for ~ each
		for (String x : set) {
			System.out.println("for each 문 : " + x);
		}
		
		// 3. 일관된 방법인 Iterator 이용
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();  // 형변환 필요 없음
			System.out.println(s);
			
		}
		

	}

}
