import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "유관순");
		
		System.out.println(map.get("one")); 
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		
		// 메서드
		System.out.println("크기 : " +map.size());
		System.out.println("키 포함 여부 : " +map.containsKey("one"));
		System.out.println("값 포함 여부 : " +map.containsValue("유관순"));
		
		map.replace("three", "강감찬");
//		map.remove("two");
		System.out.println("크기 : " +map.size());
		System.out.println(map);
		
	System.out.println("==========================");
		// 순회
		// 1. key값만 얻기
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) { // 2. key 하나 얻기
			System.out.println(key + "\t" + map.get(key));  // 3. key에 해당하는 value 값 얻기
		}
		
	System.out.println("==========================");
		// Iterator 이용
		Set<String> keys2 = map.keySet();
		Iterator<String> ite = keys2.iterator();
		while (ite.hasNext()) {
			String key = ite.next(); // 키값 하나
			System.out.println(key+"\t"+map.get(key));
		}

	}

}
