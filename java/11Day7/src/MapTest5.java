import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest5 {

	public static void main(String[] args) {
		
		HashMap<String, Person> map = new HashMap<>();
		map.put("one", new Person("홍길동", 20 ,"서울"));
		map.put("two", new Person("이순신", 30 ,"전라"));
		map.put("three", new Person("유관순", 40 ,"서울"));
		
		// get(key)
		System.out.println(map.get("one"));
		System.out.println(map.get("one").getName());
		Person one = map.get("one");
		System.out.println(one.getName());
	System.out.println("=================");
	
		// 전체 순회 모든 사람의 이름, 나이 출력
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
	
//		// 순회, person 이름만 출력
//		// for문
//		Set<String> keys = map.keySet();
//		for (String key : keys) {
//			Person p = map.get(key);
//			System.out.println(p.getName());
//		}
//	System.out.println("================");
//	
//		// while문 이용
//		Set<String> keys2 = map.keySet();
//		Iterator<String> ite = keys2.iterator();
//		while (ite.hasNext()) {
//			String key = ite.next();
//			Person p = map.get(key);
//			System.out.println(p.getName());
//		}


	}

}
