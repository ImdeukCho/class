import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest7 {
	public static void main(String[] args) {
		
		HashMap<String, Person> map = new HashMap<>();
		map.put("one",new Person("홍길동", 20, "서울"));
		map.put("two",new Person("이순신", 30, "전라"));
		map.put("three",new Person("유관순", 40, "서울"));
		
		HashMap<String, Person> map2 = new HashMap<>();
		map2.put("one",new Person("홍길동2", 200, "서울2"));
		map2.put("two",new Person("이순신2", 300, "전라2"));
		map2.put("three",new Person("유관순2", 400, "서울2"));
		
		ArrayList<HashMap<String, Person>> list = new ArrayList<>();
		list.add(map);
		list.add(map2);
		
		
		// 전체 순회
		for (HashMap<String, Person> x : list) {     // list에서 map을 꺼내오기
			Set<String> keys = x.keySet();           // keyset으로 key들만 꺼내옴
			for (String key : keys) {                // key들중 key만 꺼냄
				Person p = x.get(key);               // key값의 value값을 p에 저장
				System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getAddress());
			}
		}
		
		
		
		
		
		
		// 전체 순회 이름, 나이 출력
//		for (HashMap<String, Person> x : list) {
//			Set<String> keys = x.keySet();
//			for (String key : keys) {
//				Person p = x.get(key);
//				System.out.println(p.getName()+"\t"+p.getAge());
//			}
//		}
		
		
		// 데이터 출력하기 (list 에서 map 꺼내기)
//		for (HashMap<String, Person> x : list) {
//			Set<String> keys = x.keySet();
//			for (String key : keys) {
//				Person p = x.get(key);
//				System.out.println(p.getName()+"\t"+p.getAge());
//			}
//		}
//
//	System.out.println("====================");
//		
//	Iterator<HashMap<String, Person>> it = list.iterator();
//	while (it.hasNext()) {
//		HashMap<java.lang.String, Person> m =  it.next();
//		Set<String> keys = m.keySet();
//		for (String key : keys) {
//			Person p = m.get(key);
//			System.out.println(p.getName()+"\t"+p.getAge());
//		}
//	}

		
	} // end main

}
